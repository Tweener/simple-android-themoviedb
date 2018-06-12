package com.tweener.simplemoviedb.movie

import android.app.Application
import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.arch.lifecycle.Observer
import android.support.test.runner.AndroidJUnit4
import com.tweener.simplemoviedb.core.Constants.Companion.MOVIE_DB_API_KEY
import com.tweener.simplemoviedb.core.domain.entity.Movie
import com.tweener.simplemoviedb.core.rx.RxImmediateSchedulerRule
import com.tweener.simplemoviedb.util.MovieTestFactory
import com.tweener.simplemoviedb.util.PopularMoviesFactory
import junit.framework.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito

/**
 * Unit Tests for [PopularMoviesViewModel].
 *
 * @author Vivien Mahe
 */
@RunWith(AndroidJUnit4::class)
class PopularMoviesViewModelTest {

    @Rule
    @JvmField
    val immediateScheduler = RxImmediateSchedulerRule()

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val movieService = Mockito.mock(MovieService::class.java)
    private lateinit var popularMoviesViewModel: PopularMoviesViewModel

    @Before
    fun setUp() {
        val application = Mockito.mock(Application::class.java)
        popularMoviesViewModel = PopularMoviesViewModel(application, movieService)
    }

    @Test
    fun testLoadPopularMovies() {
        val page = 1

        // Mock some data
        val movie1 = MovieTestFactory.createApiMovie(1, "My first movie", "2016-06-17")
        val movie2 = MovieTestFactory.createApiMovie(2, "My second movie", "2013-10-28")
        val movie3 = MovieTestFactory.createApiMovie(3, "My third movie", "2018-02-12")

        val singlePopularMovies = PopularMoviesFactory.createSingleApiPopularMoviesSuccessResponse(page, movie1, movie2, movie3)

        // Make the API return the mocked data
        Mockito.`when`(movieService.getPopularMovies(MOVIE_DB_API_KEY, page)).thenReturn(singlePopularMovies)

        // Observe on the MutableLiveData with a mocked observer
        val observer = Mockito.mock(Observer::class.java) as Observer<MutableList<Movie>>
        popularMoviesViewModel.popularMovies.observeForever(observer)

        // Perform what has to be tested
        popularMoviesViewModel.loadPopularMovies()

        // Check results
        val response = popularMoviesViewModel.popularMovies.value

        Assert.assertNotNull(response)
        Assert.assertEquals(3, response!!.size)
        Assert.assertEquals("My first movie", response[0].originalTitle)
        Assert.assertEquals("My second movie", response[1].originalTitle)
        Assert.assertEquals("My third movie", response[2].originalTitle)
    }

    @Test
    fun testLoadMorePopularMovies() {
        // Observe on the MutableLiveData with a mocked observer
        val observer = Mockito.mock(Observer::class.java) as Observer<MutableList<Movie>>
        popularMoviesViewModel.popularMovies.observeForever(observer)

        // Load page 1
        var page = 1

        val movie1 = MovieTestFactory.createApiMovie(1, "My first movie", "2016-06-17")
        val movie2 = MovieTestFactory.createApiMovie(2, "My second movie", "2013-10-28")
        val movie3 = MovieTestFactory.createApiMovie(3, "My third movie", "2018-02-12")

        val singlePage1PopularMovies = PopularMoviesFactory.createSingleApiPopularMoviesSuccessResponse(page, movie1, movie2, movie3)

        Mockito.`when`(movieService.getPopularMovies(MOVIE_DB_API_KEY, page)).thenReturn(singlePage1PopularMovies)

        popularMoviesViewModel.loadPopularMovies()

        // Load page 2
        page++

        val movie4 = MovieTestFactory.createApiMovie(4, "My fourth movie", "2013-08-18")
        val movie5 = MovieTestFactory.createApiMovie(5, "My fifth movie", "2012-12-23")
        val movie6 = MovieTestFactory.createApiMovie(6, "My sixth movie", "2016-03-16")

        val singlePage2PopularMovies = PopularMoviesFactory.createSingleApiPopularMoviesSuccessResponse(page, movie4, movie5, movie6)

        Mockito.`when`(movieService.getPopularMovies(MOVIE_DB_API_KEY, page)).thenReturn(singlePage2PopularMovies)

        popularMoviesViewModel.loadMorePopularMovies()

        // Check results
        val response = popularMoviesViewModel.popularMovies.value

        Assert.assertNotNull(response)
        Assert.assertEquals(6, response!!.size)
        Assert.assertEquals("My first movie", response[0].originalTitle)
        Assert.assertEquals("My second movie", response[1].originalTitle)
        Assert.assertEquals("My third movie", response[2].originalTitle)
        Assert.assertEquals("My fourth movie", response[3].originalTitle)
        Assert.assertEquals("My fifth movie", response[4].originalTitle)
        Assert.assertEquals("My sixth movie", response[5].originalTitle)
    }
}
package com.tweener.simplemoviedb.core.domain.usecase

import android.arch.core.executor.testing.InstantTaskExecutorRule
import android.content.Context
import com.tweener.simplemoviedb.core.Constants.Companion.MOVIE_DB_API_KEY
import com.tweener.simplemoviedb.core.di.component.DaggerUseCaseTestComponent
import com.tweener.simplemoviedb.core.di.component.UseCaseTestComponent
import com.tweener.simplemoviedb.core.di.module.ApplicationModule
import com.tweener.simplemoviedb.core.di.module.NetTestModule
import com.tweener.simplemoviedb.core.rx.RxImmediateSchedulerRule
import com.tweener.simplemoviedb.movie.MovieService
import com.tweener.simplemoviedb.util.MovieTestFactory
import com.tweener.simplemoviedb.util.PopularMoviesFactory
import io.reactivex.schedulers.Schedulers
import junit.framework.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

/**
 * Unit Tests for [GetPopularMoviesUseCase].
 *
 * @author Vivien Mahe
 */
@RunWith(MockitoJUnitRunner::class)
class GetPopularMoviesUseCaseTest {

    @Rule
    @JvmField
    val immediateScheduler = RxImmediateSchedulerRule()

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var useCaseTestComponent: UseCaseTestComponent
    private val movieService: MovieService = Mockito.mock(MovieService::class.java)
    private lateinit var getPopularMoviesUseCase: GetPopularMoviesUseCase

    @Before
    fun setUp() {
        val context = Mockito.mock(Context::class.java)

        useCaseTestComponent = DaggerUseCaseTestComponent.builder()
                .applicationModule(ApplicationModule(context))
                .netModule(NetTestModule())
                .build()
        useCaseTestComponent.inject(this)

        getPopularMoviesUseCase = GetPopularMoviesUseCase(movieService)
    }

    @Test
    fun testGetPopularMoviesSuccess() {
        val page = 1

        // Mock some data
        val movie1 = MovieTestFactory.createApiMovie(1, "My first movie", "2016-06-17")
        val movie2 = MovieTestFactory.createApiMovie(2, "My second movie", "2017-10-28")
        val movie3 = MovieTestFactory.createApiMovie(3, "My third movie", "2018-02-12")

        val singlePopularMovies = PopularMoviesFactory.createSingleApiPopularMoviesSuccessResponse(page, movie1, movie2, movie3)

        // Make the API return the mocked data
        Mockito.`when`(movieService.getPopularMovies(MOVIE_DB_API_KEY, page)).thenReturn(singlePopularMovies)

        // Execute the request on the immediate thread
        val popularMovies = getPopularMoviesUseCase.execute(GetPopularMoviesUseCase.RequestParams(page))
                .subscribeOn(Schedulers.trampoline())
                .observeOn(Schedulers.trampoline())
                .blockingGet()

        // Assert results
        Assert.assertNotNull(popularMovies)
        Assert.assertEquals(3, popularMovies.size)
        Assert.assertEquals("My first movie", popularMovies[0].originalTitle)
        Assert.assertEquals("My second movie", popularMovies[1].originalTitle)
        Assert.assertEquals("My third movie", popularMovies[2].originalTitle)
    }
}
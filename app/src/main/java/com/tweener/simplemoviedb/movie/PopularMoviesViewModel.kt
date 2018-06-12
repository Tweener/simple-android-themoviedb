package com.tweener.simplemoviedb.movie

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.tweener.simplemoviedb.R
import com.tweener.simplemoviedb.core.SimpleMovieDBApplication
import com.tweener.simplemoviedb.core.domain.entity.Movie
import com.tweener.simplemoviedb.core.domain.usecase.GetPopularMoviesUseCase
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Vivien Mahe
 */
class PopularMoviesViewModel(
        application: Application,
        private val movieService: MovieService
) : AndroidViewModel(application) {

    companion object {
        private val TAG = PopularMoviesViewModel::class.java.simpleName!!

        /**
         * Date format used by The Movie DB for movies release date
         */
        private val MOVIE_DATE_FORMAT = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

        /**
         * Comparator to sort movies by ascending release date
         */
        private val MOVIE_DATE_ASC_COMPARATOR = Comparator<Movie> { o1: Movie, o2: Movie ->
            MOVIE_DATE_FORMAT.parse(o1.releaseDate).compareTo(MOVIE_DATE_FORMAT.parse(o2.releaseDate))
        }

        /**
         * Comparator to sort movies by descending release date
         */
        private val MOVIE_DATE_DESC_COMPARATOR = Comparator<Movie> { o1: Movie, o2: Movie ->
            MOVIE_DATE_FORMAT.parse(o2.releaseDate).compareTo(MOVIE_DATE_FORMAT.parse(o1.releaseDate))
        }
    }

    private val getPopularMoviesUseCase = GetPopularMoviesUseCase(movieService)
    private val disposables = CompositeDisposable()
    private var currentPage: Int = 1
    private var orderByDateAsc: Boolean = false

    // Observable properties
    val toastMessage = MutableLiveData<String>()
    val loadingStatus = MutableLiveData<Boolean>()
    val selectedMovie = MutableLiveData<Movie>()
    val popularMovies: BehaviorSubject<MutableList<Movie>> = BehaviorSubject.create()

    override fun onCleared() {
        // Cancel any ongoing requests when this ViewModel is stopped
        disposables.clear()
    }

    /**
     * Loads the current page of popular movies (page 1 is default)
     */
    fun loadPopularMovies() {
        val params = GetPopularMoviesUseCase.RequestParams(currentPage)

        disposables.add(
                getPopularMoviesUseCase.execute(params)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe { _ -> loadingStatus.value = true }
                        .flatMap { movies -> Single.just(movies.toMutableList()) }
                        .subscribe(
                                { movies ->
                                    // Append existing movies at the beginning of the newly fetched movies list
                                    popularMovies.value?.let { movies.addAll(0, it) }

                                    popularMovies.onNext(movies)
                                    loadingStatus.value = false
                                },
                                { throwable ->
                                    popularMovies.onError(throwable)
                                    loadingStatus.value = false
                                }
                        )
        )
    }

    /**
     * Loads the next page of popular movies
     */
    fun loadMorePopularMovies() {
        currentPage++

        loadPopularMovies()
    }

    /**
     * Order movies by date, either ascending or descending
     */
    fun orderMoviesByDate() {
        val movies = popularMovies.value

        // Order movie by ascending or descending order
        val comparator = if (orderByDateAsc) MOVIE_DATE_ASC_COMPARATOR else MOVIE_DATE_DESC_COMPARATOR
        Collections.sort(movies, comparator)

        // Show a toast
        val orderMessageResId = if (orderByDateAsc) R.string.popular_movies_order_asc else R.string.popular_movies_order_desc
        toastMessage.value = getApplication<SimpleMovieDBApplication>().getString(orderMessageResId)

        // Toggle the movie sorting order
        orderByDateAsc = orderByDateAsc.not()

        popularMovies.onNext(movies)
    }

    fun onMovieSelected(movie: Movie) {
        selectedMovie.value = movie
    }
}
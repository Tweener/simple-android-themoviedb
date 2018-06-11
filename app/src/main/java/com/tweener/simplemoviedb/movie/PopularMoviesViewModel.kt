package com.tweener.simplemoviedb.movie

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.tweener.simplemoviedb.core.domain.entity.Movie
import com.tweener.simplemoviedb.core.domain.usecase.GetPopularMoviesUseCase
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject

/**
 * @author Vivien Mahe
 */
class PopularMoviesViewModel(
        private val movieService: MovieService
) : ViewModel() {

    companion object {
        private val TAG = PopularMoviesViewModel::class.java.simpleName!!
    }

    private val getPopularMoviesUseCase = GetPopularMoviesUseCase(movieService)
    private val disposables = CompositeDisposable()
    private var currentPage: Int = 1

    // Observable properties
    val loadingStatus = MutableLiveData<Boolean>()
    val selectedMovie = MutableLiveData<Movie>()
    val popularMovies: BehaviorSubject<List<Movie>> = BehaviorSubject.create()

    override fun onCleared() {
        disposables.clear()
    }

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
                                    // Add existing movies to the beginning of the list
                                    popularMovies.value?.let {
                                        movies.addAll(0, it)
                                    }

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

    fun loadMorePopularMovies() {
        currentPage++
        loadPopularMovies()
    }

    fun onMovieSelected(movie: Movie) {
        selectedMovie.value = movie
    }
}
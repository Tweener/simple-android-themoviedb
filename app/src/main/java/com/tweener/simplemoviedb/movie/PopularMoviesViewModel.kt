package com.tweener.simplemoviedb.movie

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.tweener.simplemoviedb.core.domain.entity.Movie
import com.tweener.simplemoviedb.core.domain.usecase.GetPopularMoviesUseCase
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

    // Observable properties
    val loadingStatus = MutableLiveData<Boolean>()
    val popularMovies: BehaviorSubject<List<Movie>> = BehaviorSubject.create()

    override fun onCleared() {
        disposables.clear()
    }

    fun loadPopularMovies() {
        disposables.add(
                getPopularMoviesUseCase.execute()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .doOnSubscribe { _ -> loadingStatus.value = true }
                        .subscribe(
                                { movies ->
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

    fun onMovieSelected(movie: Movie) {
        Log.i(TAG, "onMovieSelected: ${movie.originalTitle}")
    }
}
package com.tweener.simplemoviedb.movie

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.tweener.simplemoviedb.R
import com.tweener.simplemoviedb.core.SimpleMovieDBApplication
import com.tweener.simplemoviedb.core.domain.entity.Movie
import retrofit2.Retrofit
import javax.inject.Inject

class PopularMoviesActivity : AppCompatActivity() {

    companion object {
        private val TAG = PopularMoviesActivity::class.java.simpleName!!
    }

    @Inject
    lateinit var retrofit: Retrofit

    private lateinit var viewModel: PopularMoviesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSimpleMovieDBApp().applicationComponent.inject(this)

        val movieService = retrofit.create(MovieService::class.java)

        val popularMoviesViewModelFactory = PopularMoviesViewModelFactory(movieService)
        viewModel = ViewModelProviders.of(this, popularMoviesViewModelFactory).get(PopularMoviesViewModel::class.java)

        viewModel.loadingStatus.observe(this, Observer { showLoading -> updateLoadingState(showLoading!!) })
        viewModel.popularMovies.subscribe { movies -> onPopularMoviesUpdated(movies) }

        viewModel.loadPopularMovies()
    }

    private fun onPopularMoviesUpdated(movies: List<Movie>) {
        Log.i(TAG, "onPopularMoviesUpdated: movies: ${movies.size}")
    }

    private fun updateLoadingState(showLoading: Boolean) {
        Log.i(TAG, "updateLoadingState: showLoading? $showLoading")
    }

    private fun getSimpleMovieDBApp(): SimpleMovieDBApplication {
        return application as SimpleMovieDBApplication
    }
}

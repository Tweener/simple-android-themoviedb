package com.tweener.simplemoviedb.movie

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.tweener.simplemoviedb.R
import com.tweener.simplemoviedb.core.SimpleMovieDBApplication
import com.tweener.simplemoviedb.core.domain.entity.Movie
import com.tweener.simplemoviedb.core.extensions.gone
import com.tweener.simplemoviedb.core.extensions.visible
import retrofit2.Retrofit
import javax.inject.Inject

class PopularMoviesActivity : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {

    companion object {
        private val TAG = PopularMoviesActivity::class.java.simpleName!!
    }

    @Inject
    lateinit var retrofit: Retrofit

    @BindView(R.id.swipe_layout)
    lateinit var swipeRefreshLayout: SwipeRefreshLayout

    @BindView(R.id.movies_list_view)
    lateinit var popularMoviesListView: PopularMoviesListView

    @BindView(R.id.movies_list_empty_view)
    lateinit var popularMoviesEmptyView: TextView

    private lateinit var viewModel: PopularMoviesViewModel
    private lateinit var adapter: PopularMoviesListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSimpleMovieDBApp().applicationComponent.inject(this)
        ButterKnife.bind(this)

        swipeRefreshLayout.setOnRefreshListener(this)

        adapter = PopularMoviesListAdapter()
        popularMoviesListView.adapter = adapter

        val movieService = retrofit.create(MovieService::class.java)

        val popularMoviesViewModelFactory = PopularMoviesViewModelFactory(movieService)
        viewModel = ViewModelProviders.of(this, popularMoviesViewModelFactory).get(PopularMoviesViewModel::class.java)

        viewModel.loadingStatus.observe(this, Observer { showLoading -> updateLoadingState(showLoading!!) })
        viewModel.popularMovies.subscribe { movies -> onPopularMoviesUpdated(movies) }

        viewModel.loadPopularMovies()
    }

    override fun onRefresh() {
        viewModel.loadPopularMovies()
    }

    private fun onPopularMoviesUpdated(movies: List<Movie>) {
        Log.i(TAG, "onPopularMoviesUpdated: movies: ${movies.size}")

        val showList = movies.isNotEmpty()

        if (showList) popularMoviesEmptyView.gone() else popularMoviesEmptyView.visible()
        if (showList) popularMoviesListView.visible() else popularMoviesListView.gone()

        adapter.updateList(movies)
    }

    private fun updateLoadingState(showLoading: Boolean) {
        swipeRefreshLayout.isRefreshing = showLoading
    }

    private fun getSimpleMovieDBApp(): SimpleMovieDBApplication {
        return application as SimpleMovieDBApplication
    }
}

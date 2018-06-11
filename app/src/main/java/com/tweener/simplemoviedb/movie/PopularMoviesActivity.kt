package com.tweener.simplemoviedb.movie

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
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
import com.tweener.simplemoviedb.core.listener.LoadMoreOnScrollListener
import com.tweener.simplemoviedb.movie.detail.PopularDetailView
import com.tweener.simplemoviedb.movie.list.PopularMoviesListAdapter
import com.tweener.simplemoviedb.movie.list.PopularMoviesListView
import retrofit2.Retrofit
import javax.inject.Inject

class PopularMoviesActivity : AppCompatActivity(), PopularMoviesListAdapter.Callback {

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

    @BindView(R.id.movie_detail_view)
    lateinit var popularDetailView: PopularDetailView

    private lateinit var viewModel: PopularMoviesViewModel
    private lateinit var adapter: PopularMoviesListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSimpleMovieDBApp().applicationComponent.inject(this)
        ButterKnife.bind(this)

        swipeRefreshLayout.isEnabled = false

        adapter = PopularMoviesListAdapter(this)
        popularMoviesListView.adapter = adapter
        popularMoviesListView.addOnScrollListener(object : LoadMoreOnScrollListener() {
            override fun onLoadMore() {
                Log.i(TAG, "onLoadMore: ")
                viewModel.loadMorePopularMovies()
            }
        })

        popularDetailView.popularDetailViewStatus.observe(this, Observer { isDetailViewOpened ->
            // Disable swipe to refresh when the bottom sheet is opened
            swipeRefreshLayout.isEnabled = isDetailViewOpened!!.not()
        })

        val movieService = retrofit.create(MovieService::class.java)

        val popularMoviesViewModelFactory = PopularMoviesViewModelFactory(movieService)
        viewModel = ViewModelProviders.of(this, popularMoviesViewModelFactory).get(PopularMoviesViewModel::class.java)

        viewModel.loadingStatus.observe(this, Observer { showLoading -> updateLoadingState(showLoading!!) })
        viewModel.selectedMovie.observe(this, Observer { movie -> popularDetailView.setMovie(movie!!) })
        viewModel.popularMovies.subscribe { movies -> onPopularMoviesUpdated(movies) }

        viewModel.loadPopularMovies()
    }

    override fun onMovieTapped(movie: Movie) {
        popularDetailView.setState(BottomSheetBehavior.STATE_COLLAPSED)
        viewModel.onMovieSelected(movie)
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

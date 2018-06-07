package com.tweener.simplemoviedb.movie

import android.support.v7.widget.RecyclerView
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.tweener.simplemoviedb.R
import com.tweener.simplemoviedb.core.domain.entity.Movie

/**
 * @author Vivien Mahe
 */
class PopularMoviesListAdapter(val callback: Callback?) : RecyclerView.Adapter<PopularMoviesListAdapter.PopularMoviesListViewHolder>() {

    companion object {
        private val TAG = PopularMoviesListAdapter::class.java.simpleName!!

        private const val CONTENT_MOVIE_ITEM_VIEW_RES_ID = R.id.popular_movies_list_item_movie_item

        class MovieItem(val viewType: ViewType, val movie: Movie?) {
            companion object {
                fun createMovieItem(movie: Movie) = MovieItem(ViewType.MOVIE, movie)
                fun createSectionHeader() = MovieItem(ViewType.SECTION_HEADER, null)
            }
        }
    }

    interface Callback {
        fun onMovieTapped(movie: Movie)
    }

    private val movies: MutableList<Movie> = ArrayList()
    private val itemViews: MutableList<MovieItem> = ArrayList()

    override fun getItemCount(): Int = itemViews.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularMoviesListViewHolder {
        val itemViewType = ViewType.values()[viewType]

        val itemView = when (itemViewType) {
            ViewType.SECTION_HEADER -> View.inflate(parent.context, R.layout.popular_movies_list_item_section_header, null)
            ViewType.MOVIE -> View.inflate(parent.context, R.layout.popular_movies_list_item_movie, null)
        }

        itemView.layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        return PopularMoviesListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PopularMoviesListViewHolder, position: Int) {
        when (getViewTypeAtPosition(position)) {
            ViewType.SECTION_HEADER -> {
                // Nothing to do
            }

            ViewType.MOVIE -> {
                val movie = itemViews[position].movie // Should not be null
                movie?.let { holder.getMovieItemView(movie).configureView(it.originalTitle, it.releaseDate, it.voteAverage, it.posterPath) }
            }
        }
    }

    override fun getItemViewType(position: Int) = getViewTypeAtPosition(position).ordinal

    fun updateList(movies: List<Movie>) {
        this.movies.clear()
        this.movies.addAll(movies)

        buildItemViews()
        notifyDataSetChanged()
    }

    private fun getViewTypeAtPosition(position: Int) = itemViews[position].viewType

    private fun buildItemViews() {
        itemViews.clear()

        // Add a section header first
        itemViews.add(MovieItem.createSectionHeader())

        // Then the list of movies
        for (movie in movies) {
            itemViews.add(MovieItem.createMovieItem(movie))
        }
    }

    inner class PopularMoviesListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun getMovieItemView(movie: Movie): PopularMoviesMovieItem {
            itemView.setOnTouchListener { _, event ->
                if (event.action == MotionEvent.ACTION_UP) callback?.onMovieTapped(movie)
                false
            }

            return itemView.findViewById(CONTENT_MOVIE_ITEM_VIEW_RES_ID) as PopularMoviesMovieItem
        }
    }

    enum class ViewType {
        MOVIE,
        SECTION_HEADER
    }
}
package com.tweener.simplemoviedb.movie.list

import android.content.Context
import android.os.Build
import android.support.v7.widget.CardView
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.tweener.simplemoviedb.R
import com.tweener.simplemoviedb.core.Constants.Companion.API_IMAGE_THUMBNAIL_URL_FORMAT
import com.tweener.simplemoviedb.core.glide.GlideApp

/**
 * @author Vivien Mahe
 */
class PopularMoviesMovieItem(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs) {

    companion object {
        private val TAG = PopularMoviesMovieItem::class.java.simpleName!!
    }

    @BindView(R.id.popular_movies_list_item_movie_cardview)
    lateinit var cardView: CardView

    @BindView(R.id.popular_movies_list_item_movie_image)
    lateinit var imageView: ImageView

    @BindView(R.id.popular_movies_list_item_movie_title)
    lateinit var titleTextView: TextView

    @BindView(R.id.popular_movies_list_item_movie_release_date)
    lateinit var releaseDateTextView: TextView

    @BindView(R.id.popular_movies_list_item_movie_ratings)
    lateinit var ratingsTextView: TextView

    private var posterUrl: String? = null
    private val glideRequestOptions: RequestOptions

    init {
        View.inflate(context, R.layout.popular_movies_list_item_movie_content, this)
        ButterKnife.bind(this)

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            cardView.preventCornerOverlap = false
            cardView.radius = resources.getDimension(R.dimen.cardview_corner_radius)
        }

        glideRequestOptions = RequestOptions().centerInside()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        GlideApp.with(context)
                .load(posterUrl)
                .apply(glideRequestOptions)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageView)
    }

    fun configureView(title: String?, releaseDate: String?, ratings: Float?, posterPath: String?) {
        this.posterUrl = String.format(API_IMAGE_THUMBNAIL_URL_FORMAT, posterPath)

        title?.let { titleTextView.text = it }
        releaseDate?.let { releaseDateTextView.text = it }
        ratings?.let { ratingsTextView.text = it.toString() }
    }
}
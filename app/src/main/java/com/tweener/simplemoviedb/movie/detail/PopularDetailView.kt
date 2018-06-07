package com.tweener.simplemoviedb.movie.detail

import android.arch.lifecycle.MutableLiveData
import android.content.Context
import android.support.design.widget.BottomSheetBehavior
import android.support.v4.view.ViewCompat
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.tweener.simplemoviedb.R
import com.tweener.simplemoviedb.core.domain.entity.Movie

/**
 * @author Vivien Mahe
 */
class PopularDetailView(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs) {

    companion object {
        private val TAG = PopularDetailView::class.java.simpleName!!
    }


    @BindView(R.id.movie_detail_bottom_sheet)
    lateinit var bottomSheet: ViewGroup

    @BindView(R.id.movie_detail_overview)
    lateinit var overviewTextView: TextView

    private var bottomSheetBehavior: BottomSheetBehavior<ViewGroup>? = null

    // Observable properties
    val popularDetailViewStatus = MutableLiveData<Boolean>() // Whether this view shown or not

    init {
        View.inflate(context, R.layout.popular_detail_view, this)
        ButterKnife.bind(this)

        ViewCompat.setElevation(bottomSheet, 8f)

        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        bottomSheetBehavior!!.state = BottomSheetBehavior.STATE_HIDDEN
        bottomSheetBehavior!!.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                onBottomSheetSlide(slideOffset)
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {
                onBottomSheetStateChanged(newState)
            }
        })
    }

    fun setMovie(movie: Movie) {
        movie.overview?.let { overviewTextView.text = it }
    }

    fun setState(state: Int) {
        bottomSheetBehavior?.state = state
    }

    private fun onBottomSheetStateChanged(newState: Int) {
        popularDetailViewStatus.value = newState != BottomSheetBehavior.STATE_HIDDEN

        when (newState) {
            BottomSheetBehavior.STATE_HIDDEN -> Log.i(TAG, "onBottomSheetStateChanged: STATE_HIDDEN")
            BottomSheetBehavior.STATE_COLLAPSED -> Log.i(TAG, "onBottomSheetStateChanged: STATE_COLLAPSED")
            BottomSheetBehavior.STATE_EXPANDED -> Log.i(TAG, "onBottomSheetStateChanged: STATE_EXPANDED")
            BottomSheetBehavior.STATE_DRAGGING -> Log.i(TAG, "onBottomSheetStateChanged: STATE_DRAGGING")
            BottomSheetBehavior.STATE_SETTLING -> Log.i(TAG, "onBottomSheetStateChanged: STATE_SETTLING")
        }
    }

    private fun onBottomSheetSlide(slideOffset: Float) {
        Log.i(TAG, "onBottomSheetSlide: slideOffset=$slideOffset")
    }
}
package com.tweener.simplemoviedb.core.listener

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

/**
 * @author Vivien Mahe
 */
abstract class LoadMoreOnScrollListener : RecyclerView.OnScrollListener() {

    companion object {
        private val TAG = LoadMoreOnScrollListener::class.java.simpleName!!

        /**
         * Number of items, from the end of the dataset, that should trigger the loading process
         */
        private val VISIBLE_THRESHOLD = 5
    }

    protected abstract fun onLoadMore()

    /**
     * Total of items in the dataset after the last fetch
     */
    private var previousTotal = 0

    /**
     * Whether or not a request is running
     */
    private var isLoading = true

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)

        val visibleItemCount = recyclerView.childCount
        val totalItemCount = recyclerView.layoutManager.itemCount
        val firstVisibleItem = (recyclerView.layoutManager as LinearLayoutManager).findFirstVisibleItemPosition()

        if (isLoading) {
            if (totalItemCount > previousTotal) {
                isLoading = false
                previousTotal = totalItemCount
            }
        }

        if (isLoading.not() && (totalItemCount - visibleItemCount <= firstVisibleItem + VISIBLE_THRESHOLD)) {
            // We reached the limit set by VISIBLE_THRESHOLD, we need to load more items
            onLoadMore()
            isLoading = true
        }
    }
}
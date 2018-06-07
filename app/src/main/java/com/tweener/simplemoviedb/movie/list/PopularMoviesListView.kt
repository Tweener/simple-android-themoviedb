package com.tweener.simplemoviedb.movie.list

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet

/**
 * @author Vivien Mahe
 */
class PopularMoviesListView(context: Context, attrs: AttributeSet) : RecyclerView(context, attrs) {

    init {
        layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}
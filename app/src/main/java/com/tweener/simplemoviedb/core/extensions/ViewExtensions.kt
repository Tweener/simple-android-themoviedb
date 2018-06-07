package com.tweener.simplemoviedb.core.extensions

import android.view.View

/**
 * Extension functions for [View] class.
 * @author Vivien Mahe
 */

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

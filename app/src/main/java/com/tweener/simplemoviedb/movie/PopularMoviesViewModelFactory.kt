package com.tweener.simplemoviedb.movie

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

/**
 * @author Vivien Mahe
 */
class PopularMoviesViewModelFactory(
        private val movieService: MovieService
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PopularMoviesViewModel::class.java)) {
            return PopularMoviesViewModel(movieService) as T
        }
        throw  IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
    }
}
package com.tweener.simplemoviedb.util

import com.tweener.simplemoviedb.core.api.entity.ApiMovie

/**
 * @author Vivien Mahe
 */
class MovieTestFactory {

    companion object {
        fun createApiMovie(id: Int, title: String, releaseDate: String): ApiMovie {
            val apiMovie = ApiMovie()
            apiMovie.id = id
            apiMovie.originalTitle = title
            apiMovie.releaseDate = releaseDate
            return apiMovie
        }
    }
}
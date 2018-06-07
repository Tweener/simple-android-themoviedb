package com.tweener.simplemoviedb.core.domain.entity

/**
 * @author Vivien Mahe
 */
class Movie(
        var id: Int? = 0,
        var originalTitle: String? = null,
        var overview: String? = null,
        var voteAverage: Float? = 0f,
        var releaseDate: String? = null,
        var posterPath: String? = null
)
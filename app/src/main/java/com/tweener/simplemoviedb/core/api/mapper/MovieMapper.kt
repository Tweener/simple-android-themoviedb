package com.tweener.simplemoviedb.core.api.mapper

import com.tweener.simplemoviedb.core.api.entity.ApiMovie
import com.tweener.simplemoviedb.core.domain.entity.Movie

/**
 * @author Vivien Mahe
 */
class MovieMapper {

    fun convertToEntity(api: ApiMovie): Movie {
        val movie = Movie()

        movie.id = api.id
        movie.originalTitle = api.originalTitle
        movie.overview = api.overview
        movie.voteAverage = api.voteAverage
        movie.releaseDate = api.releaseDate
        movie.posterPath = api.posterPath

        return movie
    }
}
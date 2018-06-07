package com.tweener.simplemoviedb.core

/**
 * @author Vivien Mahe
 */
class Constants {

    companion object {
        const val MOVIE_DB_API_KEY = "833033fa099c4aa41830e15859a610f3"

        const val CACHE_SIZE = 10 * 1024 * 1024;

        const val API_BASE_URL = "https://api.themoviedb.org/3/"
        const val API_MOVIES = "movie/"
        const val API_MOVIE_DETAIL = API_MOVIES + "{movie_id}"
        const val API_POPULAR_MOVIES = API_MOVIES + "popular/"

        const val API_IMAGE_THUMBNAIL_URL_FORMAT = "https://image.tmdb.org/t/p/w185/%s" // %s = poster_path
        const val API_IMAGE_LARGE_URL_FORMAT = "https://image.tmdb.org/t/p/w780/%s" // %s = poster_path
    }
}
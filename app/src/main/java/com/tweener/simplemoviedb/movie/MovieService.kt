package com.tweener.simplemoviedb.movie

import com.tweener.simplemoviedb.core.Constants.Companion.API_POPULAR_MOVIES
import com.tweener.simplemoviedb.core.api.entity.ApiMovies
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Vivien Mahe
 */
interface MovieService {

    @GET(API_POPULAR_MOVIES)
    fun getPopularMovies(@Query("api_key") apiKey: String): Single<ApiMovies>
}
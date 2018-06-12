package com.tweener.simplemoviedb.util

import android.util.Log
import com.tweener.simplemoviedb.core.api.entity.ApiMovie
import com.tweener.simplemoviedb.core.api.entity.ApiMovies
import io.reactivex.Single
import java.util.Arrays.asList

/**
 * @author Vivien Mahe
 */
class PopularMoviesFactory {

    companion object {
        private val TAG = PopularMoviesFactory::class.java.simpleName!!

        fun createSingleApiPopularMoviesSuccessResponse(page: Int, vararg movies: ApiMovie): Single<ApiMovies> {
            return Single.create({ emitter ->
                try {
                    emitter.onSuccess(ApiMovies(page, asList(*movies), true))
                } catch (throwable: Throwable) {
                    Log.e(TAG, "createSingleApiPopularMoviesSuccessResponse: ", throwable)
                }
            })
        }


        fun createSingleApiPopularMoviesErrorResponse(page: Int, errorMessage: String): Single<ApiMovies> {
            return Single.create({ emitter ->
                try {
                    emitter.onSuccess(ApiMovies(page, emptyList(), false, errorMessage))
                } catch (throwable: Throwable) {
                    Log.e(TAG, "createSingleApiPopularMoviesErrorResponse: ", throwable)
                }
            })
        }
    }
}
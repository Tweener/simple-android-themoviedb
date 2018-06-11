package com.tweener.simplemoviedb.core.domain.usecase

import com.tweener.simplemoviedb.core.Constants.Companion.MOVIE_DB_API_KEY
import com.tweener.simplemoviedb.core.api.entity.ApiMovies
import com.tweener.simplemoviedb.core.api.mapper.MovieMapper
import com.tweener.simplemoviedb.core.domain.entity.Movie
import com.tweener.simplemoviedb.core.domain.usecase.definition.UseCaseParams
import com.tweener.simplemoviedb.movie.MovieService
import io.reactivex.Single

/**
 * @author Vivien Mahe
 */
class GetPopularMoviesUseCase(val movieService: MovieService) : UseCaseParams<Single<List<Movie>>, GetPopularMoviesUseCase.RequestParams>() {

    companion object {
        private val TAG = GetPopularMoviesUseCase::class.java.simpleName!!

        private val MOVIE_MAPPER = MovieMapper()
    }

    override fun execute(params: RequestParams): Single<List<Movie>> {
        return movieService.getPopularMovies(MOVIE_DB_API_KEY, params.page)
                .flatMap { apiMovies -> validateResponse(apiMovies) }
    }

    private fun validateResponse(apiMovies: ApiMovies): Single<List<Movie>> {
        return Single.create { emitter ->
            try {
                if (apiMovies.success == true) {
                    val movies = apiMovies.results.map { apiMovie -> MOVIE_MAPPER.convertToEntity(apiMovie) }
                    emitter.onSuccess(movies)
                } else {
                    // Store the status message as a Throwable to retrieve it later on
                    emitter.onError(Throwable(apiMovies.statusMessage))
                }
            } catch (throwable: Throwable) {
                emitter.onError(throwable)
            }
        }
    }

    open class RequestParams(val page: Int = 1) : UseCaseParams.InputParams()
}
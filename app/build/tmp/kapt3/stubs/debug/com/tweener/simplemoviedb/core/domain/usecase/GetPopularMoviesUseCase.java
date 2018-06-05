package com.tweener.simplemoviedb.core.domain.usecase;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/tweener/simplemoviedb/core/domain/usecase/GetPopularMoviesUseCase;", "Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCaseNoParams;", "Lio/reactivex/Single;", "", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "movieService", "Lcom/tweener/simplemoviedb/movie/MovieService;", "(Lcom/tweener/simplemoviedb/movie/MovieService;)V", "getMovieService", "()Lcom/tweener/simplemoviedb/movie/MovieService;", "execute", "validateResponse", "apiMovies", "Lcom/tweener/simplemoviedb/core/api/entity/ApiMovies;", "Companion", "app_debug"})
public final class GetPopularMoviesUseCase extends com.tweener.simplemoviedb.core.domain.usecase.definition.UseCaseNoParams<io.reactivex.Single<java.util.List<? extends com.tweener.simplemoviedb.core.domain.entity.Movie>>> {
    @org.jetbrains.annotations.NotNull()
    private final com.tweener.simplemoviedb.movie.MovieService movieService = null;
    private static final java.lang.String TAG = null;
    private static final com.tweener.simplemoviedb.core.api.mapper.MovieMapper MOVIE_MAPPER = null;
    public static final com.tweener.simplemoviedb.core.domain.usecase.GetPopularMoviesUseCase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie>> execute() {
        return null;
    }
    
    private final io.reactivex.Single<java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie>> validateResponse(com.tweener.simplemoviedb.core.api.entity.ApiMovies apiMovies) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tweener.simplemoviedb.movie.MovieService getMovieService() {
        return null;
    }
    
    public GetPopularMoviesUseCase(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.movie.MovieService movieService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tweener/simplemoviedb/core/domain/usecase/GetPopularMoviesUseCase$Companion;", "", "()V", "MOVIE_MAPPER", "Lcom/tweener/simplemoviedb/core/api/mapper/MovieMapper;", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
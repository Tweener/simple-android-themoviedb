package com.tweener.simplemoviedb.movie;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesViewModel;", "Landroid/arch/lifecycle/ViewModel;", "movieService", "Lcom/tweener/simplemoviedb/movie/MovieService;", "(Lcom/tweener/simplemoviedb/movie/MovieService;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getPopularMoviesUseCase", "Lcom/tweener/simplemoviedb/core/domain/usecase/GetPopularMoviesUseCase;", "loadingStatus", "Landroid/arch/lifecycle/MutableLiveData;", "", "getLoadingStatus", "()Landroid/arch/lifecycle/MutableLiveData;", "popularMovies", "Lio/reactivex/subjects/BehaviorSubject;", "", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "getPopularMovies", "()Lio/reactivex/subjects/BehaviorSubject;", "loadPopularMovies", "", "onCleared", "onMovieSelected", "movie", "Companion", "app_debug"})
public final class PopularMoviesViewModel extends android.arch.lifecycle.ViewModel {
    private final com.tweener.simplemoviedb.core.domain.usecase.GetPopularMoviesUseCase getPopularMoviesUseCase = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> loadingStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie>> popularMovies = null;
    private final com.tweener.simplemoviedb.movie.MovieService movieService = null;
    private static final java.lang.String TAG = null;
    public static final com.tweener.simplemoviedb.movie.PopularMoviesViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie>> getPopularMovies() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void loadPopularMovies() {
    }
    
    public final void onMovieSelected(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.core.domain.entity.Movie movie) {
    }
    
    public PopularMoviesViewModel(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.movie.MovieService movieService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
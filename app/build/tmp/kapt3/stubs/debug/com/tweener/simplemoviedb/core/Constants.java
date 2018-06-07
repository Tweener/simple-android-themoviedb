package com.tweener.simplemoviedb.core;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/tweener/simplemoviedb/core/Constants;", "", "()V", "Companion", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_DB_API_KEY = "833033fa099c4aa41830e15859a610f3";
    public static final int CACHE_SIZE = 10485760;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_MOVIES = "movie/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_MOVIE_DETAIL = "movie/{movie_id}";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_POPULAR_MOVIES = "movie/popular/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_IMAGE_THUMBNAIL_URL_FORMAT = "https://image.tmdb.org/t/p/w185/%s";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_IMAGE_LARGE_URL_FORMAT = "https://image.tmdb.org/t/p/w780/%s";
    public static final com.tweener.simplemoviedb.core.Constants.Companion Companion = null;
    
    public Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/tweener/simplemoviedb/core/Constants$Companion;", "", "()V", "API_BASE_URL", "", "API_IMAGE_LARGE_URL_FORMAT", "API_IMAGE_THUMBNAIL_URL_FORMAT", "API_MOVIES", "API_MOVIE_DETAIL", "API_POPULAR_MOVIES", "CACHE_SIZE", "", "MOVIE_DB_API_KEY", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
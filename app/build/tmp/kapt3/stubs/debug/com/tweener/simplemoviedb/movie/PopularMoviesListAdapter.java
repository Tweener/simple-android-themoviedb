package com.tweener.simplemoviedb.movie;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001e2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0004\u001d\u001e\u001f B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u001c\u0010\u0015\u001a\u00020\u000e2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0014\u0010\u001b\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u001cR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$PopularMoviesListViewHolder;", "callback", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Callback;", "(Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Callback;)V", "getCallback", "()Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Callback;", "itemViews", "", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Companion$MovieItem;", "movies", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "buildItemViews", "", "getItemCount", "", "getItemViewType", "position", "getViewTypeAtPosition", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$ViewType;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "", "Callback", "Companion", "PopularMoviesListViewHolder", "ViewType", "app_debug"})
public final class PopularMoviesListAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.PopularMoviesListViewHolder> {
    private final java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie> movies = null;
    private final java.util.List<com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.Companion.MovieItem> itemViews = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.Callback callback = null;
    private static final java.lang.String TAG = null;
    private static final int CONTENT_MOVIE_ITEM_VIEW_RES_ID = 2131165277;
    public static final com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.PopularMoviesListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.PopularMoviesListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie> movies) {
    }
    
    private final com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.ViewType getViewTypeAtPosition(int position) {
        return null;
    }
    
    private final void buildItemViews() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.Callback getCallback() {
        return null;
    }
    
    public PopularMoviesListAdapter(@org.jetbrains.annotations.Nullable()
    com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.Callback callback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Callback;", "", "onMovieTapped", "", "movie", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onMovieTapped(@org.jetbrains.annotations.NotNull()
        com.tweener.simplemoviedb.core.domain.entity.Movie movie);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$PopularMoviesListViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter;Landroid/view/View;)V", "getMovieItemView", "Lcom/tweener/simplemoviedb/movie/PopularMoviesMovieItem;", "movie", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "app_debug"})
    public final class PopularMoviesListViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        @org.jetbrains.annotations.NotNull()
        public final com.tweener.simplemoviedb.movie.PopularMoviesMovieItem getMovieItemView(@org.jetbrains.annotations.NotNull()
        com.tweener.simplemoviedb.core.domain.entity.Movie movie) {
            return null;
        }
        
        public PopularMoviesListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "MOVIE", "SECTION_HEADER", "app_debug"})
    public static enum ViewType {
        /*public static final*/ MOVIE /* = new MOVIE() */,
        /*public static final*/ SECTION_HEADER /* = new SECTION_HEADER() */;
        
        ViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Companion;", "", "()V", "CONTENT_MOVIE_ITEM_VIEW_RES_ID", "", "TAG", "", "MovieItem", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$Companion$MovieItem;", "", "viewType", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$ViewType;", "movie", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "(Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$ViewType;Lcom/tweener/simplemoviedb/core/domain/entity/Movie;)V", "getMovie", "()Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "getViewType", "()Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter$ViewType;", "Companion", "app_debug"})
        public static final class MovieItem {
            @org.jetbrains.annotations.NotNull()
            private final com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.ViewType viewType = null;
            @org.jetbrains.annotations.Nullable()
            private final com.tweener.simplemoviedb.core.domain.entity.Movie movie = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.ViewType getViewType() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.tweener.simplemoviedb.core.domain.entity.Movie getMovie() {
                return null;
            }
            
            public MovieItem(@org.jetbrains.annotations.NotNull()
            com.tweener.simplemoviedb.movie.PopularMoviesListAdapter.ViewType viewType, @org.jetbrains.annotations.Nullable()
            com.tweener.simplemoviedb.core.domain.entity.Movie movie) {
                super();
            }
        }
    }
}
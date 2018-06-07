package com.tweener.simplemoviedb.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0016\u0010&\u001a\u00020#2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\b\u0010*\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "()V", "adapter", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListAdapter;", "popularMoviesEmptyView", "Landroid/widget/TextView;", "getPopularMoviesEmptyView", "()Landroid/widget/TextView;", "setPopularMoviesEmptyView", "(Landroid/widget/TextView;)V", "popularMoviesListView", "Lcom/tweener/simplemoviedb/movie/PopularMoviesListView;", "getPopularMoviesListView", "()Lcom/tweener/simplemoviedb/movie/PopularMoviesListView;", "setPopularMoviesListView", "(Lcom/tweener/simplemoviedb/movie/PopularMoviesListView;)V", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "swipeRefreshLayout", "Landroid/support/v4/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroid/support/v4/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroid/support/v4/widget/SwipeRefreshLayout;)V", "viewModel", "Lcom/tweener/simplemoviedb/movie/PopularMoviesViewModel;", "getSimpleMovieDBApp", "Lcom/tweener/simplemoviedb/core/SimpleMovieDBApplication;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPopularMoviesUpdated", "movies", "", "Lcom/tweener/simplemoviedb/core/domain/entity/Movie;", "onRefresh", "updateLoadingState", "showLoading", "", "Companion", "app_debug"})
public final class PopularMoviesActivity extends android.support.v7.app.AppCompatActivity implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public retrofit2.Retrofit retrofit;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.swipe_layout)
    public android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.movies_list_view)
    public com.tweener.simplemoviedb.movie.PopularMoviesListView popularMoviesListView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.movies_list_empty_view)
    public android.widget.TextView popularMoviesEmptyView;
    private com.tweener.simplemoviedb.movie.PopularMoviesViewModel viewModel;
    private com.tweener.simplemoviedb.movie.PopularMoviesListAdapter adapter;
    private static final java.lang.String TAG = null;
    public static final com.tweener.simplemoviedb.movie.PopularMoviesActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v4.widget.SwipeRefreshLayout getSwipeRefreshLayout() {
        return null;
    }
    
    public final void setSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    android.support.v4.widget.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tweener.simplemoviedb.movie.PopularMoviesListView getPopularMoviesListView() {
        return null;
    }
    
    public final void setPopularMoviesListView(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.movie.PopularMoviesListView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getPopularMoviesEmptyView() {
        return null;
    }
    
    public final void setPopularMoviesEmptyView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    private final void onPopularMoviesUpdated(java.util.List<com.tweener.simplemoviedb.core.domain.entity.Movie> movies) {
    }
    
    private final void updateLoadingState(boolean showLoading) {
    }
    
    private final com.tweener.simplemoviedb.core.SimpleMovieDBApplication getSimpleMovieDBApp() {
        return null;
    }
    
    public PopularMoviesActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
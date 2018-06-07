package com.tweener.simplemoviedb.movie;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J3\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010&\u001a\u0004\u0018\u00010\u00162\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001e\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c\u00a8\u00060"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesMovieItem;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardView", "Landroid/support/v7/widget/CardView;", "getCardView", "()Landroid/support/v7/widget/CardView;", "setCardView", "(Landroid/support/v7/widget/CardView;)V", "glideRequestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "posterUrl", "", "ratingsTextView", "Landroid/widget/TextView;", "getRatingsTextView", "()Landroid/widget/TextView;", "setRatingsTextView", "(Landroid/widget/TextView;)V", "releaseDateTextView", "getReleaseDateTextView", "setReleaseDateTextView", "titleTextView", "getTitleTextView", "setTitleTextView", "configureView", "", "title", "releaseDate", "ratings", "", "posterPath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)V", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "Companion", "app_debug"})
public final class PopularMoviesMovieItem extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.popular_movies_list_item_movie_cardview)
    public android.support.v7.widget.CardView cardView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.popular_movies_list_item_movie_image)
    public android.widget.ImageView imageView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.popular_movies_list_item_movie_title)
    public android.widget.TextView titleTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.popular_movies_list_item_movie_release_date)
    public android.widget.TextView releaseDateTextView;
    @org.jetbrains.annotations.NotNull()
    @butterknife.BindView(value = com.tweener.simplemoviedb.R.id.popular_movies_list_item_movie_ratings)
    public android.widget.TextView ratingsTextView;
    private java.lang.String posterUrl;
    private final com.bumptech.glide.request.RequestOptions glideRequestOptions = null;
    private static final java.lang.String TAG = null;
    public static final com.tweener.simplemoviedb.movie.PopularMoviesMovieItem.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.widget.CardView getCardView() {
        return null;
    }
    
    public final void setCardView(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.CardView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getImageView() {
        return null;
    }
    
    public final void setImageView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getTitleTextView() {
        return null;
    }
    
    public final void setTitleTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getReleaseDateTextView() {
        return null;
    }
    
    public final void setReleaseDateTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getRatingsTextView() {
        return null;
    }
    
    public final void setRatingsTextView(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public final void configureView(@org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.Float ratings, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath) {
    }
    
    public PopularMoviesMovieItem(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tweener/simplemoviedb/movie/PopularMoviesMovieItem$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
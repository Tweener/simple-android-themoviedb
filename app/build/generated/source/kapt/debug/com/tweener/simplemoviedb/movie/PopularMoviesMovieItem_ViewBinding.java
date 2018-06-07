// Generated code from Butter Knife. Do not modify!
package com.tweener.simplemoviedb.movie;

import android.support.annotation.UiThread;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tweener.simplemoviedb.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class PopularMoviesMovieItem_ViewBinding implements Unbinder {
  private PopularMoviesMovieItem target;

  @UiThread
  public PopularMoviesMovieItem_ViewBinding(PopularMoviesMovieItem target) {
    this(target, target);
  }

  @UiThread
  public PopularMoviesMovieItem_ViewBinding(PopularMoviesMovieItem target, View source) {
    this.target = target;

    target.cardView = Utils.findRequiredViewAsType(source, R.id.popular_movies_list_item_movie_cardview, "field 'cardView'", CardView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.popular_movies_list_item_movie_image, "field 'imageView'", ImageView.class);
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.popular_movies_list_item_movie_title, "field 'titleTextView'", TextView.class);
    target.releaseDateTextView = Utils.findRequiredViewAsType(source, R.id.popular_movies_list_item_movie_release_date, "field 'releaseDateTextView'", TextView.class);
    target.ratingsTextView = Utils.findRequiredViewAsType(source, R.id.popular_movies_list_item_movie_ratings, "field 'ratingsTextView'", TextView.class);
  }

  @Override
  public void unbind() {
    PopularMoviesMovieItem target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cardView = null;
    target.imageView = null;
    target.titleTextView = null;
    target.releaseDateTextView = null;
    target.ratingsTextView = null;
  }
}

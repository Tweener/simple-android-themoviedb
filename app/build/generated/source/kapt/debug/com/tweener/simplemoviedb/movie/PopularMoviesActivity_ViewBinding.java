// Generated code from Butter Knife. Do not modify!
package com.tweener.simplemoviedb.movie;

import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.tweener.simplemoviedb.R;
import com.tweener.simplemoviedb.movie.detail.PopularDetailView;
import com.tweener.simplemoviedb.movie.list.PopularMoviesListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class PopularMoviesActivity_ViewBinding implements Unbinder {
  private PopularMoviesActivity target;

  @UiThread
  public PopularMoviesActivity_ViewBinding(PopularMoviesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PopularMoviesActivity_ViewBinding(PopularMoviesActivity target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipe_layout, "field 'swipeRefreshLayout'", SwipeRefreshLayout.class);
    target.popularMoviesListView = Utils.findRequiredViewAsType(source, R.id.movies_list_view, "field 'popularMoviesListView'", PopularMoviesListView.class);
    target.popularMoviesEmptyView = Utils.findRequiredViewAsType(source, R.id.movies_list_empty_view, "field 'popularMoviesEmptyView'", TextView.class);
    target.popularDetailView = Utils.findRequiredViewAsType(source, R.id.movie_detail_view, "field 'popularDetailView'", PopularDetailView.class);
  }

  @Override
  public void unbind() {
    PopularMoviesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.popularMoviesListView = null;
    target.popularMoviesEmptyView = null;
    target.popularDetailView = null;
  }
}

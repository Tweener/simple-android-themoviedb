package com.tweener.simplemoviedb.movie;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PopularMoviesActivity_MembersInjector
    implements MembersInjector<PopularMoviesActivity> {
  private final Provider<Retrofit> retrofitProvider;

  public PopularMoviesActivity_MembersInjector(Provider<Retrofit> retrofitProvider) {
    assert retrofitProvider != null;
    this.retrofitProvider = retrofitProvider;
  }

  public static MembersInjector<PopularMoviesActivity> create(Provider<Retrofit> retrofitProvider) {
    return new PopularMoviesActivity_MembersInjector(retrofitProvider);
  }

  @Override
  public void injectMembers(PopularMoviesActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.retrofit = retrofitProvider.get();
  }
}

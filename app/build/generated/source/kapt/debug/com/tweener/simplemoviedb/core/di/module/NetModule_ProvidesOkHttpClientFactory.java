package com.tweener.simplemoviedb.core.di.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetModule module;

  private final Provider<Context> contextProvider;

  private final Provider<Cache> cacheProvider;

  public NetModule_ProvidesOkHttpClientFactory(
      NetModule module, Provider<Context> contextProvider, Provider<Cache> cacheProvider) {
    assert module != null;
    this.module = module;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert cacheProvider != null;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.providesOkHttpClient(contextProvider.get(), cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      NetModule module, Provider<Context> contextProvider, Provider<Cache> cacheProvider) {
    return new NetModule_ProvidesOkHttpClientFactory(module, contextProvider, cacheProvider);
  }
}

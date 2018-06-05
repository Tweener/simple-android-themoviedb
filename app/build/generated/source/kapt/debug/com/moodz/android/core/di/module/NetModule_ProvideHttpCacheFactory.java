package com.moodz.android.core.di.module;

import android.content.Context;

import com.tweener.simplemoviedb.core.di.module.NetModule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvideHttpCacheFactory implements Factory<Cache> {
  private final NetModule module;

  private final Provider<Context> appContextProvider;

  public NetModule_ProvideHttpCacheFactory(NetModule module, Provider<Context> appContextProvider) {
    assert module != null;
    this.module = module;
    assert appContextProvider != null;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.provideHttpCache(appContextProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache> create(NetModule module, Provider<Context> appContextProvider) {
    return new NetModule_ProvideHttpCacheFactory(module, appContextProvider);
  }
}

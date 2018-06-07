package com.tweener.simplemoviedb.core.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetModule_ProvideRetrofitFactory(
      NetModule module, Provider<OkHttpClient> okHttpClientProvider) {
    assert module != null;
    this.module = module;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      NetModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new NetModule_ProvideRetrofitFactory(module, okHttpClientProvider);
  }
}

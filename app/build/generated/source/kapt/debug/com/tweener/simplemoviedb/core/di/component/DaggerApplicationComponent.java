package com.tweener.simplemoviedb.core.di.component;

import android.content.Context;
import com.tweener.simplemoviedb.core.di.module.ApplicationModule;
import com.tweener.simplemoviedb.core.di.module.ApplicationModule_ProvidesContextFactory;
import com.tweener.simplemoviedb.core.di.module.NetModule;
import com.tweener.simplemoviedb.core.di.module.NetModule_ProvideHttpCacheFactory;
import com.tweener.simplemoviedb.core.di.module.NetModule_ProvideRetrofitFactory;
import com.tweener.simplemoviedb.core.di.module.NetModule_ProvidesOkHttpClientFactory;
import com.tweener.simplemoviedb.movie.PopularMoviesActivity;
import com.tweener.simplemoviedb.movie.PopularMoviesActivity_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Context> providesContextProvider;

  private Provider<Cache> provideHttpCacheProvider;

  private Provider<OkHttpClient> providesOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private MembersInjector<PopularMoviesActivity> popularMoviesActivityMembersInjector;

  private DaggerApplicationComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.providesContextProvider =
        DoubleCheck.provider(
            ApplicationModule_ProvidesContextFactory.create(builder.applicationModule));

    this.provideHttpCacheProvider =
        DoubleCheck.provider(
            NetModule_ProvideHttpCacheFactory.create(builder.netModule, providesContextProvider));

    this.providesOkHttpClientProvider =
        DoubleCheck.provider(
            NetModule_ProvidesOkHttpClientFactory.create(
                builder.netModule, providesContextProvider, provideHttpCacheProvider));

    this.provideRetrofitProvider =
        DoubleCheck.provider(
            NetModule_ProvideRetrofitFactory.create(
                builder.netModule, providesOkHttpClientProvider));

    this.popularMoviesActivityMembersInjector =
        PopularMoviesActivity_MembersInjector.create(provideRetrofitProvider);
  }

  @Override
  public void inject(PopularMoviesActivity popularMoviesActivity) {
    popularMoviesActivityMembersInjector.injectMembers(popularMoviesActivity);
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private NetModule netModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (applicationModule == null) {
        throw new IllegalStateException(
            ApplicationModule.class.getCanonicalName() + " must be set");
      }
      if (netModule == null) {
        this.netModule = new NetModule();
      }
      return new DaggerApplicationComponent(this);
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder netModule(NetModule netModule) {
      this.netModule = Preconditions.checkNotNull(netModule);
      return this;
    }
  }
}

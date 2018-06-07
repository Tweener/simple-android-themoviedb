package com.tweener.simplemoviedb.core.di.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvidesGsonFactory implements Factory<Gson> {
  private final NetModule module;

  public NetModule_ProvidesGsonFactory(NetModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.providesGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Gson> create(NetModule module) {
    return new NetModule_ProvidesGsonFactory(module);
  }
}

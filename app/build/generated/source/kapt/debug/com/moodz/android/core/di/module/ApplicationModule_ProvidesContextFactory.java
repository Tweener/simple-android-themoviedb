package com.moodz.android.core.di.module;

import android.content.Context;

import com.tweener.simplemoviedb.core.di.module.ApplicationModule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvidesContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  public ApplicationModule_ProvidesContextFactory(ApplicationModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.providesContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(ApplicationModule module) {
    return new ApplicationModule_ProvidesContextFactory(module);
  }
}

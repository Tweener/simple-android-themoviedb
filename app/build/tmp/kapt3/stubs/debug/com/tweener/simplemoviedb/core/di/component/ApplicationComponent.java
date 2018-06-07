package com.tweener.simplemoviedb.core.di.component;

import java.lang.System;

/**
 * * Application scoped component.
 * *
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tweener/simplemoviedb/core/di/component/ApplicationComponent;", "", "inject", "", "popularMoviesActivity", "Lcom/tweener/simplemoviedb/movie/PopularMoviesActivity;", "app_debug"})
@dagger.Component(modules = {com.tweener.simplemoviedb.core.di.module.ApplicationModule.class, com.tweener.simplemoviedb.core.di.module.NetModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.movie.PopularMoviesActivity popularMoviesActivity);
}
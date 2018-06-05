package com.tweener.simplemoviedb.core.di.component

import com.tweener.simplemoviedb.core.di.module.ApplicationModule
import com.tweener.simplemoviedb.core.di.module.NetModule
import com.tweener.simplemoviedb.movie.PopularMoviesActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Application scoped component.
 *
 * @author Vivien Mahe
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = arrayOf(ApplicationModule::class, NetModule::class))
interface ApplicationComponent {

    fun inject(popularMoviesActivity: PopularMoviesActivity)
}

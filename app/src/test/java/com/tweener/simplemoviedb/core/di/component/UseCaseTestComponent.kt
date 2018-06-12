package com.tweener.simplemoviedb.core.di.component

import com.tweener.simplemoviedb.core.di.module.ApplicationModule
import com.tweener.simplemoviedb.core.di.module.NetModule
import com.tweener.simplemoviedb.core.domain.usecase.GetPopularMoviesUseCaseTest
import dagger.Component
import javax.inject.Singleton

/**
 * @author Vivien Mahe
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = [(ApplicationModule::class), (NetModule::class)])
interface UseCaseTestComponent : ApplicationComponent {

    fun inject(getPopularMoviesUseCaseTest: GetPopularMoviesUseCaseTest)
}
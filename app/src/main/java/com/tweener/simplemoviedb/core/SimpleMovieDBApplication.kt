package com.tweener.simplemoviedb.core

import android.app.Application
import com.tweener.simplemoviedb.core.di.module.ApplicationModule
import com.tweener.simplemoviedb.core.di.module.NetModule
import com.tweener.simplemoviedb.core.di.component.ApplicationComponent
import com.tweener.simplemoviedb.core.di.component.DaggerApplicationComponent

/**
 * @author Vivien Mahe
 */
class SimpleMovieDBApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .netModule(NetModule())
                .build()
    }

}
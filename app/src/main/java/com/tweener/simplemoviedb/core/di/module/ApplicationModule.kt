package com.tweener.simplemoviedb.core.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Application scoped module.
 *
 * @author Vivien Mahe
 */
@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @Singleton
    fun providesContext(): Context = context
}

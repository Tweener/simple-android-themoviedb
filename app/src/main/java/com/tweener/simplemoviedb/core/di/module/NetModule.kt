package com.tweener.simplemoviedb.core.di.module

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ihsanbal.logging.Level
import com.ihsanbal.logging.LoggingInterceptor
import com.tweener.simplemoviedb.BuildConfig
import com.tweener.simplemoviedb.core.Constants.Companion.API_BASE_URL
import com.tweener.simplemoviedb.core.Constants.Companion.CACHE_SIZE
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.internal.platform.Platform
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Module that injects Retrofit and OkHttp libs.
 *
 * @author Vivien Mahe
 */
@Module
open class NetModule() {

    private val gson: Gson = GsonBuilder()
            .serializeNulls()
            .create()

    @Provides
    @Singleton
    fun providesGson(): Gson = gson

    @Provides
    @Singleton
    fun provideHttpCache(appContext: Context): Cache = Cache(appContext.cacheDir, CACHE_SIZE.toLong())

    @Provides
    @Singleton
    open fun providesOkHttpClient(context: Context, cache: Cache): OkHttpClient {
        // Add requests/responses logging
        val loggingInterceptor = LoggingInterceptor.Builder()
                .loggable(BuildConfig.DEBUG) // Logging only enabled for DEBUG builds
                .setLevel(Level.BASIC)
                .log(Platform.INFO)
                .request("Request")
                .response("Response")
                .build()

        val httpClient = OkHttpClient.Builder()
        httpClient
                .cache(cache)
                .readTimeout(0, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)

        return httpClient.build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .build()
    }
}

package com.tweener.simplemoviedb.core.di.module

import android.content.Context
import okhttp3.Cache
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * @author Vivien Mahe
 */
class NetTestModule : NetModule() {

    override fun providesOkHttpClient(context: Context, cache: Cache): OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient.cache(cache)
        httpClient.readTimeout(0, TimeUnit.SECONDS)

        return httpClient.build()
    }
}
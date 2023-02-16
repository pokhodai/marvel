package com.pokhodai.marvel.di.module.network.client

import com.pokhodai.marvel.BuildConfig
import com.pokhodai.marvel.di.annotations.HttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HttpClientModule {

    @Provides
    @Singleton
    @HttpClient
    fun httpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
    ): OkHttpClient {
        return OkHttpClient.Builder().apply {
            if (BuildConfig.DEBUG) addInterceptor(httpLoggingInterceptor)
        }.build()
    }
}
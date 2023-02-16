package com.pokhodai.marvel.di.module.network.retrofit

import com.pokhodai.marvel.data.settings.ApiURL
import com.pokhodai.marvel.di.annotations.ApiRetrofitClient
import com.pokhodai.marvel.di.annotations.HttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    @ApiRetrofitClient
    fun vitaRetrofit(
        @HttpClient okHttpClient: OkHttpClient,
        factory: GsonConverterFactory
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(ApiURL.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(factory)
            .build()
}
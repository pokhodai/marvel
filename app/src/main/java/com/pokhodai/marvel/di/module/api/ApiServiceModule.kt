package com.pokhodai.marvel.di.module.api

import com.pokhodai.marvel.data.services.ApiService
import com.pokhodai.marvel.di.annotations.ApiRetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiServiceModule {

    @Provides
    @Singleton
    fun provideApiService(@ApiRetrofitClient retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)
}
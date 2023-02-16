package com.pokhodai.marvel.di.annotations

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class HttpRequestInterceptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class HttpClient
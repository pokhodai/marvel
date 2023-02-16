package com.pokhodai.marvel.data.services

import androidx.compose.ui.geometry.Offset
import com.pokhodai.marvel.data.responses.character.CharacterResponse
import com.pokhodai.marvel.data.settings.ApiURL.PUBLIC_API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("characters")
    suspend fun getCharactersList(
        @Query("apikey") apikey: String = PUBLIC_API_KEY,
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int = 0
    ): Response<CharacterResponse>
}
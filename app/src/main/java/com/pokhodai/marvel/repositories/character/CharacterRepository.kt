package com.pokhodai.marvel.repositories.character

import com.pokhodai.marvel.data.services.ApiService
import com.pokhodai.marvel.utils.toResultFlow
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun getCharacterList() = toResultFlow {
        apiService.getCharactersList()
    }
}
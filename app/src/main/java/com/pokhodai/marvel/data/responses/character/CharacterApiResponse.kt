package com.pokhodai.marvel.data.responses.character

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("data") val data: CharacterDataResponse
) {
    data class CharacterDataResponse(
        @SerializedName("offset") val offset: Int = 0,
        @SerializedName("limit") val limit: Int = 0,
        @SerializedName("total") val total: Int = 0,
        @SerializedName("count") val count: Int = 0,
        @SerializedName("results") val results: List<CharacterResultResponse> = emptyList()
    ) {
        data class CharacterResultResponse(
            @SerializedName("id") val id: Int = 0,
            @SerializedName("name") val name: String = "",
            @SerializedName("description") val description: String = "",
            @SerializedName("modified") val modified: String = "",
            @SerializedName("thumbnail") val thumbnail: CharacterThumbnailResponse,
            @SerializedName("resourceURI") val resourceURI: String = ""
        ) {
            data class CharacterThumbnailResponse(
                @SerializedName("path") val path: String = "",
                @SerializedName("extension") val extension: String = ""
            )
        }
    }
}
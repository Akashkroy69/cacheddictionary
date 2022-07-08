package com.example.dictionary.feature_dictionary.data.remote

import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/<word>")
    suspend fun getWordInfo(
        @Path("word") word: String
    )

    companion object {
        const val BASE_URL = "https://dictionaryapi.dev/"
    }
}
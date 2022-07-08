package com.example.dictionary.feature_dictionary.data.remote.dto

data class Phonetic(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)
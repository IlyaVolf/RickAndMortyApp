package com.example.rickandmorty.data.characters.entities

data class InfoResponseEntity(
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)
package com.example.rickandmorty.domain.entities

data class Character(
    val id: Int,
    val name: String,
    val status: Status,
    val species: String,
    val type: String,
    val gender: Gender,
    val origin: Origin,
    val location: Location,
    val image: String,
    val episodes: List<String>,
    val url: String,
    val created: String
)
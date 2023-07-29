package com.example.rickandmorty.data.characters.entities

data class CharacterResponseEntity(
    val id: Int,
    val name: String,
    val status: StatusResponseEntity,
    val species: String,
    val type: String,
    val gender: GenderResponseEntity,
    val origin: OriginResponseEntity,
    val location: LocationResponseEntity,
    val image: String,
    val episodes: List<String>,
    val url: String,
    val created: String
)
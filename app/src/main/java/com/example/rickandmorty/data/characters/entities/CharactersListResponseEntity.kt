package com.example.rickandmorty.data.characters.entities

data class CharactersListResponseEntity(
    val info: InfoResponseEntity,
    val results: List<CharacterResponseEntity>
)
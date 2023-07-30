package com.example.rickandmorty.data.characters.sources
import com.example.rickandmorty.domain.entities.Character

interface CharactersSource {

    suspend fun getCharacters(page: Int, name: String? = null): List<Character>

    suspend fun getCharacter(id: Int): Character

}
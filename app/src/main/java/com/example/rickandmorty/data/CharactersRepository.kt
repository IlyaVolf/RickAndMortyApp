package com.example.rickandmorty.data

import com.example.rickandmorty.domain.entities.Character
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    suspend fun getCharacters(name: String? = null): List<Character>

    suspend fun getCharacter(id: Int): Character

}
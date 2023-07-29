package com.example.rickandmorty.data

import com.example.rickandmorty.domain.entities.Character

interface CharactersRepository {

    suspend fun getCharacters(): List<Character>

    suspend fun getCharacter(id: Int): Character

}
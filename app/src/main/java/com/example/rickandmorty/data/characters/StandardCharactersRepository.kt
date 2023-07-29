package com.example.rickandmorty.data.characters

import com.example.rickandmorty.data.CharactersRepository
import com.example.rickandmorty.data.characters.sources.CharactersSource
import com.example.rickandmorty.domain.entities.Character
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StandardCharactersRepository @Inject constructor(
    private val charactersSource: CharactersSource
) : CharactersRepository {

    override suspend fun getCharacters(): List<Character> {
        return charactersSource.getCharacters(1)
    }

    override suspend fun getCharacter(id: Int): Character {
        return charactersSource.getCharacter(id)
    }

}
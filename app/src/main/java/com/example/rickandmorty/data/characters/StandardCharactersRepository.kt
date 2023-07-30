package com.example.rickandmorty.data.characters

import com.example.rickandmorty.data.CharactersRepository
import com.example.rickandmorty.data.characters.sources.CharactersSource
import com.example.rickandmorty.di.IoDispatcher
import com.example.rickandmorty.domain.entities.Character
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StandardCharactersRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val charactersSource: CharactersSource
) : CharactersRepository {

    override suspend fun getCharacters(name: String?): List<Character> = withContext(ioDispatcher) {
        return@withContext charactersSource.getCharacters(page = 1, name = name)
    }

    override suspend fun getCharacter(id: Int): Character = withContext(ioDispatcher) {
        return@withContext charactersSource.getCharacter(id)
    }

}
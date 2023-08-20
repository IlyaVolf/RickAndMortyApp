package com.example.rickandmorty.data.characters

import com.example.rickandmorty.data.CharactersRepository
import com.example.rickandmorty.data.characters.sources.CharactersSource
import com.example.rickandmorty.data.episodes.sources.EpisodesSource
import com.example.rickandmorty.di.IoDispatcher
import com.example.rickandmorty.domain.entities.Character
import com.example.rickandmorty.domain.entities.CharacterDetailed
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StandardCharactersRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher,
    private val charactersSource: CharactersSource,
    private val episodesSource: EpisodesSource
) : CharactersRepository {

    override suspend fun getCharacters(name: String?): List<Character> = withContext(ioDispatcher) {
        return@withContext charactersSource.getCharacters(page = 1, name = name)
    }

    override suspend fun getCharacterDetailed(id: Int): CharacterDetailed = withContext(ioDispatcher) {
        val character = charactersSource.getCharacter(id)
        val episodesAppeared = episodesSource.getEpisodeAppearedSnippets(character.episode)
        return@withContext CharacterDetailed(character, episodesAppeared)
    }

}
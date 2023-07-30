package com.example.rickandmorty.data.characters.mappers

import com.example.rickandmorty.data.characters.entities.CharactersListResponseEntity
import com.example.rickandmorty.data.characters.entities.CharacterResponseEntity
import com.example.rickandmorty.data.episodes.entities.EpisodeResponseEntity
import com.example.rickandmorty.data.episodes.mappers.EpisodeMapper
import com.example.rickandmorty.domain.entities.Character
import com.example.rickandmorty.domain.entities.CharacterDetailed
import com.example.rickandmorty.domain.entities.EpisodeSnippet
import javax.inject.Inject

class CharacterMapper @Inject constructor(
    private val genderMapper: GenderMapper,
    private val originMapper: OriginMapper,
    private val locationMapper: LocationMapper,
    private val statusMapper: StatusMapper,
    private val episodeMapper: EpisodeMapper
) {

    fun toCharacter(
        characterResponseEntity: CharacterResponseEntity
    ): Character {
        return Character(
            id = characterResponseEntity.id,
            name = characterResponseEntity.name,
            status = statusMapper.toStatus(characterResponseEntity.status),
            species = characterResponseEntity.species,
            type = characterResponseEntity.type,
            gender = genderMapper.toGender(characterResponseEntity.gender),
            origin = originMapper.toOrigin(characterResponseEntity.origin),
            location = locationMapper.toLocation(characterResponseEntity.location),
            image = characterResponseEntity.image,
            episode = characterResponseEntity.episode,
            url = characterResponseEntity.url,
            created = characterResponseEntity.created
        )
    }

    fun toCharacterDetailed(
        characterResponseEntity: CharacterResponseEntity,
        episodesResponseEntity: List<EpisodeResponseEntity>
    ): CharacterDetailed {
        return CharacterDetailed(
            character = toCharacter(characterResponseEntity),
            episodeSnippetsList = episodesResponseEntity.map { episodeMapper.toEpisodeSnippet(it) }
        )
    }

    fun toCharactersList(characterListResponseEntity: CharactersListResponseEntity): List<Character> {
        return characterListResponseEntity.results.map { toCharacter(it) }
    }

}
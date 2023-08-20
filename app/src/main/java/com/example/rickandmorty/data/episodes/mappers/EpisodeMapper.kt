package com.example.rickandmorty.data.episodes.mappers

import com.example.rickandmorty.data.episodes.entities.EpisodeResponseEntity
import com.example.rickandmorty.domain.entities.EpisodeSnippet
import javax.inject.Inject

class EpisodeMapper @Inject constructor() {

    fun toEpisodeSnippet(episodeResponseEntity: EpisodeResponseEntity): EpisodeSnippet {
        return EpisodeSnippet(
            name = episodeResponseEntity.name,
            episode = episodeResponseEntity.episode,
            url = episodeResponseEntity.url
        )
    }

}
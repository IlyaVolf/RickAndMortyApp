package com.example.rickandmorty.domain.entities

import com.example.rickandmorty.domain.entities.Character

data class CharacterDetailed(
    val character: Character,
    val episodeSnippetsList: List<EpisodeSnippet>
)
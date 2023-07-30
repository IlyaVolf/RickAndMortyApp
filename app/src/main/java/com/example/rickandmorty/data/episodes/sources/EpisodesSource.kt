package com.example.rickandmorty.data.episodes.sources
import com.example.rickandmorty.domain.entities.EpisodeSnippet

interface EpisodesSource {

    suspend fun getEpisodeAppearedSnippets(urls: List<String>): List<EpisodeSnippet>

}
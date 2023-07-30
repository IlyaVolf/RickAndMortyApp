package com.example.rickandmorty.data.episodes.sources

import com.example.rickandmorty.domain.entities.EpisodeSnippet
import javax.inject.Inject

class OkHttpEpisodesSource @Inject constructor() : EpisodesSource {

    override suspend fun getEpisodeAppearedSnippets(urls: List<String>): List<EpisodeSnippet> {
        return arrayListOf(
            EpisodeSnippet("daadad", "S01E11", "a"),
            EpisodeSnippet("dfssfsf", "S01E12", "b")
        )
    }

}
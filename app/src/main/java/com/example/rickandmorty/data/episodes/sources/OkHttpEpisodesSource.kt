package com.example.rickandmorty.data.episodes.sources

import com.example.rickandmorty.data.base.okhttp.BaseOkHttpSource
import com.example.rickandmorty.data.base.okhttp.OkHttpConfig
import com.example.rickandmorty.data.episodes.entities.EpisodeResponseEntity
import com.example.rickandmorty.data.episodes.mappers.EpisodeMapper
import com.example.rickandmorty.domain.entities.EpisodeSnippet
import com.example.rickandmorty.utils.extractIdFromUrl
import com.google.gson.reflect.TypeToken
import okhttp3.Request
import javax.inject.Inject

class OkHttpEpisodesSource @Inject constructor(
    config: OkHttpConfig,
    private val episodeMapper: EpisodeMapper
) : EpisodesSource, BaseOkHttpSource(config) {

    override suspend fun getEpisodeAppearedSnippets(urls: List<String>): List<EpisodeSnippet> {
        val ids = urls.map { extractIdFromUrl(it) }
        val endpoint = buildEndpointForMultipleEpisodes(ids)

        val request = Request.Builder()
            .get()
            .endpoint(endpoint)
            .build()
        val call = client.newCall(request)
        val response = call.suspendEnqueue()
        val typeToken = object : TypeToken<List<EpisodeResponseEntity>>() {}

        return response.parseJsonResponse(typeToken).map { episodeMapper.toEpisodeSnippet(it) }
    }

    private fun buildEndpointForMultipleEpisodes(ids: List<Int>): String {
        val idsString = StringBuilder()
        ids.forEach { idsString.append("$it,") }
        idsString.dropLast(1)
        return "/episode/$idsString"
    }

}
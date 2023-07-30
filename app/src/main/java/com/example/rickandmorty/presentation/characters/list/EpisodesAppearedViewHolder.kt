package com.example.rickandmorty.presentation.characters.list

import android.view.View
import com.example.rickandmorty.databinding.ItemEpisodeSnippetBinding
import com.example.rickandmorty.presentation.base.BaseViewHolder
import com.example.rickandmorty.domain.entities.EpisodeSnippet

class EpisodesAppearedViewHolder(
    private val binding: ItemEpisodeSnippetBinding,
    private val onItemClick: (EpisodeSnippet) -> Unit
) : BaseViewHolder<EpisodeSnippet>(binding) {

    override fun bindItem(item: EpisodeSnippet) {
        binding.apply {

            // TODO open mentioned episodes page when pressed
            /* root.setOnClickListener {
                onItemClick(item)
            } */

            episodeName.text = item.name
            episodeEpisode.text = item.episode
        }
    }
}

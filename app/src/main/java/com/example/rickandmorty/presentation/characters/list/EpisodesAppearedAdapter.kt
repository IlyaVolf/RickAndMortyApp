package com.example.rickandmorty.presentation.characters.list

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.rickandmorty.databinding.ItemEpisodeSnippetBinding
import com.example.rickandmorty.presentation.base.BaseAdapter
import com.example.rickandmorty.presentation.base.BaseViewHolder
import com.example.rickandmorty.domain.entities.EpisodeSnippet

class EpisodesAppearedAdapter(
    private val onItemClick: (EpisodeSnippet) -> Unit
) : BaseAdapter<BaseViewHolder<EpisodeSnippet>, EpisodeSnippet>() {

    override fun takeViewHolder(parent: ViewGroup): BaseViewHolder<EpisodeSnippet> {
        return EpisodesAppearedViewHolder(
            binding = ItemEpisodeSnippetBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onItemClick
        )
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<EpisodeSnippet> {
        return takeViewHolder(parent)
    }

}
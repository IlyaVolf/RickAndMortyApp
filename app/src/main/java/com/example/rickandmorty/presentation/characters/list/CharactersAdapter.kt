package com.example.rickandmorty.presentation.characters.list

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.rickandmorty.databinding.ItemCharacterBinding
import com.example.rickandmorty.presentation.base.BaseAdapter
import com.example.rickandmorty.presentation.base.BaseViewHolder
import com.example.rickandmorty.domain.entities.Character

class CharactersAdapter(
    private val onItemClick: (Character) -> Unit
) : BaseAdapter<BaseViewHolder<Character>, Character>() {

    override fun takeViewHolder(parent: ViewGroup): BaseViewHolder<Character> {
        return CharacterViewHolder(
            binding = ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onItemClick
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Character> {
        return takeViewHolder(parent)
    }

}
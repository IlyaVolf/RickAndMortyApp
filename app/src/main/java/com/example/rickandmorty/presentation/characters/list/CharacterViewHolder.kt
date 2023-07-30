package com.example.rickandmorty.presentation.characters.list

import android.util.Log
import android.view.View
import com.example.rickandmorty.databinding.ItemCharacterBinding
import com.example.rickandmorty.presentation.base.BaseViewHolder
import com.example.rickandmorty.domain.entities.Character
import com.example.rickandmorty.utils.image_loader.loadImage

class CharacterViewHolder(
    private val binding: ItemCharacterBinding,
    private val onItemClick: (Character) -> Unit
) : BaseViewHolder<Character>(binding) {

    override fun bindItem(item: Character) {
        binding.apply {

            root.setOnClickListener {
                onItemClick(item)
            }

            characterPicture.loadImage(item.image.orEmpty())
            characterName.text = item.name
        }
    }
}

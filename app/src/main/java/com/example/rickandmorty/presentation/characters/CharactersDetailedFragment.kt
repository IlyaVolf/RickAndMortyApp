package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.FragmentCharacterDetailedBinding
import com.example.rickandmorty.utils.DataHolder
import com.example.rickandmorty.utils.viewBinding
import com.example.rickandmorty.utils.viewModelCreator
import com.example.rickandmorty.domain.entities.CharacterDetailed
import com.example.rickandmorty.domain.entities.EpisodeSnippet
import com.example.rickandmorty.domain.entities.Status
import com.example.rickandmorty.presentation.characters.list.EpisodesAppearedAdapter
import com.example.rickandmorty.utils.ResourcesUtils.getColor
import com.example.rickandmorty.utils.getResourceString
import com.example.rickandmorty.utils.image_loader.loadImage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CharactersDetailedFragment : Fragment(R.layout.fragment_character_detailed) {

    @Inject
    lateinit var factory: CharactersDetailedViewModel.Factory
    private val viewModel by viewModelCreator {
        factory.create(2)
    }
    private val binding by viewBinding<FragmentCharacterDetailedBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = initAdapter()
        observeViewModel(adapter)
        initListeners()
    }

    private val onItemClick: (EpisodeSnippet) -> Unit = { episodeSnippet ->

    }

    private fun initAdapter(): EpisodesAppearedAdapter {
        val adapter = EpisodesAppearedAdapter(onItemClick)
        binding.episodesList.adapter = adapter
        return adapter
    }

    private fun observeViewModel(adapter: EpisodesAppearedAdapter) {
        viewModel.character.observe(viewLifecycleOwner) { holder ->
            when (holder) {
                is DataHolder.INIT -> {
                    setVisibility(View.VISIBLE, View.GONE, View.GONE)
                }
                is DataHolder.LOADING -> {
                    setVisibility(View.VISIBLE, View.GONE, View.GONE)
                }
                is DataHolder.READY -> {
                    setVisibility(View.GONE, View.VISIBLE, View.GONE)
                    drawCharacterDetailedInfo(holder.data, adapter)
                }
                is DataHolder.ERROR -> {
                    setVisibility(View.GONE, View.GONE, View.VISIBLE)
                }
                else -> {}
            }
        }
    }

    private fun drawCharacterDetailedInfo(
        characterDetailed: CharacterDetailed,
        adapter: EpisodesAppearedAdapter
    ) {
        with(binding) {
            characterName.text = characterDetailed.character.name
            characterGender.text = characterDetailed.character.gender.getResourceString()
            characterSpecies.text = characterDetailed.character.species
            characterLocation.text = characterDetailed.character.location.name
            characterLocation.text = characterDetailed.character.location.name
            characterOrigin.text = characterDetailed.character.origin.name
            characterStatus.text = characterDetailed.character.status.getResourceString()
            characterPicture.loadImage(characterDetailed.character.image.orEmpty())
            adapter.setupItems(characterDetailed.episodeSnippetsList)

            when (characterDetailed.character.status) {
                Status.ALIVE -> characterStatus.setTextColor(getColor(R.color.green_light))
                Status.DEAD -> characterStatus.setTextColor(getColor(R.color.red))
                Status.UNKNOWN -> {}
            }
        }
    }

    private fun initListeners() {
        binding.errorView.tryAgain.setOnClickListener {
            viewModel.tryAgain()
        }
    }

    private fun setVisibility(
        visibilityLoadingView: Int,
        visibilityContentView: Int,
        visibilityErrorView: Int
    ) {
        binding.loadingView.root.visibility = visibilityLoadingView
        binding.contentView.visibility = visibilityContentView
        binding.errorView.root.visibility = visibilityErrorView
    }

}
package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rickandmorty.R
import com.example.rickandmorty.databinding.FragmentCharacterDetailedBinding
import com.example.rickandmorty.domain.BackendException
import com.example.rickandmorty.domain.ConnectionException
import com.example.rickandmorty.utils.DataHolder
import com.example.rickandmorty.utils.viewBinding
import com.example.rickandmorty.utils.viewModelCreator
import com.example.rickandmorty.domain.entities.CharacterDetailed
import com.example.rickandmorty.domain.entities.EpisodeSnippet
import com.example.rickandmorty.domain.entities.Status
import com.example.rickandmorty.presentation.characters.list.EpisodesAppearedAdapter
import com.example.rickandmorty.utils.ResourcesUtils.getColor
import com.example.rickandmorty.utils.ResourcesUtils.getDrawable
import com.example.rickandmorty.utils.getResourceString
import com.example.rickandmorty.utils.image_loader.loadImage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CharactersDetailedFragment : Fragment(R.layout.fragment_character_detailed) {

    @Inject
    lateinit var factory: CharactersDetailedViewModel.Factory
    private val viewModel by viewModelCreator {
        factory.create(10)
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
                    setVisibility(
                        visibilityLoadingView = View.VISIBLE,
                        visibilityContentView = View.GONE,
                        visibilityErrorView = View.GONE
                    )
                }
                is DataHolder.LOADING -> {
                    setVisibility(
                        visibilityLoadingView = View.VISIBLE,
                        visibilityContentView = View.GONE,
                        visibilityErrorView = View.GONE
                    )
                }
                is DataHolder.READY -> {
                    setVisibility(
                        visibilityLoadingView = View.GONE,
                        visibilityContentView = View.VISIBLE,
                        visibilityErrorView = View.GONE
                    )
                    renderCharacterDetailedInfo(holder.data, adapter)
                }
                is DataHolder.ERROR -> {
                    setVisibility(
                        visibilityLoadingView = View.GONE,
                        visibilityContentView = View.GONE,
                        visibilityErrorView = View.VISIBLE
                    )
                    processException(holder.failure)
                }
                else -> {}
            }
        }
    }

    private fun renderCharacterDetailedInfo(
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

    private fun processException(failure: Throwable) {
        when (failure) {
            is ConnectionException -> {
                binding.errorView.veIcon.setImageDrawable(getDrawable(R.drawable.icon_no_internet))
                binding.errorView.connectionError.text = getString(R.string.error_connection_title)
                binding.errorView.connectionErrorDescription.text =
                    getString(R.string.error_connection_message)
            }
            is BackendException -> {
                binding.errorView.veIcon.setImageDrawable(getDrawable(R.drawable.icon_backend_error))
                binding.errorView.connectionError.text = getString(R.string.error_backend_title)
                binding.errorView.connectionErrorDescription.text =
                    getString(R.string.error_backend_message)
            }
            else -> {
                binding.errorView.veIcon.setImageDrawable(getDrawable(R.drawable.icon_backend_error))
                binding.errorView.connectionError.text = getString(R.string.error_title)
                binding.errorView.connectionErrorDescription.text =
                    "${failure.javaClass}: ${failure.message}"
            }
        }
    }

}
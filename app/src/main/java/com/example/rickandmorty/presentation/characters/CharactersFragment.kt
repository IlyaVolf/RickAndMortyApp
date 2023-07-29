package com.example.rickandmorty.presentation.characters

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.rickandmorty.R
import androidx.fragment.app.viewModels
import com.example.rickandmorty.databinding.FragmentCharactersBinding
import com.example.rickandmorty.utils.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CharactersFragment : Fragment(R.layout.fragment_characters) {

    private val viewModel by viewModels<CharactersViewModel>()
    private val binding by viewBinding<FragmentCharactersBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    private fun observeViewModel() {

    }

}
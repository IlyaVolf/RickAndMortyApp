package com.example.rickandmorty.presentation.characters

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.data.CharactersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
): ViewModel() {

    init {
        load()
    }

    private fun load() = viewModelScope.launch(Dispatchers.IO) {
        val res1 = charactersRepository.getCharacter(1)
        val res2 = charactersRepository.getCharacters()

        val a = 5
    }

}
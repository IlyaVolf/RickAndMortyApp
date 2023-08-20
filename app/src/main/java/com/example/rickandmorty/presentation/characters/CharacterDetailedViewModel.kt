package com.example.rickandmorty.presentation.characters

import android.util.Log
import androidx.lifecycle.*
import com.example.rickandmorty.data.CharactersRepository
import com.example.rickandmorty.utils.ObservableHolder
import kotlinx.coroutines.launch
import com.example.rickandmorty.domain.entities.CharacterDetailed
import com.example.rickandmorty.utils.DataHolder
import com.example.rickandmorty.utils.share
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class CharacterDetailedViewModel @AssistedInject constructor(
    @Assisted private val characterId: Int,
    private val charactersRepository: CharactersRepository
) : ViewModel() {

    private val _character = ObservableHolder<CharacterDetailed>(DataHolder.init())
    val character = _character.share()
    
    init {
        _character.postValue(DataHolder.loading())
        load()
    }

    fun tryAgain() {
        _character.postValue(DataHolder.loading())
        load()
    }

    private fun load() = viewModelScope.launch {
        try {
            val character = charactersRepository.getCharacterDetailed(characterId)
            _character.postValue(DataHolder.ready(character))
        } catch (e: Exception) {
            Log.d("BUGFIX", e.message.toString())
            _character.value = DataHolder.error(e)
        }
    }

    @AssistedFactory
    interface Factory {
        fun create(characterId: Int): CharacterDetailedViewModel
    }

}
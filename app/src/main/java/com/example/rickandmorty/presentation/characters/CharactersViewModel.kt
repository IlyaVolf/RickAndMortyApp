package com.example.rickandmorty.presentation.characters

import android.util.Log
import androidx.lifecycle.*
import com.example.rickandmorty.data.CharactersRepository
import com.example.rickandmorty.utils.ObservableHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import com.example.rickandmorty.domain.entities.Character
import com.example.rickandmorty.utils.DataHolder
import com.example.rickandmorty.utils.share
@HiltViewModel
class CharactersViewModel @Inject constructor(
    private val charactersRepository: CharactersRepository
) : ViewModel() {

    private val _charactersList = ObservableHolder<List<Character>>(DataHolder.init())
    val charactersList = _charactersList.share()

    private val _search = MutableLiveData("")
    var search: String?
        get() = _search.value
        set(value) {
            _search.value = value
        }

    init {
        _charactersList.postValue(DataHolder.loading())
        load()
    }

    fun tryAgain() {
        _charactersList.postValue(DataHolder.loading())
        load()
    }

    fun refresh() {
        _charactersList.postValue(DataHolder.refresh())
        load()
    }

    private fun load() = viewModelScope.launch {
        try {
            val characters = charactersRepository.getCharacters()
            _charactersList.postValue(DataHolder.ready(characters))
        } catch (e: Exception) {
            Log.d("BUGFIX", e.message.toString())
            _charactersList.value = DataHolder.error(e)
        }
    }

}
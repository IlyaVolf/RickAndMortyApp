package com.example.rickandmorty.data.characters.sources.retrofit

import android.util.Log
import com.example.rickandmorty.data.base.retrofit.BaseRetrofitSource
import com.example.rickandmorty.data.base.retrofit.RetrofitConfig
import com.example.rickandmorty.data.characters.mappers.CharacterMapper
import com.example.rickandmorty.data.characters.sources.CharactersSource
import com.example.rickandmorty.domain.entities.Character
import kotlinx.coroutines.delay
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitCharactersSource @Inject constructor(
    config: RetrofitConfig,
    private val characterMapper: CharacterMapper
) : CharactersSource, BaseRetrofitSource(config) {

    private val charactersApi = retrofit.create(CharactersApi::class.java)

    override suspend fun getCharacters(page: Int, name: String?): List<Character> = wrapRetrofitExceptions{
        delay(1000)
        val characterListResponseEntity = charactersApi.getCharacters(page = page, name = name)
        return@wrapRetrofitExceptions  characterMapper.toCharactersList(characterListResponseEntity)
    }

    override suspend fun getCharacter(id: Int): Character = wrapRetrofitExceptions {
        delay(1000)
        val characterResponseEntity = charactersApi.getCharacter(id)
        Log.d("BUGFIX", characterResponseEntity.toString())
        return@wrapRetrofitExceptions characterMapper.toCharacter(characterResponseEntity)
    }

}
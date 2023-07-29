package com.example.rickandmorty.data.characters.sources.retrofit

import com.example.rickandmorty.data.base.BaseRetrofitSource
import com.example.rickandmorty.data.base.RetrofitConfig
import  com.example.rickandmorty.data.characters.entities.CharacterResponseEntity
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

    override suspend fun getCharacters(page: Int): List<Character> = wrapRetrofitExceptions{
        delay(1000)
        val characterListResponseEntity = charactersApi.getCharacters(page = page)
        return@wrapRetrofitExceptions  characterMapper.toCharactersList(characterListResponseEntity)
    }

    override suspend fun getCharacter(id: Int): Character = wrapRetrofitExceptions {
        delay(1000)
        val characterResponseEntity = charactersApi.getCharacter(id)
        return@wrapRetrofitExceptions characterMapper.toCharacter(characterResponseEntity)
    }

}
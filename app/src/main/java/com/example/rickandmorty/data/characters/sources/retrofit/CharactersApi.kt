package com.example.rickandmorty.data.characters.sources.retrofit

import com.example.rickandmorty.data.characters.entities.CharactersListResponseEntity
import com.example.rickandmorty.data.characters.entities.CharacterResponseEntity
import com.example.rickandmorty.data.characters.entities.GenderResponseEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersApi {

    @GET("/character")
    suspend fun getCharacters(
        @Query("page") page: Int? = null,
        @Query("name") name: String? = null,
        @Query("status") status: String? = null,
        @Query("species") species: String? = null,
        @Query("type") type: String? = null,
        @Query("gender") gender: GenderResponseEntity? = null,
    ): CharactersListResponseEntity

    @GET("/character/{characterId}")
    suspend fun getCharacter(
        @Path("characterId") characterId: Int
    ): CharacterResponseEntity

}
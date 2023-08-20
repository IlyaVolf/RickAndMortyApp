package com.example.rickandmorty.di

import com.example.rickandmorty.data.CharactersRepository
import com.example.rickandmorty.data.characters.StandardCharactersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindCharactersRepository(
        charactersRepository: StandardCharactersRepository,
    ): CharactersRepository

}
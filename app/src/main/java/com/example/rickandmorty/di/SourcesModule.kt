package com.example.rickandmorty.di

import com.example.rickandmorty.data.characters.sources.CharactersSource
import com.example.rickandmorty.data.characters.sources.retrofit.RetrofitCharactersSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SourcesModule {

    @Binds
    abstract fun bindCharactersSource(
        charactersSource: RetrofitCharactersSource,
    ): CharactersSource

}
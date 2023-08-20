package com.example.rickandmorty.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/rickandmorty/di/RepositoriesModule;", "", "()V", "bindCharactersRepository", "Lcom/example/rickandmorty/data/CharactersRepository;", "charactersRepository", "Lcom/example/rickandmorty/data/characters/StandardCharactersRepository;", "app_debug"})
@dagger.Module
public abstract class RepositoriesModule {
    
    public RepositoriesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.example.rickandmorty.data.CharactersRepository bindCharactersRepository(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.StandardCharactersRepository charactersRepository);
}
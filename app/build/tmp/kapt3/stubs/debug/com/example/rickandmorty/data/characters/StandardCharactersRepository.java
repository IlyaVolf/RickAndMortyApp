package com.example.rickandmorty.data.characters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/rickandmorty/data/characters/StandardCharactersRepository;", "Lcom/example/rickandmorty/data/CharactersRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "charactersSource", "Lcom/example/rickandmorty/data/characters/sources/CharactersSource;", "episodesSource", "Lcom/example/rickandmorty/data/episodes/sources/EpisodesSource;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/example/rickandmorty/data/characters/sources/CharactersSource;Lcom/example/rickandmorty/data/episodes/sources/EpisodesSource;)V", "getCharacterDetailed", "Lcom/example/rickandmorty/domain/entities/CharacterDetailed;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "", "Lcom/example/rickandmorty/domain/entities/Character;", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class StandardCharactersRepository implements com.example.rickandmorty.data.CharactersRepository {
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final com.example.rickandmorty.data.characters.sources.CharactersSource charactersSource = null;
    private final com.example.rickandmorty.data.episodes.sources.EpisodesSource episodesSource = null;
    
    @javax.inject.Inject
    public StandardCharactersRepository(@org.jetbrains.annotations.NotNull
    @com.example.rickandmorty.di.IoDispatcher
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.sources.CharactersSource charactersSource, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.episodes.sources.EpisodesSource episodesSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCharacters(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.domain.entities.Character>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCharacterDetailed(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.rickandmorty.domain.entities.CharacterDetailed> continuation) {
        return null;
    }
}
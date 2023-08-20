package com.example.rickandmorty.data.characters.sources.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/rickandmorty/data/characters/sources/retrofit/RetrofitCharactersSource;", "Lcom/example/rickandmorty/data/characters/sources/CharactersSource;", "Lcom/example/rickandmorty/data/base/retrofit/BaseRetrofitSource;", "config", "Lcom/example/rickandmorty/data/base/retrofit/RetrofitConfig;", "characterMapper", "Lcom/example/rickandmorty/data/characters/mappers/CharacterMapper;", "(Lcom/example/rickandmorty/data/base/retrofit/RetrofitConfig;Lcom/example/rickandmorty/data/characters/mappers/CharacterMapper;)V", "charactersApi", "Lcom/example/rickandmorty/data/characters/sources/retrofit/CharactersApi;", "kotlin.jvm.PlatformType", "getCharacter", "Lcom/example/rickandmorty/domain/entities/Character;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "", "page", "name", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class RetrofitCharactersSource extends com.example.rickandmorty.data.base.retrofit.BaseRetrofitSource implements com.example.rickandmorty.data.characters.sources.CharactersSource {
    private final com.example.rickandmorty.data.characters.mappers.CharacterMapper characterMapper = null;
    private final com.example.rickandmorty.data.characters.sources.retrofit.CharactersApi charactersApi = null;
    
    @javax.inject.Inject
    public RetrofitCharactersSource(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.base.retrofit.RetrofitConfig config, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.mappers.CharacterMapper characterMapper) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCharacters(int page, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.domain.entities.Character>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCharacter(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.rickandmorty.domain.entities.Character> continuation) {
        return null;
    }
}
package com.example.rickandmorty.data.characters.sources.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006JY\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/rickandmorty/data/characters/sources/retrofit/CharactersApi;", "", "getCharacter", "Lcom/example/rickandmorty/data/characters/entities/CharacterResponseEntity;", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "Lcom/example/rickandmorty/data/characters/entities/CharactersListResponseEntity;", "page", "name", "", "status", "species", "type", "gender", "Lcom/example/rickandmorty/data/characters/entities/GenderResponseEntity;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/rickandmorty/data/characters/entities/GenderResponseEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CharactersApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "character")
    public abstract java.lang.Object getCharacters(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "page")
    java.lang.Integer page, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "species")
    java.lang.String species, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "type")
    java.lang.String type, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "gender")
    com.example.rickandmorty.data.characters.entities.GenderResponseEntity gender, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.rickandmorty.data.characters.entities.CharactersListResponseEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "character/{characterId}")
    public abstract java.lang.Object getCharacter(@retrofit2.http.Path(value = "characterId")
    int characterId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.rickandmorty.data.characters.entities.CharacterResponseEntity> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}
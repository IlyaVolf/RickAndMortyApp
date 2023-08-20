package com.example.rickandmorty.data.characters.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/rickandmorty/data/characters/mappers/CharacterMapper;", "", "genderMapper", "Lcom/example/rickandmorty/data/characters/mappers/GenderMapper;", "originMapper", "Lcom/example/rickandmorty/data/characters/mappers/OriginMapper;", "locationMapper", "Lcom/example/rickandmorty/data/characters/mappers/LocationMapper;", "statusMapper", "Lcom/example/rickandmorty/data/characters/mappers/StatusMapper;", "(Lcom/example/rickandmorty/data/characters/mappers/GenderMapper;Lcom/example/rickandmorty/data/characters/mappers/OriginMapper;Lcom/example/rickandmorty/data/characters/mappers/LocationMapper;Lcom/example/rickandmorty/data/characters/mappers/StatusMapper;)V", "toCharacter", "Lcom/example/rickandmorty/domain/entities/Character;", "characterResponseEntity", "Lcom/example/rickandmorty/data/characters/entities/CharacterResponseEntity;", "toCharactersList", "", "characterListResponseEntity", "Lcom/example/rickandmorty/data/characters/entities/CharactersListResponseEntity;", "app_debug"})
public final class CharacterMapper {
    private final com.example.rickandmorty.data.characters.mappers.GenderMapper genderMapper = null;
    private final com.example.rickandmorty.data.characters.mappers.OriginMapper originMapper = null;
    private final com.example.rickandmorty.data.characters.mappers.LocationMapper locationMapper = null;
    private final com.example.rickandmorty.data.characters.mappers.StatusMapper statusMapper = null;
    
    @javax.inject.Inject
    public CharacterMapper(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.mappers.GenderMapper genderMapper, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.mappers.OriginMapper originMapper, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.mappers.LocationMapper locationMapper, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.mappers.StatusMapper statusMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.domain.entities.Character toCharacter(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.CharacterResponseEntity characterResponseEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.rickandmorty.domain.entities.Character> toCharactersList(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.CharactersListResponseEntity characterListResponseEntity) {
        return null;
    }
}
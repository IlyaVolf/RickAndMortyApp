package com.example.rickandmorty.data.characters.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u000bH\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\t\u00103\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0089\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017\u00a8\u0006;"}, d2 = {"Lcom/example/rickandmorty/data/characters/entities/CharacterResponseEntity;", "", "id", "", "name", "", "status", "Lcom/example/rickandmorty/data/characters/entities/StatusResponseEntity;", "species", "type", "gender", "Lcom/example/rickandmorty/data/characters/entities/GenderResponseEntity;", "origin", "Lcom/example/rickandmorty/data/characters/entities/OriginResponseEntity;", "location", "Lcom/example/rickandmorty/data/characters/entities/LocationResponseEntity;", "image", "episode", "", "url", "created", "(ILjava/lang/String;Lcom/example/rickandmorty/data/characters/entities/StatusResponseEntity;Ljava/lang/String;Ljava/lang/String;Lcom/example/rickandmorty/data/characters/entities/GenderResponseEntity;Lcom/example/rickandmorty/data/characters/entities/OriginResponseEntity;Lcom/example/rickandmorty/data/characters/entities/LocationResponseEntity;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCreated", "()Ljava/lang/String;", "getEpisode", "()Ljava/util/List;", "getGender", "()Lcom/example/rickandmorty/data/characters/entities/GenderResponseEntity;", "getId", "()I", "getImage", "getLocation", "()Lcom/example/rickandmorty/data/characters/entities/LocationResponseEntity;", "getName", "getOrigin", "()Lcom/example/rickandmorty/data/characters/entities/OriginResponseEntity;", "getSpecies", "getStatus", "()Lcom/example/rickandmorty/data/characters/entities/StatusResponseEntity;", "getType", "getUrl", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CharacterResponseEntity {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.rickandmorty.data.characters.entities.StatusResponseEntity status = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String species = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.rickandmorty.data.characters.entities.GenderResponseEntity gender = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.rickandmorty.data.characters.entities.OriginResponseEntity origin = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.rickandmorty.data.characters.entities.LocationResponseEntity location = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> episode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String created = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.CharacterResponseEntity copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.StatusResponseEntity status, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.GenderResponseEntity gender, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.OriginResponseEntity origin, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.LocationResponseEntity location, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> episode, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String created) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CharacterResponseEntity(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.StatusResponseEntity status, @org.jetbrains.annotations.NotNull
    java.lang.String species, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.GenderResponseEntity gender, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.OriginResponseEntity origin, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.characters.entities.LocationResponseEntity location, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> episode, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String created) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.StatusResponseEntity component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.StatusResponseEntity getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.GenderResponseEntity component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.GenderResponseEntity getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.OriginResponseEntity component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.OriginResponseEntity getOrigin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.LocationResponseEntity component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.data.characters.entities.LocationResponseEntity getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getEpisode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreated() {
        return null;
    }
}
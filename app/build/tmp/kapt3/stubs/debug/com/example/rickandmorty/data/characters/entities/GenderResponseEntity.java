package com.example.rickandmorty.data.characters.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/rickandmorty/data/characters/entities/GenderResponseEntity;", "", "gender", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getGender", "()Ljava/lang/String;", "MALE", "FEMALE", "GENDERLESS", "UNKNOWN", "app_debug"})
public enum GenderResponseEntity {
    @com.google.gson.annotations.SerializedName(value = "Male")
    /*public static final*/ MALE /* = new MALE(null) */,
    @com.google.gson.annotations.SerializedName(value = "Female")
    /*public static final*/ FEMALE /* = new FEMALE(null) */,
    @com.google.gson.annotations.SerializedName(value = "Genderless")
    /*public static final*/ GENDERLESS /* = new GENDERLESS(null) */,
    @com.google.gson.annotations.SerializedName(value = "unknown")
    /*public static final*/ UNKNOWN /* = new UNKNOWN(null) */;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String gender = null;
    
    GenderResponseEntity(java.lang.String gender) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return null;
    }
}
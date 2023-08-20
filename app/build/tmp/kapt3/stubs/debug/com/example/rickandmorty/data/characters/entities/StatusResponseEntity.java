package com.example.rickandmorty.data.characters.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/example/rickandmorty/data/characters/entities/StatusResponseEntity;", "", "status", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "ALIVE", "DEAD", "UNKNOWN", "app_debug"})
public enum StatusResponseEntity {
    @com.google.gson.annotations.SerializedName(value = "Alive")
    /*public static final*/ ALIVE /* = new ALIVE(null) */,
    @com.google.gson.annotations.SerializedName(value = "Dead")
    /*public static final*/ DEAD /* = new DEAD(null) */,
    @com.google.gson.annotations.SerializedName(value = "unknown")
    /*public static final*/ UNKNOWN /* = new UNKNOWN(null) */;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String status = null;
    
    StatusResponseEntity(java.lang.String status) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return null;
    }
}
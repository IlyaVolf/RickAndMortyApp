package com.example.rickandmorty.data.base.retrofit;

import java.lang.System;

/**
 * All stuffs required for making HTTP-requests with Retrofit client and
 * for parsing JSON-messages.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/rickandmorty/data/base/retrofit/RetrofitConfig;", "", "retrofit", "Lretrofit2/Retrofit;", "gson", "Lcom/google/gson/Gson;", "(Lretrofit2/Retrofit;Lcom/google/gson/Gson;)V", "getGson", "()Lcom/google/gson/Gson;", "getRetrofit", "()Lretrofit2/Retrofit;", "app_debug"})
public final class RetrofitConfig {
    @org.jetbrains.annotations.NotNull
    private final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject
    public RetrofitConfig(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson getGson() {
        return null;
    }
}
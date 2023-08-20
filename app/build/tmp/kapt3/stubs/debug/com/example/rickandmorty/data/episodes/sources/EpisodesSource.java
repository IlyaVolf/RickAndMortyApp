package com.example.rickandmorty.data.episodes.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/example/rickandmorty/data/episodes/sources/EpisodesSource;", "", "getEpisodeAppearedSnippets", "", "Lcom/example/rickandmorty/domain/entities/EpisodeSnippet;", "urls", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface EpisodesSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getEpisodeAppearedSnippets(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> urls, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.domain.entities.EpisodeSnippet>> continuation);
}
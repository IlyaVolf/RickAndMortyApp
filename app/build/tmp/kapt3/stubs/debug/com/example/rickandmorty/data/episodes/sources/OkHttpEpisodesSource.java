package com.example.rickandmorty.data.episodes.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/rickandmorty/data/episodes/sources/OkHttpEpisodesSource;", "Lcom/example/rickandmorty/data/episodes/sources/EpisodesSource;", "Lcom/example/rickandmorty/data/base/okhttp/BaseOkHttpSource;", "config", "Lcom/example/rickandmorty/data/base/okhttp/OkHttpConfig;", "episodeMapper", "Lcom/example/rickandmorty/data/episodes/mappers/EpisodeMapper;", "(Lcom/example/rickandmorty/data/base/okhttp/OkHttpConfig;Lcom/example/rickandmorty/data/episodes/mappers/EpisodeMapper;)V", "buildEndpointForMultipleEpisodes", "", "ids", "", "", "getEpisodeAppearedSnippets", "Lcom/example/rickandmorty/domain/entities/EpisodeSnippet;", "urls", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OkHttpEpisodesSource extends com.example.rickandmorty.data.base.okhttp.BaseOkHttpSource implements com.example.rickandmorty.data.episodes.sources.EpisodesSource {
    private final com.example.rickandmorty.data.episodes.mappers.EpisodeMapper episodeMapper = null;
    
    @javax.inject.Inject
    public OkHttpEpisodesSource(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.base.okhttp.OkHttpConfig config, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.episodes.mappers.EpisodeMapper episodeMapper) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getEpisodeAppearedSnippets(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> urls, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.rickandmorty.domain.entities.EpisodeSnippet>> continuation) {
        return null;
    }
    
    private final java.lang.String buildEndpointForMultipleEpisodes(java.util.List<java.lang.Integer> ids) {
        return null;
    }
}
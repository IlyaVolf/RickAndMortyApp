package com.example.rickandmorty.presentation.characters;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/example/rickandmorty/presentation/characters/CharactersViewModel;", "Landroidx/lifecycle/ViewModel;", "charactersRepository", "Lcom/example/rickandmorty/data/CharactersRepository;", "(Lcom/example/rickandmorty/data/CharactersRepository;)V", "_charactersList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/rickandmorty/utils/DataHolder;", "", "Lcom/example/rickandmorty/domain/entities/Character;", "_search", "", "kotlin.jvm.PlatformType", "charactersList", "Landroidx/lifecycle/LiveData;", "getCharactersList", "()Landroidx/lifecycle/LiveData;", "value", "search", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "load", "Lkotlinx/coroutines/Job;", "refresh", "", "tryAgain", "app_debug"})
public final class CharactersViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.rickandmorty.data.CharactersRepository charactersRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.rickandmorty.utils.DataHolder<java.util.List<com.example.rickandmorty.domain.entities.Character>>> _charactersList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.rickandmorty.utils.DataHolder<java.util.List<com.example.rickandmorty.domain.entities.Character>>> charactersList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _search = null;
    
    @javax.inject.Inject
    public CharactersViewModel(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.CharactersRepository charactersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.rickandmorty.utils.DataHolder<java.util.List<com.example.rickandmorty.domain.entities.Character>>> getCharactersList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSearch() {
        return null;
    }
    
    public final void setSearch(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final void tryAgain() {
    }
    
    public final void refresh() {
    }
    
    private final kotlinx.coroutines.Job load() {
        return null;
    }
}
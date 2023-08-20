package com.example.rickandmorty.presentation.characters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel;", "Landroidx/lifecycle/ViewModel;", "characterId", "", "charactersRepository", "Lcom/example/rickandmorty/data/CharactersRepository;", "(ILcom/example/rickandmorty/data/CharactersRepository;)V", "_character", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/rickandmorty/utils/DataHolder;", "Lcom/example/rickandmorty/domain/entities/CharacterDetailed;", "character", "Landroidx/lifecycle/LiveData;", "getCharacter", "()Landroidx/lifecycle/LiveData;", "load", "Lkotlinx/coroutines/Job;", "tryAgain", "", "Factory", "app_debug"})
public final class CharacterDetailedViewModel extends androidx.lifecycle.ViewModel {
    private final int characterId = 0;
    private final com.example.rickandmorty.data.CharactersRepository charactersRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.rickandmorty.utils.DataHolder<com.example.rickandmorty.domain.entities.CharacterDetailed>> _character = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.rickandmorty.utils.DataHolder<com.example.rickandmorty.domain.entities.CharacterDetailed>> character = null;
    
    @dagger.assisted.AssistedInject
    public CharacterDetailedViewModel(@dagger.assisted.Assisted
    int characterId, @org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.CharactersRepository charactersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.rickandmorty.utils.DataHolder<com.example.rickandmorty.domain.entities.CharacterDetailed>> getCharacter() {
        return null;
    }
    
    public final void tryAgain() {
    }
    
    private final kotlinx.coroutines.Job load() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel$Factory;", "", "create", "Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel;", "characterId", "", "app_debug"})
    @dagger.assisted.AssistedFactory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.rickandmorty.presentation.characters.CharacterDetailedViewModel create(int characterId);
    }
}
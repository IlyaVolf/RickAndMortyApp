package com.example.rickandmorty.presentation.characters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020 H\u0002J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010#\u001a\u00020 H\u0002J \u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00064"}, d2 = {"Lcom/example/rickandmorty/presentation/characters/CharacterDetailedFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/rickandmorty/presentation/characters/CharacterDetailedFragmentArgs;", "getArgs", "()Lcom/example/rickandmorty/presentation/characters/CharacterDetailedFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/rickandmorty/databinding/FragmentCharacterDetailedBinding;", "getBinding", "()Lcom/example/rickandmorty/databinding/FragmentCharacterDetailedBinding;", "binding$delegate", "Lcom/example/rickandmorty/utils/ViewBindingDelegate;", "factory", "Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel$Factory;", "getFactory", "()Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel$Factory;", "setFactory", "(Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel$Factory;)V", "onItemClick", "Lkotlin/Function1;", "Lcom/example/rickandmorty/domain/entities/EpisodeSnippet;", "", "viewModel", "Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel;", "getViewModel", "()Lcom/example/rickandmorty/presentation/characters/CharacterDetailedViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initAdapter", "Lcom/example/rickandmorty/presentation/characters/list/EpisodesAppearedAdapter;", "initListeners", "observeViewModel", "adapter", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "processException", "failure", "", "renderCharacterDetailedInfo", "characterDetailed", "Lcom/example/rickandmorty/domain/entities/CharacterDetailed;", "setVisibility", "visibilityLoadingView", "", "visibilityContentView", "visibilityErrorView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CharacterDetailedFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @javax.inject.Inject
    public com.example.rickandmorty.presentation.characters.CharacterDetailedViewModel.Factory factory;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.example.rickandmorty.utils.ViewBindingDelegate binding$delegate = null;
    private final kotlin.jvm.functions.Function1<com.example.rickandmorty.domain.entities.EpisodeSnippet, kotlin.Unit> onItemClick = null;
    
    public CharacterDetailedFragment() {
        super();
    }
    
    private final com.example.rickandmorty.presentation.characters.CharacterDetailedFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.rickandmorty.presentation.characters.CharacterDetailedViewModel.Factory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.presentation.characters.CharacterDetailedViewModel.Factory p0) {
    }
    
    private final com.example.rickandmorty.presentation.characters.CharacterDetailedViewModel getViewModel() {
        return null;
    }
    
    private final com.example.rickandmorty.databinding.FragmentCharacterDetailedBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.example.rickandmorty.presentation.characters.list.EpisodesAppearedAdapter initAdapter() {
        return null;
    }
    
    private final void observeViewModel(com.example.rickandmorty.presentation.characters.list.EpisodesAppearedAdapter adapter) {
    }
    
    private final void renderCharacterDetailedInfo(com.example.rickandmorty.domain.entities.CharacterDetailed characterDetailed, com.example.rickandmorty.presentation.characters.list.EpisodesAppearedAdapter adapter) {
    }
    
    private final void initListeners() {
    }
    
    private final void setVisibility(int visibilityLoadingView, int visibilityContentView, int visibilityErrorView) {
    }
    
    private final void processException(java.lang.Throwable failure) {
    }
}
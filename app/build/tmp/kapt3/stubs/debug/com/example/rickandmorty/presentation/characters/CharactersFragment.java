package com.example.rickandmorty.presentation.characters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0002J(\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006*"}, d2 = {"Lcom/example/rickandmorty/presentation/characters/CharactersFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/rickandmorty/databinding/FragmentCharactersBinding;", "getBinding", "()Lcom/example/rickandmorty/databinding/FragmentCharactersBinding;", "binding$delegate", "Lcom/example/rickandmorty/utils/ViewBindingDelegate;", "onItemClick", "Lkotlin/Function1;", "Lcom/example/rickandmorty/domain/entities/Character;", "", "viewModel", "Lcom/example/rickandmorty/presentation/characters/CharactersViewModel;", "getViewModel", "()Lcom/example/rickandmorty/presentation/characters/CharactersViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initAdapter", "Lcom/example/rickandmorty/presentation/characters/list/CharactersAdapter;", "initErrorViewListener", "initListeners", "initSearchListener", "initSwipeRefreshLayoutListener", "observeViewModel", "adapter", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "processException", "failure", "", "setVisibility", "isRefreshing", "", "visibilityLoadingView", "", "visibilityContentView", "visibilityErrorView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CharactersFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.example.rickandmorty.utils.ViewBindingDelegate binding$delegate = null;
    private final kotlin.jvm.functions.Function1<com.example.rickandmorty.domain.entities.Character, kotlin.Unit> onItemClick = null;
    
    public CharactersFragment() {
        super();
    }
    
    private final com.example.rickandmorty.presentation.characters.CharactersViewModel getViewModel() {
        return null;
    }
    
    private final com.example.rickandmorty.databinding.FragmentCharactersBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.example.rickandmorty.presentation.characters.list.CharactersAdapter initAdapter() {
        return null;
    }
    
    private final void observeViewModel(com.example.rickandmorty.presentation.characters.list.CharactersAdapter adapter) {
    }
    
    private final void initListeners() {
    }
    
    private final void initErrorViewListener() {
    }
    
    private final void initSwipeRefreshLayoutListener() {
    }
    
    private final void initSearchListener() {
    }
    
    private final void setVisibility(boolean isRefreshing, int visibilityLoadingView, int visibilityContentView, int visibilityErrorView) {
    }
    
    private final void processException(java.lang.Throwable failure) {
    }
}
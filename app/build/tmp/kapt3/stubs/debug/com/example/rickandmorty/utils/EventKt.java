package com.example.rickandmorty.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aL\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003j\b\u0012\u0004\u0012\u0002H\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\tj\b\u0012\u0004\u0012\u0002H\u0002`\n\u001a4\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003j\u0002`\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00010\fj\u0002`\r\u001a3\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u000fj\b\u0012\u0004\u0012\u0002H\u0002`\u00102\u0006\u0010\u0011\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u000e\u001a\u00020\u0001*\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u000fj\u0002`\u0013\u001a\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f*(\u0010\u0015\u001a\u0004\b\u0000\u0010\u0002\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t2\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t*(\u0010\u0016\u001a\u0004\b\u0000\u0010\u0002\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003*(\u0010\u0017\u001a\u0004\b\u0000\u0010\u0002\"\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u000f2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u000f*\u001c\u0010\u0018\"\b\u0012\u0004\u0012\u00020\u0001`\u00102\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u000f*\u0016\u0010\u0019\"\b\u0012\u0004\u0012\u00020\u00010\f2\b\u0012\u0004\u0012\u00020\u00010\f*\u001c\u0010\u001a\"\b\u0012\u0004\u0012\u00020\u0001`\u00052\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003\u00a8\u0006\u001b"}, d2 = {"observeEvent", "", "T", "Landroidx/lifecycle/LiveData;", "Lcom/example/rickandmorty/utils/Event;", "Lcom/example/rickandmorty/utils/LiveEvent;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "listener", "Lkotlin/Function1;", "Lcom/example/rickandmorty/utils/EventListener;", "Lcom/example/rickandmorty/utils/UnitLiveEvent;", "Lkotlin/Function0;", "Lcom/example/rickandmorty/utils/UnitEventListener;", "publishEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/rickandmorty/utils/MutableLiveEvent;", "value", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "Lcom/example/rickandmorty/utils/MutableUnitLiveEvent;", "share", "EventListener", "LiveEvent", "MutableLiveEvent", "MutableUnitLiveEvent", "UnitEventListener", "UnitLiveEvent", "app_debug"})
public final class EventKt {
    
    /**
     * Convert mutable live-data into non-mutable live-data.
     */
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<T> share(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<T> $this$share) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void publishEvent(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.rickandmorty.utils.Event<T>> $this$publishEvent, T value) {
    }
    
    public static final <T extends java.lang.Object>void observeEvent(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.example.rickandmorty.utils.Event<T>> $this$observeEvent, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> listener) {
    }
    
    public static final void publishEvent(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.rickandmorty.utils.Event<kotlin.Unit>> $this$publishEvent) {
    }
    
    public static final void observeEvent(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.example.rickandmorty.utils.Event<kotlin.Unit>> $this$observeEvent, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
}
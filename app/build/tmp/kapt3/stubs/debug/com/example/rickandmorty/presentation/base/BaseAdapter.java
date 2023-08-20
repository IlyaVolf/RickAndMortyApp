package com.example.rickandmorty.presentation.base;

import java.lang.System;

/**
 * Базовый класс адаптера основанного на view binding
 *
 * @property onItemClickListener Функция обратного вызова для обработки нажатий на элемент списка
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001d\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u0013\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\u001d\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u001f\u001a\u00020 H&J*\u0010!\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u0006H\u0016R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u000bj\b\u0012\u0004\u0012\u00028\u0001`\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\t\u00a8\u0006$"}, d2 = {"Lcom/example/rickandmorty/presentation/base/BaseAdapter;", "K", "Lcom/example/rickandmorty/presentation/base/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onItemClickListener", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "bindHolder", "holder", "position", "getItem", "(I)Ljava/lang/Object;", "getItemCount", "onBindViewHolder", "(Lcom/example/rickandmorty/presentation/base/BaseViewHolder;I)V", "setupItems", "", "takeViewHolder", "parent", "Landroid/view/ViewGroup;", "update", "callback", "", "app_debug"})
public abstract class BaseAdapter<K extends com.example.rickandmorty.presentation.base.BaseViewHolder<T>, T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<K> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClickListener;
    
    /**
     * Список элементов
     */
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<T> items;
    
    public BaseAdapter() {
        super();
    }
    
    public BaseAdapter(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnItemClickListener() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<T> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<T> p0) {
    }
    
    /**
     * Получить элемент по индексу
     */
    public final T getItem(int position) {
        return null;
    }
    
    /**
     * Получить количество элементов списка
     */
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    /**
     * Изменить текущий список элементов на новый
     *
     * @param items Новый список элементов
     */
    public void setupItems(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> items) {
    }
    
    public void update(@org.jetbrains.annotations.NotNull
    java.util.List<? extends T> items, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    /**
     * Создать view holder
     *
     * @param parent Родительская view group
     */
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.presentation.base.BaseViewHolder<T> takeViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent);
    
    /**
     * Связать viewHolder с данными
     *
     * @param holder [BaseViewHolder]
     * @param position Позиция элемента списка
     */
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    K holder, int position) {
    }
    
    /**
     * Вызываем в onBindViewHolder
     *
     * @param holder [BaseViewHolder]
     * @param position Позиция элемента списка
     */
    public void bindHolder(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.presentation.base.BaseViewHolder<T> holder, int position) {
    }
}
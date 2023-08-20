package com.example.rickandmorty.presentation.base;

import java.lang.System;

/**
 * Базовый класс ViewHolder
 *
 * @property itemViewBinding байндинг
 * @property tag номер (для определения индекса элемента)
 * @property context [Context]
 * @property resources ресурсы приложения
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u000fH\u0004R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/example/rickandmorty/presentation/base/BaseViewHolder;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemViewBinding", "Landroidx/viewbinding/ViewBinding;", "(Landroidx/viewbinding/ViewBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "tag", "", "getTag", "()I", "setTag", "(I)V", "bindItem", "", "item", "(Ljava/lang/Object;)V", "getString", "", "stringRes", "app_debug"})
public abstract class BaseViewHolder<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final androidx.viewbinding.ViewBinding itemViewBinding = null;
    private int tag = 0;
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull
    androidx.viewbinding.ViewBinding itemViewBinding) {
        super(null);
    }
    
    /**
     * Наполнение viewholder
     */
    public abstract void bindItem(T item);
    
    public int getTag() {
        return 0;
    }
    
    public void setTag(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.res.Resources getResources() {
        return null;
    }
    
    /**
     * Получить строку из ресурса
     *
     * @param stringRes Ресурс строки
     */
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getString(@androidx.annotation.StringRes
    int stringRes) {
        return null;
    }
}
package com.thesis.sportologia.utils.image_loader;

import java.lang.System;

/**
 * Создание экземпляра загрузчика
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/thesis/sportologia/utils/image_loader/LoaderCreator;", "", "getInstance", "Lcom/example/rickandmorty/utils/image_loader/ImageLoader;", "context", "Landroid/content/Context;", "app_debug"})
public abstract interface LoaderCreator {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader getInstance(@org.jetbrains.annotations.NotNull
    android.content.Context context);
}
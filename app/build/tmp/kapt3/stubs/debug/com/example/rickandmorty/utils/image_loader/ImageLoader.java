package com.example.rickandmorty.utils.image_loader;

import java.lang.System;

/**
 * Класс для загрузки изображений
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\b\u0010\u0002\u001a\u00020\u0000H&J\b\u0010\u0003\u001a\u00020\u0000H&J\b\u0010\u0004\u001a\u00020\u0000H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0012\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\tH&J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\tH&J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH&\u00a8\u0006\u001f"}, d2 = {"Lcom/example/rickandmorty/utils/image_loader/ImageLoader;", "", "centerCrop", "centerInside", "circleCrop", "error", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "", "into", "", "imageView", "Landroid/widget/ImageView;", "callback", "Lcom/thesis/sportologia/utils/image_loader/ImageLoaderListener;", "load", "file", "Ljava/io/File;", "resourceId", "url", "", "placeholder", "placeholderDrawable", "placeholderResId", "resize", "targetWidth", "targetHeight", "roundedCorners", "roundingRadius", "Companion", "app_debug"})
public abstract interface ImageLoader {
    @org.jetbrains.annotations.NotNull
    public static final com.example.rickandmorty.utils.image_loader.ImageLoader.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader centerCrop();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader roundedCorners(int roundingRadius);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader circleCrop();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader centerInside();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader placeholder(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable placeholderDrawable);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader error(int errorResId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader error(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable errorDrawable);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader placeholder(int placeholderResId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader resize(int targetWidth, int targetHeight);
    
    public abstract void into(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    com.thesis.sportologia.utils.image_loader.ImageLoaderListener callback);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader load(@org.jetbrains.annotations.Nullable
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader load(@org.jetbrains.annotations.NotNull
    java.io.File file);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.rickandmorty.utils.image_loader.ImageLoader load(@androidx.annotation.DrawableRes
    int resourceId);
    
    /**
     * Класс для загрузки изображений
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u000eJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/rickandmorty/utils/image_loader/ImageLoader$Companion;", "", "()V", "loaderCreator", "Lcom/thesis/sportologia/utils/image_loader/LoaderCreator;", "getLoaderCreator", "()Lcom/thesis/sportologia/utils/image_loader/LoaderCreator;", "setLoaderCreator", "(Lcom/thesis/sportologia/utils/image_loader/LoaderCreator;)V", "load", "Lcom/example/rickandmorty/utils/image_loader/ImageLoader;", "file", "Ljava/io/File;", "resourceId", "", "url", "", "app_debug"})
    public static final class Companion {
        public static com.thesis.sportologia.utils.image_loader.LoaderCreator loaderCreator;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.thesis.sportologia.utils.image_loader.LoaderCreator getLoaderCreator() {
            return null;
        }
        
        public final void setLoaderCreator(@org.jetbrains.annotations.NotNull
        com.thesis.sportologia.utils.image_loader.LoaderCreator p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.image_loader.ImageLoader load(@org.jetbrains.annotations.Nullable
        java.lang.String url) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.image_loader.ImageLoader load(@org.jetbrains.annotations.NotNull
        java.io.File file) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.image_loader.ImageLoader load(@androidx.annotation.DrawableRes
        int resourceId) {
            return null;
        }
    }
}
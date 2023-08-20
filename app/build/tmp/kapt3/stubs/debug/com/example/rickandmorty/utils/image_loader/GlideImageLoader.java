package com.example.rickandmorty.utils.image_loader;

import java.lang.System;

/**
 * Загрузка изображений с помощью @Glide
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001c\u001a\u00020\u00012\b\b\u0001\u0010\u001f\u001a\u00020\u0015H\u0016J\u0012\u0010\u001c\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u0015H\u0016J\u0018\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020\u0015H\u0016J\u0010\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/rickandmorty/utils/image_loader/GlideImageLoader;", "Lcom/example/rickandmorty/utils/image_loader/ImageLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "requestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "requestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "transformations", "", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "centerCrop", "centerInside", "circleCrop", "error", "errorDrawable", "errorResId", "", "into", "", "imageView", "Landroid/widget/ImageView;", "callback", "Lcom/thesis/sportologia/utils/image_loader/ImageLoaderListener;", "load", "file", "Ljava/io/File;", "resourceId", "url", "", "placeholder", "placeholderDrawable", "placeholderResId", "resize", "targetWidth", "targetHeight", "roundedCorners", "roundingRadius", "app_debug"})
public final class GlideImageLoader implements com.example.rickandmorty.utils.image_loader.ImageLoader {
    private com.bumptech.glide.RequestManager requestManager;
    private com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable> requestBuilder;
    private com.bumptech.glide.request.RequestOptions requestOptions;
    private java.util.List<com.bumptech.glide.load.resource.bitmap.BitmapTransformation> transformations;
    
    public GlideImageLoader(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader centerCrop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader roundedCorners(int roundingRadius) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader circleCrop() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader centerInside() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader placeholder(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable placeholderDrawable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader error(int errorResId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader error(@org.jetbrains.annotations.NotNull
    android.graphics.drawable.Drawable errorDrawable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader placeholder(int placeholderResId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader resize(int targetWidth, int targetHeight) {
        return null;
    }
    
    @java.lang.Override
    public void into(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    com.thesis.sportologia.utils.image_loader.ImageLoaderListener callback) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader load(@org.jetbrains.annotations.Nullable
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader load(@org.jetbrains.annotations.NotNull
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.rickandmorty.utils.image_loader.ImageLoader load(@androidx.annotation.DrawableRes
    int resourceId) {
        return null;
    }
}
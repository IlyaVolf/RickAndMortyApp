package com.example.rickandmorty.utils;

import java.lang.System;

/**
 * Помощник для работы с файлами ресурсов
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ \u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0001J\u0010\u0010\u001e\u001a\n \f*\u0004\u0018\u00010\u00130\u0013H\u0002J\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0006J\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0006J+\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00062\u0016\u0010&\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\'\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010(J#\u0010)\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00190\u00190\'2\b\b\u0001\u0010*\u001a\u00020\u0006\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/rickandmorty/utils/ResourcesUtils;", "", "()V", "DEFAULT_APP_LOCALE", "Ljava/util/Locale;", "getColor", "", "resColor", "getDimensionPixels", "dimenId", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getDrawable", "Landroid/graphics/drawable/Drawable;", "resDrawable", "getInteger", "integerResId", "getLocalizedResources", "Landroid/content/res/Resources;", "locale", "getPxByDp", "dp", "", "getQuantityString", "", "pluralId", "quantity", "", "value", "getResources", "getScreenHeightInPixels", "window", "Landroid/view/Window;", "getScreenWidthInPixels", "getStatusBarHeight", "getString", "stringRes", "args", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "arrayResId", "(I)[Ljava/lang/String;", "app_debug"})
public final class ResourcesUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.example.rickandmorty.utils.ResourcesUtils INSTANCE = null;
    private static final java.util.Locale DEFAULT_APP_LOCALE = null;
    
    private ResourcesUtils() {
        super();
    }
    
    /**
     * Получение строки из ресурса
     *
     * @param stringRes идентификатор строкового ресурса
     * @return строка
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getString(int stringRes) {
        return null;
    }
    
    /**
     * Получение строки из ресурса с параметрами
     *
     * @param stringRes идентификатор строкового ресурса
     * @param args      параметры для строки
     * @return строка
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getString(int stringRes, @org.jetbrains.annotations.NotNull
    java.lang.Object... args) {
        return null;
    }
    
    /**
     * Возвращает цвет
     *
     * @param resColor идентификатор ресурса цвета
     * @return цвет
     */
    public final int getColor(@androidx.annotation.ColorRes
    int resColor) {
        return 0;
    }
    
    /**
     * Возвращает drawable
     *
     * @param resDrawable идентификатор ресурса drawable
     * @return drawable
     */
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getDrawable(@androidx.annotation.DrawableRes
    int resDrawable) {
        return null;
    }
    
    /**
     * Возвращает строку с окончанием множества
     *
     * @param pluralId идентификатор текста множества
     * @param quantity количество
     * @return строка
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuantityString(@androidx.annotation.PluralsRes
    int pluralId, long quantity) {
        return null;
    }
    
    /**
     * Возвращает строку с окончанием множества
     *
     * @param pluralId идентификатор текста множества
     * @param quantity количество
     * @param value    подставляемое значение
     * @return строка
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuantityString(@androidx.annotation.PluralsRes
    int pluralId, long quantity, @org.jetbrains.annotations.NotNull
    java.lang.Object value) {
        return null;
    }
    
    /**
     * Возвращает количество pixels из ресурсов через ссылку на dimension resource
     *
     * @param dimenId индентификатор dimension resource
     * @return количество pixels
     * @see .getPxByDp
     */
    public final int getDimensionPixels(@androidx.annotation.DimenRes
    int dimenId) {
        return 0;
    }
    
    /**
     * Возвращает ширину экрана в pixels
     *
     * @return количество pixels
     */
    public final int getScreenWidthInPixels() {
        return 0;
    }
    
    /**
     * Возвращает высоту экрана в pixels
     *
     * @return количество pixels
     */
    public final int getScreenHeightInPixels() {
        return 0;
    }
    
    /**
     * Возвращает высоту экрана в pixels
     *
     * @return количество pixels
     */
    public final int getScreenHeightInPixels(@org.jetbrains.annotations.NotNull
    android.view.Window window) {
        return 0;
    }
    
    /**
     * Конвертирует значение dp в значение pixels
     *
     * @param dp количество dp
     * @return количество pixels
     * @see .getDimensionPixels
     */
    public final int getPxByDp(float dp) {
        return 0;
    }
    
    /**
     * Получение целого числа по его идентификатору
     *
     * @param integerResId идентификатор ресурса целого числа
     * @return целое число
     */
    public final int getInteger(@androidx.annotation.IntegerRes
    int integerResId) {
        return 0;
    }
    
    /**
     * Возвращает массив строк
     *
     * @param arrayResId индентификатор ресурса массива
     * @return массив строк
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getStringArray(@androidx.annotation.ArrayRes
    int arrayResId) {
        return null;
    }
    
    /**
     * Возвращает высоту StatusBar в pixels
     *
     * @return высота StatusBar в pixels
     */
    public final int getStatusBarHeight() {
        return 0;
    }
    
    /**
     * Возвращает экземпляр класса Resources
     *
     * @return экземпляр класса Resources
     */
    private final android.content.res.Resources getResources() {
        return null;
    }
    
    private final android.util.DisplayMetrics getDisplayMetrics() {
        return null;
    }
    
    /**
     * Возвращает локализированный экземпляр класса [Resources]
     *
     * @param locale [языковая локаль][Locale]
     * @return [Resources] с применённой локалью
     */
    private final android.content.res.Resources getLocalizedResources(java.util.Locale locale) {
        return null;
    }
}
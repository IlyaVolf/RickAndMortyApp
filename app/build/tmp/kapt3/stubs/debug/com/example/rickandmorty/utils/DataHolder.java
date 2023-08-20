package com.example.rickandmorty.utils;

import java.lang.System;

/**
 * Класс для хранения информации о статусе состояния данных
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0006\u001c\u001d\u001e\u001f !B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003Ji\u0010\f\u001a\u0002H\r\"\u0004\b\u0001\u0010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\r0\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\r0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\r0\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J \u0010\u0010\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u000fH\u0086\b\u00f8\u0001\u0000J\u001a\u0010\u0012\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00f8\u0001\u0000J\u001a\u0010\u0019\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00f8\u0001\u0000J\u001a\u0010\u001a\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00f8\u0001\u0000J \u0010\u000e\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u000fH\u0086\b\u00f8\u0001\u0000J\u001a\u0010\u001b\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0086\b\u00f8\u0001\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u00058\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006R\u0012\u0010\b\u001a\u00020\u00058\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\u00058\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u00058\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0012\u0010\u000b\u001a\u00020\u00058\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006\u0082\u0001\u0005\"#$%&\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\'"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder;", "TData", "", "()V", "isError", "", "()Z", "isInit", "isLoading", "isNotReady", "isReady", "isRefresh", "fold", "TResult", "onReady", "Lkotlin/Function1;", "onError", "", "onLoading", "Lkotlin/Function0;", "onInit", "onRefresh", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "block", "onNotLoading", "onNotReady", "onRefreshing", "Companion", "ERROR", "INIT", "LOADING", "READY", "REFRESH", "Lcom/example/rickandmorty/utils/DataHolder$INIT;", "Lcom/example/rickandmorty/utils/DataHolder$LOADING;", "Lcom/example/rickandmorty/utils/DataHolder$REFRESH;", "Lcom/example/rickandmorty/utils/DataHolder$READY;", "Lcom/example/rickandmorty/utils/DataHolder$ERROR;", "app_debug"})
public abstract class DataHolder<TData extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    public static final com.example.rickandmorty.utils.DataHolder.Companion Companion = null;
    
    private DataHolder() {
        super();
    }
    
    /**
     * @param block Будет вызван в случае готовности данных
     */
    public final void onReady(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super TData, kotlin.Unit> block) {
    }
    
    /**
     * @param block Будет вызван в случае неготовности данных
     */
    public final void onNotReady(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    /**
     * @param block Будет вызван в состоянии загрузки данных
     */
    public final void onLoading(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    /**
     * @param block Будет вызван в состоянии обновления данных
     */
    public final void onRefreshing(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    /**
     * @param block Будет вызван во всех состояниях кроме загрузки данных
     */
    public final void onNotLoading(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    /**
     * @param block Будет вызван в состоянии ошибки загрузки данных
     */
    public final void onError(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> block) {
    }
    
    /**
     * Конвертирует состяние в новый тип данных в зависимости от текущего статуса
     */
    public final <TResult extends java.lang.Object>TResult fold(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super TData, ? extends TResult> onReady, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends TResult> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends TResult> onLoading, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends TResult> onInit, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends TResult> onRefresh) {
        return null;
    }
    
    public final boolean isInit() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isRefresh() {
        return false;
    }
    
    public final boolean isReady() {
        return false;
    }
    
    public final boolean isNotReady() {
        return false;
    }
    
    public final boolean isError() {
        return false;
    }
    
    /**
     * Состояние инициализации (первой загрузки) данных
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder$INIT;", "Lcom/example/rickandmorty/utils/DataHolder;", "", "()V", "app_debug"})
    public static final class INIT extends com.example.rickandmorty.utils.DataHolder {
        @org.jetbrains.annotations.NotNull
        public static final com.example.rickandmorty.utils.DataHolder.INIT INSTANCE = null;
        
        private INIT() {
            super();
        }
    }
    
    /**
     * Состояние загрузки данных
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder$LOADING;", "Lcom/example/rickandmorty/utils/DataHolder;", "", "()V", "app_debug"})
    public static final class LOADING extends com.example.rickandmorty.utils.DataHolder {
        @org.jetbrains.annotations.NotNull
        public static final com.example.rickandmorty.utils.DataHolder.LOADING INSTANCE = null;
        
        private LOADING() {
            super();
        }
    }
    
    /**
     * Состояние обновления данных
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder$REFRESH;", "Lcom/example/rickandmorty/utils/DataHolder;", "", "()V", "app_debug"})
    public static final class REFRESH extends com.example.rickandmorty.utils.DataHolder {
        @org.jetbrains.annotations.NotNull
        public static final com.example.rickandmorty.utils.DataHolder.REFRESH INSTANCE = null;
        
        private REFRESH() {
            super();
        }
    }
    
    /**
     * Состояние готовности данных
     *
     * @property data Загруженные данные
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder$READY;", "TData", "Lcom/example/rickandmorty/utils/DataHolder;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
    public static final class READY<TData extends java.lang.Object> extends com.example.rickandmorty.utils.DataHolder<TData> {
        private final TData data = null;
        
        public READY(TData data) {
            super();
        }
        
        public final TData getData() {
            return null;
        }
    }
    
    /**
     * Состояние ошибки загрузки данных
     *
     * @property failure Информация об ошибке
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder$ERROR;", "Lcom/example/rickandmorty/utils/DataHolder;", "", "failure", "", "(Ljava/lang/Throwable;)V", "getFailure", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class ERROR extends com.example.rickandmorty.utils.DataHolder {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Throwable failure = null;
        
        public ERROR(@org.jetbrains.annotations.NotNull
        java.lang.Throwable failure) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable getFailure() {
            return null;
        }
    }
    
    /**
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0001\u0010\r2\u0006\u0010\u000e\u001a\u0002H\r\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/rickandmorty/utils/DataHolder$Companion;", "", "()V", "error", "Lcom/example/rickandmorty/utils/DataHolder$ERROR;", "failure", "", "init", "Lcom/example/rickandmorty/utils/DataHolder$INIT;", "loading", "Lcom/example/rickandmorty/utils/DataHolder$LOADING;", "ready", "Lcom/example/rickandmorty/utils/DataHolder$READY;", "TData", "data", "(Ljava/lang/Object;)Lcom/example/rickandmorty/utils/DataHolder$READY;", "refresh", "Lcom/example/rickandmorty/utils/DataHolder$REFRESH;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Создает [DataHolder] в состоянии инициализации данных
         */
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.DataHolder.INIT init() {
            return null;
        }
        
        /**
         * Создает [DataHolder] в состоянии загрузки данных
         */
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.DataHolder.LOADING loading() {
            return null;
        }
        
        /**
         * Создает [DataHolder] в состоянии обновления данных
         */
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.DataHolder.REFRESH refresh() {
            return null;
        }
        
        /**
         * Создает [DataHolder] в состоянии готовности данных
         */
        @org.jetbrains.annotations.NotNull
        public final <TData extends java.lang.Object>com.example.rickandmorty.utils.DataHolder.READY<TData> ready(TData data) {
            return null;
        }
        
        /**
         * Создает [DataHolder] в состоянии ошибки загрузки данных
         */
        @org.jetbrains.annotations.NotNull
        public final com.example.rickandmorty.utils.DataHolder.ERROR error(@org.jetbrains.annotations.NotNull
        java.lang.Throwable failure) {
            return null;
        }
    }
}
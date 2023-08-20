package com.example.rickandmorty.data.base.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J5\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u00152\u001c\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/example/rickandmorty/data/base/retrofit/BaseRetrofitSource;", "", "retrofitConfig", "Lcom/example/rickandmorty/data/base/retrofit/RetrofitConfig;", "(Lcom/example/rickandmorty/data/base/retrofit/RetrofitConfig;)V", "errorAdapter", "Lcom/google/gson/TypeAdapter;", "Lcom/example/rickandmorty/data/base/retrofit/BaseRetrofitSource$ErrorResponseBody;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "createBackendException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lretrofit2/HttpException;", "wrapRetrofitExceptions", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ErrorResponseBody", "app_debug"})
public class BaseRetrofitSource {
    @org.jetbrains.annotations.NotNull
    private final retrofit2.Retrofit retrofit = null;
    private final com.google.gson.Gson gson = null;
    private final com.google.gson.TypeAdapter<com.example.rickandmorty.data.base.retrofit.BaseRetrofitSource.ErrorResponseBody> errorAdapter = null;
    
    @javax.inject.Inject
    public BaseRetrofitSource(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.base.retrofit.RetrofitConfig retrofitConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    /**
     * Map network and parse exceptions into in-app exceptions.
     * @throws BackendException
     * @throws ParseBackendResponseException
     * @throws ConnectionException
     */
    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.Object>java.lang.Object wrapRetrofitExceptions(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> continuation) {
        return null;
    }
    
    private final java.lang.Exception createBackendException(retrofit2.HttpException e) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/rickandmorty/data/base/retrofit/BaseRetrofitSource$ErrorResponseBody;", "", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "app_debug"})
    public static final class ErrorResponseBody {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String error = null;
        
        public ErrorResponseBody(@org.jetbrains.annotations.NotNull
        java.lang.String error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getError() {
            return null;
        }
    }
}
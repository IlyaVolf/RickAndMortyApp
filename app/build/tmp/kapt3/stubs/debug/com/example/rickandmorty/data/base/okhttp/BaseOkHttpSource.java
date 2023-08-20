package com.example.rickandmorty.data.base.okhttp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0002H\u0019\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0012H\u0086\b\u00a2\u0006\u0002\u0010\u001aJ#\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0000\u0010\u0019*\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001c\u00a2\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u0012*\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00020\"\"\u0004\b\u0000\u0010\u0019*\u0002H\u0019\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/rickandmorty/data/base/okhttp/BaseOkHttpSource;", "", "OkHttpConfig", "Lcom/example/rickandmorty/data/base/okhttp/OkHttpConfig;", "(Lcom/example/rickandmorty/data/base/okhttp/OkHttpConfig;)V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "contentType", "Lokhttp3/MediaType;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "handleErrorResponse", "", "response", "Lokhttp3/Response;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "endpoint", "Lokhttp3/Request$Builder;", "", "parseJsonResponse", "T", "(Lokhttp3/Response;)Ljava/lang/Object;", "typeToken", "Lcom/google/gson/reflect/TypeToken;", "(Lokhttp3/Response;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", "suspendEnqueue", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toJsonRequestBody", "Lokhttp3/RequestBody;", "(Ljava/lang/Object;)Lokhttp3/RequestBody;", "app_debug"})
public class BaseOkHttpSource {
    private final com.example.rickandmorty.data.base.okhttp.OkHttpConfig OkHttpConfig = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull
    private final okhttp3.OkHttpClient client = null;
    private final okhttp3.MediaType contentType = null;
    
    @javax.inject.Inject
    public BaseOkHttpSource(@org.jetbrains.annotations.NotNull
    com.example.rickandmorty.data.base.okhttp.OkHttpConfig OkHttpConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    /**
     * Suspending function which wraps OkHttp [Call.enqueue] method for making
     * HTTP requests and wraps external exceptions into subclasses of [AppException].
     *
     * @throws ConnectionException
     * @throws BackendException
     * @throws ParseBackendResponseException
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object suspendEnqueue(@org.jetbrains.annotations.NotNull
    okhttp3.Call $this$suspendEnqueue, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.Response> p1) {
        return null;
    }
    
    /**
     * Concatenate the base URL with a path and query args.
     */
    @org.jetbrains.annotations.NotNull
    public final okhttp3.Request.Builder endpoint(@org.jetbrains.annotations.NotNull
    okhttp3.Request.Builder $this$endpoint, @org.jetbrains.annotations.NotNull
    java.lang.String endpoint) {
        return null;
    }
    
    /**
     * Convert data class into [RequestBody] in JSON-format.
     */
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>okhttp3.RequestBody toJsonRequestBody(T $this$toJsonRequestBody) {
        return null;
    }
    
    /**
     * Parse OkHttp [Response] instance into data object. The type is derived from
     * TypeToken passed to this function as a second argument. Usually this method is
     * used to parse JSON arrays.
     *
     * @throws ParseBackendResponseException
     */
    public final <T extends java.lang.Object>T parseJsonResponse(@org.jetbrains.annotations.NotNull
    okhttp3.Response $this$parseJsonResponse, @org.jetbrains.annotations.NotNull
    com.google.gson.reflect.TypeToken<T> typeToken) {
        return null;
    }
    
    /**
     * 1. Convert error response from the server into [BackendException] and throw the latter.
     * 2. Throw [ParseBackendResponseException] if error response parsing
     * process has been failed.
     */
    private final void handleErrorResponse(okhttp3.Response response, kotlinx.coroutines.CancellableContinuation<? super okhttp3.Response> continuation) {
    }
}
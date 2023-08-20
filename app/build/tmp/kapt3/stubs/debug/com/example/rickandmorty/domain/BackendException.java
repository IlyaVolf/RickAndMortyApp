package com.example.rickandmorty.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/rickandmorty/domain/BackendException;", "Lcom/example/rickandmorty/domain/AppException;", "code", "", "message", "", "(ILjava/lang/String;)V", "getCode", "()I", "app_debug"})
public class BackendException extends com.example.rickandmorty.domain.AppException {
    private final int code = 0;
    
    public BackendException(int code, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
        super();
    }
    
    public final int getCode() {
        return 0;
    }
}
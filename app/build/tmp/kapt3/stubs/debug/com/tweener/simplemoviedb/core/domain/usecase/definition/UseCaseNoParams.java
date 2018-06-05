package com.tweener.simplemoviedb.core.domain.usecase.definition;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCaseNoParams;", "T", "Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCase;", "()V", "execute", "()Ljava/lang/Object;", "app_debug"})
public abstract class UseCaseNoParams<T extends java.lang.Object> extends com.tweener.simplemoviedb.core.domain.usecase.definition.UseCase {
    
    public abstract T execute();
    
    public UseCaseNoParams() {
        super();
    }
}
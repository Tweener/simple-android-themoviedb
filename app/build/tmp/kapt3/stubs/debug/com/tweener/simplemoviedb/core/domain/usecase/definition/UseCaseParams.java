package com.tweener.simplemoviedb.core.domain.usecase.definition;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\n\b\u0001\u0010\u0002 \u0000*\u00020\u00032\u00020\u0004:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCaseParams;", "T", "Input", "Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCaseParams$InputParams;", "Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCase;", "()V", "execute", "params", "(Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCaseParams$InputParams;)Ljava/lang/Object;", "InputParams", "app_debug"})
public abstract class UseCaseParams<T extends java.lang.Object, Input extends com.tweener.simplemoviedb.core.domain.usecase.definition.UseCaseParams.InputParams> extends com.tweener.simplemoviedb.core.domain.usecase.definition.UseCase {
    
    public abstract T execute(@org.jetbrains.annotations.NotNull()
    Input params);
    
    public UseCaseParams() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tweener/simplemoviedb/core/domain/usecase/definition/UseCaseParams$InputParams;", "", "()V", "app_debug"})
    public static class InputParams {
        
        public InputParams() {
            super();
        }
    }
}
package com.tweener.simplemoviedb.core;

import java.lang.System;

/**
 * * @author Vivien Mahe
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/tweener/simplemoviedb/core/SimpleMovieDBApplication;", "Landroid/app/Application;", "()V", "applicationComponent", "Lcom/tweener/simplemoviedb/core/di/component/ApplicationComponent;", "getApplicationComponent", "()Lcom/tweener/simplemoviedb/core/di/component/ApplicationComponent;", "setApplicationComponent", "(Lcom/tweener/simplemoviedb/core/di/component/ApplicationComponent;)V", "onCreate", "", "app_debug"})
public final class SimpleMovieDBApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.tweener.simplemoviedb.core.di.component.ApplicationComponent applicationComponent;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tweener.simplemoviedb.core.di.component.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    public final void setApplicationComponent(@org.jetbrains.annotations.NotNull()
    com.tweener.simplemoviedb.core.di.component.ApplicationComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public SimpleMovieDBApplication() {
        super();
    }
}
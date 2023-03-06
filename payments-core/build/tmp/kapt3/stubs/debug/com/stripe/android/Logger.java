package com.stripe.android;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/Logger;", "", "debug", "", "msg", "", "error", "t", "", "info", "warning", "Companion", "payments-core_debug"})
public abstract interface Logger {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.Logger.Companion Companion = null;
    
    public abstract void debug(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void info(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void warning(@org.jetbrains.annotations.NotNull()
    java.lang.String msg);
    
    public abstract void error(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0006\u0010\u000b\u001a\u00020\u0004J\r\u0010\f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/Logger$Companion;", "", "()V", "NOOP_LOGGER", "Lcom/stripe/android/Logger;", "REAL_LOGGER", "TAG", "", "getInstance", "enableLogging", "", "noop", "real", "real$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        private static final java.lang.String TAG = "StripeSdk";
        private static final com.stripe.android.Logger REAL_LOGGER = null;
        private static final com.stripe.android.Logger NOOP_LOGGER = null;
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final com.stripe.android.Logger getInstance(boolean enableLogging) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.Logger real$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.Logger noop() {
            return null;
        }
    }
}
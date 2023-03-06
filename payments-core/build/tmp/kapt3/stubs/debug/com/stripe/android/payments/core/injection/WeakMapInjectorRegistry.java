package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * A [InjectorRegistry] implemented with a weak map. An entry from the map will be  will be garbage
 * collected once the [Injector] instance is no longer held elsewhere.
 *
 * Note: the weak map will be cleared when app process is killed by system.
 * [Injectable] implementations are responsible for detecting this and call
 * [Injectable.fallbackInitialize] accordingly.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0017J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u000bH\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0016R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R-\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\u000b\u00a2\u0006\u0002\b\f0\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/payments/core/injection/WeakMapInjectorRegistry;", "Lcom/stripe/android/payments/core/injection/InjectorRegistry;", "()V", "CURRENT_REGISTER_KEY", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCURRENT_REGISTER_KEY$payments_core_debug$annotations", "getCURRENT_REGISTER_KEY$payments_core_debug", "()Ljava/util/concurrent/atomic/AtomicInteger;", "staticCacheMap", "Ljava/util/WeakHashMap;", "Lcom/stripe/android/payments/core/injection/Injector;", "", "Lcom/stripe/android/payments/core/injection/InjectorKey;", "getStaticCacheMap$annotations", "getStaticCacheMap", "()Ljava/util/WeakHashMap;", "nextKey", "prefix", "register", "", "injector", "key", "retrieve", "injectorKey", "payments-core_debug"})
public final class WeakMapInjectorRegistry implements com.stripe.android.payments.core.injection.InjectorRegistry {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.core.injection.WeakMapInjectorRegistry INSTANCE = null;
    
    /**
     * Cache to map [Injector] to its corresponding [InjectorKey].
     * Note: the [Injector] is the weak map key for itself to be garbage collected.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private static final java.util.WeakHashMap<com.stripe.android.payments.core.injection.Injector, java.lang.String> staticCacheMap = null;
    
    /**
     * Global unique monotonically increasing key to be assigned as a suffixes to
     * registered [Injector]s.
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.atomic.AtomicInteger CURRENT_REGISTER_KEY = null;
    
    private WeakMapInjectorRegistry() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.WeakHashMap<com.stripe.android.payments.core.injection.Injector, java.lang.String> getStaticCacheMap() {
        return null;
    }
    
    /**
     * Cache to map [Injector] to its corresponding [InjectorKey].
     * Note: the [Injector] is the weak map key for itself to be garbage collected.
     */
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStaticCacheMap$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.atomic.AtomicInteger getCURRENT_REGISTER_KEY$payments_core_debug() {
        return null;
    }
    
    /**
     * Global unique monotonically increasing key to be assigned as a suffixes to
     * registered [Injector]s.
     */
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCURRENT_REGISTER_KEY$payments_core_debug$annotations() {
    }
    
    @java.lang.Override()
    public void register(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injector injector, @org.jetbrains.annotations.NotNull()
    @InjectorKey()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.payments.core.injection.Injector retrieve(@org.jetbrains.annotations.NotNull()
    @InjectorKey()
    java.lang.String injectorKey) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @InjectorKey()
    public java.lang.String nextKey(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix) {
        return null;
    }
}
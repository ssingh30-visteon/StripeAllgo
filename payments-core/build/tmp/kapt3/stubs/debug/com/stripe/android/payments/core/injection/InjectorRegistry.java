package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * A registry to maintain [Injector] instances so that they can be retrieved from
 * [Activity]s and [Fragment]s.
 * This registry is needed for dagger injection because the SDK can't access [Application], and
 * thus [Activity]s can't get required [Component] from by downcasting  [Activity.getApplication].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0003H&J\u0014\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/payments/core/injection/InjectorRegistry;", "", "nextKey", "", "prefix", "register", "", "injector", "Lcom/stripe/android/payments/core/injection/Injector;", "key", "retrieve", "injectorKey", "payments-core_debug"})
public abstract interface InjectorRegistry {
    
    /**
     * Registers an [Injector] instance with corresponding [InjectorKey].
     */
    public abstract void register(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injector injector, @org.jetbrains.annotations.NotNull()
    @InjectorKey()
    java.lang.String key);
    
    /**
     * Retrieves an [Injector] instance from [InjectorKey].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.payments.core.injection.Injector retrieve(@org.jetbrains.annotations.NotNull()
    @InjectorKey()
    java.lang.String injectorKey);
    
    /**
     * Returns the next key to identify an [Injector].
     */
    @org.jetbrains.annotations.NotNull()
    @InjectorKey()
    public abstract java.lang.String nextKey(@org.jetbrains.annotations.NotNull()
    java.lang.String prefix);
}
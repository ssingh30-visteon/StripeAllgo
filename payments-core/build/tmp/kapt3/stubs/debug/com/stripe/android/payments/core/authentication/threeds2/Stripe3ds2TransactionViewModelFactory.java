package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ7\u0010\u0012\u001a\u0002H\u0013\"\n\b\u0000\u0010\u0013*\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Lcom/stripe/android/payments/core/injection/Injectable;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory$FallbackInitializeParam;", "applicationSupplier", "Lkotlin/Function0;", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "argsSupplier", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "(Lkotlin/jvm/functions/Function0;Landroidx/savedstate/SavedStateRegistryOwner;Lkotlin/jvm/functions/Function0;)V", "subComponentBuilder", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "getSubComponentBuilder", "()Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "setSubComponentBuilder", "(Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "fallbackInitialize", "", "arg", "FallbackInitializeParam", "payments-core_debug"})
public final class Stripe3ds2TransactionViewModelFactory extends androidx.lifecycle.AbstractSavedStateViewModelFactory implements com.stripe.android.payments.core.injection.Injectable<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.FallbackInitializeParam> {
    private final kotlin.jvm.functions.Function0<android.app.Application> applicationSupplier = null;
    private final kotlin.jvm.functions.Function0<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> argsSupplier = null;
    @javax.inject.Inject()
    public com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder subComponentBuilder;
    
    public Stripe3ds2TransactionViewModelFactory(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends android.app.Application> applicationSupplier, @org.jetbrains.annotations.NotNull()
    androidx.savedstate.SavedStateRegistryOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> argsSupplier) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder getSubComponentBuilder() {
        return null;
    }
    
    public final void setSubComponentBuilder(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent.Builder p0) {
    }
    
    /**
     * Fallback call to initialize dependencies when injection is not available, this might happen
     * when app process is killed by system and [WeakMapInjectorRegistry] is cleared.
     */
    @java.lang.Override()
    public void fallbackInitialize(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.FallbackInitializeParam arg) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle handle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModelFactory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "enableLogging", "", "publishableKey", "", "productUsage", "", "(Landroid/app/Application;ZLjava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "payments-core_debug"})
    public static final class FallbackInitializeParam {
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        private final boolean enableLogging = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String publishableKey = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> productUsage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.FallbackInitializeParam copy(@org.jetbrains.annotations.NotNull()
        android.app.Application application, boolean enableLogging, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FallbackInitializeParam(@org.jetbrains.annotations.NotNull()
        android.app.Application application, boolean enableLogging, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApplication() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getEnableLogging() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPublishableKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getProductUsage() {
            return null;
        }
    }
}
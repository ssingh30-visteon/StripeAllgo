package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020%H\u0007J\u0019\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u001aH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0013R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00130\u00130\u0015X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8@@@X\u0080\u000e\u00a2\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00062"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_googleResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "googlePayResult", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getGooglePayResult$payments_core_debug", "()Landroidx/lifecycle/LiveData;", "value", "", "hasLaunched", "getHasLaunched$payments_core_debug", "()Z", "setHasLaunched$payments_core_debug", "(Z)V", "createLoadPaymentDataTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentDataRequest", "Lorg/json/JSONObject;", "createPaymentMethod", "paymentData", "(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "createTransactionInfo$payments_core_debug", "isReadyToPay", "updateResult", "", "result", "Companion", "Factory", "payments-core_debug"})
public final class GooglePayPaymentMethodLauncherViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.android.gms.wallet.PaymentsClient paymentsClient = null;
    private final com.stripe.android.networking.ApiRequest.Options requestOptions = null;
    private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args args = null;
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final com.stripe.android.GooglePayJsonFactory googlePayJsonFactory = null;
    private final com.stripe.android.googlepaylauncher.GooglePayRepository googlePayRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result> _googleResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result> googlePayResult = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String HAS_LAUNCHED_KEY = "has_launched";
    
    @javax.inject.Inject()
    public GooglePayPaymentMethodLauncherViewModel(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.wallet.PaymentsClient paymentsClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory googlePayJsonFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayRepository googlePayRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final boolean getHasLaunched$payments_core_debug() {
        return false;
    }
    
    public final void setHasLaunched$payments_core_debug(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result> getGooglePayResult$payments_core_debug() {
        return null;
    }
    
    public final void updateResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result result) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object isReadyToPay(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final org.json.JSONObject createPaymentDataRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final com.stripe.android.GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args args) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createLoadPaymentDataTask(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<com.google.android.gms.wallet.PaymentData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.wallet.PaymentData paymentData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001 B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ7\u0010\u0013\u001a\u0002H\u0014\"\n\b\u0000\u0010\u0014*\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Lcom/stripe/android/payments/core/injection/Injectable;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory$FallbackInjectionParams;", "application", "Landroid/app/Application;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "(Landroid/app/Application;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContract$Args;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "subComponentBuilder", "Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "getSubComponentBuilder", "()Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;", "setSubComponentBuilder", "(Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherViewModelSubcomponent$Builder;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "fallbackInitialize", "", "arg", "FallbackInjectionParams", "payments-core_debug"})
    public static final class Factory extends androidx.lifecycle.AbstractSavedStateViewModelFactory implements com.stripe.android.payments.core.injection.Injectable<com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams> {
        private final android.app.Application application = null;
        private final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args args = null;
        @javax.inject.Inject()
        public com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder subComponentBuilder;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContract.Args args, @org.jetbrains.annotations.NotNull()
        androidx.savedstate.SavedStateRegistryOwner owner, @org.jetbrains.annotations.Nullable()
        android.os.Bundle defaultArgs) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder getSubComponentBuilder() {
            return null;
        }
        
        public final void setSubComponentBuilder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.Builder p0) {
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        protected <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
            return null;
        }
        
        @java.lang.Override()
        public void fallbackInitialize(@org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams arg) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00c6\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Factory$FallbackInjectionParams;", "", "application", "Landroid/app/Application;", "enableLogging", "", "publishableKey", "", "stripeAccountId", "productUsage", "", "(Landroid/app/Application;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "payments-core_debug"})
        public static final class FallbackInjectionParams {
            @org.jetbrains.annotations.NotNull()
            private final android.app.Application application = null;
            private final boolean enableLogging = false;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String publishableKey = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherViewModel.Factory.FallbackInjectionParams copy(@org.jetbrains.annotations.NotNull()
            android.app.Application application, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
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
            
            public FallbackInjectionParams(@org.jetbrains.annotations.NotNull()
            android.app.Application application, boolean enableLogging, @org.jetbrains.annotations.NotNull()
            java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
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
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStripeAccountId() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherViewModel$Companion;", "", "()V", "HAS_LAUNCHED_KEY", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
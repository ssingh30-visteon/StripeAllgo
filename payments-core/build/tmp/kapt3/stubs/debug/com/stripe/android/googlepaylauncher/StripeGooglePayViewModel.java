package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u00010BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020(J\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0*0\u00152\u0006\u0010+\u001a\u00020,\u00f8\u0001\u0000J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0011R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\u0015X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "publishableKey", "", "stripeAccountId", "args", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "appName", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "_googleResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayResult", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getGooglePayResult$payments_core_debug", "()Landroidx/lifecycle/LiveData;", "hasLaunched", "", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "setPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "createIsReadyToPayRequest", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "createPaymentDataRequestForPaymentIntentArgs", "Lorg/json/JSONObject;", "createPaymentMethod", "Lkotlin/Result;", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "updateGooglePayResult", "", "result", "Factory", "payments-core_debug"})
public final class StripeGooglePayViewModel extends androidx.lifecycle.AndroidViewModel {
    private final java.lang.String publishableKey = null;
    private final java.lang.String stripeAccountId = null;
    private final com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args args = null;
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final java.lang.String appName = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private boolean hasLaunched = false;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.PaymentMethod paymentMethod;
    private final com.stripe.android.GooglePayJsonFactory googlePayJsonFactory = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.googlepaylauncher.GooglePayLauncherResult> _googleResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.googlepaylauncher.GooglePayLauncherResult> googlePayResult = null;
    
    public StripeGooglePayViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    java.lang.String appName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super(null);
    }
    
    public final boolean getHasLaunched() {
        return false;
    }
    
    public final void setHasLaunched(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
        return null;
    }
    
    public final void setPaymentMethod(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.googlepaylauncher.GooglePayLauncherResult> getGooglePayResult$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.wallet.IsReadyToPayRequest createIsReadyToPayRequest() {
        return null;
    }
    
    public final void updateGooglePayResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncherResult result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject createPaymentDataRequestForPaymentIntentArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<com.stripe.android.model.PaymentMethod>> createPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u0002H\u000b\"\n\b\u0000\u0010\u000b*\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "publishableKey", "", "stripeAccountId", "args", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.app.Application application = null;
        private final java.lang.String publishableKey = null;
        private final java.lang.String stripeAccountId = null;
        private final com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args args = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args args) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}
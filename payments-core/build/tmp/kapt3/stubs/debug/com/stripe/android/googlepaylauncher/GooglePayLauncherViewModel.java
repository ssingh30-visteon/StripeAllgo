package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001?B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u0007H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u001d\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001\u00a2\u0006\u0002\b3J#\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\b9\u0010:J\u0011\u0010;\u001a\u00020\u001aH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0016\u0010<\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\u000e\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020\u0013R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00130\u00130\u0015X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006@"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "Landroidx/lifecycle/ViewModel;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "paymentController", "Lcom/stripe/android/PaymentController;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "(Lcom/google/android/gms/wallet/PaymentsClient;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/PaymentController;Lcom/stripe/android/GooglePayJsonFactory;Lcom/stripe/android/googlepaylauncher/GooglePayRepository;)V", "_googleResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "googlePayResult", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getGooglePayResult$payments_core_debug", "()Landroidx/lifecycle/LiveData;", "hasLaunched", "", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "confirmStripeIntent", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLoadPaymentDataTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentDataRequest", "Lorg/json/JSONObject;", "(Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTransactionInfo", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "currencyCode", "", "createTransactionInfo$payments_core_debug", "getResultFromConfirmation", "requestCode", "", "data", "Landroid/content/Intent;", "getResultFromConfirmation$payments_core_debug", "(ILandroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isReadyToPay", "onConfirmResult", "updateResult", "result", "Factory", "payments-core_debug"})
public final class GooglePayLauncherViewModel extends androidx.lifecycle.ViewModel {
    private final com.google.android.gms.wallet.PaymentsClient paymentsClient = null;
    private final com.stripe.android.networking.ApiRequest.Options requestOptions = null;
    private final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args args = null;
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final com.stripe.android.PaymentController paymentController = null;
    private final com.stripe.android.GooglePayJsonFactory googlePayJsonFactory = null;
    private final com.stripe.android.googlepaylauncher.GooglePayRepository googlePayRepository = null;
    private boolean hasLaunched = false;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result> _googleResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result> googlePayResult = null;
    
    public GooglePayLauncherViewModel(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.wallet.PaymentsClient paymentsClient, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentController paymentController, @org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory googlePayJsonFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayRepository googlePayRepository) {
        super();
    }
    
    public final boolean getHasLaunched() {
        return false;
    }
    
    public final void setHasLaunched(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.googlepaylauncher.GooglePayLauncher.Result> getGooglePayResult$payments_core_debug() {
        return null;
    }
    
    public final void updateResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncher.Result result) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object isReadyToPay(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object createPaymentDataRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args args, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.json.JSONObject> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final com.stripe.android.GooglePayJsonFactory.TransactionInfo createTransactionInfo$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createLoadPaymentDataTask(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.android.gms.tasks.Task<com.google.android.gms.wallet.PaymentData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object confirmStripeIntent(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethodCreateParams params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onConfirmResult(int requestCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object getResultFromConfirmation$payments_core_debug(int requestCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.googlepaylauncher.GooglePayLauncher.Result> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "enableLogging", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/app/Application;Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;ZLkotlin/coroutines/CoroutineContext;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.app.Application application = null;
        private final com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args args = null;
        private final boolean enableLogging = false;
        private final kotlin.coroutines.CoroutineContext workContext = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args args, boolean enableLogging, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext workContext) {
            super();
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}
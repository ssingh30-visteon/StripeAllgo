package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bBU\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;", "", "activity", "Landroidx/activity/ComponentActivity;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "appContext", "Landroid/content/Context;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "statusBarColor", "Lkotlin/Function0;", "", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlinx/coroutines/CoroutineScope;Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Landroidx/activity/result/ActivityResultCaller;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "create", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "paymentsheet_debug"})
public final class FlowControllerFactory {
    private final androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner = null;
    private final kotlinx.coroutines.CoroutineScope lifecycleScope = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final android.content.Context appContext = null;
    private final androidx.activity.result.ActivityResultCaller activityResultCaller = null;
    private final kotlin.jvm.functions.Function0<java.lang.Integer> statusBarColor = null;
    private final com.stripe.android.paymentsheet.model.PaymentOptionFactory paymentOptionFactory = null;
    private final com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback = null;
    private final com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback = null;
    
    public FlowControllerFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultCaller activityResultCaller, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Integer> statusBarColor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentOptionFactory paymentOptionFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
        super();
    }
    
    public FlowControllerFactory(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
        super();
    }
    
    public FlowControllerFactory(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.PaymentSheet.FlowController create() {
        return null;
    }
}
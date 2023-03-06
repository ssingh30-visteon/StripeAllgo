package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019BR\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "", "context", "Landroid/content/Context;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "customerSession", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "productUsage", "", "", "onDeletedPaymentMethodCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Object;", "create", "Landroidx/appcompat/app/AlertDialog;", "paymentMethod", "onDeletedPaymentMethod", "onDeletedPaymentMethod$payments_core_debug", "PaymentMethodDeleteListener", "payments-core_debug"})
public final class DeletePaymentMethodDialogFactory {
    private final android.content.Context context = null;
    private final com.stripe.android.view.PaymentMethodsAdapter adapter = null;
    private final com.stripe.android.view.CardDisplayTextFactory cardDisplayTextFactory = null;
    private final java.lang.Object customerSession = null;
    private final java.util.Set<java.lang.String> productUsage = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.model.PaymentMethod, kotlin.Unit> onDeletedPaymentMethodCallback = null;
    
    public DeletePaymentMethodDialogFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.PaymentMethodsAdapter adapter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.CardDisplayTextFactory cardDisplayTextFactory, @org.jetbrains.annotations.NotNull()
    java.lang.Object customerSession, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> productUsage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.PaymentMethod, kotlin.Unit> onDeletedPaymentMethodCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "()V", "onError", "", "errorCode", "", "errorMessage", "", "stripeError", "Lcom/stripe/android/StripeError;", "onPaymentMethodRetrieved", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_debug"})
    static final class PaymentMethodDeleteListener implements com.stripe.android.CustomerSession.PaymentMethodRetrievalListener {
        
        public PaymentMethodDeleteListener() {
            super();
        }
        
        @java.lang.Override()
        public void onPaymentMethodRetrieved(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod) {
        }
        
        @java.lang.Override()
        public void onError(int errorCode, @org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
        com.stripe.android.StripeError stripeError) {
        }
    }
}
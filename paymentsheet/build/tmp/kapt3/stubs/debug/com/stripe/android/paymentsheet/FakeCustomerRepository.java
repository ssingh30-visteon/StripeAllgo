package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/FakeCustomerRepository;", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "(Ljava/util/List;)V", "error", "", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "savedPaymentMethod", "getSavedPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "setSavedPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "detachPaymentMethod", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "paymentMethodId", "", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethods", "types", "Lcom/stripe/android/model/PaymentMethod$Type;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
public final class FakeCustomerRepository implements com.stripe.android.paymentsheet.repositories.CustomerRepository {
    private final java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods = null;
    public com.stripe.android.model.PaymentMethod savedPaymentMethod;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Throwable error;
    
    public FakeCustomerRepository() {
        super();
    }
    
    public FakeCustomerRepository(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod getSavedPaymentMethod() {
        return null;
    }
    
    public final void setSavedPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> types, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.PaymentMethod>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object detachPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation) {
        return null;
    }
}
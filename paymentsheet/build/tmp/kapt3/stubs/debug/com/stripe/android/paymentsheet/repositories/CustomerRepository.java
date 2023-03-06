package com.stripe.android.paymentsheet.repositories;

import java.lang.System;

/**
 * Interface for fetching and modifying information about a Customer.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "", "detachPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "paymentMethodId", "", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethods", "", "types", "Lcom/stripe/android/model/PaymentMethod$Type;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
public abstract interface CustomerRepository {
    
    /**
     * Retrieve a Customer's payment methods of all types requested.
     * Silently handle failures by returning an empty list for the payment method types that failed.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPaymentMethods(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> types, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.stripe.android.model.PaymentMethod>> continuation);
    
    /**
     * Detach a payment method from the Customer and return the modified [PaymentMethod].
     * Silently handle failures by returning null.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object detachPaymentMethod(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethodId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentMethod> continuation);
}
package com.stripe.android.paymentsheet.repositories;

import java.lang.System;

/**
 * A [CustomerRepository] that uses the Stripe API.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "lazyPaymentConfig", "Ldagger/Lazy;", "Lcom/stripe/android/PaymentConfiguration;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "productUsageTokens", "", "", "(Lcom/stripe/android/networking/StripeRepository;Ldagger/Lazy;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;Ljava/util/Set;)V", "detachPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "paymentMethodId", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethods", "", "types", "Lcom/stripe/android/model/PaymentMethod$Type;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class CustomerApiRepository implements com.stripe.android.paymentsheet.repositories.CustomerRepository {
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfig = null;
    private final com.stripe.android.Logger logger = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final java.util.Set<java.lang.String> productUsageTokens = null;
    
    @javax.inject.Inject()
    public CustomerApiRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfig, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "productUsage")
    java.util.Set<java.lang.String> productUsageTokens) {
        super();
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
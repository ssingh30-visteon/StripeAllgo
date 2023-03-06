package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository;", "Lcom/stripe/android/networking/AlipayRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "(Lcom/stripe/android/networking/StripeRepository;)V", "authenticate", "Lcom/stripe/android/model/AlipayAuthResult;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_debug"})
public final class DefaultAlipayRepository implements com.stripe.android.networking.AlipayRepository {
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.networking.DefaultAlipayRepository.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String ALIPAY_RESULT_FIELD = "resultStatus";
    
    public DefaultAlipayRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent paymentIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.AlipayAuthResult> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;", "", "()V", "ALIPAY_RESULT_FIELD", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
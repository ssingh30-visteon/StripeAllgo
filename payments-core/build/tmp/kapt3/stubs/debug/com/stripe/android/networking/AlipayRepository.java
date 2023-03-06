package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/networking/AlipayRepository;", "", "authenticate", "Lcom/stripe/android/model/AlipayAuthResult;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "authenticator", "Lcom/stripe/android/AlipayAuthenticator;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
public abstract interface AlipayRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object authenticate(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent paymentIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.AlipayAuthenticator authenticator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.AlipayAuthResult> continuation);
}
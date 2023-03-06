package com.stripe.android.payments;

import java.lang.System;

/**
 * Processes the result of a [PaymentIntent] confirmation.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0014J!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J1\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/PaymentIntentResult;", "context", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/RetryDelaySupplier;)V", "getRetryDelaySupplier", "()Lcom/stripe/android/core/networking/RetryDelaySupplier;", "cancelStripeIntentSource", "stripeIntent", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "sourceId", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "outcomeFromFlow", "", "failureMessage", "refreshStripeIntentUntilTerminalState", "clientSecret", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "expandFields", "", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_debug"})
@javax.inject.Singleton()
public final class PaymentIntentFlowResultProcessor extends com.stripe.android.payments.PaymentFlowResultProcessor<com.stripe.android.model.PaymentIntent, com.stripe.android.PaymentIntentResult> {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.PaymentIntentFlowResultProcessor.Companion Companion = null;
    public static final int MAX_RETRIES = 3;
    
    @javax.inject.Inject()
    public PaymentIntentFlowResultProcessor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier) {
        super(null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.core.networking.RetryDelaySupplier getRetryDelaySupplier() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object retrieveStripeIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object refreshStripeIntentUntilTerminalState(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object cancelStripeIntentSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.PaymentIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.stripe.android.PaymentIntentResult createStripeIntentResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentIntent stripeIntent, int outcomeFromFlow, @org.jetbrains.annotations.Nullable()
    java.lang.String failureMessage) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor$Companion;", "", "()V", "MAX_RETRIES", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
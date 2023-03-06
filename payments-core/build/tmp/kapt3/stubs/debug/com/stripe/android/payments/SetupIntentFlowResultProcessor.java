package com.stripe.android.payments;

import java.lang.System;

/**
 * Processes the result of a [SetupIntent] confirmation.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\"\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0014J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/SetupIntentResult;", "context", "Landroid/content/Context;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;)V", "cancelStripeIntentSource", "stripeIntent", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "sourceId", "(Lcom/stripe/android/model/SetupIntent;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "outcomeFromFlow", "", "failureMessage", "refreshStripeIntentUntilTerminalState", "clientSecret", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "expandFields", "", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
@javax.inject.Singleton()
public final class SetupIntentFlowResultProcessor extends com.stripe.android.payments.PaymentFlowResultProcessor<com.stripe.android.model.SetupIntent, com.stripe.android.SetupIntentResult> {
    
    @javax.inject.Inject()
    public SetupIntentFlowResultProcessor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "publishableKey")
    kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        super(null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object retrieveStripeIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object refreshStripeIntentUntilTerminalState(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object cancelStripeIntentSource(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SetupIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.SetupIntent> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.stripe.android.SetupIntentResult createStripeIntentResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SetupIntent stripeIntent, int outcomeFromFlow, @org.jetbrains.annotations.Nullable()
    java.lang.String failureMessage) {
        return null;
    }
}
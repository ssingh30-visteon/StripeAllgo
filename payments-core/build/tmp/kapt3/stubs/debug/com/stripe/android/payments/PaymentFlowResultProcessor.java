package com.stripe.android.payments;

import java.lang.System;

/**
 * Class responsible for processing the result of a [PaymentController] confirm operation.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 1*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u00011B5\b\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nH\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH$\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J!\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J1\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0*H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0002J\u0018\u0010/\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u001eH\u0002R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u000223\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "T", "Lcom/stripe/android/model/StripeIntent;", "S", "Lcom/stripe/android/StripeIntentResult;", "", "context", "Landroid/content/Context;", "publishableKeyProvider", "Ljavax/inject/Provider;", "", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Ljavax/inject/Provider;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;)V", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "getStripeRepository", "()Lcom/stripe/android/networking/StripeRepository;", "cancelStripeIntentSource", "stripeIntent", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "sourceId", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createStripeIntentResult", "outcomeFromFlow", "", "failureMessage", "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lcom/stripe/android/StripeIntentResult;", "processResult", "unvalidatedResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshStripeIntentUntilTerminalState", "clientSecret", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "expandFields", "", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldCancelIntentSource", "", "shouldCancelSource", "shouldRefreshIntent", "flowOutcome", "Companion", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "payments-core_debug"})
public abstract class PaymentFlowResultProcessor<T extends com.stripe.android.model.StripeIntent, S extends com.stripe.android.StripeIntentResult<? extends T>> {
    private final javax.inject.Provider<java.lang.String> publishableKeyProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final com.stripe.android.Logger logger = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final com.stripe.android.payments.PaymentFlowFailureMessageFactory failureMessageFactory = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.PaymentFlowResultProcessor.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> EXPAND_PAYMENT_METHOD = null;
    
    private PaymentFlowResultProcessor(android.content.Context context, javax.inject.Provider<java.lang.String> publishableKeyProvider, com.stripe.android.networking.StripeRepository stripeRepository, com.stripe.android.Logger logger, kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.stripe.android.networking.StripeRepository getStripeRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.PaymentFlowResult.Unvalidated unvalidatedResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super S> continuation) {
        return null;
    }
    
    private final boolean shouldCancelIntentSource(com.stripe.android.model.StripeIntent stripeIntent, boolean shouldCancelSource) {
        return false;
    }
    
    private final boolean shouldRefreshIntent(com.stripe.android.model.StripeIntent stripeIntent, @com.stripe.android.StripeIntentResult.Outcome()
    int flowOutcome) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object retrieveStripeIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> expandFields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation);
    
    /**
     * Keeps polling refresh endpoint for this [StripeIntent] until its status is no longer
     * "requires_action".
     *
     * @param clientSecret for the intent
     * @param requestOptions options for [ApiRequest]
     *
     * @return a [StripeIntent] object with a deterministic state.
     *
     * @throws MaxRetryReachedException when max retry is reached and the status is still
     * "requires_action".
     * @throws InvalidRequestException if the intent is a [SetupIntent], refresh endpoint is only
     * available for [PaymentIntent].
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.exception.MaxRetryReachedException.class, com.stripe.android.core.exception.InvalidRequestException.class})
    protected abstract java.lang.Object refreshStripeIntentUntilTerminalState(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation);
    
    /**
     * Cancels the source of this intent so that the payment method attached to it is cleared,
     * transferring the intent's status from requires_action to requires_payment_method.
     */
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object cancelStripeIntentSource(@org.jetbrains.annotations.NotNull()
    T stripeIntent, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options requestOptions, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract S createStripeIntentResult(@org.jetbrains.annotations.NotNull()
    T stripeIntent, @com.stripe.android.StripeIntentResult.Outcome()
    int outcomeFromFlow, @org.jetbrains.annotations.Nullable()
    java.lang.String failureMessage);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getEXPAND_PAYMENT_METHOD() {
            return null;
        }
    }
}
package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J1\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;)V", "complete3ds2Auth", "", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "remainingRetries", "", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onComplete3ds2AuthFailure", "error", "", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lcom/stripe/android/networking/ApiRequest$Options;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "process", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-core_debug"})
@javax.inject.Singleton()
public final class DefaultStripe3ds2ChallengeResultProcessor implements com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor {
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier = null;
    private final com.stripe.android.Logger logger = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int MAX_RETRIES = 3;
    
    @javax.inject.Inject()
    public DefaultStripe3ds2ChallengeResultProcessor(@org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object process(@org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.ChallengeResult challengeResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.payments.PaymentFlowResult.Unvalidated> continuation) {
        return null;
    }
    
    /**
     * Call [StripeRepository.complete3ds2Auth] to notify the Stripe API that the 3DS2
     * challenge has been completed.
     *
     * When [StripeRepository.complete3ds2Auth] fails, handle in [onComplete3ds2AuthFailure].
     *
     * @param remainingRetries the number of retry attempts remaining. Defaults to [MAX_RETRIES].
     *
     * @return `true` if [StripeRepository.complete3ds2Auth] was called successfully;
     * `false` otherwise
     */
    private final java.lang.Object complete3ds2Auth(com.stripe.android.stripe3ds2.transaction.ChallengeResult challengeResult, com.stripe.android.networking.ApiRequest.Options requestOptions, int remainingRetries, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    /**
     * When [StripeRepository.complete3ds2Auth] fails with a client error (a 4xx status code)
     * and [remainingRetries] is greater than 0, retry after a delay.
     * After [remainingRetries] are exhausted, stop attempts.
     *
     * The delay logic can be found in [RetryDelaySupplier.getDelayMillis].
     *
     * @param challengeResult the result of the 3DS2 challenge flow.
     * @param remainingRetries the number of retry attempts remaining. Defaults to [MAX_RETRIES].
     */
    private final java.lang.Object onComplete3ds2AuthFailure(com.stripe.android.stripe3ds2.transaction.ChallengeResult challengeResult, com.stripe.android.networking.ApiRequest.Options requestOptions, int remainingRetries, java.lang.Throwable error, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/DefaultStripe3ds2ChallengeResultProcessor$Companion;", "", "()V", "MAX_RETRIES", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
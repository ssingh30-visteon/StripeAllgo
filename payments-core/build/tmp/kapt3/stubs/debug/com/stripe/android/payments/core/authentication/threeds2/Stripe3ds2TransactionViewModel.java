package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FBY\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(H\u0002J3\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\b1\u00102J1\u00103\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u0010/\u001a\u000200H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010;J\u0011\u0010<\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J3\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(2\u0006\u0010B\u001a\u000200H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\bC\u0010DJ\b\u0010E\u001a\u00020\u001eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006G"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "threeDs2Service", "Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "challengeResultProcessor", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "initChallengeRepository", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/stripe3ds2/service/StripeThreeDs2Service;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/SavedStateHandle;)V", "hasCompleted", "", "getHasCompleted", "()Z", "setHasCompleted", "(Z)V", "begin3ds2Auth", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "stripe3ds2Fingerprint", "Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "(Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initChallenge", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "on3ds2AuthFallback", "fallbackRedirectUrl", "", "on3ds2AuthSuccess", "result", "Lcom/stripe/android/model/Stripe3ds2AuthResult;", "transaction", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "sourceId", "timeout", "", "on3ds2AuthSuccess$payments_core_debug", "(Lcom/stripe/android/model/Stripe3ds2AuthResult;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "perform3ds2AuthenticationRequest", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "(Lcom/stripe/android/stripe3ds2/transaction/Transaction;Lcom/stripe/android/model/Stripe3ds2Fingerprint;Lcom/stripe/android/networking/ApiRequest$Options;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processChallengeResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start3ds2Flow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startChallengeFlow", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "ares", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "maxTimeout", "startChallengeFlow$payments_core_debug", "(Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Lcom/stripe/android/stripe3ds2/transaction/Transaction;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFrictionlessFlow", "Companion", "payments-core_debug"})
public final class Stripe3ds2TransactionViewModel extends androidx.lifecycle.ViewModel {
    private final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args = null;
    private final com.stripe.android.networking.StripeRepository stripeRepository = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final com.stripe.android.stripe3ds2.service.StripeThreeDs2Service threeDs2Service = null;
    private final com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry messageVersionRegistry = null;
    private final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor challengeResultProcessor = null;
    private final com.stripe.android.stripe3ds2.transaction.InitChallengeRepository initChallengeRepository = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private boolean hasCompleted;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String KEY_HAS_COMPLETED = "key_next_step";
    
    @javax.inject.Inject()
    public Stripe3ds2TransactionViewModel(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.service.StripeThreeDs2Service threeDs2Service, @org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry messageVersionRegistry, @org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2ChallengeResultProcessor challengeResultProcessor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.InitChallengeRepository initChallengeRepository, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final boolean getHasCompleted() {
        return false;
    }
    
    public final void setHasCompleted(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processChallengeResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.ChallengeResult challengeResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.payments.PaymentFlowResult.Unvalidated> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object start3ds2Flow(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.payments.core.authentication.threeds2.NextStep> continuation) {
        return null;
    }
    
    private final java.lang.Object begin3ds2Auth(com.stripe.android.model.Stripe3ds2Fingerprint stripe3ds2Fingerprint, kotlin.coroutines.Continuation<? super com.stripe.android.payments.core.authentication.threeds2.NextStep> continuation) {
        return null;
    }
    
    /**
     * Fire the 3DS2 AReq.
     */
    private final java.lang.Object perform3ds2AuthenticationRequest(com.stripe.android.stripe3ds2.transaction.Transaction transaction, com.stripe.android.model.Stripe3ds2Fingerprint stripe3ds2Fingerprint, com.stripe.android.networking.ApiRequest.Options requestOptions, int timeout, kotlin.coroutines.Continuation<? super com.stripe.android.model.Stripe3ds2AuthResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object on3ds2AuthSuccess$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Stripe3ds2AuthResult result, @org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.Transaction transaction, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, int timeout, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.payments.core.authentication.threeds2.NextStep> continuation) {
        return null;
    }
    
    /**
     * Used when standard 3DS2 authentication mechanisms are unavailable.
     */
    private final com.stripe.android.payments.core.authentication.threeds2.NextStep on3ds2AuthFallback(java.lang.String fallbackRedirectUrl) {
        return null;
    }
    
    private final com.stripe.android.payments.core.authentication.threeds2.NextStep startFrictionlessFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object initChallenge(@org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.InitChallengeArgs args, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.stripe3ds2.transaction.InitChallengeResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object startChallengeFlow$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Stripe3ds2AuthResult.Ares ares, @org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.Transaction transaction, @org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, int maxTimeout, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.payments.core.authentication.threeds2.NextStep.StartChallenge> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel$Companion;", "", "()V", "KEY_HAS_COMPLETED", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
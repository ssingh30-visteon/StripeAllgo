package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2ChallengeResultProcessor;", "", "process", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "challengeResult", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
public abstract interface Stripe3ds2ChallengeResultProcessor {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object process(@org.jetbrains.annotations.NotNull()
    com.stripe.android.stripe3ds2.transaction.ChallengeResult challengeResult, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.payments.PaymentFlowResult.Unvalidated> continuation);
}
package com.stripe.android.payments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "create", "", "intent", "Lcom/stripe/android/model/StripeIntent;", "outcome", "", "createForPaymentIntent", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "createForSetupIntent", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", "payments-core_debug"})
public final class PaymentFlowFailureMessageFactory {
    private final android.content.Context context = null;
    
    public PaymentFlowFailureMessageFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent intent, @com.stripe.android.StripeIntentResult.Outcome()
    int outcome) {
        return null;
    }
    
    private final java.lang.String createForPaymentIntent(com.stripe.android.model.PaymentIntent paymentIntent) {
        return null;
    }
    
    private final java.lang.String createForSetupIntent(com.stripe.android.model.SetupIntent setupIntent) {
        return null;
    }
}
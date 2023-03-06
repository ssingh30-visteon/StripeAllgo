package com.stripe.android.paymentsheet.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;)V", "create", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "paymentsheet_debug"})
public final class ConfirmPaymentIntentParamsFactory extends com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory<com.stripe.android.model.ConfirmPaymentIntentParams> {
    private final com.stripe.android.paymentsheet.model.ClientSecret clientSecret = null;
    
    public ConfirmPaymentIntentParamsFactory(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.ClientSecret clientSecret) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection.Saved paymentSelection) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.ConfirmPaymentIntentParams create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection.New paymentSelection) {
        return null;
    }
}
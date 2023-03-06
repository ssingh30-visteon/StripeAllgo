package com.stripe.android.paymentsheet.model;

import java.lang.System;

/**
 * Factory class for creating [ConfirmPaymentIntentParams] or [ConfirmSetupIntentParams].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\tH&\u00a2\u0006\u0002\u0010\n\u0082\u0001\u0002\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "T", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "", "()V", "create", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;)Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Companion", "Lcom/stripe/android/paymentsheet/model/ConfirmPaymentIntentParamsFactory;", "Lcom/stripe/android/paymentsheet/model/ConfirmSetupIntentParamsFactory;", "paymentsheet_debug"})
public abstract class ConfirmStripeIntentParamsFactory<T extends com.stripe.android.model.ConfirmStripeIntentParams> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory.Companion Companion = null;
    
    private ConfirmStripeIntentParamsFactory() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract T create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection.Saved paymentSelection);
    
    @org.jetbrains.annotations.NotNull()
    public abstract T create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection.New paymentSelection);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory$Companion;", "", "()V", "createFactory", "Lcom/stripe/android/paymentsheet/model/ConfirmStripeIntentParamsFactory;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory<com.stripe.android.model.ConfirmStripeIntentParams> createFactory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.ClientSecret clientSecret) {
            return null;
        }
    }
}
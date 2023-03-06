package com.stripe.android.model;

import java.lang.System;

/**
 * If a card number is tokenized, this is the method that was used.
 *
 * See [tokenization_method](https://stripe.com/docs/api/cards/object#card_object-tokenization_method)
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/TokenizationMethod;", "", "code", "", "", "(Ljava/lang/String;ILjava/util/Set;)V", "ApplePay", "GooglePay", "Masterpass", "VisaCheckout", "Companion", "payments-core_debug"})
public enum TokenizationMethod {
    /*public static final*/ ApplePay /* = new ApplePay(null) */,
    /*public static final*/ GooglePay /* = new GooglePay(null) */,
    /*public static final*/ Masterpass /* = new Masterpass(null) */,
    /*public static final*/ VisaCheckout /* = new VisaCheckout(null) */;
    private final java.util.Set<java.lang.String> code = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.TokenizationMethod.Companion Companion = null;
    
    TokenizationMethod(java.util.Set<java.lang.String> code) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/TokenizationMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/TokenizationMethod;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.TokenizationMethod fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String code) {
            return null;
        }
    }
}
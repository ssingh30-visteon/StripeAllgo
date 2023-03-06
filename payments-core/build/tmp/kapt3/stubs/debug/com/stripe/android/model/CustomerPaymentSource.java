package com.stripe.android.model;

import java.lang.System;

/**
 * Model of the "data" object inside a [Customer] "source" object.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/CustomerPaymentSource;", "Lcom/stripe/android/model/StripeModel;", "()V", "id", "", "getId", "()Ljava/lang/String;", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "Lcom/stripe/android/model/CustomerCard;", "Lcom/stripe/android/model/CustomerBankAccount;", "Lcom/stripe/android/model/CustomerSource;", "payments-core_debug"})
public abstract class CustomerPaymentSource implements com.stripe.android.model.StripeModel {
    
    private CustomerPaymentSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getId();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.TokenizationMethod getTokenizationMethod();
}
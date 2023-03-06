package com.stripe.android.model;

import java.lang.System;

/**
 * Represents an object that has an ID field that can be used to create payments with Stripe.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u0006\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/StripePaymentSource;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "Lcom/stripe/android/model/BankAccount;", "Lcom/stripe/android/model/Card;", "Lcom/stripe/android/model/Source;", "Lcom/stripe/android/model/Token;", "payments-core_debug"})
public abstract interface StripePaymentSource extends android.os.Parcelable {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getId();
}
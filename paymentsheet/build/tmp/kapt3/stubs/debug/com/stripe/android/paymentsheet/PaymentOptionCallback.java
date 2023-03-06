package com.stripe.android.paymentsheet;

import java.lang.System;

/**
 * Callback that is invoked when the customer's [PaymentOption] selection changes.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "", "onPaymentOption", "", "paymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "paymentsheet_debug"})
public abstract interface PaymentOptionCallback {
    
    /**
     * @param paymentOption The new [PaymentOption] selection. If null, the customer has not yet
     * selected a [PaymentOption]. The customer can only complete the transaction if this value is
     * not null.
     */
    public abstract void onPaymentOption(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentOption paymentOption);
}
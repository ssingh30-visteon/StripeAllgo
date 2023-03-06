package com.stripe.android.paymentsheet;

import java.lang.System;

/**
 * Callback that is invoked when a [PaymentSheetResult] is available.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "", "onPaymentSheetResult", "", "paymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "paymentsheet_debug"})
public abstract interface PaymentSheetResultCallback {
    
    public abstract void onPaymentSheetResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResult paymentSheetResult);
}
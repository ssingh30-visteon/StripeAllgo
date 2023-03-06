package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "", "presentWithPaymentIntent", "", "paymentIntentClientSecret", "", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "presentWithSetupIntent", "setupIntentClientSecret", "paymentsheet_debug"})
public abstract interface PaymentSheetLauncher {
    
    public abstract void presentWithPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration);
    
    public abstract void presentWithSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}
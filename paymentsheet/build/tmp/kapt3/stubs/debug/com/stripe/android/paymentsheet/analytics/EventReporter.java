package com.stripe.android.paymentsheet.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u0001\u000eJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "", "onDismiss", "", "onInit", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "onPaymentFailure", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "onPaymentSuccess", "onSelectPaymentOption", "onShowExistingPaymentOptions", "onShowNewPaymentOptionForm", "Mode", "paymentsheet_debug"})
public abstract interface EventReporter {
    
    public abstract void onInit(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration);
    
    public abstract void onDismiss();
    
    public abstract void onShowExistingPaymentOptions();
    
    public abstract void onShowNewPaymentOptionForm();
    
    public abstract void onSelectPaymentOption(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection);
    
    public abstract void onPaymentSuccess(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection);
    
    public abstract void onPaymentFailure(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Complete", "Custom", "paymentsheet_debug"})
    public static enum Mode {
        /*public static final*/ Complete /* = new Complete(null) */,
        /*public static final*/ Custom /* = new Custom(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        Mode(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}
package com.stripe.android.googlepaylauncher;

import java.lang.System;

/**
 * [StripeGooglePayActivity] is used to return the result of a Google Pay operation.
 * The activity will return payment data via [GooglePayLauncherResult.PaymentData].
 *
 * Use [StripeGooglePayContract] to start [StripeGooglePayActivity].
 *
 * See [Troubleshooting](https://developers.google.com/pay/api/android/support/troubleshooting)
 * for a guide to troubleshooting Google Pay issues.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u00192\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00061"}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "getPaymentsClient", "()Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient$delegate", "Lkotlin/Lazy;", "publishableKey", "", "getPublishableKey", "()Ljava/lang/String;", "publishableKey$delegate", "stripeAccountId", "getStripeAccountId", "stripeAccountId$delegate", "viewModel", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/StripeGooglePayViewModel;", "viewModel$delegate", "finish", "", "finishWithResult", "result", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "isReadyToPay", "paymentDataRequest", "Lorg/json/JSONObject;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGooglePayResult", "onPaymentMethodCreated", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payWithGoogle", "Companion", "payments-core_debug"})
public final class StripeGooglePayActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy paymentsClient$delegate = null;
    private final kotlin.Lazy publishableKey$delegate = null;
    private final kotlin.Lazy stripeAccountId$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.stripe.android.googlepaylauncher.StripeGooglePayContract.Args args;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.googlepaylauncher.StripeGooglePayActivity.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    
    public StripeGooglePayActivity() {
        super();
    }
    
    private final com.google.android.gms.wallet.PaymentsClient getPaymentsClient() {
        return null;
    }
    
    private final java.lang.String getPublishableKey() {
        return null;
    }
    
    private final java.lang.String getStripeAccountId() {
        return null;
    }
    
    private final com.stripe.android.googlepaylauncher.StripeGooglePayViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    /**
     * Check that Google Pay is available and ready
     */
    private final void isReadyToPay(org.json.JSONObject paymentDataRequest) {
    }
    
    private final void payWithGoogle(org.json.JSONObject paymentDataRequest) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void onGooglePayResult(android.content.Intent data) {
    }
    
    private final void onPaymentMethodCreated(com.stripe.android.model.PaymentMethod paymentMethod, com.stripe.android.model.ShippingInformation shippingInformation) {
    }
    
    private final void finishWithResult(com.stripe.android.googlepaylauncher.GooglePayLauncherResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayActivity$Companion;", "", "()V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.stripe.android.payments.paymentlauncher;

import java.lang.System;

/**
 * API to confirm and handle next actions for [PaymentIntent] and [SetupIntent].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "", "confirm", "", "params", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "handleNextActionForPaymentIntent", "clientSecret", "", "handleNextActionForSetupIntent", "Companion", "PaymentResultCallback", "payments-core_debug"})
public abstract interface PaymentLauncher {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.paymentlauncher.PaymentLauncher.Companion Companion = null;
    
    /**
     * Confirms and, if necessary, authenticates a [PaymentIntent].
     */
    public abstract void confirm(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmPaymentIntentParams params);
    
    /**
     * Confirms and, if necessary, authenticates a [SetupIntent].
     */
    public abstract void confirm(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ConfirmSetupIntentParams params);
    
    /**
     * Fetches a [PaymentIntent] and handles its next action.
     */
    public abstract void handleNextActionForPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret);
    
    /**
     * Fetches a [SetupIntent] and handles its next action.
     */
    public abstract void handleNextActionForSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret);
    
    /**
     * Callback to notify when the intent is confirmed and next action handled.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "", "onPaymentResult", "", "paymentResult", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "payments-core_debug"})
    public static abstract interface PaymentResultCallback {
        
        public abstract void onPaymentResult(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.paymentlauncher.PaymentResult paymentResult);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;", "", "()V", "create", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "activity", "Landroidx/activity/ComponentActivity;", "publishableKey", "", "stripeAccountId", "callback", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "createForCompose", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a [PaymentLauncher] instance with [ComponentActivity].
         *
         * This API registers an [ActivityResultLauncher] into the [ComponentActivity],  it needs
         * to be called before the [ComponentActivity] is created.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.paymentlauncher.PaymentLauncher create(@org.jetbrains.annotations.NotNull()
        androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback callback) {
            return null;
        }
        
        /**
         * Create a [PaymentLauncher] instance with [Fragment].
         *
         * This API registers an [ActivityResultLauncher] into the [Fragment]'s hosting Activity, it
         * needs to be called before the [Fragment] is created.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.paymentlauncher.PaymentLauncher create(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback callback) {
            return null;
        }
        
        /**
         * Create a [PaymentLauncher] used for Jetpack Compose.
         *
         * This API uses Compose specific API [rememberLauncherForActivityResult] to register a
         * [ActivityResultLauncher] into current activity, it should be called as part of Compose
         * initialization path.
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.compose.runtime.Composable()
        public final com.stripe.android.payments.paymentlauncher.PaymentLauncher createForCompose(@org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, @org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.paymentlauncher.PaymentLauncher.PaymentResultCallback callback) {
            return null;
        }
    }
}
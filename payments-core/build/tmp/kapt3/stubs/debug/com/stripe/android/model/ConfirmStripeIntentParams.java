package com.stripe.android.model;

import java.lang.System;

/**
 * Interface for params for confirming a [PaymentIntent] or [SetupIntent].
 *
 * See [ConfirmPaymentIntentParams] and [ConfirmSetupIntentParams]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eJ\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\n\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "clientSecret", "", "getClientSecret", "()Ljava/lang/String;", "returnUrl", "getReturnUrl", "setReturnUrl", "(Ljava/lang/String;)V", "shouldUseStripeSdk", "", "withShouldUseStripeSdk", "Companion", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "payments-core_debug"})
public abstract interface ConfirmStripeIntentParams extends com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.ConfirmStripeIntentParams.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_CLIENT_SECRET = "client_secret";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_RETURN_URL = "return_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PAYMENT_METHOD_ID = "payment_method";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_USE_STRIPE_SDK = "use_stripe_sdk";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_MANDATE_ID = "mandate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_MANDATE_DATA = "mandate_data";
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getClientSecret();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getReturnUrl();
    
    public abstract void setReturnUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0);
    
    public abstract boolean shouldUseStripeSdk();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.model.ConfirmStripeIntentParams withShouldUseStripeSdk(boolean shouldUseStripeSdk);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/ConfirmStripeIntentParams$Companion;", "", "()V", "PARAM_CLIENT_SECRET", "", "PARAM_MANDATE_DATA", "PARAM_MANDATE_ID", "PARAM_PAYMENT_METHOD_DATA", "PARAM_PAYMENT_METHOD_ID", "PARAM_RETURN_URL", "PARAM_USE_STRIPE_SDK", "payments-core_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_CLIENT_SECRET = "client_secret";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_RETURN_URL = "return_url";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_PAYMENT_METHOD_ID = "payment_method";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_USE_STRIPE_SDK = "use_stripe_sdk";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_MANDATE_ID = "mandate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PARAM_MANDATE_DATA = "mandate_data";
        
        private Companion() {
            super();
        }
    }
}
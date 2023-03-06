package com.stripe.android;

import java.lang.System;

/**
 * Configuration settings for Google Pay's `TokenizationSpecification`.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001b\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/GooglePayConfig;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "(Lcom/stripe/android/PaymentConfiguration;)V", "publishableKey", "", "connectedAccountId", "(Ljava/lang/String;Ljava/lang/String;)V", "apiVersion", "key", "getKey", "()Ljava/lang/String;", "tokenizationSpecification", "Lorg/json/JSONObject;", "getTokenizationSpecification", "()Lorg/json/JSONObject;", "validPublishableKey", "payments-core_debug"})
public final class GooglePayConfig {
    private final java.lang.String connectedAccountId = null;
    private final java.lang.String validPublishableKey = null;
    private final java.lang.String apiVersion = null;
    
    @kotlin.jvm.JvmOverloads()
    public GooglePayConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public GooglePayConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String connectedAccountId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    public final org.json.JSONObject getTokenizationSpecification() throws org.json.JSONException {
        return null;
    }
    
    private final java.lang.String getKey() {
        return null;
    }
    
    /**
     * Instantiate with [PaymentConfiguration].
     * [PaymentConfiguration] must be initialized.
     */
    public GooglePayConfig(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private GooglePayConfig(com.stripe.android.PaymentConfiguration paymentConfiguration) {
        super();
    }
}
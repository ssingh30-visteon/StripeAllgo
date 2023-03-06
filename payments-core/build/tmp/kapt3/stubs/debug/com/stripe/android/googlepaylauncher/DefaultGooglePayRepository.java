package com.stripe.android.googlepaylauncher;

import java.lang.System;

/**
 * The default implementation of [GooglePayRepository].  Using the individual values as parameters
 * so it can be shared with [GooglePayLauncher] and [GooglePayPaymentMethodLauncher]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "context", "Landroid/content/Context;", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "logger", "Lcom/stripe/android/Logger;", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/Logger;)V", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "existingPaymentMethodRequired", "", "(Landroid/content/Context;Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLcom/stripe/android/Logger;)V", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "getPaymentsClient", "()Lcom/google/android/gms/wallet/PaymentsClient;", "paymentsClient$delegate", "Lkotlin/Lazy;", "isReady", "Lkotlinx/coroutines/flow/Flow;", "payments-core_debug"})
@javax.inject.Singleton()
public final class DefaultGooglePayRepository implements com.stripe.android.googlepaylauncher.GooglePayRepository {
    private final android.content.Context context = null;
    private final com.stripe.android.googlepaylauncher.GooglePayEnvironment environment = null;
    private final com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters = null;
    private final boolean existingPaymentMethodRequired = false;
    private final com.stripe.android.Logger logger = null;
    private final com.stripe.android.GooglePayJsonFactory googlePayJsonFactory = null;
    private final kotlin.Lazy paymentsClient$delegate = null;
    
    public DefaultGooglePayRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean existingPaymentMethodRequired, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    @javax.inject.Inject()
    public DefaultGooglePayRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config googlePayConfig, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    private final com.google.android.gms.wallet.PaymentsClient getPaymentsClient() {
        return null;
    }
    
    /**
     * @return a [Flow] that represents the result of a [PaymentsClient.isReadyToPay] operation.
     *
     * See [Google Pay API docs](https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient#isReadyToPay(com.google.android.gms.wallet.IsReadyToPayRequest))
     * for more details.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> isReady() {
        return null;
    }
}
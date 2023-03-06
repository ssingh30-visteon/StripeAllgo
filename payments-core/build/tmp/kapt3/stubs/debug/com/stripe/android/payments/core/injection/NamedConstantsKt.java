package com.stripe.android.payments.core.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"ENABLE_LOGGING", "", "IS_PAYMENT_INTENT", "PRODUCT_USAGE", "PUBLISHABLE_KEY", "STRIPE_ACCOUNT_ID", "payments-core_debug"})
public final class NamedConstantsKt {
    
    /**
     * Name for injected boolean to denote if logging is enabled.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENABLE_LOGGING = "enableLogging";
    
    /**
     * Name for injected set if strings to represent product usage for analytics.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_USAGE = "productUsage";
    
    /**
     * Name for user's publishable key
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PUBLISHABLE_KEY = "publishableKey";
    
    /**
     * Name for user's account id
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STRIPE_ACCOUNT_ID = "stripeAccountId";
    
    /**
     * Name to indicate whether the current [StripeIntent] is a [PaymentIntent] or [SetupIntent].
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_PAYMENT_INTENT = "isPaymentIntent";
}
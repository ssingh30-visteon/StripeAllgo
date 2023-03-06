package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Provides [PaymentAuthenticator] for [NextActionData.WeChatPayRedirect] through reflection,
 * requires "com.stripe:stripe-wechatpay:[Stripe.VERSION_NAME]" dependency.
 * Will register a [UnsupportedAuthenticator] if the dependency is not added.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/injection/WeChatPayAuthenticatorModule;", "", "()V", "provideWeChatAuthenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "unsupportedAuthenticator", "Lcom/stripe/android/payments/core/authentication/UnsupportedAuthenticator;", "provideWeChatAuthenticator$payments_core_debug", "payments-core_debug"})
@dagger.Module()
public final class WeChatPayAuthenticatorModule {
    
    public WeChatPayAuthenticatorModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @IntentAuthenticatorKey(value = com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect.class)
    @dagger.multibindings.IntoMap()
    @dagger.Provides()
    @IntentAuthenticatorMap()
    public final com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> provideWeChatAuthenticator$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.UnsupportedAuthenticator unsupportedAuthenticator) {
        return null;
    }
}
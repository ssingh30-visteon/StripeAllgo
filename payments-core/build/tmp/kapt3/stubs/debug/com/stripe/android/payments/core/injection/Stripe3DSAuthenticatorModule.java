package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Provides [PaymentAuthenticator] for [NextActionData.SdkData.Use3DS2].
 * Requires 3ds2 SDK.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule;", "", "()V", "bindsStripe3DSAuthenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "stripe3ds2Authenticator", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;", "Companion", "payments-core_debug"})
@dagger.Module(includes = {com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule.class})
public abstract class Stripe3DSAuthenticatorModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.core.injection.Stripe3DSAuthenticatorModule.Companion Companion = null;
    
    public Stripe3DSAuthenticatorModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @IntentAuthenticatorKey(value = com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    @IntentAuthenticatorMap()
    public abstract com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> bindsStripe3DSAuthenticator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2Authenticator stripe3ds2Authenticator);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3DSAuthenticatorModule$Companion;", "", "()V", "providePaymentAuthConfig", "Lcom/stripe/android/PaymentAuthConfig;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.stripe.android.PaymentAuthConfig providePaymentAuthConfig() {
            return null;
        }
    }
}
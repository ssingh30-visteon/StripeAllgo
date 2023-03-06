package com.stripe.android.payments.core.injection;

import java.lang.System;

/**
 * Provides mappings between [NextActionData] and [PaymentAuthenticator] provided by payment SDK.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u000bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/core/injection/AuthenticationModule;", "", "()V", "binds3DS1Authenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "webIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/WebIntentAuthenticator;", "bindsAlipayRedirectAuthenticator", "bindsOxxoAuthenticator", "oxxoAuthenticator", "Lcom/stripe/android/payments/core/authentication/OxxoAuthenticator;", "bindsRedirectAuthenticator", "Companion", "payments-core_debug"})
@dagger.Module()
public abstract class AuthenticationModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.payments.core.injection.AuthenticationModule.Companion Companion = null;
    
    public AuthenticationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @IntentAuthenticatorKey(value = com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS1.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    @IntentAuthenticatorMap()
    public abstract com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> binds3DS1Authenticator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.WebIntentAuthenticator webIntentAuthenticator);
    
    @org.jetbrains.annotations.NotNull()
    @IntentAuthenticatorKey(value = com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    @IntentAuthenticatorMap()
    public abstract com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> bindsRedirectAuthenticator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.WebIntentAuthenticator webIntentAuthenticator);
    
    @org.jetbrains.annotations.NotNull()
    @IntentAuthenticatorKey(value = com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    @IntentAuthenticatorMap()
    public abstract com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> bindsAlipayRedirectAuthenticator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.WebIntentAuthenticator webIntentAuthenticator);
    
    @org.jetbrains.annotations.NotNull()
    @IntentAuthenticatorKey(value = com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    @IntentAuthenticatorMap()
    public abstract com.stripe.android.payments.core.authentication.PaymentAuthenticator<com.stripe.android.model.StripeIntent> bindsOxxoAuthenticator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.authentication.OxxoAuthenticator oxxoAuthenticator);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J*\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/injection/AuthenticationModule$Companion;", "", "()V", "provideDefaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "context", "Landroid/content/Context;", "providePaymentBrowserAuthStarterFactory", "Lkotlin/Function1;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "lazyRegistry", "Ldagger/Lazy;", "Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;", "defaultReturnUrl", "providePaymentRelayStarterFactory", "Lcom/stripe/android/PaymentRelayStarter;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.stripe.android.payments.DefaultReturnUrl provideDefaultReturnUrl(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentRelayStarter> providePaymentRelayStarterFactory(@org.jetbrains.annotations.NotNull()
        dagger.Lazy<com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry> lazyRegistry) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final kotlin.jvm.functions.Function1<com.stripe.android.view.AuthActivityStarterHost, com.stripe.android.PaymentBrowserAuthStarter> providePaymentBrowserAuthStarterFactory(@org.jetbrains.annotations.NotNull()
        dagger.Lazy<com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry> lazyRegistry, @org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl) {
            return null;
        }
    }
}
package com.stripe.android.googlepaylauncher.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherModule;", "", "()V", "bindsGooglePayRepository", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "defaultGooglePayRepository", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayRepository;", "Companion", "payments-core_debug"})
@dagger.Module(subcomponents = {com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherViewModelSubcomponent.class})
public abstract class GooglePayPaymentMethodLauncherModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.googlepaylauncher.injection.GooglePayPaymentMethodLauncherModule.Companion Companion = null;
    
    public GooglePayPaymentMethodLauncherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.stripe.android.googlepaylauncher.GooglePayRepository bindsGooglePayRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.DefaultGooglePayRepository defaultGooglePayRepository);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherModule$Companion;", "", "()V", "providePaymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "context", "Landroid/content/Context;", "googlePayConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "paymentsClientFactory", "Lcom/stripe/android/googlepaylauncher/PaymentsClientFactory;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.google.android.gms.wallet.PaymentsClient providePaymentsClient(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config googlePayConfig, @org.jetbrains.annotations.NotNull()
        com.stripe.android.googlepaylauncher.PaymentsClientFactory paymentsClientFactory) {
            return null;
        }
    }
}
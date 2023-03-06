package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0010H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;", "", "()V", "bindsCustomerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "repository", "Lcom/stripe/android/paymentsheet/repositories/CustomerApiRepository;", "bindsDeviceIdRepository", "Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;", "Lcom/stripe/android/paymentsheet/analytics/DefaultDeviceIdRepository;", "bindsEventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "bindsStripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Api;", "Companion", "paymentsheet_debug"})
@dagger.Module()
public abstract class PaymentSheetCommonModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.injection.PaymentSheetCommonModule.Companion Companion = null;
    
    public PaymentSheetCommonModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.paymentsheet.analytics.EventReporter bindsEventReporter(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.DefaultEventReporter eventReporter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.paymentsheet.analytics.DeviceIdRepository bindsDeviceIdRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.DefaultDeviceIdRepository repository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.paymentsheet.repositories.CustomerRepository bindsCustomerRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.CustomerApiRepository repository);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.paymentsheet.repositories.StripeIntentRepository bindsStripeIntentRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.StripeIntentRepository.Api repository);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule$Companion;", "", "()V", "provideEnabledLogging", "", "provideLocale", "Ljava/util/Locale;", "providePaymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "appContext", "Landroid/content/Context;", "providePublishableKey", "Lkotlin/Function0;", "", "paymentConfiguration", "Ldagger/Lazy;", "provideResources", "Landroid/content/res/Resources;", "context", "provideStripeAccountId", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Provides a non-singleton PaymentConfiguration.
         *
         * Should be fetched only when it's needed, to allow client to set the publishableKey and
         * stripeAccountId in PaymentConfiguration any time before configuring the FlowController
         * or presenting Payment Sheet.
         *
         * Should always be injected with [Lazy] or [Provider].
         */
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.stripe.android.PaymentConfiguration providePaymentConfiguration(@org.jetbrains.annotations.NotNull()
        android.content.Context appContext) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final android.content.res.Resources provideResources(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        @dagger.Provides()
        public final kotlin.jvm.functions.Function0<java.lang.String> providePublishableKey(@org.jetbrains.annotations.NotNull()
        dagger.Lazy<com.stripe.android.PaymentConfiguration> paymentConfiguration) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "stripeAccountId")
        @dagger.Provides()
        public final kotlin.jvm.functions.Function0<java.lang.String> provideStripeAccountId(@org.jetbrains.annotations.NotNull()
        dagger.Lazy<com.stripe.android.PaymentConfiguration> paymentConfiguration) {
            return null;
        }
        
        @javax.inject.Named(value = "enableLogging")
        @javax.inject.Singleton()
        @dagger.Provides()
        public final boolean provideEnabledLogging() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final java.util.Locale provideLocale() {
            return null;
        }
    }
}
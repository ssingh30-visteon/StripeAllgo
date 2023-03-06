package com.stripe.android.paymentsheet.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0001\u0002\n\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "", "()V", "get", "Lcom/stripe/android/model/StripeIntent;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Api", "Static", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Static;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Api;", "paymentsheet_debug"})
public abstract class StripeIntentRepository {
    
    private StripeIntentRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object get(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation);
    
    /**
     * Retrieve the [StripeIntent] from a static source.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Static;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/model/StripeIntent;)V", "get", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
    public static final class Static extends com.stripe.android.paymentsheet.repositories.StripeIntentRepository {
        private final com.stripe.android.model.StripeIntent stripeIntent = null;
        
        public Static(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent stripeIntent) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object get(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation) {
            return null;
        }
    }
    
    /**
     * Retrieve the [StripeIntent] from the [StripeRepository].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Api;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "lazyPaymentConfig", "Ldagger/Lazy;", "Lcom/stripe/android/PaymentConfiguration;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "locale", "Ljava/util/Locale;", "(Lcom/stripe/android/networking/StripeRepository;Ldagger/Lazy;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;)V", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "getRequestOptions", "()Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/model/StripeIntent;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
    public static final class Api extends com.stripe.android.paymentsheet.repositories.StripeIntentRepository {
        private final com.stripe.android.networking.StripeRepository stripeRepository = null;
        private final dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfig = null;
        private final kotlin.coroutines.CoroutineContext workContext = null;
        private final java.util.Locale locale = null;
        private final kotlin.Lazy requestOptions$delegate = null;
        
        @javax.inject.Inject()
        public Api(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.StripeRepository stripeRepository, @org.jetbrains.annotations.NotNull()
        dagger.Lazy<com.stripe.android.PaymentConfiguration> lazyPaymentConfig, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.IOContext()
        kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.Nullable()
        java.util.Locale locale) {
            super();
        }
        
        private final com.stripe.android.networking.ApiRequest.Options getRequestOptions() {
            return null;
        }
        
        /**
         * Tries to retrieve the StripeIntent with ordered Payment Methods, falling back to
         * traditional GET if we don't have a locale or the call fails for any reason.
         */
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object get(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation) {
            return null;
        }
    }
}
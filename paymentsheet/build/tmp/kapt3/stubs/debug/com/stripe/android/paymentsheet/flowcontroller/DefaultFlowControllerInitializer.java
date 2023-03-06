package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001Be\b\u0007\u0012\u0019\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\b\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J3\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ+\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J#\u0010!\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001b\u0010\u001c\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J/\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0003\u00a2\u0006\u0002\b\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0002\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowControllerInitializer;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "prefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "googlePayRepositoryFactory", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "stripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeIntentValidator", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "logger", "Lcom/stripe/android/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/Logger;Lkotlin/coroutines/CoroutineContext;)V", "createWithCustomer", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "customerConfig", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "isGooglePayReady", "", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createWithoutCustomer", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "paymentSheetConfiguration", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveStripeIntent", "Lcom/stripe/android/model/StripeIntent;", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastSavedPaymentMethod", "", "prefsRepository", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/paymentsheet/PrefsRepository;ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class DefaultFlowControllerInitializer implements com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer {
    private final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration, com.stripe.android.paymentsheet.PrefsRepository> prefsRepositoryFactory = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> googlePayRepositoryFactory = null;
    private final com.stripe.android.paymentsheet.repositories.StripeIntentRepository stripeIntentRepository = null;
    private final com.stripe.android.paymentsheet.model.StripeIntentValidator stripeIntentValidator = null;
    private final com.stripe.android.paymentsheet.repositories.CustomerRepository customerRepository = null;
    private final com.stripe.android.Logger logger = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    
    @javax.inject.Inject()
    public DefaultFlowControllerInitializer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration, com.stripe.android.paymentsheet.PrefsRepository> prefsRepositoryFactory, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<com.stripe.android.googlepaylauncher.GooglePayEnvironment, com.stripe.android.googlepaylauncher.GooglePayRepository> googlePayRepositoryFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.StripeIntentRepository stripeIntentRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.StripeIntentValidator stripeIntentValidator, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.CustomerRepository customerRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object init(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration paymentSheetConfiguration, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> continuation) {
        return null;
    }
    
    private final java.lang.Object isGooglePayReady(com.stripe.android.paymentsheet.PaymentSheet.Configuration paymentSheetConfiguration, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object createWithCustomer(com.stripe.android.paymentsheet.model.ClientSecret clientSecret, com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customerConfig, com.stripe.android.paymentsheet.PaymentSheet.Configuration config, boolean isGooglePayReady, kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> continuation) {
        return null;
    }
    
    private final java.lang.Object createWithoutCustomer(com.stripe.android.paymentsheet.model.ClientSecret clientSecret, com.stripe.android.paymentsheet.PaymentSheet.Configuration config, boolean isGooglePayReady, kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> continuation) {
        return null;
    }
    
    private final java.lang.Object setLastSavedPaymentMethod(com.stripe.android.paymentsheet.PrefsRepository prefsRepository, boolean isGooglePayReady, java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object retrieveStripeIntent(com.stripe.android.paymentsheet.model.ClientSecret clientSecret, kotlin.coroutines.Continuation<? super com.stripe.android.model.StripeIntent> continuation) {
        return null;
    }
}
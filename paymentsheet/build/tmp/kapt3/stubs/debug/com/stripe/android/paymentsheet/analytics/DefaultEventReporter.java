package com.stripe.android.paymentsheet.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultEventReporter;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "deviceIdRepository", "Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V", "fireEvent", "", "event", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "onDismiss", "onInit", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "onPaymentFailure", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "onPaymentSuccess", "onSelectPaymentOption", "onShowExistingPaymentOptions", "onShowNewPaymentOptionForm", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class DefaultEventReporter implements com.stripe.android.paymentsheet.analytics.EventReporter {
    private final com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode = null;
    private final com.stripe.android.paymentsheet.analytics.DeviceIdRepository deviceIdRepository = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    private final kotlin.coroutines.CoroutineContext workContext = null;
    
    @javax.inject.Inject()
    public DefaultEventReporter(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.DeviceIdRepository deviceIdRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @java.lang.Override()
    public void onInit(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration) {
    }
    
    @java.lang.Override()
    public void onDismiss() {
    }
    
    @java.lang.Override()
    public void onShowExistingPaymentOptions() {
    }
    
    @java.lang.Override()
    public void onShowNewPaymentOptionForm() {
    }
    
    @java.lang.Override()
    public void onSelectPaymentOption(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    @java.lang.Override()
    public void onPaymentSuccess(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    @java.lang.Override()
    public void onPaymentFailure(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    private final void fireEvent(com.stripe.android.paymentsheet.analytics.PaymentSheetEvent event) {
    }
}
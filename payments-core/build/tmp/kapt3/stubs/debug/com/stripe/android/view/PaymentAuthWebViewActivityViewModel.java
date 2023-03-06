package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002()B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\"J\u0006\u0010&\u001a\u00020\"J\u0006\u0010\'\u001a\u00020\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006*"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "buttonText", "", "getButtonText$payments_core_debug", "()Ljava/lang/String;", "cancellationResult", "Landroid/content/Intent;", "getCancellationResult$payments_core_debug", "()Landroid/content/Intent;", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders$delegate", "Lkotlin/Lazy;", "paymentResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "getPaymentResult$payments_core_debug", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toolbarBackgroundColor", "getToolbarBackgroundColor$payments_core_debug", "toolbarTitle", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "getToolbarTitle$payments_core_debug", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "fireAnalytics", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "logComplete", "logError", "logStart", "Factory", "ToolbarTitleData", "payments-core_debug"})
public final class PaymentAuthWebViewActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.stripe.android.auth.PaymentBrowserAuthContract.Args args = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy extraHeaders$delegate = null;
    
    public PaymentAuthWebViewActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.stripe.android.auth.PaymentBrowserAuthContract.Args args, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getExtraHeaders() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getButtonText$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.PaymentAuthWebViewActivityViewModel.ToolbarTitleData getToolbarTitle$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToolbarBackgroundColor$payments_core_debug() {
        return null;
    }
    
    /**
     * Log that 3DS1 challenge started.
     */
    public final void logStart() {
    }
    
    /**
     * Log that 3DS1 challenge completed with an error.
     */
    public final void logError() {
    }
    
    /**
     * Log that 3DS1 challenge completed without an error.
     */
    public final void logComplete() {
    }
    
    private final void fireAnalytics(com.stripe.android.core.networking.AnalyticsRequest request) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "", "text", "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)V", "getText$payments_core_debug", "()Ljava/lang/String;", "getToolbarCustomization$payments_core_debug", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "equals", "", "other", "hashCode", "", "toString", "payments-core_debug"})
    public static final class ToolbarTitleData {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String text = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization toolbarCustomization = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.PaymentAuthWebViewActivityViewModel.ToolbarTitleData copy(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization toolbarCustomization) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ToolbarTitleData(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization toolbarCustomization) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization getToolbarCustomization$payments_core_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "logger", "Lcom/stripe/android/Logger;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "(Landroid/app/Application;Lcom/stripe/android/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        private final android.app.Application application = null;
        private final com.stripe.android.Logger logger = null;
        private final com.stripe.android.auth.PaymentBrowserAuthContract.Args args = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
        com.stripe.android.auth.PaymentBrowserAuthContract.Args args) {
            super();
        }
        
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}
package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/FlowControllerModule;", "", "()V", "bindsFlowControllerInitializer", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "defaultFlowControllerInitializer", "Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowControllerInitializer;", "Companion", "paymentsheet_debug"})
@dagger.Module(subcomponents = {com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.class, com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.class})
public abstract class FlowControllerModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.injection.FlowControllerModule.Companion Companion = null;
    
    public FlowControllerModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer bindsFlowControllerInitializer(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer defaultFlowControllerInitializer);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J(\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/FlowControllerModule$Companion;", "", "()V", "provideClientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "providePrefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "appContext", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "provideProductUsageTokens", "", "", "provideViewModel", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * [FlowController]'s clientSecret might be updated multiple times through
         * [FlowController.configureWithSetupIntent] or [FlowController.configureWithPaymentIntent].
         *
         * Should always be injected with [Provider].
         */
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        public final com.stripe.android.paymentsheet.model.ClientSecret provideClientSecret(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel viewModel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration, com.stripe.android.paymentsheet.PrefsRepository> providePrefsRepositoryFactory(@org.jetbrains.annotations.NotNull()
        android.content.Context appContext, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.IOContext()
        kotlin.coroutines.CoroutineContext workContext) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.stripe.android.paymentsheet.analytics.EventReporter.Mode provideEventReporterMode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "productUsage")
        @javax.inject.Singleton()
        @dagger.Provides()
        public final java.util.Set<java.lang.String> provideProductUsageTokens() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel provideViewModel(@org.jetbrains.annotations.NotNull()
        androidx.lifecycle.ViewModelStoreOwner viewModelStoreOwner) {
            return null;
        }
    }
}
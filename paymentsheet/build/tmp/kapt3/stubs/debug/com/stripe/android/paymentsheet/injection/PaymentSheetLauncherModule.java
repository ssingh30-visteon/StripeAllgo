package com.stripe.android.paymentsheet.injection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule;", "", "()V", "bindsApplicationForContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "Companion", "paymentsheet_debug"})
@dagger.Module(subcomponents = {com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent.class, com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.class})
public abstract class PaymentSheetLauncherModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.injection.PaymentSheetLauncherModule.Companion Companion = null;
    
    public PaymentSheetLauncherModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.content.Context bindsApplicationForContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherModule$Companion;", "", "()V", "provideEventReporterMode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "provideProductUsageTokens", "", "", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
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
    }
}
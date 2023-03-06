package com.stripe.android.paymentsheet;

import java.lang.System;

/**
 * This is used internally for integrations that don't use Jetpack Compose and are
 * able to pass in an activity.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\rB\u001b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002J\u001a\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u00158\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "Lcom/stripe/android/payments/core/injection/Injector;", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "application", "Landroid/app/Application;", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Application;)V", "injectorKey", "", "getInjectorKey$annotations", "()V", "paymentSheetLauncherComponent", "Lcom/stripe/android/paymentsheet/injection/PaymentSheetLauncherComponent;", "inject", "", "injectable", "Lcom/stripe/android/payments/core/injection/Injectable;", "present", "args", "presentWithPaymentIntent", "paymentIntentClientSecret", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "presentWithSetupIntent", "setupIntentClientSecret", "paymentsheet_debug"})
public final class DefaultPaymentSheetLauncher implements com.stripe.android.paymentsheet.PaymentSheetLauncher, com.stripe.android.payments.core.injection.Injector {
    private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.paymentsheet.PaymentSheetContract.Args> activityResultLauncher = null;
    private final java.lang.String injectorKey = null;
    private final com.stripe.android.paymentsheet.injection.PaymentSheetLauncherComponent paymentSheetLauncherComponent = null;
    
    public DefaultPaymentSheetLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<com.stripe.android.paymentsheet.PaymentSheetContract.Args> activityResultLauncher, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @com.stripe.android.payments.core.injection.InjectorKey()
    @java.lang.Deprecated()
    private static void getInjectorKey$annotations() {
    }
    
    public DefaultPaymentSheetLauncher(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback callback) {
        super();
    }
    
    public DefaultPaymentSheetLauncher(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback callback) {
        super();
    }
    
    @org.jetbrains.annotations.TestOnly()
    public DefaultPaymentSheetLauncher(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultRegistry registry, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback callback) {
        super();
    }
    
    @java.lang.Override()
    public void presentWithPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration) {
    }
    
    @java.lang.Override()
    public void presentWithSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration) {
    }
    
    private final void present(com.stripe.android.paymentsheet.PaymentSheetContract.Args args) {
    }
    
    @java.lang.Override()
    public void inject(@org.jetbrains.annotations.NotNull()
    com.stripe.android.payments.core.injection.Injectable<?> injectable) {
    }
}
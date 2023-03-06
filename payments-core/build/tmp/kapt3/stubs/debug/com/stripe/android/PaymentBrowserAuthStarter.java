package com.stripe.android;

import java.lang.System;

/**
 * A class that manages starting a [StripeBrowserLauncherActivity] or [PaymentAuthWebViewActivity]
 * with a [PaymentBrowserAuthContract.Args].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Legacy", "Modern", "payments-core_debug"})
public abstract interface PaymentBrowserAuthStarter extends com.stripe.android.view.AuthActivityStarter<com.stripe.android.auth.PaymentBrowserAuthContract.Args> {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Legacy;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/payments/DefaultReturnUrl;)V", "start", "", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "payments-core_debug"})
    public static final class Legacy implements com.stripe.android.PaymentBrowserAuthStarter {
        private final com.stripe.android.view.AuthActivityStarterHost host = null;
        private final com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl = null;
        
        public Legacy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AuthActivityStarterHost host, @org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl) {
            super();
        }
        
        @java.lang.Override()
        public void start(@org.jetbrains.annotations.NotNull()
        com.stripe.android.auth.PaymentBrowserAuthContract.Args args) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Modern;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "start", "", "args", "payments-core_debug"})
    public static final class Modern implements com.stripe.android.PaymentBrowserAuthStarter {
        private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.auth.PaymentBrowserAuthContract.Args> launcher = null;
        
        public Modern(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultLauncher<com.stripe.android.auth.PaymentBrowserAuthContract.Args> launcher) {
            super();
        }
        
        @java.lang.Override()
        public void start(@org.jetbrains.annotations.NotNull()
        com.stripe.android.auth.PaymentBrowserAuthContract.Args args) {
        }
    }
}
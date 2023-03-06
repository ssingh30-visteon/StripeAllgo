package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

/**
 * A [AuthActivityStarter] to start [Stripe3ds2TransactionActivity]
 * with legacy [Activity.startActivityForResult] or modern [ActivityResultLauncher.launch].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "Legacy", "Modern", "payments-core_debug"})
public abstract interface Stripe3ds2TransactionStarter extends com.stripe.android.view.AuthActivityStarter<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter$Legacy;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "(Lcom/stripe/android/view/AuthActivityStarterHost;)V", "start", "", "args", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "payments-core_debug"})
    public static final class Legacy implements com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter {
        private final com.stripe.android.view.AuthActivityStarterHost host = null;
        
        public Legacy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AuthActivityStarterHost host) {
            super();
        }
        
        @java.lang.Override()
        public void start(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter$Modern;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "start", "", "args", "payments-core_debug"})
    public static final class Modern implements com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter {
        private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> launcher = null;
        
        public Modern(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultLauncher<com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args> launcher) {
            super();
        }
        
        @java.lang.Override()
        public void start(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract.Args args) {
        }
    }
}
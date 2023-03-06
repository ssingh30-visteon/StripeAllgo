package com.stripe.android.googlepaylauncher;

import java.lang.System;

/**
 * [GooglePayLauncherActivity] is used to return the result of a Google Pay operation.
 * The activity's result will be a [GooglePayLauncher.Result].
 *
 * [GooglePayLauncherActivity] will:
 * 1. Fetch the [StripeIntent]
 * 2. Verify that Google Pay is available
 * 3. Create a [PaymentDataRequest](https://developers.google.com/pay/api/web/reference/request-objects#PaymentDataRequest)
 * 4. Confirm the [StripeIntent] using the Google Pay token
 *
 * Use [GooglePayLauncherContract] to start [GooglePayLauncherActivity].
 *
 * See [Troubleshooting](https://developers.google.com/pay/api/android/support/troubleshooting)
 * for a guide to troubleshooting Google Pay issues.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0015J\u0012\u0010\u001a\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0016\u0010\u001b\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "args", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherContract$Args;", "viewModel", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/googlepaylauncher/GooglePayLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "disableAnimations", "", "finish", "finishWithResult", "result", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncher$Result;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGooglePayResult", "payWithGoogle", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "Companion", "payments-core_debug"})
public final class GooglePayLauncherActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.stripe.android.googlepaylauncher.GooglePayLauncherContract.Args args;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.googlepaylauncher.GooglePayLauncherActivity.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    
    public GooglePayLauncherActivity() {
        super();
    }
    
    private final com.stripe.android.googlepaylauncher.GooglePayLauncherViewModel getViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void finish() {
    }
    
    private final void payWithGoogle(com.google.android.gms.tasks.Task<com.google.android.gms.wallet.PaymentData> task) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void onGooglePayResult(android.content.Intent data) {
    }
    
    private final void finishWithResult(com.stripe.android.googlepaylauncher.GooglePayLauncher.Result result) {
    }
    
    private final void disableAnimations() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayLauncherActivity$Companion;", "", "()V", "LOAD_PAYMENT_DATA_REQUEST_CODE", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
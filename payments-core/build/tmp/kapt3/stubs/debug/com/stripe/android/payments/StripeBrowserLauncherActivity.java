package com.stripe.android.payments;

import java.lang.System;

/**
 * A transparent activity that launches [PaymentBrowserAuthContract.Args.url] in either
 * Custom Tabs (if available) or a browser.
 *
 * The eventual replacement for [PaymentAuthWebViewActivity].
 *
 * [StripeBrowserLauncherActivity] will only be used when the following are true:
 * - Custom Tabs are available or Chrome is installed
 * - the confirmation request's `return_url` is set to [DefaultReturnUrl.value]
 *
 * See [BrowserCapabilities] and [PaymentBrowserAuthContract.Args.hasDefaultReturnUrl].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "getViewModel", "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onResult", "activityResult", "Landroidx/activity/result/ActivityResult;", "payments-core_debug"})
public final class StripeBrowserLauncherActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    
    public StripeBrowserLauncherActivity() {
        super();
    }
    
    private final com.stripe.android.payments.StripeBrowserLauncherViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onResult(androidx.activity.result.ActivityResult activityResult) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
}
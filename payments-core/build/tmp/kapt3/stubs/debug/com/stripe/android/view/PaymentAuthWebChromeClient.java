package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebChromeClient;", "Landroid/webkit/WebChromeClient;", "activity", "Landroid/app/Activity;", "logger", "Lcom/stripe/android/Logger;", "(Landroid/app/Activity;Lcom/stripe/android/Logger;)V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onJsConfirm", "view", "Landroid/webkit/WebView;", "url", "", "message", "result", "Landroid/webkit/JsResult;", "payments-core_debug"})
public final class PaymentAuthWebChromeClient extends android.webkit.WebChromeClient {
    private final android.app.Activity activity = null;
    private final com.stripe.android.Logger logger = null;
    
    public PaymentAuthWebChromeClient(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    @java.lang.Override()
    public boolean onConsoleMessage(@org.jetbrains.annotations.Nullable()
    android.webkit.ConsoleMessage consoleMessage) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onJsConfirm(@org.jetbrains.annotations.Nullable()
    android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    android.webkit.JsResult result) {
        return false;
    }
}
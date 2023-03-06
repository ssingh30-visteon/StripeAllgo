package com.stripe.android.view;

import java.lang.System;

/**
 * A `WebView` used for authenticating payment details
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0011\u001a\u00020\u000bH\u0003J\b\u0010\u0012\u001a\u00020\u000bH\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onLoadBlank", "Lkotlin/Function0;", "", "getOnLoadBlank$payments_core_debug", "()Lkotlin/jvm/functions/Function0;", "setOnLoadBlank$payments_core_debug", "(Lkotlin/jvm/functions/Function0;)V", "cleanup", "configureSettings", "destroy", "payments-core_debug"})
public final class PaymentAuthWebView extends android.webkit.WebView {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onLoadBlank;
    
    @kotlin.jvm.JvmOverloads()
    public PaymentAuthWebView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PaymentAuthWebView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PaymentAuthWebView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnLoadBlank$payments_core_debug() {
        return null;
    }
    
    public final void setOnLoadBlank$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void destroy() {
    }
    
    private final void cleanup() {
    }
    
    @android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
    private final void configureSettings() {
    }
}
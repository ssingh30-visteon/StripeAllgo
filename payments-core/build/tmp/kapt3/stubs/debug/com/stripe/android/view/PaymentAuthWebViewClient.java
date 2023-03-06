package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u001c\u001a\u00020\rH\u0002J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u0014\u0010 \u001a\u00020\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010&\u001a\u00020\r2\u0006\u0010\'\u001a\u00020\fH\u0002J\u0010\u0010(\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002R\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient;", "Landroid/webkit/WebViewClient;", "logger", "Lcom/stripe/android/Logger;", "isPageLoaded", "Landroidx/lifecycle/MutableLiveData;", "", "clientSecret", "", "returnUrl", "activityStarter", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "activityFinisher", "", "(Lcom/stripe/android/Logger;Landroidx/lifecycle/MutableLiveData;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "completionUrlParam", "getCompletionUrlParam", "()Ljava/lang/String;", "hasLoadedBlank", "getHasLoadedBlank$payments_core_debug", "()Z", "setHasLoadedBlank$payments_core_debug", "(Z)V", "userReturnUri", "Landroid/net/Uri;", "hideProgressBar", "isPredefinedReturnUrl", "uri", "isReturnUrl", "onAuthCompleted", "error", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", "openIntent", "intent", "openIntentScheme", "shouldOverrideUrlLoading", "request", "Landroid/webkit/WebResourceRequest;", "updateCompletionUrl", "Companion", "payments-core_debug"})
public final class PaymentAuthWebViewClient extends android.webkit.WebViewClient {
    private final com.stripe.android.Logger logger = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPageLoaded = null;
    private final java.lang.String clientSecret = null;
    private final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> activityStarter = null;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> activityFinisher = null;
    private final android.net.Uri userReturnUri = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String completionUrlParam;
    private boolean hasLoadedBlank = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentAuthWebViewClient.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_PAYMENT_CLIENT_SECRET = "payment_intent_client_secret";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAM_SETUP_CLIENT_SECRET = "setup_intent_client_secret";
    private static final java.util.Set<java.lang.String> AUTHENTICATE_URLS = null;
    private static final java.util.Set<java.lang.String> COMPLETION_URLS = null;
    private static final java.lang.String PARAM_RETURN_URL = "return_url";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLANK_PAGE = "about:blank";
    
    public PaymentAuthWebViewClient(@org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPageLoaded, @org.jetbrains.annotations.NotNull()
    java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> activityStarter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> activityFinisher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompletionUrlParam() {
        return null;
    }
    
    public final boolean getHasLoadedBlank$payments_core_debug() {
        return false;
    }
    
    public final void setHasLoadedBlank$payments_core_debug(boolean p0) {
    }
    
    @java.lang.Override()
    public void onPageFinished(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    private final void hideProgressBar() {
    }
    
    @java.lang.Override()
    public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull()
    android.webkit.WebView view, @org.jetbrains.annotations.NotNull()
    android.webkit.WebResourceRequest request) {
        return false;
    }
    
    private final void openIntentScheme(android.net.Uri uri) {
    }
    
    /**
     * See https://developer.android.com/training/basics/intents/package-visibility-use-cases
     * for more details on app-to-app interaction.
     */
    private final void openIntent(android.content.Intent intent) {
    }
    
    private final void updateCompletionUrl(android.net.Uri uri) {
    }
    
    private final boolean isReturnUrl(android.net.Uri uri) {
        return false;
    }
    
    private final boolean isPredefinedReturnUrl(android.net.Uri uri) {
        return false;
    }
    
    /**
     * Invoked when authentication flow has completed, whether succeeded or failed.
     */
    private final void onAuthCompleted(java.lang.Throwable error) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002J\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\b\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient$Companion;", "", "()V", "AUTHENTICATE_URLS", "", "", "BLANK_PAGE", "COMPLETION_URLS", "PARAM_PAYMENT_CLIENT_SECRET", "PARAM_RETURN_URL", "PARAM_SETUP_CLIENT_SECRET", "isAuthenticateUrl", "", "url", "isCompletionUrl", "isCompletionUrl$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting()
        public final boolean isCompletionUrl$payments_core_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        private final boolean isAuthenticateUrl(java.lang.String url) {
            return false;
        }
    }
}
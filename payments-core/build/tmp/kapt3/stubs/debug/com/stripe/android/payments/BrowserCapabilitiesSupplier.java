package com.stripe.android.payments;

import java.lang.System;

/**
 * Supply the device's [BrowserCapabilities].
 *
 * See https://developer.chrome.com/docs/android/custom-tabs/integration-guide/ for more details
 * on Custom Tabs.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilitiesSupplier;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "get", "Lcom/stripe/android/payments/BrowserCapabilities;", "isCustomTabsSupported", "", "Companion", "NoopCustomTabsServiceConnection", "payments-core_debug"})
public final class BrowserCapabilitiesSupplier {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.payments.BrowserCapabilitiesSupplier.Companion Companion = null;
    
    /**
     * Stable = com.android.chrome
     * Beta = com.chrome.beta
     * Dev = com.chrome.dev
     */
    @java.lang.Deprecated()
    private static final java.lang.String CHROME_PACKAGE = "com.android.chrome";
    
    public BrowserCapabilitiesSupplier(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.payments.BrowserCapabilities get() {
        return null;
    }
    
    private final boolean isCustomTabsSupported() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "()V", "onCustomTabsServiceConnected", "", "componentName", "Landroid/content/ComponentName;", "customTabsClient", "Landroidx/browser/customtabs/CustomTabsClient;", "onServiceDisconnected", "name", "payments-core_debug"})
    static final class NoopCustomTabsServiceConnection extends androidx.browser.customtabs.CustomTabsServiceConnection {
        
        public NoopCustomTabsServiceConnection() {
            super();
        }
        
        @java.lang.Override()
        public void onCustomTabsServiceConnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName componentName, @org.jetbrains.annotations.NotNull()
        androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        }
        
        @java.lang.Override()
        public void onServiceDisconnected(@org.jetbrains.annotations.NotNull()
        android.content.ComponentName name) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilitiesSupplier$Companion;", "", "()V", "CHROME_PACKAGE", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory;", "", "systemPropertySupplier", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "create", "", "appInfo", "Lcom/stripe/android/AppInfo;", "createHeaderValue", "Lorg/json/JSONObject;", "Companion", "payments-core_debug"})
public final class StripeClientUserAgentHeaderFactory {
    private final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> systemPropertySupplier = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.StripeClientUserAgentHeaderFactory.Companion Companion = null;
    private static final java.lang.String PROP_USER_AGENT = "http.agent";
    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_STRIPE_CLIENT_USER_AGENT = "X-Stripe-Client-User-Agent";
    
    public StripeClientUserAgentHeaderFactory() {
        super();
    }
    
    public StripeClientUserAgentHeaderFactory(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> systemPropertySupplier) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> create(@org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final org.json.JSONObject createHeaderValue(@org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory$Companion;", "", "()V", "DEFAULT_SYSTEM_PROPERTY_SUPPLIER", "Lkotlin/Function1;", "", "HEADER_STRIPE_CLIENT_USER_AGENT", "PROP_USER_AGENT", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
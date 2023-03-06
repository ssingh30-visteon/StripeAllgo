package com.stripe.android.core.networking;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003H\u00c6\u0003J\u001d\u0010\u001c\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0004H\u00d6\u0001R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "params", "", "", "(Ljava/util/Map;)V", "headers", "getHeaders", "()Ljava/util/Map;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getParams", "query", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "payments-core_debug"})
public final class AnalyticsRequest extends com.stripe.android.core.networking.StripeRequest {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, ?> params = null;
    private final java.lang.String query = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.Method method = com.stripe.android.core.networking.StripeRequest.Method.GET;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.MimeType mimeType = com.stripe.android.core.networking.StripeRequest.MimeType.Form;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Iterable<java.lang.Integer> retryResponseCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> headers = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.core.networking.AnalyticsRequest.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOST = "https://q.stripe.com";
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.core.networking.AnalyticsRequest copy(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ?> params) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AnalyticsRequest(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ?> params) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ?> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, ?> getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.core.networking.StripeRequest.Method getMethod$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.core.networking.StripeRequest.MimeType getMimeType$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Iterable<java.lang.Integer> getRetryResponseCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequest$Companion;", "", "()V", "HOST", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
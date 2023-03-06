package com.stripe.android.networking;

import java.lang.System;

/**
 * A class representing a [FraudDetectionData] request.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0010\u00a2\u0006\u0002\b+R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000f\u00a8\u0006-"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "params", "", "", "", "guid", "(Ljava/util/Map;Ljava/lang/String;)V", "headers", "getHeaders", "()Ljava/util/Map;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "jsonBody", "getJsonBody", "()Ljava/lang/String;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "postBodyBytes", "", "getPostBodyBytes", "()[B", "postHeaders", "getPostHeaders$payments_core_debug", "setPostHeaders$payments_core_debug", "(Ljava/util/Map;)V", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "writePostBody$payments_core_debug", "Companion", "payments-core_debug"})
public final class FraudDetectionDataRequest extends com.stripe.android.core.networking.StripeRequest {
    private final java.util.Map<java.lang.String, java.lang.Object> params = null;
    private final com.stripe.android.networking.RequestHeadersFactory.FraudDetection headersFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.Method method = com.stripe.android.core.networking.StripeRequest.Method.POST;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.MimeType mimeType = com.stripe.android.core.networking.StripeRequest.MimeType.Json;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Iterable<java.lang.Integer> retryResponseCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = "https://m.stripe.com/6";
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> headers = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> postHeaders;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.networking.FraudDetectionDataRequest.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String URL = "https://m.stripe.com/6";
    
    public FraudDetectionDataRequest(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> params, @org.jetbrains.annotations.NotNull()
    java.lang.String guid) {
        super();
    }
    
    private final java.lang.String getJsonBody() {
        return null;
    }
    
    private final byte[] getPostBodyBytes() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.String> getPostHeaders$payments_core_debug() {
        return null;
    }
    
    @java.lang.Override()
    public void setPostHeaders$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @java.lang.Override()
    public void writePostBody$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.io.OutputStream outputStream) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequest$Companion;", "", "()V", "URL", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
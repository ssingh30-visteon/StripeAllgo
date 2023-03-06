package com.stripe.android.core.networking;

import java.lang.System;

/**
 * A class representing a request to a Stripe-owned service.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001:\u0002!\"B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0010\u00a2\u0006\u0002\b R\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/core/networking/StripeRequest;", "", "()V", "headers", "", "", "getHeaders", "()Ljava/util/Map;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "postHeaders", "getPostHeaders$payments_core_debug", "setPostHeaders$payments_core_debug", "(Ljava/util/Map;)V", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "()Ljava/lang/String;", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "writePostBody$payments_core_debug", "Method", "MimeType", "payments-core_debug"})
public abstract class StripeRequest {
    
    /**
     * Additional HTTP headers attached if this is a POST request
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> postHeaders;
    
    public StripeRequest() {
        super();
    }
    
    /**
     * The type(Get/Post/Delete) of this request.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.core.networking.StripeRequest.Method getMethod$payments_core_debug();
    
    /**
     * The MimeType of this request, determines the header and body format for a POST request
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.core.networking.StripeRequest.MimeType getMimeType$payments_core_debug();
    
    /**
     * A range of HTTP response code indicating this request should be retried
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Iterable<java.lang.Integer> getRetryResponseCodes();
    
    /**
     * The url of the request, could be concatenated with query params
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUrl();
    
    /**
     * The HTTP headers attached to this request
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.String> getHeaders();
    
    @org.jetbrains.annotations.Nullable()
    public java.util.Map<java.lang.String, java.lang.String> getPostHeaders$payments_core_debug() {
        return null;
    }
    
    public void setPostHeaders$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    /**
     * Writes the body of a POST request with [OutputStream], left empty for non-POST requests
     */
    public void writePostBody$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.io.OutputStream outputStream) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/core/networking/StripeRequest$Method;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "GET", "POST", "DELETE", "payments-core_debug"})
    public static enum Method {
        /*public static final*/ GET /* = new GET(null) */,
        /*public static final*/ POST /* = new POST(null) */,
        /*public static final*/ DELETE /* = new DELETE(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        Method(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Form", "MultipartForm", "Json", "payments-core_debug"})
    public static enum MimeType {
        /*public static final*/ Form /* = new Form(null) */,
        /*public static final*/ MultipartForm /* = new MultipartForm(null) */,
        /*public static final*/ Json /* = new Json(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        MimeType(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}
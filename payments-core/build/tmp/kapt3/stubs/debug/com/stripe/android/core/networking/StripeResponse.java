package com.stripe.android.core.networking;

import java.lang.System;

/**
 * Represents a response from the Stripe servers.
 * Upon receiving the HTTP response, its body is parsed into [ResponseBody], such as a
 * [String] or a [File].
 *
 * @param code the response code (i.e. 404)
 * @param body the body of the response
 * @param headers any headers associated with the response
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 -*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001-B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00018\u0000H\u00c0\u0003\u00a2\u0006\u0004\b!\u0010\fJ \u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007H\u00c0\u0003\u00a2\u0006\u0002\b#JF\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00132\b\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\u001d\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\t2\u0006\u0010)\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b*J\t\u0010+\u001a\u00020\u0004H\u00d6\u0001J\b\u0010,\u001a\u00020\bH\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0013X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006."}, d2 = {"Lcom/stripe/android/core/networking/StripeResponse;", "ResponseBody", "", "code", "", "body", "headers", "", "", "", "(ILjava/lang/Object;Ljava/util/Map;)V", "getBody$payments_core_debug", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode$payments_core_debug", "()I", "getHeaders$payments_core_debug", "()Ljava/util/Map;", "isError", "", "isError$payments_core_debug", "()Z", "isOk", "isOk$payments_core_debug", "isRateLimited", "isRateLimited$payments_core_debug", "requestId", "Lcom/stripe/android/core/networking/RequestId;", "getRequestId$payments_core_debug", "()Lcom/stripe/android/core/networking/RequestId;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "(ILjava/lang/Object;Ljava/util/Map;)Lcom/stripe/android/core/networking/StripeResponse;", "equals", "other", "getHeaderValue", "key", "getHeaderValue$payments_core_debug", "hashCode", "toString", "Companion", "payments-core_debug"})
public final class StripeResponse<ResponseBody extends java.lang.Object> {
    
    /**
     * the response code
     */
    private final int code = 0;
    
    /**
     * the response body
     */
    @org.jetbrains.annotations.Nullable()
    private final ResponseBody body = null;
    
    /**
     * the response headers
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = null;
    private final boolean isOk = false;
    private final boolean isError = false;
    private final boolean isRateLimited = false;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.core.networking.RequestId requestId = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.core.networking.StripeResponse.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_REQUEST_ID = "Request-Id";
    
    /**
     * Represents a response from the Stripe servers.
     * Upon receiving the HTTP response, its body is parsed into [ResponseBody], such as a
     * [String] or a [File].
     *
     * @param code the response code (i.e. 404)
     * @param body the body of the response
     * @param headers any headers associated with the response
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.core.networking.StripeResponse<ResponseBody> copy(int code, @org.jetbrains.annotations.Nullable()
    ResponseBody body, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers) {
        return null;
    }
    
    /**
     * Represents a response from the Stripe servers.
     * Upon receiving the HTTP response, its body is parsed into [ResponseBody], such as a
     * [String] or a [File].
     *
     * @param code the response code (i.e. 404)
     * @param body the body of the response
     * @param headers any headers associated with the response
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Represents a response from the Stripe servers.
     * Upon receiving the HTTP response, its body is parsed into [ResponseBody], such as a
     * [String] or a [File].
     *
     * @param code the response code (i.e. 404)
     * @param body the body of the response
     * @param headers any headers associated with the response
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public StripeResponse(int code, @org.jetbrains.annotations.Nullable()
    ResponseBody body, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers) {
        super();
    }
    
    /**
     * the response code
     */
    public final int component1$payments_core_debug() {
        return 0;
    }
    
    /**
     * the response code
     */
    public final int getCode$payments_core_debug() {
        return 0;
    }
    
    /**
     * the response body
     */
    @org.jetbrains.annotations.Nullable()
    public final ResponseBody component2$payments_core_debug() {
        return null;
    }
    
    /**
     * the response body
     */
    @org.jetbrains.annotations.Nullable()
    public final ResponseBody getBody$payments_core_debug() {
        return null;
    }
    
    /**
     * the response headers
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> component3$payments_core_debug() {
        return null;
    }
    
    /**
     * the response headers
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders$payments_core_debug() {
        return null;
    }
    
    public final boolean isOk$payments_core_debug() {
        return false;
    }
    
    public final boolean isError$payments_core_debug() {
        return false;
    }
    
    public final boolean isRateLimited$payments_core_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.core.networking.RequestId getRequestId$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getHeaderValue$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/core/networking/StripeResponse$Companion;", "", "()V", "HEADER_REQUEST_ID", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
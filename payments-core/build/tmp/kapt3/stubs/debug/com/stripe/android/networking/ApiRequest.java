package com.stripe.android.networking;

import java.lang.System;

/**
 * A class representing a Stripe API or Analytics request.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0003FGHBU\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010/\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b0J\u000e\u00101\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b2J\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\b4J\u000e\u00105\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\b6J\u000b\u00107\u001a\u0004\u0018\u00010\u000bH\u00c2\u0003J\t\u00108\u001a\u00020\u0005H\u00c2\u0003J\t\u00109\u001a\u00020\u0005H\u00c2\u0003J]\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020*H\u00d6\u0001J\b\u0010@\u001a\u00020\u0005H\u0016J\u0015\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0010\u00a2\u0006\u0002\bER\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0090\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0010\u00a8\u0006I"}, d2 = {"Lcom/stripe/android/networking/ApiRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "baseUrl", "", "params", "", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/AppInfo;", "apiVersion", "sdkVersion", "(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Ljava/lang/String;Ljava/lang/String;)V", "getBaseUrl$payments_core_debug", "()Ljava/lang/String;", "headers", "getHeaders", "()Ljava/util/Map;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "getMethod$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType$payments_core_debug", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getOptions$payments_core_debug", "()Lcom/stripe/android/networking/ApiRequest$Options;", "getParams$payments_core_debug", "postBodyBytes", "", "getPostBodyBytes", "()[B", "postHeaders", "getPostHeaders$payments_core_debug", "setPostHeaders$payments_core_debug", "(Ljava/util/Map;)V", "query", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "writePostBody$payments_core_debug", "Companion", "Factory", "Options", "payments-core_debug"})
public final class ApiRequest extends com.stripe.android.core.networking.StripeRequest {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.Method method = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, ?> params = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.networking.ApiRequest.Options options = null;
    private final com.stripe.android.AppInfo appInfo = null;
    private final java.lang.String apiVersion = null;
    private final java.lang.String sdkVersion = null;
    private final java.lang.String query = null;
    private final com.stripe.android.networking.RequestHeadersFactory.Api headersFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.core.networking.StripeRequest.MimeType mimeType = com.stripe.android.core.networking.StripeRequest.MimeType.Form;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Iterable<java.lang.Integer> retryResponseCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.String> headers = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.Map<java.lang.String, java.lang.String> postHeaders;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.ApiRequest.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_HOST = "https://api.stripe.com";
    
    /**
     * A class representing a Stripe API or Analytics request.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.networking.ApiRequest copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest.Method method, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ?> params, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkVersion) {
        return null;
    }
    
    /**
     * A class representing a Stripe API or Analytics request.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A class representing a Stripe API or Analytics request.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public ApiRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest.Method method, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ?> params, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
    com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkVersion) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.core.networking.StripeRequest.Method component1$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.core.networking.StripeRequest.Method getMethod$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, ?> component3$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, ?> getParams$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.networking.ApiRequest.Options component4$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.networking.ApiRequest.Options getOptions$payments_core_debug() {
        return null;
    }
    
    private final com.stripe.android.AppInfo component5() {
        return null;
    }
    
    private final java.lang.String component6() {
        return null;
    }
    
    private final java.lang.String component7() {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.UnsupportedEncodingException.class, com.stripe.android.core.exception.InvalidRequestException.class})
    private final byte[] getPostBodyBytes() throws java.io.UnsupportedEncodingException, com.stripe.android.core.exception.InvalidRequestException {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Data class representing options for a Stripe API request.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B)\b\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u00c0\u0003\u00a2\u0006\u0002\b\u0014J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Options;", "Landroid/os/Parcelable;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "apiKey", "stripeAccount", "idempotencyKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey$payments_core_debug", "()Ljava/lang/String;", "getIdempotencyKey$payments_core_debug", "getStripeAccount$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Options implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String apiKey = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stripeAccount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String idempotencyKey = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.networking.ApiRequest.Options.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String UNDEFINED_PUBLISHABLE_KEY = "pk_undefined";
        public static final android.os.Parcelable.Creator<com.stripe.android.networking.ApiRequest.Options> CREATOR = null;
        
        /**
         * Data class representing options for a Stripe API request.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.ApiRequest.Options copy(@org.jetbrains.annotations.NotNull()
        java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccount, @org.jetbrains.annotations.Nullable()
        java.lang.String idempotencyKey) {
            return null;
        }
        
        /**
         * Data class representing options for a Stripe API request.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Data class representing options for a Stripe API request.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Data class representing options for a Stripe API request.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Options(@org.jetbrains.annotations.NotNull()
        java.lang.String apiKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccount, @org.jetbrains.annotations.Nullable()
        java.lang.String idempotencyKey) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApiKey$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStripeAccount$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIdempotencyKey$payments_core_debug() {
            return null;
        }
        
        /**
         * Dedicated constructor for injection.
         *
         * Because [PUBLISHABLE_KEY] and [STRIPE_ACCOUNT_ID] might change, whenever required, a new
         * [ApiRequest.Options] instance is created with the latest values.
         * Should always be used with [Provider] or [Lazy].
         */
        @javax.inject.Inject()
        public Options(@org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "publishableKey")
        kotlin.jvm.functions.Function0<java.lang.String> publishableKeyProvider, @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "stripeAccountId")
        kotlin.jvm.functions.Function0<java.lang.String> stripeAccountIdProvider) {
            super();
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.networking.ApiRequest.Options> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.networking.ApiRequest.Options createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.networking.ApiRequest.Options[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Options$Companion;", "", "()V", "UNDEFINED_PUBLISHABLE_KEY", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000fJ,\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Factory;", "", "appInfo", "Lcom/stripe/android/AppInfo;", "apiVersion", "", "sdkVersion", "(Lcom/stripe/android/AppInfo;Ljava/lang/String;Ljava/lang/String;)V", "createDelete", "Lcom/stripe/android/networking/ApiRequest;", "url", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "createGet", "params", "", "createPost", "payments-core_debug"})
    public static final class Factory {
        private final com.stripe.android.AppInfo appInfo = null;
        private final java.lang.String apiVersion = null;
        private final java.lang.String sdkVersion = null;
        
        public Factory() {
            super();
        }
        
        public Factory(@org.jetbrains.annotations.Nullable()
        com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
        java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String sdkVersion) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.ApiRequest createGet(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, ?> params) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.ApiRequest createPost(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, ?> params) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.ApiRequest createDelete(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options options) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/ApiRequest$Companion;", "", "()V", "API_HOST", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
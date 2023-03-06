package com.stripe.android.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00142\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004R\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0005X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0017\u0018\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory;", "", "()V", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "userAgent", "getUserAgent", "()Ljava/lang/String;", "create", "createPostHeader", "Analytics", "Api", "BasePaymentApiHeadersFactory", "Companion", "FileUpload", "FraudDetection", "Lcom/stripe/android/networking/RequestHeadersFactory$BasePaymentApiHeadersFactory;", "Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/networking/RequestHeadersFactory$Analytics;", "payments-core_debug"})
public abstract class RequestHeadersFactory {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.String> postHeaders;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.RequestHeadersFactory.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_USER_AGENT = "User-Agent";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_ACCEPT_CHARSET = "Accept-Charset";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_ACCEPT = "Accept";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_STRIPE_VERSION = "Stripe-Version";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_STRIPE_ACCOUNT = "Stripe-Account";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_AUTHORIZATION = "Authorization";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HEADER_IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final java.lang.String CHARSET = null;
    
    private RequestHeadersFactory() {
        super();
    }
    
    /**
     * Creates a map for headers attached to all requests.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> create() {
        return null;
    }
    
    /**
     * Creates a map for headers attached to POST requests. Return am empty map if this factory is
     * used for request that doesn't have POST options.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> createPostHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getUserAgent();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.util.Map<java.lang.String, java.lang.String> getExtraHeaders();
    
    @org.jetbrains.annotations.NotNull()
    protected java.util.Map<java.lang.String, java.lang.String> getPostHeaders() {
        return null;
    }
    
    protected void setPostHeaders(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$BasePaymentApiHeadersFactory;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "(Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "languageTag", "getLanguageTag", "()Ljava/lang/String;", "stripeClientUserAgentHeaderFactory", "Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory;", "userAgent", "getUserAgent", "payments-core_debug"})
    public static class BasePaymentApiHeadersFactory extends com.stripe.android.networking.RequestHeadersFactory {
        private final com.stripe.android.networking.ApiRequest.Options options = null;
        private final com.stripe.android.AppInfo appInfo = null;
        private final java.util.Locale locale = null;
        private final java.lang.String apiVersion = null;
        private final java.lang.String sdkVersion = null;
        private final com.stripe.android.networking.StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory = null;
        
        public BasePaymentApiHeadersFactory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
        com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
        java.util.Locale locale, @org.jetbrains.annotations.NotNull()
        java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String sdkVersion) {
            super();
        }
        
        private final java.lang.String getLanguageTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String getUserAgent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.Map<java.lang.String, java.lang.String> getExtraHeaders() {
            return null;
        }
    }
    
    /**
     * Factory for [ApiRequest].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/networking/RequestHeadersFactory$BasePaymentApiHeadersFactory;", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "(Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "postHeaders", "", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "payments-core_debug"})
    public static final class Api extends com.stripe.android.networking.RequestHeadersFactory.BasePaymentApiHeadersFactory {
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.String, java.lang.String> postHeaders;
        
        public Api(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
        com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
        java.util.Locale locale, @org.jetbrains.annotations.NotNull()
        java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String sdkVersion) {
            super(null, null, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.Map<java.lang.String, java.lang.String> getPostHeaders() {
            return null;
        }
        
        @java.lang.Override()
        protected void setPostHeaders(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
    }
    
    /**
     * Factory for [FileUploadRequest].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0002\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eX\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$FileUpload;", "Lcom/stripe/android/networking/RequestHeadersFactory$BasePaymentApiHeadersFactory;", "options", "Lcom/stripe/android/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "boundary", "(Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "postHeaders", "", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "payments-core_debug"})
    public static final class FileUpload extends com.stripe.android.networking.RequestHeadersFactory.BasePaymentApiHeadersFactory {
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.String, java.lang.String> postHeaders;
        
        public FileUpload(@org.jetbrains.annotations.NotNull()
        com.stripe.android.networking.ApiRequest.Options options, @org.jetbrains.annotations.Nullable()
        com.stripe.android.AppInfo appInfo, @org.jetbrains.annotations.NotNull()
        java.util.Locale locale, @org.jetbrains.annotations.NotNull()
        java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String sdkVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String boundary) {
            super(null, null, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.Map<java.lang.String, java.lang.String> getPostHeaders() {
            return null;
        }
        
        @java.lang.Override()
        protected void setPostHeaders(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
    }
    
    /**
     * Factory for [FraudDetectionDataRequest].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0094\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "guid", "", "(Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "userAgent", "getUserAgent", "()Ljava/lang/String;", "Companion", "payments-core_debug"})
    public static final class FraudDetection extends com.stripe.android.networking.RequestHeadersFactory {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> extraHeaders = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String userAgent = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.networking.RequestHeadersFactory.FraudDetection.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String HEADER_COOKIE = "Cookie";
        @org.jetbrains.annotations.NotNull()
        private java.util.Map<java.lang.String, java.lang.String> postHeaders;
        
        public FraudDetection(@org.jetbrains.annotations.NotNull()
        java.lang.String guid) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.Map<java.lang.String, java.lang.String> getExtraHeaders() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String getUserAgent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.Map<java.lang.String, java.lang.String> getPostHeaders() {
            return null;
        }
        
        @java.lang.Override()
        protected void setPostHeaders(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> p0) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$FraudDetection$Companion;", "", "()V", "HEADER_COOKIE", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * Factory for [AnalyticsRequest].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "()V", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "userAgent", "getUserAgent", "()Ljava/lang/String;", "payments-core_debug"})
    public static final class Analytics extends com.stripe.android.networking.RequestHeadersFactory {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.networking.RequestHeadersFactory.Analytics INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String userAgent = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.util.Map<java.lang.String, java.lang.String> extraHeaders = null;
        
        private Analytics() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String getUserAgent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.util.Map<java.lang.String, java.lang.String> getExtraHeaders() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0013R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/networking/RequestHeadersFactory$Companion;", "", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "getCHARSET$payments_core_debug", "()Ljava/lang/String;", "HEADER_ACCEPT", "HEADER_ACCEPT_CHARSET", "HEADER_ACCEPT_LANGUAGE", "HEADER_AUTHORIZATION", "HEADER_CONTENT_TYPE", "HEADER_IDEMPOTENCY_KEY", "HEADER_STRIPE_ACCOUNT", "HEADER_STRIPE_VERSION", "HEADER_USER_AGENT", "getUserAgent", "sdkVersion", "getUserAgent$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUserAgent$payments_core_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String sdkVersion) {
            return null;
        }
        
        public final java.lang.String getCHARSET$payments_core_debug() {
            return null;
        }
    }
}
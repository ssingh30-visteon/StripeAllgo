package com.stripe.android.core.networking;

import java.lang.System;

/**
 * Factory to create [StripeConnection], which encapsulates an [HttpsURLConnection], triggers the
 * request and parses the response with different body type as [StripeResponse].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory;", "", "create", "Lcom/stripe/android/core/networking/StripeConnection;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "createForFile", "Ljava/io/File;", "outputFile", "Companion", "Default", "payments-core_debug"})
public abstract interface ConnectionFactory {
    
    /**
     * Creates an [StripeConnection] which attempts to parse the http response body as a [String].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, com.stripe.android.core.exception.InvalidRequestException.class})
    public abstract com.stripe.android.core.networking.StripeConnection<java.lang.String> create(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest request);
    
    /**
     * Creates an [StripeConnection] which attempts to parse the http response body as a [File].
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, com.stripe.android.core.exception.InvalidRequestException.class})
    public abstract com.stripe.android.core.networking.StripeConnection<java.io.File> createForFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest request, @org.jetbrains.annotations.NotNull()
    java.io.File outputFile);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Default;", "Lcom/stripe/android/core/networking/ConnectionFactory;", "()V", "create", "Lcom/stripe/android/core/networking/StripeConnection;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "createForFile", "Ljava/io/File;", "outputFile", "openConnectionAndApplyFields", "Ljavax/net/ssl/HttpsURLConnection;", "payments-core_debug"})
    public static final class Default implements com.stripe.android.core.networking.ConnectionFactory {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.core.networking.ConnectionFactory.Default INSTANCE = null;
        
        private Default() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.core.networking.StripeConnection<java.io.File> createForFile(@org.jetbrains.annotations.NotNull()
        com.stripe.android.core.networking.StripeRequest request, @org.jetbrains.annotations.NotNull()
        java.io.File outputFile) {
            return null;
        }
        
        private final javax.net.ssl.HttpsURLConnection openConnectionAndApplyFields(com.stripe.android.core.networking.StripeRequest request) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/core/networking/ConnectionFactory$Companion;", "", "()V", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "payments-core_debug"})
    public static final class Companion {
        private static final int CONNECT_TIMEOUT = 0;
        private static final int READ_TIMEOUT = 0;
        
        private Companion() {
            super();
        }
    }
}
package com.stripe.android.core.networking;

import java.lang.System;

/**
 * A wrapper for accessing a [HttpURLConnection]. Implements [Closeable] to simplify closing related
 * resources.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011J\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH&\u00a2\u0006\u0002\u0010\u000eR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection;", "ResponseBodyType", "Ljava/io/Closeable;", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "responseCode", "", "getResponseCode", "()I", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)Ljava/lang/Object;", "AbstractConnection", "Default", "FileConnection", "payments-core_debug"})
public abstract interface StripeConnection<ResponseBodyType extends java.lang.Object> extends java.io.Closeable {
    
    public abstract int getResponseCode();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.core.networking.StripeResponse<ResponseBodyType> getResponse();
    
    @org.jetbrains.annotations.Nullable()
    public abstract ResponseBodyType createBodyFromResponseStream(@org.jetbrains.annotations.Nullable()
    java.io.InputStream responseStream);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u0014*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "ResponseBodyType", "Lcom/stripe/android/core/networking/StripeConnection;", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "(Ljavax/net/ssl/HttpsURLConnection;)V", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "getResponse", "()Lcom/stripe/android/core/networking/StripeResponse;", "responseCode", "", "getResponseCode", "()I", "responseStream", "Ljava/io/InputStream;", "getResponseStream", "()Ljava/io/InputStream;", "close", "", "Companion", "payments-core_debug"})
    public static abstract class AbstractConnection<ResponseBodyType extends java.lang.Object> implements com.stripe.android.core.networking.StripeConnection<ResponseBodyType> {
        private final javax.net.ssl.HttpsURLConnection conn = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.core.networking.StripeConnection.AbstractConnection.Companion Companion = null;
        private static final java.lang.String CHARSET = null;
        
        public AbstractConnection(@org.jetbrains.annotations.NotNull()
        javax.net.ssl.HttpsURLConnection conn) {
            super();
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        private final java.io.InputStream getResponseStream() throws java.io.IOException {
            return null;
        }
        
        @java.lang.Override()
        public void close() {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection$Companion;", "", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "getCHARSET$payments_core_debug", "()Ljava/lang/String;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            public final java.lang.String getCHARSET$payments_core_debug() {
                return null;
            }
        }
    }
    
    /**
     * Default [StripeConnection] that converts the ResponseStream to a String.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$Default;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "(Ljavax/net/ssl/HttpsURLConnection;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "payments-core_debug"})
    public static final class Default extends com.stripe.android.core.networking.StripeConnection.AbstractConnection<java.lang.String> {
        
        public Default(@org.jetbrains.annotations.NotNull()
        javax.net.ssl.HttpsURLConnection conn) {
            super(null);
        }
        
        /**
         * Convert stream to a String
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @java.lang.Override()
        public java.lang.String createBodyFromResponseStream(@org.jetbrains.annotations.Nullable()
        java.io.InputStream responseStream) throws java.io.IOException {
            return null;
        }
    }
    
    /**
     * [StripeConnection] that writes the ResponseStream to a File.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/core/networking/StripeConnection$FileConnection;", "Lcom/stripe/android/core/networking/StripeConnection$AbstractConnection;", "Ljava/io/File;", "conn", "Ljavax/net/ssl/HttpsURLConnection;", "outputFile", "(Ljavax/net/ssl/HttpsURLConnection;Ljava/io/File;)V", "createBodyFromResponseStream", "responseStream", "Ljava/io/InputStream;", "payments-core_debug"})
    public static final class FileConnection extends com.stripe.android.core.networking.StripeConnection.AbstractConnection<java.io.File> {
        private final java.io.File outputFile = null;
        
        public FileConnection(@org.jetbrains.annotations.NotNull()
        javax.net.ssl.HttpsURLConnection conn, @org.jetbrains.annotations.NotNull()
        java.io.File outputFile) {
            super(null);
        }
        
        /**
         * Convert stream to a File
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
        @java.lang.Override()
        public java.io.File createBodyFromResponseStream(@org.jetbrains.annotations.Nullable()
        java.io.InputStream responseStream) throws java.io.IOException {
            return null;
        }
    }
}
package com.stripe.android.core.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B9\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJI\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000f0\u000e0\u0014H\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J,\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u000f0$2\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient;", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "connectionFactory", "Lcom/stripe/android/core/networking/ConnectionFactory;", "retryDelaySupplier", "Lcom/stripe/android/core/networking/RetryDelaySupplier;", "maxRetries", "", "logger", "Lcom/stripe/android/Logger;", "(Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/ConnectionFactory;Lcom/stripe/android/core/networking/RetryDelaySupplier;ILcom/stripe/android/Logger;)V", "executeInternal", "Lcom/stripe/android/core/networking/StripeResponse;", "BodyType", "remainingRetries", "retryResponseCodes", "", "requester", "Lkotlin/Function0;", "executeInternal$payments_core_debug", "(ILjava/lang/Iterable;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequest", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequestForFile", "Ljava/io/File;", "outputFile", "(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRequest", "makeRequestForFile", "parseResponse", "connection", "Lcom/stripe/android/core/networking/StripeConnection;", "baseUrl", "Companion", "payments-core_debug"})
public final class DefaultStripeNetworkClient implements com.stripe.android.core.networking.StripeNetworkClient {
    private final kotlin.coroutines.CoroutineContext workContext = null;
    private final com.stripe.android.core.networking.ConnectionFactory connectionFactory = null;
    private final com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier = null;
    private final int maxRetries = 0;
    private final com.stripe.android.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.core.networking.DefaultStripeNetworkClient.Companion Companion = null;
    
    /**
     * Default number of retries if the SDK receives certain range or HTTP codes represented by
     * [StripeRequest.retryResponseCodes].
     */
    @java.lang.Deprecated()
    private static final int DEFAULT_MAX_RETRIES = 3;
    
    @kotlin.jvm.JvmOverloads()
    public DefaultStripeNetworkClient() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultStripeNetworkClient(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultStripeNetworkClient(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.ConnectionFactory connectionFactory) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultStripeNetworkClient(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultStripeNetworkClient(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier, int maxRetries) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public DefaultStripeNetworkClient(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.ConnectionFactory connectionFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.RetryDelaySupplier retryDelaySupplier, int maxRetries, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object executeRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object executeRequestForFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest request, @org.jetbrains.annotations.NotNull()
    java.io.File outputFile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<java.io.File>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final <BodyType extends java.lang.Object>java.lang.Object executeInternal$payments_core_debug(int remainingRetries, @org.jetbrains.annotations.NotNull()
    java.lang.Iterable<java.lang.Integer> retryResponseCodes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<com.stripe.android.core.networking.StripeResponse<BodyType>> requester, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<BodyType>> continuation) {
        return null;
    }
    
    private final com.stripe.android.core.networking.StripeResponse<java.lang.String> makeRequest(com.stripe.android.core.networking.StripeRequest request) {
        return null;
    }
    
    private final com.stripe.android.core.networking.StripeResponse<java.io.File> makeRequestForFile(com.stripe.android.core.networking.StripeRequest request, java.io.File outputFile) {
        return null;
    }
    
    private final <BodyType extends java.lang.Object>com.stripe.android.core.networking.StripeResponse<BodyType> parseResponse(com.stripe.android.core.networking.StripeConnection<BodyType> connection, java.lang.String baseUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/core/networking/DefaultStripeNetworkClient$Companion;", "", "()V", "DEFAULT_MAX_RETRIES", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
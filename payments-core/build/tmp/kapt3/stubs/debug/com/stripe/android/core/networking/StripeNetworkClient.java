package com.stripe.android.core.networking;

import java.lang.System;

/**
 * HTTP client to execute different types of [StripeRequest] and return [StripeResponse].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/core/networking/StripeNetworkClient;", "", "executeRequest", "Lcom/stripe/android/core/networking/StripeResponse;", "", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "(Lcom/stripe/android/core/networking/StripeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRequestForFile", "Ljava/io/File;", "outputFile", "(Lcom/stripe/android/core/networking/StripeRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_debug"})
public abstract interface StripeNetworkClient {
    
    /**
     * Execute an HTTP request represented by a [StripeRequest] and attempts to parse the HTTP
     * response's body as a [String] and returns it as [StripeResponse].
     *
     * @param request: the request to execute
     *
     * @return response with its body parsed as a String
     *
     * @throws APIConnectionException if there connection fails
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.APIConnectionException.class})
    public abstract java.lang.Object executeRequest(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<java.lang.String>> continuation);
    
    /**
     * Execute an HTTP request represented by a [StripeRequest] and attempts to parse the HTTP
     * response's body as a [File] and returns it as [StripeResponse].
     *
     * @param request: the request to execute
     * @param outputFile: the file to save to
     *
     * @return response with its body saved to outputFile
     *
     * @throws APIConnectionException if there connection fails
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.APIConnectionException.class})
    public abstract java.lang.Object executeRequestForFile(@org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.StripeRequest request, @org.jetbrains.annotations.NotNull()
    java.io.File outputFile, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.core.networking.StripeResponse<java.io.File>> continuation);
}
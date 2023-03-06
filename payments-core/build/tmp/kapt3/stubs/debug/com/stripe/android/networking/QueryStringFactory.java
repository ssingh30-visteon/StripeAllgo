package com.stripe.android.networking;

import java.lang.System;

/**
 * Factory for HTTP request query strings, converts a [Map] of <param, value> into a query string
 * like "?p1=v1&p2=v2"
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\u0005H\u0002J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/networking/QueryStringFactory;", "", "()V", "compactParams", "", "", "params", "create", "createFromParamsWithEmptyValues", "flattenParams", "", "Lcom/stripe/android/networking/QueryStringFactory$Parameter;", "flattenParamsList", "keyPrefix", "flattenParamsMap", "flattenParamsValue", "value", "Parameter", "payments-core_debug"})
public final class QueryStringFactory {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.QueryStringFactory INSTANCE = null;
    
    private QueryStringFactory() {
        super();
    }
    
    /**
     * Create a query string from a [Map]
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String create(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ?> params) {
        return null;
    }
    
    /**
     * Create a query string from a [Map] with possible empty values, remove the empty values first
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createFromParamsWithEmptyValues(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ?> params) {
        return null;
    }
    
    /**
     * Copy the {@param params} map and recursively remove null and empty values. The Stripe API
     * requires that parameters with null values are removed from requests.
     *
     * @param params a [Map] from which to remove the keys that have `null` values
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> compactParams(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ?> params) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class})
    private final java.util.List<com.stripe.android.networking.QueryStringFactory.Parameter> flattenParams(java.util.Map<java.lang.String, ?> params) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class})
    private final java.util.List<com.stripe.android.networking.QueryStringFactory.Parameter> flattenParamsList(java.util.List<?> params, java.lang.String keyPrefix) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class})
    private final java.util.List<com.stripe.android.networking.QueryStringFactory.Parameter> flattenParamsMap(java.util.Map<java.lang.String, ?> params, java.lang.String keyPrefix) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.stripe.android.core.exception.InvalidRequestException.class})
    private final java.util.List<com.stripe.android.networking.QueryStringFactory.Parameter> flattenParamsValue(java.lang.Object value, java.lang.String keyPrefix) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0007\u001a\u00020\u0003H\u00c2\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/QueryStringFactory$Parameter;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "urlEncode", "str", "payments-core_debug"})
    static final class Parameter {
        private final java.lang.String key = null;
        private final java.lang.String value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.networking.QueryStringFactory.Parameter copy(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
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
        
        public Parameter(@org.jetbrains.annotations.NotNull()
        java.lang.String key, @org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        private final java.lang.String component1() {
            return null;
        }
        
        private final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.io.UnsupportedEncodingException.class})
        private final java.lang.String urlEncode(java.lang.String str) throws java.io.UnsupportedEncodingException {
            return null;
        }
    }
}
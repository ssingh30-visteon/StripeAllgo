package com.stripe.android.model;

import java.lang.System;

/**
 * A set of JSON parsing utility functions.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b\tJ\'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u00a2\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000\u00a2\u0006\u0002\b\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0002J#\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\b\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0002\b\u0018J\u001f\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u001cJ!\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b J-\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\"J#\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b%\u0010&J#\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\b)\u0010*J/\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b,J\u001e\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/stripe/android/model/StripeJsonUtils;", "", "()V", "NULL", "", "jsonArrayToList", "", "jsonArray", "Lorg/json/JSONArray;", "jsonArrayToList$payments_core_debug", "jsonObjectToMap", "", "jsonObject", "Lorg/json/JSONObject;", "jsonObjectToMap$payments_core_debug", "jsonObjectToStringMap", "jsonObjectToStringMap$payments_core_debug", "listToJsonArray", "values", "mapToJsonObject", "mapObject", "mapToJsonObject$payments_core_debug", "nullIfNullOrEmpty", "possibleNull", "nullIfNullOrEmpty$payments_core_debug", "optBoolean", "", "fieldName", "optBoolean$payments_core_debug", "optCountryCode", "optCountryCode$payments_core_debug", "optCurrency", "optCurrency$payments_core_debug", "optHash", "optHash$payments_core_debug", "optInteger", "", "optInteger$payments_core_debug", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "optLong", "", "optLong$payments_core_debug", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "optMap", "optMap$payments_core_debug", "optString", "payments-core_debug"})
public final class StripeJsonUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.StripeJsonUtils INSTANCE = null;
    private static final java.lang.String NULL = "null";
    
    private StripeJsonUtils() {
        super();
    }
    
    /**
     * Calls through to [JSONObject.optString] while safely
     * converting the raw string "null" and the empty string to `null`. Will not throw
     * an exception if the field isn't found.
     *
     * @param jsonObject the input object
     * @param fieldName the optional field name
     * @return the value stored in the field, or `null` if the field isn't present
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String optString(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject jsonObject, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String fieldName) {
        return null;
    }
    
    /**
     * Calls through to [JSONObject.optString] while safely converting
     * the raw string "null" and the empty string to `null`, along with any value that isn't
     * a three-character string.
     * @param jsonObject the object from which to retrieve the currency code
     * @param fieldName the name of the field in which the currency code is stored
     * @return a three-letter currency code if one is found, or `null`
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 3L)
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String optCurrency$payments_core_debug(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject jsonObject, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 1L)
    java.lang.String fieldName) {
        return null;
    }
    
    /**
     * Converts a string-keyed [Map] into a [JSONObject]. This will cause a
     * [ClassCastException] if any sub-map has keys that are not [Strings][String].
     *
     * @param mapObject the [Map] that you'd like in JSON form
     * @return a [JSONObject] representing the input map, or `null` if the input
     * object is `null`
     */
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject mapToJsonObject$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, ?> mapObject) {
        return null;
    }
    
    /**
     * Converts a [List] into a [JSONArray]. A [ClassCastException] will be
     * thrown if any object in the list (or any sub-list or sub-map) is a [Map] whose keys
     * are not [Strings][String].
     *
     * @param values a [List] of values to be put in a [JSONArray]
     * @return a [JSONArray], or `null` if the input was `null`
     */
    private final org.json.JSONArray listToJsonArray(java.util.List<?> values) {
        return null;
    }
}
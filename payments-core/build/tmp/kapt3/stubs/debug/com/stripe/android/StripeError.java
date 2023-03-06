package com.stripe.android;

import java.lang.System;

/**
 * A model representing a Stripe [Errors](https://stripe.com/docs/api/errors) object.
 *
 * Stripe uses conventional HTTP response codes to indicate the success or failure of an API
 * request. In general:
 * - Codes in the `2xx` range indicate success.
 * - Codes in the `4xx` range indicate an error that failed given the information provided
 *  (e.g. a required parameter was omitted, a charge failed, etc.).
 * - Codes in the `5xx` range indicate an error with Stripe's servers (these are rare).
 *
 * Some `4xx` errors that could be handled programmatically (e.g., a card is
 * [declined](https://stripe.com/docs/declines)) include an
 * [error code](https://stripe.com/docs/error-codes) that briefly explains the error reported.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B[\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u001dH\u00d6\u0001J\t\u0010#\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006)"}, d2 = {"Lcom/stripe/android/StripeError;", "Lcom/stripe/android/model/StripeModel;", "Ljava/io/Serializable;", "type", "", "message", "code", "param", "declineCode", "charge", "docUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCharge", "()Ljava/lang/String;", "getCode", "getDeclineCode", "getDocUrl", "getMessage", "getParam", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class StripeError implements com.stripe.android.model.StripeModel, java.io.Serializable {
    
    /**
     * The type of error returned. One of `api_connection_error`, `api_error`,
     * `authentication_error`, `card_error`, `idempotency_error`, `invalid_request_error`,
     * or `rate_limit_error`
     *
     * [type](https://stripe.com/docs/api/errors#errors-type)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    
    /**
     * A human-readable message providing more details about the error. For card errors,
     * these messages can be shown to your users.
     *
     * This will be localized based on the requesting device's Locale.
     *
     * [message](https://stripe.com/docs/api/errors#errors-message)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    
    /**
     * For some errors that could be handled programmatically, a short string indicating the
     * [error code](https://stripe.com/docs/error-codes) reported.
     *
     * [code](https://stripe.com/docs/api/errors#errors-code)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String code = null;
    
    /**
     * If the error is parameter-specific, the parameter related to the error. For example, you can
     * use this to display a message near the correct form field.
     *
     * [param](https://stripe.com/docs/api/errors#errors-param)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String param = null;
    
    /**
     * For card errors resulting from a card issuer decline, a short string indicating the
     * [card issuer’s reason for the decline](https://stripe.com/docs/declines/codes)
     * if they provide one.
     *
     * [decline_code](https://stripe.com/docs/api/errors#errors-decline_code)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String declineCode = null;
    
    /**
     * For card errors, the ID of the failed charge.
     *
     * [charge](https://stripe.com/docs/api/errors#errors-charge)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String charge = null;
    
    /**
     * A URL to more information about the
     * [error code](https://stripe.com/docs/error-codes) reported.
     *
     * [doc_url](https://stripe.com/docs/api/errors#errors-doc_url)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String docUrl = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.StripeError> CREATOR = null;
    
    /**
     * A model representing a Stripe [Errors](https://stripe.com/docs/api/errors) object.
     *
     * Stripe uses conventional HTTP response codes to indicate the success or failure of an API
     * request. In general:
     * - Codes in the `2xx` range indicate success.
     * - Codes in the `4xx` range indicate an error that failed given the information provided
     *  (e.g. a required parameter was omitted, a charge failed, etc.).
     * - Codes in the `5xx` range indicate an error with Stripe's servers (these are rare).
     *
     * Some `4xx` errors that could be handled programmatically (e.g., a card is
     * [declined](https://stripe.com/docs/declines)) include an
     * [error code](https://stripe.com/docs/error-codes) that briefly explains the error reported.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.StripeError copy(@org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.lang.String param, @org.jetbrains.annotations.Nullable()
    java.lang.String declineCode, @org.jetbrains.annotations.Nullable()
    java.lang.String charge, @org.jetbrains.annotations.Nullable()
    java.lang.String docUrl) {
        return null;
    }
    
    /**
     * A model representing a Stripe [Errors](https://stripe.com/docs/api/errors) object.
     *
     * Stripe uses conventional HTTP response codes to indicate the success or failure of an API
     * request. In general:
     * - Codes in the `2xx` range indicate success.
     * - Codes in the `4xx` range indicate an error that failed given the information provided
     *  (e.g. a required parameter was omitted, a charge failed, etc.).
     * - Codes in the `5xx` range indicate an error with Stripe's servers (these are rare).
     *
     * Some `4xx` errors that could be handled programmatically (e.g., a card is
     * [declined](https://stripe.com/docs/declines)) include an
     * [error code](https://stripe.com/docs/error-codes) that briefly explains the error reported.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A model representing a Stripe [Errors](https://stripe.com/docs/api/errors) object.
     *
     * Stripe uses conventional HTTP response codes to indicate the success or failure of an API
     * request. In general:
     * - Codes in the `2xx` range indicate success.
     * - Codes in the `4xx` range indicate an error that failed given the information provided
     *  (e.g. a required parameter was omitted, a charge failed, etc.).
     * - Codes in the `5xx` range indicate an error with Stripe's servers (these are rare).
     *
     * Some `4xx` errors that could be handled programmatically (e.g., a card is
     * [declined](https://stripe.com/docs/declines)) include an
     * [error code](https://stripe.com/docs/error-codes) that briefly explains the error reported.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A model representing a Stripe [Errors](https://stripe.com/docs/api/errors) object.
     *
     * Stripe uses conventional HTTP response codes to indicate the success or failure of an API
     * request. In general:
     * - Codes in the `2xx` range indicate success.
     * - Codes in the `4xx` range indicate an error that failed given the information provided
     *  (e.g. a required parameter was omitted, a charge failed, etc.).
     * - Codes in the `5xx` range indicate an error with Stripe's servers (these are rare).
     *
     * Some `4xx` errors that could be handled programmatically (e.g., a card is
     * [declined](https://stripe.com/docs/declines)) include an
     * [error code](https://stripe.com/docs/error-codes) that briefly explains the error reported.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public StripeError() {
        super();
    }
    
    public StripeError(@org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.lang.String param, @org.jetbrains.annotations.Nullable()
    java.lang.String declineCode, @org.jetbrains.annotations.Nullable()
    java.lang.String charge, @org.jetbrains.annotations.Nullable()
    java.lang.String docUrl) {
        super();
    }
    
    /**
     * The type of error returned. One of `api_connection_error`, `api_error`,
     * `authentication_error`, `card_error`, `idempotency_error`, `invalid_request_error`,
     * or `rate_limit_error`
     *
     * [type](https://stripe.com/docs/api/errors#errors-type)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * The type of error returned. One of `api_connection_error`, `api_error`,
     * `authentication_error`, `card_error`, `idempotency_error`, `invalid_request_error`,
     * or `rate_limit_error`
     *
     * [type](https://stripe.com/docs/api/errors#errors-type)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    /**
     * A human-readable message providing more details about the error. For card errors,
     * these messages can be shown to your users.
     *
     * This will be localized based on the requesting device's Locale.
     *
     * [message](https://stripe.com/docs/api/errors#errors-message)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * A human-readable message providing more details about the error. For card errors,
     * these messages can be shown to your users.
     *
     * This will be localized based on the requesting device's Locale.
     *
     * [message](https://stripe.com/docs/api/errors#errors-message)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    /**
     * For some errors that could be handled programmatically, a short string indicating the
     * [error code](https://stripe.com/docs/error-codes) reported.
     *
     * [code](https://stripe.com/docs/api/errors#errors-code)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * For some errors that could be handled programmatically, a short string indicating the
     * [error code](https://stripe.com/docs/error-codes) reported.
     *
     * [code](https://stripe.com/docs/api/errors#errors-code)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    /**
     * If the error is parameter-specific, the parameter related to the error. For example, you can
     * use this to display a message near the correct form field.
     *
     * [param](https://stripe.com/docs/api/errors#errors-param)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * If the error is parameter-specific, the parameter related to the error. For example, you can
     * use this to display a message near the correct form field.
     *
     * [param](https://stripe.com/docs/api/errors#errors-param)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getParam() {
        return null;
    }
    
    /**
     * For card errors resulting from a card issuer decline, a short string indicating the
     * [card issuer’s reason for the decline](https://stripe.com/docs/declines/codes)
     * if they provide one.
     *
     * [decline_code](https://stripe.com/docs/api/errors#errors-decline_code)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * For card errors resulting from a card issuer decline, a short string indicating the
     * [card issuer’s reason for the decline](https://stripe.com/docs/declines/codes)
     * if they provide one.
     *
     * [decline_code](https://stripe.com/docs/api/errors#errors-decline_code)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeclineCode() {
        return null;
    }
    
    /**
     * For card errors, the ID of the failed charge.
     *
     * [charge](https://stripe.com/docs/api/errors#errors-charge)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * For card errors, the ID of the failed charge.
     *
     * [charge](https://stripe.com/docs/api/errors#errors-charge)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCharge() {
        return null;
    }
    
    /**
     * A URL to more information about the
     * [error code](https://stripe.com/docs/error-codes) reported.
     *
     * [doc_url](https://stripe.com/docs/api/errors#errors-doc_url)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * A URL to more information about the
     * [error code](https://stripe.com/docs/error-codes) reported.
     *
     * [doc_url](https://stripe.com/docs/api/errors#errors-doc_url)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDocUrl() {
        return null;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.StripeError> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.StripeError createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.StripeError[] newArray(int size) {
            return null;
        }
    }
}
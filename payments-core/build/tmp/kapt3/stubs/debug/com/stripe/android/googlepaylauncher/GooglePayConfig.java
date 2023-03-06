package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0004\b\'\u0010\u000fJ\u000e\u0010(\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\nH\u00c0\u0003\u00a2\u0006\u0002\b-J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\b/J\u0010\u00100\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0002\b1JZ\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u00103J\t\u00104\u001a\u00020\u0005H\u00d6\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\u0005H\u00d6\u0001J\t\u00109\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016\u00a8\u0006?"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayConfig;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "amount", "", "countryCode", "", "currencyCode", "isEmailRequired", "", "merchantName", "transactionId", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAmount$payments_core_debug", "()Ljava/lang/Integer;", "setAmount$payments_core_debug", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCountryCode$payments_core_debug", "()Ljava/lang/String;", "setCountryCode$payments_core_debug", "(Ljava/lang/String;)V", "getCurrencyCode$payments_core_debug", "setCurrencyCode$payments_core_debug", "getEnvironment", "()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "setEnvironment", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;)V", "isEmailRequired$payments_core_debug", "()Z", "setEmailRequired$payments_core_debug", "(Z)V", "getMerchantName$payments_core_debug", "setMerchantName$payments_core_debug", "getTransactionId$payments_core_debug", "setTransactionId$payments_core_debug", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component7$payments_core_debug", "copy", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/stripe/android/googlepaylauncher/GooglePayConfig;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class GooglePayConfig implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.googlepaylauncher.GooglePayEnvironment environment;
    
    /**
     * Total monetary value of the transaction.
     *
     * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
     * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer amount;
    
    /**
     * ISO 3166-1 alpha-2 country code where the transaction is processed.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String countryCode;
    
    /**
     * ISO 4217 alphabetic currency code.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currencyCode;
    
    /**
     * Set to true to request an email address.
     */
    private boolean isEmailRequired;
    
    /**
     * Merchant name encoded as UTF-8.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String merchantName;
    
    /**
     * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
     * generate a specific one for Google Pay transaction attempts. This field is required
     * when you send callbacks to the Google Transaction Events API.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String transactionId;
    public static final android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayConfig> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.googlepaylauncher.GooglePayConfig copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer amount, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, boolean isEmailRequired, @org.jetbrains.annotations.Nullable()
    java.lang.String merchantName, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public GooglePayConfig(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayEnvironment environment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer amount, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode, boolean isEmailRequired, @org.jetbrains.annotations.Nullable()
    java.lang.String merchantName, @org.jetbrains.annotations.Nullable()
    java.lang.String transactionId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.googlepaylauncher.GooglePayEnvironment component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.googlepaylauncher.GooglePayEnvironment getEnvironment() {
        return null;
    }
    
    public final void setEnvironment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.googlepaylauncher.GooglePayEnvironment p0) {
    }
    
    /**
     * Total monetary value of the transaction.
     *
     * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
     * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2$payments_core_debug() {
        return null;
    }
    
    /**
     * Total monetary value of the transaction.
     *
     * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
     * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAmount$payments_core_debug() {
        return null;
    }
    
    /**
     * Total monetary value of the transaction.
     *
     * The value of this field is represented in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal).
     * For example, when [currencyCode] is `"USD"`, a value of `100` represents 100 cents ($1.00).
     */
    public final void setAmount$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    /**
     * ISO 3166-1 alpha-2 country code where the transaction is processed.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3$payments_core_debug() {
        return null;
    }
    
    /**
     * ISO 3166-1 alpha-2 country code where the transaction is processed.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryCode$payments_core_debug() {
        return null;
    }
    
    /**
     * ISO 3166-1 alpha-2 country code where the transaction is processed.
     */
    public final void setCountryCode$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * ISO 4217 alphabetic currency code.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4$payments_core_debug() {
        return null;
    }
    
    /**
     * ISO 4217 alphabetic currency code.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrencyCode$payments_core_debug() {
        return null;
    }
    
    /**
     * ISO 4217 alphabetic currency code.
     */
    public final void setCurrencyCode$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    /**
     * Set to true to request an email address.
     */
    public final boolean component5$payments_core_debug() {
        return false;
    }
    
    /**
     * Set to true to request an email address.
     */
    public final boolean isEmailRequired$payments_core_debug() {
        return false;
    }
    
    /**
     * Set to true to request an email address.
     */
    public final void setEmailRequired$payments_core_debug(boolean p0) {
    }
    
    /**
     * Merchant name encoded as UTF-8.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6$payments_core_debug() {
        return null;
    }
    
    /**
     * Merchant name encoded as UTF-8.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMerchantName$payments_core_debug() {
        return null;
    }
    
    /**
     * Merchant name encoded as UTF-8.
     */
    public final void setMerchantName$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    /**
     * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
     * generate a specific one for Google Pay transaction attempts. This field is required
     * when you send callbacks to the Google Transaction Events API.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7$payments_core_debug() {
        return null;
    }
    
    /**
     * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
     * generate a specific one for Google Pay transaction attempts. This field is required
     * when you send callbacks to the Google Transaction Events API.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTransactionId$payments_core_debug() {
        return null;
    }
    
    /**
     * A unique ID that identifies a transaction attempt. Merchants may use an existing ID or
     * generate a specific one for Google Pay transaction attempts. This field is required
     * when you send callbacks to the Google Transaction Events API.
     */
    public final void setTransactionId$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.googlepaylauncher.GooglePayConfig> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.googlepaylauncher.GooglePayConfig createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.googlepaylauncher.GooglePayConfig[] newArray(int size) {
            return null;
        }
    }
}
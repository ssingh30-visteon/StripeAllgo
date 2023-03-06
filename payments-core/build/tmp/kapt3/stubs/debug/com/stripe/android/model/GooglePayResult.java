package com.stripe.android.model;

import java.lang.System;

/**
 * Result of a successful Google Pay Payment Data Request
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BO\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u001fH\u00d6\u0001J\t\u0010%\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006,"}, d2 = {"Lcom/stripe/android/model/GooglePayResult;", "Landroid/os/Parcelable;", "token", "Lcom/stripe/android/model/Token;", "address", "Lcom/stripe/android/model/Address;", "name", "", "email", "phoneNumber", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "(Lcom/stripe/android/model/Token;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhoneNumber", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getToken", "()Lcom/stripe/android/model/Token;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class GooglePayResult implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Token token = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Address address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.ShippingInformation shippingInformation = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.GooglePayResult.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.GooglePayResult> CREATOR = null;
    
    /**
     * Result of a successful Google Pay Payment Data Request
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.GooglePayResult copy(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Token token, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation) {
        return null;
    }
    
    /**
     * Result of a successful Google Pay Payment Data Request
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Result of a successful Google Pay Payment Data Request
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Result of a successful Google Pay Payment Data Request
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public GooglePayResult() {
        super();
    }
    
    public GooglePayResult(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Token token, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Token component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Token getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getShippingInformation() {
        return null;
    }
    
    /**
     * @param paymentDataJson a JSONObject representation of a
     * [PaymentData](https://developers.google.com/pay/api/android/reference/response-objects#PaymentData)
     * response
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.GooglePayResult fromJson(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject paymentDataJson) throws org.json.JSONException {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.GooglePayResult> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.GooglePayResult createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.GooglePayResult[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/GooglePayResult$Companion;", "", "()V", "createShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "paymentDataJson", "Lorg/json/JSONObject;", "fromJson", "Lcom/stripe/android/model/GooglePayResult;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * @param paymentDataJson a JSONObject representation of a
         * [PaymentData](https://developers.google.com/pay/api/android/reference/response-objects#PaymentData)
         * response
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.GooglePayResult fromJson(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject paymentDataJson) throws org.json.JSONException {
            return null;
        }
        
        private final com.stripe.android.model.ShippingInformation createShippingInformation(org.json.JSONObject paymentDataJson) {
            return null;
        }
    }
}
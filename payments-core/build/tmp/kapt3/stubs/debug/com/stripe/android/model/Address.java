package com.stripe.android.model;

import java.lang.System;

/**
 * Model for an owner [address](https://stripe.com/docs/api#source_object-owner-address)
 * object in the Source api.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002-.BO\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\n\u0010#\u001a\u0004\u0018\u00010\u000fH\u0007J\t\u0010$\u001a\u00020\u001eH\u00d6\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0&H\u0016J\t\u0010\'\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001eH\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "city", "", "country", "line1", "line2", "postalCode", "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "countryCode", "Lcom/stripe/android/model/CountryCode;", "getCountryCode$payments_core_debug", "()Lcom/stripe/android/model/CountryCode;", "getLine1", "getLine2", "getPostalCode", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "getCountryCode", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
public final class Address implements com.stripe.android.model.StripeModel, com.stripe.android.model.StripeParamsModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String line1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String line2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String postalCode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.Address.Companion Companion = null;
    private static final java.lang.String PARAM_CITY = "city";
    private static final java.lang.String PARAM_COUNTRY = "country";
    private static final java.lang.String PARAM_LINE_1 = "line1";
    private static final java.lang.String PARAM_LINE_2 = "line2";
    private static final java.lang.String PARAM_POSTAL_CODE = "postal_code";
    private static final java.lang.String PARAM_STATE = "state";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Address> CREATOR = null;
    
    /**
     * Model for an owner [address](https://stripe.com/docs/api#source_object-owner-address)
     * object in the Source api.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Address copy(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String line1, @org.jetbrains.annotations.Nullable()
    java.lang.String line2, @org.jetbrains.annotations.Nullable()
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
    java.lang.String state) {
        return null;
    }
    
    /**
     * Model for an owner [address](https://stripe.com/docs/api#source_object-owner-address)
     * object in the Source api.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model for an owner [address](https://stripe.com/docs/api#source_object-owner-address)
     * object in the Source api.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model for an owner [address](https://stripe.com/docs/api#source_object-owner-address)
     * object in the Source api.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public Address() {
        super();
    }
    
    @androidx.annotation.VisibleForTesting()
    public Address(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String line1, @org.jetbrains.annotations.Nullable()
    java.lang.String line2, @org.jetbrains.annotations.Nullable()
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
    java.lang.String state) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLine1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLine2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CountryCode getCountryCode$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final com.stripe.android.model.CountryCode getCountryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.Address fromJson(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject jsonObject) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Address> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Address createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Address[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/Address$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/Address;", "()V", "city", "", "country", "line1", "line2", "postalCode", "state", "build", "setCity", "setCountry", "setCountryCode", "countryCode", "Lcom/stripe/android/model/CountryCode;", "setLine1", "setLine2", "setPostalCode", "setState", "payments-core_debug"})
    public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.Address> {
        private java.lang.String city;
        private java.lang.String country;
        private java.lang.String line1;
        private java.lang.String line2;
        private java.lang.String postalCode;
        private java.lang.String state;
        
        public Builder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address.Builder setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String city) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address.Builder setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String country) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final com.stripe.android.model.Address.Builder setCountryCode(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.CountryCode countryCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address.Builder setLine1(@org.jetbrains.annotations.Nullable()
        java.lang.String line1) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address.Builder setLine2(@org.jetbrains.annotations.Nullable()
        java.lang.String line2) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address.Builder setPostalCode(@org.jetbrains.annotations.Nullable()
        java.lang.String postalCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Address.Builder setState(@org.jetbrains.annotations.Nullable()
        java.lang.String state) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.Address build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/Address$Companion;", "", "()V", "PARAM_CITY", "", "PARAM_COUNTRY", "PARAM_LINE_1", "PARAM_LINE_2", "PARAM_POSTAL_CODE", "PARAM_STATE", "fromJson", "Lcom/stripe/android/model/Address;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.Address fromJson(@org.jetbrains.annotations.Nullable()
        org.json.JSONObject jsonObject) {
            return null;
        }
    }
}
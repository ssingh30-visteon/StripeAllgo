package com.stripe.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002+,BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u001dH\u00d6\u0001J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0$H\u0016J\t\u0010%\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001dH\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r\u00a8\u0006-"}, d2 = {"Lcom/stripe/android/model/AddressJapanParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "city", "", "country", "line1", "line2", "postalCode", "state", "town", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getLine1", "getLine2", "getPostalCode", "getState", "getTown", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
public final class AddressJapanParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    
    /**
     * City or ward.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String city = null;
    
    /**
     * Two-letter country code (ISO 3166-1 alpha-2).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    
    /**
     * Block or building number.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String line1 = null;
    
    /**
     * Building details.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String line2 = null;
    
    /**
     * Postal code.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String postalCode = null;
    
    /**
     * Prefecture.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state = null;
    
    /**
     * Town or cho-me.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String town = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.AddressJapanParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CITY = "city";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_COUNTRY = "country";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LINE_1 = "line1";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LINE_2 = "line2";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_POSTAL_CODE = "postal_code";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_STATE = "state";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_TOWN = "town";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.AddressJapanParams> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.AddressJapanParams copy(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String line1, @org.jetbrains.annotations.Nullable()
    java.lang.String line2, @org.jetbrains.annotations.Nullable()
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String town) {
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
    
    public AddressJapanParams() {
        super();
    }
    
    public AddressJapanParams(@org.jetbrains.annotations.Nullable()
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String line1, @org.jetbrains.annotations.Nullable()
    java.lang.String line2, @org.jetbrains.annotations.Nullable()
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String town) {
        super();
    }
    
    /**
     * City or ward.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * City or ward.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    /**
     * Two-letter country code (ISO 3166-1 alpha-2).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Two-letter country code (ISO 3166-1 alpha-2).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    /**
     * Block or building number.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Block or building number.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLine1() {
        return null;
    }
    
    /**
     * Building details.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Building details.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLine2() {
        return null;
    }
    
    /**
     * Postal code.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * Postal code.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    /**
     * Prefecture.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Prefecture.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
        return null;
    }
    
    /**
     * Town or cho-me.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * Town or cho-me.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AddressJapanParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.AddressJapanParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.AddressJapanParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/model/AddressJapanParams$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AddressJapanParams;", "()V", "city", "", "country", "line1", "line2", "postalCode", "state", "town", "build", "setCity", "setCountry", "setLine1", "setLine2", "setPostalCode", "setState", "setTown", "payments-core_debug"})
    public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.AddressJapanParams> {
        private java.lang.String city;
        private java.lang.String country;
        private java.lang.String line1;
        private java.lang.String line2;
        private java.lang.String postalCode;
        private java.lang.String state;
        private java.lang.String town;
        
        public Builder() {
            super();
        }
        
        /**
         * @param city City or ward.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setCity(@org.jetbrains.annotations.Nullable()
        java.lang.String city) {
            return null;
        }
        
        /**
         * @param country Two-letter country code (ISO 3166-1 alpha-2).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String country) {
            return null;
        }
        
        /**
         * @param line1 Block or building number.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setLine1(@org.jetbrains.annotations.Nullable()
        java.lang.String line1) {
            return null;
        }
        
        /**
         * @param line2 Building details.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setLine2(@org.jetbrains.annotations.Nullable()
        java.lang.String line2) {
            return null;
        }
        
        /**
         * @param postalCode Postal code.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setPostalCode(@org.jetbrains.annotations.Nullable()
        java.lang.String postalCode) {
            return null;
        }
        
        /**
         * @param state Prefecture.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setState(@org.jetbrains.annotations.Nullable()
        java.lang.String state) {
            return null;
        }
        
        /**
         * @param town Town or cho-me.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AddressJapanParams.Builder setTown(@org.jetbrains.annotations.Nullable()
        java.lang.String town) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.AddressJapanParams build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/AddressJapanParams$Companion;", "", "()V", "PARAM_CITY", "", "PARAM_COUNTRY", "PARAM_LINE_1", "PARAM_LINE_2", "PARAM_POSTAL_CODE", "PARAM_STATE", "PARAM_TOWN", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
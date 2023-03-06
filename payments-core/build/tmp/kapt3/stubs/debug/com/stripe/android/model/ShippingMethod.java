package com.stripe.android.model;

import java.lang.System;

/**
 * Model representing a shipping method in the Android SDK.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tB3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006("}, d2 = {"Lcom/stripe/android/model/ShippingMethod;", "Lcom/stripe/android/model/StripeModel;", "label", "", "identifier", "amount", "", "currencyCode", "detail", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "currency", "Ljava/util/Currency;", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Currency;Ljava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/util/Currency;", "getDetail", "()Ljava/lang/String;", "getIdentifier", "getLabel", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class ShippingMethod implements com.stripe.android.model.StripeModel {
    
    /**
     * Human friendly label specifying the shipping method that can be shown in the UI.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    
    /**
     * Identifier for the shipping method.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String identifier = null;
    
    /**
     * The cost in minor unit based on [currency]
     */
    private final long amount = 0L;
    
    /**
     * The currency that the specified amount will be rendered in.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Currency currency = null;
    
    /**
     * Human friendly information such as estimated shipping times that can be shown in
     * the UI
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String detail = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.ShippingMethod> CREATOR = null;
    
    /**
     * Model representing a shipping method in the Android SDK.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.ShippingMethod copy(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String identifier, long amount, @org.jetbrains.annotations.NotNull()
    java.util.Currency currency, @org.jetbrains.annotations.Nullable()
    java.lang.String detail) {
        return null;
    }
    
    /**
     * Model representing a shipping method in the Android SDK.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model representing a shipping method in the Android SDK.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model representing a shipping method in the Android SDK.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String identifier, long amount, @org.jetbrains.annotations.NotNull()
    java.util.Currency currency) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String identifier, long amount, @org.jetbrains.annotations.NotNull()
    java.util.Currency currency, @org.jetbrains.annotations.Nullable()
    java.lang.String detail) {
        super();
    }
    
    /**
     * Human friendly label specifying the shipping method that can be shown in the UI.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Human friendly label specifying the shipping method that can be shown in the UI.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
    
    /**
     * Identifier for the shipping method.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Identifier for the shipping method.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdentifier() {
        return null;
    }
    
    /**
     * The cost in minor unit based on [currency]
     */
    public final long component3() {
        return 0L;
    }
    
    /**
     * The cost in minor unit based on [currency]
     */
    public final long getAmount() {
        return 0L;
    }
    
    /**
     * The currency that the specified amount will be rendered in.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Currency component4() {
        return null;
    }
    
    /**
     * The currency that the specified amount will be rendered in.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Currency getCurrency() {
        return null;
    }
    
    /**
     * Human friendly information such as estimated shipping times that can be shown in
     * the UI
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * Human friendly information such as estimated shipping times that can be shown in
     * the UI
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDetail() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String identifier, long amount, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 0L, max = 3L)
    java.lang.String currencyCode) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    java.lang.String identifier, long amount, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 0L, max = 3L)
    java.lang.String currencyCode, @org.jetbrains.annotations.Nullable()
    java.lang.String detail) {
        super();
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.ShippingMethod> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ShippingMethod createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.ShippingMethod[] newArray(int size) {
            return null;
        }
    }
}
package com.stripe.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(B+\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u00c6\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\"\u001a\u00020\tH\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/stripe/android/model/AccountRange;", "Lcom/stripe/android/model/StripeModel;", "binRange", "Lcom/stripe/android/model/BinRange;", "panLength", "", "brandInfo", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "country", "", "(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;)V", "getBinRange", "()Lcom/stripe/android/model/BinRange;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getBrandInfo", "()Lcom/stripe/android/model/AccountRange$BrandInfo;", "getCountry", "()Ljava/lang/String;", "getPanLength", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BrandInfo", "payments-core_debug"})
public final class AccountRange implements com.stripe.android.model.StripeModel {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.BinRange binRange = null;
    private final int panLength = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.AccountRange.BrandInfo brandInfo = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountRange> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.AccountRange copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BinRange binRange, int panLength, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountRange.BrandInfo brandInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String country) {
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
    
    public AccountRange(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.BinRange binRange, int panLength, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountRange.BrandInfo brandInfo, @org.jetbrains.annotations.Nullable()
    java.lang.String country) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.BinRange component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.BinRange getBinRange() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPanLength() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.AccountRange.BrandInfo component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.AccountRange.BrandInfo getBrandInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand getBrand() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountRange> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.AccountRange createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.AccountRange[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/AccountRange$BrandInfo;", "", "brandName", "", "brand", "Lcom/stripe/android/model/CardBrand;", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getBrandName", "()Ljava/lang/String;", "Visa", "Mastercard", "AmericanExpress", "JCB", "DinersClub", "Discover", "UnionPay", "payments-core_debug"})
    public static enum BrandInfo {
        /*public static final*/ Visa /* = new Visa(null, null) */,
        /*public static final*/ Mastercard /* = new Mastercard(null, null) */,
        /*public static final*/ AmericanExpress /* = new AmericanExpress(null, null) */,
        /*public static final*/ JCB /* = new JCB(null, null) */,
        /*public static final*/ DinersClub /* = new DinersClub(null, null) */,
        /*public static final*/ Discover /* = new Discover(null, null) */,
        /*public static final*/ UnionPay /* = new UnionPay(null, null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String brandName = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.CardBrand brand = null;
        
        BrandInfo(java.lang.String brandName, com.stripe.android.model.CardBrand brand) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBrandName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand getBrand() {
            return null;
        }
    }
}
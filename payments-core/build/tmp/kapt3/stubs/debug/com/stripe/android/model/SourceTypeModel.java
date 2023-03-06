package com.stripe.android.model;

import java.lang.System;

/**
 * Models for [Source] type-specific data
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel;", "Lcom/stripe/android/model/StripeModel;", "()V", "Card", "SepaDebit", "Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "payments-core_debug"})
public abstract class SourceTypeModel implements com.stripe.android.model.StripeModel {
    
    private SourceTypeModel() {
        super();
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001BB\u0093\u0001\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00102\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0002\u00105J\t\u00106\u001a\u00020\u000bH\u00d6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\t\u0010;\u001a\u00020\u000bH\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u000bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006C"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card;", "Lcom/stripe/android/model/SourceTypeModel;", "addressLine1Check", "", "addressZipCheck", "brand", "Lcom/stripe/android/model/CardBrand;", "country", "cvcCheck", "dynamicLast4", "expiryMonth", "", "expiryYear", "funding", "Lcom/stripe/android/model/CardFunding;", "last4", "threeDSecureStatus", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "tokenizationMethod", "Lcom/stripe/android/model/TokenizationMethod;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)V", "getAddressLine1Check", "()Ljava/lang/String;", "getAddressZipCheck", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCountry", "getCvcCheck", "getDynamicLast4", "getExpiryMonth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getExpiryYear", "getFunding", "()Lcom/stripe/android/model/CardFunding;", "getLast4", "getThreeDSecureStatus", "()Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/CardFunding;Ljava/lang/String;Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;Lcom/stripe/android/model/TokenizationMethod;)Lcom/stripe/android/model/SourceTypeModel$Card;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ThreeDSecureStatus", "payments-core_debug"})
    public static final class Card extends com.stripe.android.model.SourceTypeModel {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String addressLine1Check = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String addressZipCheck = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.CardBrand brand = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String country = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String cvcCheck = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String dynamicLast4 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer expiryMonth = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer expiryYear = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.CardFunding funding = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String last4 = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus threeDSecureStatus = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.TokenizationMethod tokenizationMethod = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceTypeModel.Card> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceTypeModel.Card copy(@org.jetbrains.annotations.Nullable()
        java.lang.String addressLine1Check, @org.jetbrains.annotations.Nullable()
        java.lang.String addressZipCheck, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String cvcCheck, @org.jetbrains.annotations.Nullable()
        java.lang.String dynamicLast4, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryYear, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.CardFunding funding, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus threeDSecureStatus, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.TokenizationMethod tokenizationMethod) {
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
        
        public Card(@org.jetbrains.annotations.Nullable()
        java.lang.String addressLine1Check, @org.jetbrains.annotations.Nullable()
        java.lang.String addressZipCheck, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String cvcCheck, @org.jetbrains.annotations.Nullable()
        java.lang.String dynamicLast4, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
        java.lang.Integer expiryYear, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.CardFunding funding, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus threeDSecureStatus, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.TokenizationMethod tokenizationMethod) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressLine1Check() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAddressZipCheck() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CardBrand getBrand() {
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
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCvcCheck() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDynamicLast4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExpiryMonth() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getExpiryYear() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.CardFunding component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.CardFunding getFunding() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus getThreeDSecureStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.TokenizationMethod component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.TokenizationMethod getTokenizationMethod() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceTypeModel.Card> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceTypeModel.Card createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceTypeModel.Card[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Required", "Optional", "NotSupported", "Recommended", "Unknown", "Companion", "payments-core_debug"})
        public static enum ThreeDSecureStatus {
            /*public static final*/ Required /* = new Required(null) */,
            /*public static final*/ Optional /* = new Optional(null) */,
            /*public static final*/ NotSupported /* = new NotSupported(null) */,
            /*public static final*/ Recommended /* = new Recommended(null) */,
            /*public static final*/ Unknown /* = new Unknown(null) */;
            private final java.lang.String code = null;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus.Companion Companion = null;
            
            ThreeDSecureStatus(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/SourceTypeModel$Card$ThreeDSecureStatus;", "code", "", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.SourceTypeModel.Card.ThreeDSecureStatus fromCode(@org.jetbrains.annotations.Nullable()
                java.lang.String code) {
                    return null;
                }
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001cH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006("}, d2 = {"Lcom/stripe/android/model/SourceTypeModel$SepaDebit;", "Lcom/stripe/android/model/SourceTypeModel;", "bankCode", "", "branchCode", "country", "fingerPrint", "last4", "mandateReference", "mandateUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankCode", "()Ljava/lang/String;", "getBranchCode", "getCountry", "getFingerPrint", "getLast4", "getMandateReference", "getMandateUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class SepaDebit extends com.stripe.android.model.SourceTypeModel {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String bankCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String branchCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String country = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String fingerPrint = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String last4 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String mandateReference = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String mandateUrl = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.SourceTypeModel.SepaDebit> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.SourceTypeModel.SepaDebit copy(@org.jetbrains.annotations.Nullable()
        java.lang.String bankCode, @org.jetbrains.annotations.Nullable()
        java.lang.String branchCode, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerPrint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateReference, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateUrl) {
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
        
        public SepaDebit(@org.jetbrains.annotations.Nullable()
        java.lang.String bankCode, @org.jetbrains.annotations.Nullable()
        java.lang.String branchCode, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String fingerPrint, @org.jetbrains.annotations.Nullable()
        java.lang.String last4, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateReference, @org.jetbrains.annotations.Nullable()
        java.lang.String mandateUrl) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBankCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBranchCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFingerPrint() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMandateReference() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMandateUrl() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.SourceTypeModel.SepaDebit> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceTypeModel.SepaDebit createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.SourceTypeModel.SepaDebit[] newArray(int size) {
                return null;
            }
        }
    }
}
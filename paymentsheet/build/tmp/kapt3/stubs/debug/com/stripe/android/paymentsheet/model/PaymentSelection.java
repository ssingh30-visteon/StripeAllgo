package com.stripe.android.paymentsheet.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Landroid/os/Parcelable;", "()V", "CustomerRequestedSave", "GooglePay", "New", "Saved", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "paymentsheet_debug"})
public abstract class PaymentSelection implements android.os.Parcelable {
    
    private PaymentSelection() {
        super();
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class GooglePay extends com.stripe.android.paymentsheet.model.PaymentSelection {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay> CREATOR = null;
        
        private GooglePay() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class Saved extends com.stripe.android.paymentsheet.model.PaymentSelection {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.PaymentMethod paymentMethod = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.Saved> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.model.PaymentSelection.Saved copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod) {
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
        
        public Saved(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.Saved> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.Saved createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.Saved[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "", "(Ljava/lang/String;I)V", "RequestReuse", "RequestNoReuse", "NoRequest", "paymentsheet_debug"})
    public static enum CustomerRequestedSave {
        /*public static final*/ RequestReuse /* = new RequestReuse() */,
        /*public static final*/ RequestNoReuse /* = new RequestNoReuse() */,
        /*public static final*/ NoRequest /* = new NoRequest() */;
        
        CustomerRequestedSave() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "()V", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "Card", "GenericPaymentMethod", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "paymentsheet_debug"})
    public static abstract class New extends com.stripe.android.paymentsheet.model.PaymentSelection {
        
        private New() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave getCustomerRequestedSave();
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "brand", "Lcom/stripe/android/model/CardBrand;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
        public static final class Card extends com.stripe.android.paymentsheet.model.PaymentSelection.New {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams = null;
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.CardBrand brand = null;
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave customerRequestedSave = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.New.Card> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.New.Card copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
            com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave customerRequestedSave) {
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
            
            public Card(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
            com.stripe.android.model.CardBrand brand, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave customerRequestedSave) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethodCreateParams component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.CardBrand component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.CardBrand getBrand() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave getCustomerRequestedSave() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.New.Card> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.paymentsheet.model.PaymentSelection.New.Card createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.paymentsheet.model.PaymentSelection.New.Card[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "labelResource", "", "iconResource", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "(IILcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;)V", "getCustomerRequestedSave", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "getIconResource", "()I", "getLabelResource", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
        public static final class GenericPaymentMethod extends com.stripe.android.paymentsheet.model.PaymentSelection.New {
            private final int labelResource = 0;
            private final int iconResource = 0;
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams = null;
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave customerRequestedSave = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.New.GenericPaymentMethod> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.New.GenericPaymentMethod copy(@androidx.annotation.StringRes()
            int labelResource, @androidx.annotation.DrawableRes()
            int iconResource, @org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave customerRequestedSave) {
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
            
            public GenericPaymentMethod(@androidx.annotation.StringRes()
            int labelResource, @androidx.annotation.DrawableRes()
            int iconResource, @org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethodCreateParams paymentMethodCreateParams, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave customerRequestedSave) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getLabelResource() {
                return 0;
            }
            
            public final int component2() {
                return 0;
            }
            
            public final int getIconResource() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethodCreateParams component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave getCustomerRequestedSave() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.PaymentSelection.New.GenericPaymentMethod> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.paymentsheet.model.PaymentSelection.New.GenericPaymentMethod createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.paymentsheet.model.PaymentSelection.New.GenericPaymentMethod[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}
package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003J\t\u0010 \u001a\u00020\u000eH\u00c6\u0003JM\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0013\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020#H\u00d6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "Landroid/os/Parcelable;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayReady", "", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Z)V", "getClientSecret", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "()Z", "getPaymentMethods", "()Ljava/util/List;", "getSavedSelection", "()Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
public final class InitData implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.PaymentSheet.Configuration config = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.model.ClientSecret clientSecret = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.StripeIntent stripeIntent = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.model.SavedSelection savedSelection = null;
    private final boolean isGooglePayReady = false;
    public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.flowcontroller.InitData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.flowcontroller.InitData copy(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SavedSelection savedSelection, boolean isGooglePayReady) {
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
    
    public InitData(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SavedSelection savedSelection, boolean isGooglePayReady) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentSheet.Configuration component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentSheet.Configuration getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.ClientSecret component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.ClientSecret getClientSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeIntent component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeIntent getStripeIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.PaymentMethod> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.PaymentMethod> getPaymentMethods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.SavedSelection component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.SavedSelection getSavedSelection() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isGooglePayReady() {
        return false;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.flowcontroller.InitData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.paymentsheet.flowcontroller.InitData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.paymentsheet.flowcontroller.InitData[] newArray(int size) {
            return null;
        }
    }
}
package com.stripe.android.paymentsheet.model;

import java.lang.System;

/**
 * Configuration data for [BaseAddPaymentMethodFragment] and [BasePaymentMethodsListFragment] and
 * their subclasses.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "Landroid/os/Parcelable;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "isGooglePayReady", "", "savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "(Lcom/stripe/android/model/StripeIntent;ZLcom/stripe/android/paymentsheet/model/SavedSelection;)V", "()Z", "getSavedSelection", "()Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
public final class FragmentConfig implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.StripeIntent stripeIntent = null;
    private final boolean isGooglePayReady = false;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.model.SavedSelection savedSelection = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.FragmentConfig> CREATOR = null;
    
    /**
     * Configuration data for [BaseAddPaymentMethodFragment] and [BasePaymentMethodsListFragment] and
     * their subclasses.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.FragmentConfig copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, boolean isGooglePayReady, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SavedSelection savedSelection) {
        return null;
    }
    
    /**
     * Configuration data for [BaseAddPaymentMethodFragment] and [BasePaymentMethodsListFragment] and
     * their subclasses.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Configuration data for [BaseAddPaymentMethodFragment] and [BasePaymentMethodsListFragment] and
     * their subclasses.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Configuration data for [BaseAddPaymentMethodFragment] and [BasePaymentMethodsListFragment] and
     * their subclasses.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public FragmentConfig(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, boolean isGooglePayReady, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SavedSelection savedSelection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeIntent component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.StripeIntent getStripeIntent() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isGooglePayReady() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.SavedSelection component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.SavedSelection getSavedSelection() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.model.FragmentConfig> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.paymentsheet.model.FragmentConfig createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.paymentsheet.model.FragmentConfig[] newArray(int size) {
            return null;
        }
    }
}
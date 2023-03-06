package com.stripe.android;

import java.lang.System;

/**
 * A data class representing the state of the associated [PaymentSession].
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004BY\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0006H\u00c2\u0003J\t\u0010 \u001a\u00020\u0006H\u00c2\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J_\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0006H\u00c6\u0001J\t\u0010(\u001a\u00020)H\u00d6\u0001J\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020)H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\u00a8\u00065"}, d2 = {"Lcom/stripe/android/PaymentSessionData;", "Landroid/os/Parcelable;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "(Lcom/stripe/android/PaymentSessionConfig;)V", "isShippingInfoRequired", "", "isShippingMethodRequired", "cartTotal", "", "shippingTotal", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "useGooglePay", "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V", "getCartTotal", "()J", "isPaymentReadyToCharge", "()Z", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "getShippingTotal", "getUseGooglePay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class PaymentSessionData implements android.os.Parcelable {
    private final boolean isShippingInfoRequired = false;
    private final boolean isShippingMethodRequired = false;
    
    /**
     * The cart total value, excluding shipping and tax items.
     */
    private final long cartTotal = 0L;
    
    /**
     * The current value of the shipping items in the associated [PaymentSession]
     */
    private final long shippingTotal = 0L;
    
    /**
     * Where the items being purchased should be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.ShippingInformation shippingInformation = null;
    
    /**
     * How the items being purchased should be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.ShippingMethod shippingMethod = null;
    
    /**
     * The selected payment method for the associated [PaymentSession].
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PaymentMethod paymentMethod = null;
    
    /**
     * When `true`, the customer has indicated their intent to pay with Google Pay. Use the
     * [Google Pay API](https://developers.google.com/pay/api/android/overview) to complete
     * payment with Google Pay.
     */
    private final boolean useGooglePay = false;
    public static final android.os.Parcelable.Creator<com.stripe.android.PaymentSessionData> CREATOR = null;
    
    /**
     * A data class representing the state of the associated [PaymentSession].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionData copy(boolean isShippingInfoRequired, boolean isShippingMethodRequired, long cartTotal, long shippingTotal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingMethod shippingMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod paymentMethod, boolean useGooglePay) {
        return null;
    }
    
    /**
     * A data class representing the state of the associated [PaymentSession].
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A data class representing the state of the associated [PaymentSession].
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A data class representing the state of the associated [PaymentSession].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaymentSessionData(boolean isShippingInfoRequired, boolean isShippingMethodRequired, long cartTotal, long shippingTotal, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingMethod shippingMethod, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethod paymentMethod, boolean useGooglePay) {
        super();
    }
    
    private final boolean component1() {
        return false;
    }
    
    private final boolean component2() {
        return false;
    }
    
    /**
     * The cart total value, excluding shipping and tax items.
     */
    public final long component3() {
        return 0L;
    }
    
    /**
     * The cart total value, excluding shipping and tax items.
     */
    public final long getCartTotal() {
        return 0L;
    }
    
    /**
     * The current value of the shipping items in the associated [PaymentSession]
     */
    public final long component4() {
        return 0L;
    }
    
    /**
     * The current value of the shipping items in the associated [PaymentSession]
     */
    public final long getShippingTotal() {
        return 0L;
    }
    
    /**
     * Where the items being purchased should be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation component5() {
        return null;
    }
    
    /**
     * Where the items being purchased should be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getShippingInformation() {
        return null;
    }
    
    /**
     * How the items being purchased should be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingMethod component6() {
        return null;
    }
    
    /**
     * How the items being purchased should be shipped.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingMethod getShippingMethod() {
        return null;
    }
    
    /**
     * The selected payment method for the associated [PaymentSession].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod component7() {
        return null;
    }
    
    /**
     * The selected payment method for the associated [PaymentSession].
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
        return null;
    }
    
    /**
     * When `true`, the customer has indicated their intent to pay with Google Pay. Use the
     * [Google Pay API](https://developers.google.com/pay/api/android/overview) to complete
     * payment with Google Pay.
     */
    public final boolean component8() {
        return false;
    }
    
    /**
     * When `true`, the customer has indicated their intent to pay with Google Pay. Use the
     * [Google Pay API](https://developers.google.com/pay/api/android/overview) to complete
     * payment with Google Pay.
     */
    public final boolean getUseGooglePay() {
        return false;
    }
    
    public PaymentSessionData(@org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig config) {
        super();
    }
    
    public final boolean isPaymentReadyToCharge() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentSessionData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.PaymentSessionData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.PaymentSessionData[] newArray(int size) {
            return null;
        }
    }
}
package com.stripe.android.paymentsheet;

import java.lang.System;

/**
 * The result of an attempt to confirm a [PaymentIntent] or [SetupIntent].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Landroid/os/Parcelable;", "()V", "Canceled", "Completed", "Failed", "Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;", "paymentsheet_debug"})
public abstract class PaymentSheetResult implements android.os.Parcelable {
    
    private PaymentSheetResult() {
        super();
    }
    
    /**
     * The customer completed the payment or setup.
     * The payment may still be processing at this point; don't assume money has successfully moved.
     *
     * Your app should transition to a generic receipt view (e.g. a screen that displays "Your order
     * is confirmed!"), and fulfill the order (e.g. ship the product to the customer) after
     * receiving a successful payment event from Stripe.
     *
     * See [Stripe's documentation](https://stripe.com/docs/payments/handling-payment-events)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class Completed extends com.stripe.android.paymentsheet.PaymentSheetResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.PaymentSheetResult.Completed INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetResult.Completed> CREATOR = null;
        
        private Completed() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetResult.Completed> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetResult.Completed createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetResult.Completed[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The customer canceled the payment or setup attempt.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class Canceled extends com.stripe.android.paymentsheet.PaymentSheetResult {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.PaymentSheetResult.Canceled INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetResult.Canceled> CREATOR = null;
        
        private Canceled() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetResult.Canceled> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetResult.Canceled createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetResult.Canceled[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The payment or setup attempt failed.
     * @param error The error encountered by the customer.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class Failed extends com.stripe.android.paymentsheet.PaymentSheetResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable error = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetResult.Failed> CREATOR = null;
        
        /**
         * The payment or setup attempt failed.
         * @param error The error encountered by the customer.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheetResult.Failed copy(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            return null;
        }
        
        /**
         * The payment or setup attempt failed.
         * @param error The error encountered by the customer.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The payment or setup attempt failed.
         * @param error The error encountered by the customer.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The payment or setup attempt failed.
         * @param error The error encountered by the customer.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Failed(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getError() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetResult.Failed> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetResult.Failed createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetResult.Failed[] newArray(int size) {
                return null;
            }
        }
    }
}
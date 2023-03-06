package com.stripe.android.view;

import java.lang.System;

/**
 * A class to start [PaymentMethodsActivity]. Arguments for the activity can be specified
 * with [Args] and constructed with [Args.Builder].
 *
 * The result data is a [Result] instance, obtained using [Result.fromIntent]}.
 * The result will be returned with request code [REQUEST_CODE].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\n\u000b\fB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentMethodsActivity;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "Args", "Companion", "Result", "payments-core_debug"})
public final class PaymentMethodsActivityStarter extends com.stripe.android.view.ActivityStarter<com.stripe.android.view.PaymentMethodsActivity, com.stripe.android.view.PaymentMethodsActivityStarter.Args> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentMethodsActivityStarter.Companion Companion = null;
    public static final int REQUEST_CODE = 6000;
    
    public PaymentMethodsActivityStarter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super(null, null, 0, null);
    }
    
    public PaymentMethodsActivityStarter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super(null, null, 0, null);
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002IJBw\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b)J\u000e\u0010*\u001a\u00020\bH\u00c0\u0003\u00a2\u0006\u0002\b+J\u000e\u0010,\u001a\u00020\bH\u00c0\u0003\u00a2\u0006\u0002\b-J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u000e\u00100\u001a\u00020\bH\u00c0\u0003\u00a2\u0006\u0002\b1J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c0\u0003\u00a2\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\rH\u00c0\u0003\u00a2\u0006\u0002\b5J\u0012\u00106\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0004\b7\u0010&J\u000e\u00108\u001a\u00020\u0010H\u00c0\u0003\u00a2\u0006\u0002\b9J\u000e\u0010:\u001a\u00020\bH\u00c0\u0003\u00a2\u0006\u0002\b;J\u0088\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010=J\t\u0010>\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010AH\u00d6\u0003J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0014\u0010\u0011\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010\u0012\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b%\u0010&\u00a8\u0006K"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "initialPaymentMethodId", "", "paymentMethodsFooterLayoutId", "", "addPaymentMethodFooterLayoutId", "isPaymentSessionActive", "", "paymentMethodTypes", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "windowFlags", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "shouldShowGooglePay", "useGooglePay", "canDeletePaymentMethods", "(Ljava/lang/String;IIZLjava/util/List;Lcom/stripe/android/PaymentConfiguration;Ljava/lang/Integer;Lcom/stripe/android/view/BillingAddressFields;ZZZ)V", "getAddPaymentMethodFooterLayoutId", "()I", "getBillingAddressFields$payments_core_debug", "()Lcom/stripe/android/view/BillingAddressFields;", "getCanDeletePaymentMethods$payments_core_debug", "()Z", "getInitialPaymentMethodId$payments_core_debug", "()Ljava/lang/String;", "isPaymentSessionActive$payments_core_debug", "getPaymentConfiguration$payments_core_debug", "()Lcom/stripe/android/PaymentConfiguration;", "getPaymentMethodTypes$payments_core_debug", "()Ljava/util/List;", "getPaymentMethodsFooterLayoutId", "getShouldShowGooglePay$payments_core_debug", "getUseGooglePay$payments_core_debug", "getWindowFlags$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$payments_core_debug", "component10", "component10$payments_core_debug", "component11", "component11$payments_core_debug", "component2", "component3", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component7$payments_core_debug", "component8", "component8$payments_core_debug", "component9", "component9$payments_core_debug", "copy", "(Ljava/lang/String;IIZLjava/util/List;Lcom/stripe/android/PaymentConfiguration;Ljava/lang/Integer;Lcom/stripe/android/view/BillingAddressFields;ZZZ)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class Args implements com.stripe.android.view.ActivityStarter.Args {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String initialPaymentMethodId = null;
        private final int paymentMethodsFooterLayoutId = 0;
        private final int addPaymentMethodFooterLayoutId = 0;
        private final boolean isPaymentSessionActive = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.PaymentConfiguration paymentConfiguration = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer windowFlags = null;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.view.BillingAddressFields billingAddressFields = null;
        private final boolean shouldShowGooglePay = false;
        private final boolean useGooglePay = false;
        private final boolean canDeletePaymentMethods = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.PaymentMethodsActivityStarter.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.PaymentMethodsActivityStarter.Args copy(@org.jetbrains.annotations.Nullable()
        java.lang.String initialPaymentMethodId, @androidx.annotation.LayoutRes()
        int paymentMethodsFooterLayoutId, @androidx.annotation.LayoutRes()
        int addPaymentMethodFooterLayoutId, boolean isPaymentSessionActive, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes, @org.jetbrains.annotations.Nullable()
        com.stripe.android.PaymentConfiguration paymentConfiguration, @org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.BillingAddressFields billingAddressFields, boolean shouldShowGooglePay, boolean useGooglePay, boolean canDeletePaymentMethods) {
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
        
        public Args(@org.jetbrains.annotations.Nullable()
        java.lang.String initialPaymentMethodId, @androidx.annotation.LayoutRes()
        int paymentMethodsFooterLayoutId, @androidx.annotation.LayoutRes()
        int addPaymentMethodFooterLayoutId, boolean isPaymentSessionActive, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes, @org.jetbrains.annotations.Nullable()
        com.stripe.android.PaymentConfiguration paymentConfiguration, @org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.BillingAddressFields billingAddressFields, boolean shouldShowGooglePay, boolean useGooglePay, boolean canDeletePaymentMethods) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getInitialPaymentMethodId$payments_core_debug() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getPaymentMethodsFooterLayoutId() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getAddPaymentMethodFooterLayoutId() {
            return 0;
        }
        
        public final boolean component4$payments_core_debug() {
            return false;
        }
        
        public final boolean isPaymentSessionActive$payments_core_debug() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.PaymentMethod.Type> component5$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.PaymentMethod.Type> getPaymentMethodTypes$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.PaymentConfiguration component6$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.PaymentConfiguration getPaymentConfiguration$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWindowFlags$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.BillingAddressFields component8$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.BillingAddressFields getBillingAddressFields$payments_core_debug() {
            return null;
        }
        
        public final boolean component9$payments_core_debug() {
            return false;
        }
        
        public final boolean getShouldShowGooglePay$payments_core_debug() {
            return false;
        }
        
        public final boolean component10$payments_core_debug() {
            return false;
        }
        
        public final boolean getUseGooglePay$payments_core_debug() {
            return false;
        }
        
        public final boolean component11$payments_core_debug() {
            return false;
        }
        
        public final boolean getCanDeletePaymentMethods$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.PaymentMethodsActivityStarter.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010$R\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "()V", "addPaymentMethodFooterLayoutId", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "canDeletePaymentMethods", "", "initialPaymentMethodId", "", "isPaymentSessionActive", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "paymentMethodTypes", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodsFooterLayoutId", "shouldShowGooglePay", "useGooglePay", "windowFlags", "Ljava/lang/Integer;", "build", "setAddPaymentMethodFooter", "setBillingAddressFields", "setCanDeletePaymentMethods", "setInitialPaymentMethodId", "setIsPaymentSessionActive", "setPaymentConfiguration", "setPaymentMethodTypes", "setPaymentMethodsFooter", "setShouldShowGooglePay", "setUseGooglePay", "setUseGooglePay$payments_core_debug", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.view.PaymentMethodsActivityStarter.Args> {
            private com.stripe.android.view.BillingAddressFields billingAddressFields = com.stripe.android.view.BillingAddressFields.PostalCode;
            private java.lang.String initialPaymentMethodId;
            private boolean isPaymentSessionActive = false;
            private java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes;
            private boolean shouldShowGooglePay = false;
            private boolean useGooglePay = false;
            private boolean canDeletePaymentMethods = true;
            private com.stripe.android.PaymentConfiguration paymentConfiguration;
            private java.lang.Integer windowFlags;
            @androidx.annotation.LayoutRes()
            private int paymentMethodsFooterLayoutId = 0;
            @androidx.annotation.LayoutRes()
            private int addPaymentMethodFooterLayoutId = 0;
            
            public Builder() {
                super();
            }
            
            /**
             * @param billingAddressFields the billing address fields to require on [AddPaymentMethodActivity]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setBillingAddressFields(@org.jetbrains.annotations.NotNull()
            com.stripe.android.view.BillingAddressFields billingAddressFields) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setInitialPaymentMethodId(@org.jetbrains.annotations.Nullable()
            java.lang.String initialPaymentMethodId) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setIsPaymentSessionActive(boolean isPaymentSessionActive) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setPaymentConfiguration(@org.jetbrains.annotations.Nullable()
            com.stripe.android.PaymentConfiguration paymentConfiguration) {
                return null;
            }
            
            /**
             * @param paymentMethodTypes a list of [PaymentMethod.Type] that indicates the types of
             * Payment Methods that the customer can select or add via Stripe UI components.
             *
             * The order of the [PaymentMethod.Type] values in the list will be used to
             * arrange the add buttons in the Stripe UI components. They will be arranged vertically
             * from first to last.
             *
             * Currently only [PaymentMethod.Type.Card] and [PaymentMethod.Type.Fpx] are supported.
             * If not specified or empty, [PaymentMethod.Type.Card] will be used.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setPaymentMethodTypes(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes) {
                return null;
            }
            
            /**
             * @param shouldShowGooglePay if `true`, will show "Google Pay" as an option on the
             * Payment Methods selection screen. If a user selects the Google Pay option,
             * [PaymentMethodsActivityStarter.Result.useGooglePay] will be `true`.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setShouldShowGooglePay(boolean shouldShowGooglePay) {
                return null;
            }
            
            /**
             * @param paymentMethodsFooterLayoutId optional layout id that will be inflated and
             * displayed beneath the payment method selection list on [PaymentMethodsActivity]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setPaymentMethodsFooter(@androidx.annotation.LayoutRes()
            int paymentMethodsFooterLayoutId) {
                return null;
            }
            
            /**
             * @param addPaymentMethodFooterLayoutId optional layout id that will be inflated and
             * displayed beneath the payment details collection form on [AddPaymentMethodActivity]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setAddPaymentMethodFooter(@androidx.annotation.LayoutRes()
            int addPaymentMethodFooterLayoutId) {
                return null;
            }
            
            /**
             * @param windowFlags optional flags to set on the `Window` object of Stripe Activities
             *
             * See [WindowManager.LayoutParams](https://developer.android.com/reference/android/view/WindowManager.LayoutParams)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setWindowFlags(@org.jetbrains.annotations.Nullable()
            java.lang.Integer windowFlags) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setUseGooglePay$payments_core_debug(boolean useGooglePay) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Args.Builder setCanDeletePaymentMethods(boolean canDeletePaymentMethods) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.view.PaymentMethodsActivityStarter.Args build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "intent", "Landroid/content/Intent;", "create$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * The result of a [PaymentMethodsActivity].
     *
     * Retrieve in `#onActivityResult()` using [fromIntent].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\rH\u00d6\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u00d6\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "useGooglePay", "", "(Lcom/stripe/android/model/PaymentMethod;Z)V", "getUseGooglePay", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Result implements com.stripe.android.view.ActivityStarter.Result {
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmField()
        public final com.stripe.android.model.PaymentMethod paymentMethod = null;
        private final boolean useGooglePay = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.PaymentMethodsActivityStarter.Result.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.PaymentMethodsActivityStarter.Result> CREATOR = null;
        
        /**
         * The result of a [PaymentMethodsActivity].
         *
         * Retrieve in `#onActivityResult()` using [fromIntent].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.PaymentMethodsActivityStarter.Result copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, boolean useGooglePay) {
            return null;
        }
        
        /**
         * The result of a [PaymentMethodsActivity].
         *
         * Retrieve in `#onActivityResult()` using [fromIntent].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The result of a [PaymentMethodsActivity].
         *
         * Retrieve in `#onActivityResult()` using [fromIntent].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The result of a [PaymentMethodsActivity].
         *
         * Retrieve in `#onActivityResult()` using [fromIntent].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Result() {
            super();
        }
        
        public Result(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PaymentMethod paymentMethod, boolean useGooglePay) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PaymentMethod component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getUseGooglePay() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.os.Bundle toBundle() {
            return null;
        }
        
        /**
         * @return the [Result] object from the given `Intent`
         */
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public static final com.stripe.android.view.PaymentMethodsActivityStarter.Result fromIntent(@org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.PaymentMethodsActivityStarter.Result> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Result createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Result[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * @return the [Result] object from the given `Intent`
             */
            @org.jetbrains.annotations.Nullable()
            @kotlin.jvm.JvmStatic()
            public final com.stripe.android.view.PaymentMethodsActivityStarter.Result fromIntent(@org.jetbrains.annotations.Nullable()
            android.content.Intent intent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Companion;", "", "()V", "REQUEST_CODE", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
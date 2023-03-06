package com.stripe.android.view;

import java.lang.System;

/**
 * A class to start [AddPaymentMethodActivity]. Arguments for the activity can be
 * specified with [Args] and constructed with [Args.Builder].
 *
 * The result will be returned with request code [REQUEST_CODE].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\n\u000b\fB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "Args", "Companion", "Result", "payments-core_debug"})
public final class AddPaymentMethodActivityStarter extends com.stripe.android.view.ActivityStarter<com.stripe.android.view.AddPaymentMethodActivity, com.stripe.android.view.AddPaymentMethodActivityStarter.Args> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.AddPaymentMethodActivityStarter.Companion Companion = null;
    public static final int REQUEST_CODE = 6001;
    
    public AddPaymentMethodActivityStarter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super(null, null, 0, null);
    }
    
    public AddPaymentMethodActivityStarter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super(null, null, 0, null);
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:BG\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001d\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b J\u000e\u0010!\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\bH\u00c0\u0003\u00a2\u0006\u0002\b$J\u0010\u0010%\u001a\u0004\u0018\u00010\nH\u00c0\u0003\u00a2\u0006\u0002\b&J\u000e\u0010\'\u001a\u00020\fH\u00c0\u0003\u00a2\u0006\u0002\b(J\u0012\u0010)\u001a\u0004\u0018\u00010\fH\u00c0\u0003\u00a2\u0006\u0004\b*\u0010\u001bJX\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010,J\t\u0010-\u001a\u00020\fH\u00d6\u0001J\u0013\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\fH\u00d6\u0001J\t\u00102\u001a\u000203H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\fH\u00d6\u0001R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\fX\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006;"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "shouldAttachToCustomer", "", "isPaymentSessionActive", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "addPaymentMethodFooterLayoutId", "", "windowFlags", "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V", "getAddPaymentMethodFooterLayoutId$payments_core_debug", "()I", "getBillingAddressFields$payments_core_debug", "()Lcom/stripe/android/view/BillingAddressFields;", "isPaymentSessionActive$payments_core_debug", "()Z", "getPaymentConfiguration$payments_core_debug", "()Lcom/stripe/android/PaymentConfiguration;", "getPaymentMethodType$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod$Type;", "getShouldAttachToCustomer$payments_core_debug", "getWindowFlags$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component7$payments_core_debug", "copy", "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class Args implements com.stripe.android.view.ActivityStarter.Args {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.view.BillingAddressFields billingAddressFields = null;
        private final boolean shouldAttachToCustomer = false;
        private final boolean isPaymentSessionActive = false;
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.PaymentMethod.Type paymentMethodType = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.PaymentConfiguration paymentConfiguration = null;
        private final int addPaymentMethodFooterLayoutId = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer windowFlags = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.AddPaymentMethodActivityStarter.Args.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.BillingAddressFields billingAddressFields, boolean shouldAttachToCustomer, boolean isPaymentSessionActive, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
        com.stripe.android.PaymentConfiguration paymentConfiguration, @androidx.annotation.LayoutRes()
        int addPaymentMethodFooterLayoutId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags) {
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
        
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.BillingAddressFields billingAddressFields, boolean shouldAttachToCustomer, boolean isPaymentSessionActive, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod.Type paymentMethodType, @org.jetbrains.annotations.Nullable()
        com.stripe.android.PaymentConfiguration paymentConfiguration, @androidx.annotation.LayoutRes()
        int addPaymentMethodFooterLayoutId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.BillingAddressFields component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.BillingAddressFields getBillingAddressFields$payments_core_debug() {
            return null;
        }
        
        public final boolean component2$payments_core_debug() {
            return false;
        }
        
        public final boolean getShouldAttachToCustomer$payments_core_debug() {
            return false;
        }
        
        public final boolean component3$payments_core_debug() {
            return false;
        }
        
        public final boolean isPaymentSessionActive$payments_core_debug() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Type component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PaymentMethod.Type getPaymentMethodType$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.PaymentConfiguration component5$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.PaymentConfiguration getPaymentConfiguration$payments_core_debug() {
            return null;
        }
        
        public final int component6$payments_core_debug() {
            return 0;
        }
        
        public final int getAddPaymentMethodFooterLayoutId$payments_core_debug() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component7$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWindowFlags$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u0015J\u0012\u0010\u0016\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\tJ\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001aR\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "()V", "addPaymentMethodFooterLayoutId", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "isPaymentSessionActive", "", "paymentConfiguration", "Lcom/stripe/android/PaymentConfiguration;", "paymentMethodType", "Lcom/stripe/android/model/PaymentMethod$Type;", "shouldAttachToCustomer", "windowFlags", "Ljava/lang/Integer;", "build", "setAddPaymentMethodFooter", "setBillingAddressFields", "setIsPaymentSessionActive", "setIsPaymentSessionActive$payments_core_debug", "setPaymentConfiguration", "setPaymentMethodType", "setShouldAttachToCustomer", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.view.AddPaymentMethodActivityStarter.Args> {
            private com.stripe.android.view.BillingAddressFields billingAddressFields = com.stripe.android.view.BillingAddressFields.PostalCode;
            private boolean shouldAttachToCustomer = false;
            private boolean isPaymentSessionActive = false;
            private com.stripe.android.model.PaymentMethod.Type paymentMethodType = com.stripe.android.model.PaymentMethod.Type.Card;
            private com.stripe.android.PaymentConfiguration paymentConfiguration;
            private java.lang.Integer windowFlags;
            @androidx.annotation.LayoutRes()
            private int addPaymentMethodFooterLayoutId = 0;
            
            public Builder() {
                super();
            }
            
            /**
             * If true, the created Payment Method will be attached to the current Customer
             * using an already-initialized [com.stripe.android.CustomerSession].
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args.Builder setShouldAttachToCustomer(boolean shouldAttachToCustomer) {
                return null;
            }
            
            /**
             * @param billingAddressFields the billing address fields to require on [AddPaymentMethodActivity]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args.Builder setBillingAddressFields(@org.jetbrains.annotations.NotNull()
            com.stripe.android.view.BillingAddressFields billingAddressFields) {
                return null;
            }
            
            /**
             * Optional: specify the [PaymentMethod.Type] of the payment method to create based on
             * the customer's input (i.e. the form that will be presented to the customer).
             * If unspecified, defaults to [PaymentMethod.Type.Card].
             * Currently only [PaymentMethod.Type.Card] and [PaymentMethod.Type.Fpx] are supported.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args.Builder setPaymentMethodType(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod.Type paymentMethodType) {
                return null;
            }
            
            /**
             * @param addPaymentMethodFooterLayoutId optional layout id that will be inflated and
             * displayed beneath the payment details collection form on [AddPaymentMethodActivity]
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args.Builder setAddPaymentMethodFooter(@androidx.annotation.LayoutRes()
            int addPaymentMethodFooterLayoutId) {
                return null;
            }
            
            /**
             * @param windowFlags optional flags to set on the `Window` object of Stripe Activities
             *
             * See [WindowManager.LayoutParams](https://developer.android.com/reference/android/view/WindowManager.LayoutParams)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args.Builder setWindowFlags(@org.jetbrains.annotations.Nullable()
            java.lang.Integer windowFlags) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.view.AddPaymentMethodActivityStarter.Args build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "intent", "Landroid/content/Intent;", "create$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * The result of a [AddPaymentMethodActivity].
     *
     * Retrieve in `#onActivityResult()` using [fromIntent].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "()V", "toBundle", "Landroid/os/Bundle;", "Canceled", "Companion", "Failure", "Success", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Failure;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Canceled;", "payments-core_debug"})
    public static abstract class Result implements com.stripe.android.view.ActivityStarter.Result {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Companion Companion = null;
        
        private Result() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.os.Bundle toBundle() {
            return null;
        }
        
        /**
         * @return the [Result] object from the given `Intent`. [Canceled] by default.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static final com.stripe.android.view.AddPaymentMethodActivityStarter.Result fromIntent(@org.jetbrains.annotations.Nullable()
        android.content.Intent intent) {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Success extends com.stripe.android.view.AddPaymentMethodActivityStarter.Result {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentMethod paymentMethod = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Success> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Success copy(@org.jetbrains.annotations.NotNull()
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
            
            public Success(@org.jetbrains.annotations.NotNull()
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Success> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Success createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Success[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Failure;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Failure extends com.stripe.android.view.AddPaymentMethodActivityStarter.Result {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable exception = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Failure> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Failure copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable exception) {
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
            
            public Failure(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable exception) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getException() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Failure> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Failure createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Failure[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Canceled;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class Canceled extends com.stripe.android.view.AddPaymentMethodActivityStarter.Result {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Canceled INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Canceled> CREATOR = null;
            
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Canceled> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Canceled createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Canceled[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "intent", "Landroid/content/Intent;", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * @return the [Result] object from the given `Intent`. [Canceled] by default.
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result fromIntent(@org.jetbrains.annotations.Nullable()
            android.content.Intent intent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Companion;", "", "()V", "REQUEST_CODE", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
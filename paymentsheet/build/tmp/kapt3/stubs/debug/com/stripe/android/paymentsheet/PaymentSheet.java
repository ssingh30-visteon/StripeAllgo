package com.stripe.android.paymentsheet;

import java.lang.System;

/**
 * A drop-in class that presents a bottom sheet to collect and process a customer's payment.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u000f\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet;", "", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "paymentSheetLauncher", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V", "presentWithPaymentIntent", "", "paymentIntentClientSecret", "", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "presentWithSetupIntent", "setupIntentClientSecret", "Address", "BillingDetails", "Configuration", "CustomerConfiguration", "FlowController", "GooglePayConfiguration", "paymentsheet_debug"})
public final class PaymentSheet {
    private final com.stripe.android.paymentsheet.PaymentSheetLauncher paymentSheetLauncher = null;
    
    public PaymentSheet(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetLauncher paymentSheetLauncher) {
        super();
    }
    
    /**
     * Constructor to be used when launching the payment sheet from an Activity.
     *
     * @param activity  the Activity that is presenting the payment sheet.
     * @param callback  called with the result of the payment after the payment sheet is dismissed.
     */
    public PaymentSheet(@org.jetbrains.annotations.NotNull()
    androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback callback) {
        super();
    }
    
    /**
     * Constructor to be used when launching the payment sheet from a Fragment.
     *
     * @param fragment the Fragment that is presenting the payment sheet.
     * @param callback called with the result of the payment after the payment sheet is dismissed.
     */
    public PaymentSheet(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResultCallback callback) {
        super();
    }
    
    /**
     * Present the payment sheet to process a [PaymentIntent].
     * If the [PaymentIntent] is already confirmed, [PaymentSheetResultCallback] will be invoked
     * with [PaymentSheetResult.Completed].
     *
     * @param paymentIntentClientSecret the client secret for the [PaymentIntent].
     * @param configuration optional [PaymentSheet] settings.
     */
    @kotlin.jvm.JvmOverloads()
    public final void presentWithPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentClientSecret) {
    }
    
    /**
     * Present the payment sheet to process a [PaymentIntent].
     * If the [PaymentIntent] is already confirmed, [PaymentSheetResultCallback] will be invoked
     * with [PaymentSheetResult.Completed].
     *
     * @param paymentIntentClientSecret the client secret for the [PaymentIntent].
     * @param configuration optional [PaymentSheet] settings.
     */
    @kotlin.jvm.JvmOverloads()
    public final void presentWithPaymentIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration) {
    }
    
    /**
     * Present the payment sheet to process a [SetupIntent].
     * If the [SetupIntent] is already confirmed, [PaymentSheetResultCallback] will be invoked
     * with [PaymentSheetResult.Completed].
     *
     * @param setupIntentClientSecret the client secret for the [SetupIntent].
     * @param configuration optional [PaymentSheet] settings.
     */
    @kotlin.jvm.JvmOverloads()
    public final void presentWithSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentClientSecret) {
    }
    
    /**
     * Present the payment sheet to process a [SetupIntent].
     * If the [SetupIntent] is already confirmed, [PaymentSheetResultCallback] will be invoked
     * with [PaymentSheetResult.Completed].
     *
     * @param setupIntentClientSecret the client secret for the [SetupIntent].
     * @param configuration optional [PaymentSheet] settings.
     */
    @kotlin.jvm.JvmOverloads()
    public final void presentWithSetupIntent(@org.jetbrains.annotations.NotNull()
    java.lang.String setupIntentClientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration) {
    }
    
    /**
     * Configuration for [PaymentSheet]
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020#H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "Landroid/os/Parcelable;", "merchantDisplayName", "", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "allowsDelayedPaymentMethods", "", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Landroid/content/res/ColorStateList;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Z)V", "getAllowsDelayedPaymentMethods", "()Z", "getCustomer", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getGooglePay", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getMerchantDisplayName", "()Ljava/lang/String;", "getPrimaryButtonColor", "()Landroid/content/res/ColorStateList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_debug"})
    public static final class Configuration implements android.os.Parcelable {
        
        /**
         * Your customer-facing business name.
         *
         * The default value is the name of your app.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String merchantDisplayName = null;
        
        /**
         * If set, the customer can select a previously saved payment method within PaymentSheet.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer = null;
        
        /**
         * Configuration related to the Stripe Customer making a payment.
         *
         * If set, PaymentSheet displays Google Pay as a payment option.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay = null;
        
        /**
         * The color of the Pay or Add button. Keep in mind the text color is white.
         *
         * If set, PaymentSheet displays the button with this color.
         */
        @org.jetbrains.annotations.Nullable()
        private final android.content.res.ColorStateList primaryButtonColor = null;
        
        /**
         * The billing information for the customer.
         *
         * If set, PaymentSheet will pre-populate the form fields with the values provided.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails defaultBillingDetails = null;
        
        /**
         * If true, allows payment methods that do not move money at the end of the checkout.
         * Defaults to false.
         *
         * Some payment methods can't guarantee you will receive funds from your customer at the end
         * of the checkout because they take time to settle (eg. most bank debits, like SEPA or ACH)
         * or require customer action to complete (e.g. OXXO, Konbini, Boleto). If this is set to
         * true, make sure your integration listens to webhooks for notifications on whether a
         * payment has succeeded or not.
         *
         * See [payment-notification](https://stripe.com/docs/payments/payment-methods#payment-notification).
         */
        private final boolean allowsDelayedPaymentMethods = false;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.Configuration> CREATOR = null;
        
        /**
         * Configuration for [PaymentSheet]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration copy(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay, @org.jetbrains.annotations.Nullable()
        android.content.res.ColorStateList primaryButtonColor, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.BillingDetails defaultBillingDetails, boolean allowsDelayedPaymentMethods) {
            return null;
        }
        
        /**
         * Configuration for [PaymentSheet]
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Configuration for [PaymentSheet]
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Configuration for [PaymentSheet]
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public Configuration(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Configuration(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Configuration(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Configuration(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay, @org.jetbrains.annotations.Nullable()
        android.content.res.ColorStateList primaryButtonColor) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Configuration(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay, @org.jetbrains.annotations.Nullable()
        android.content.res.ColorStateList primaryButtonColor, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.BillingDetails defaultBillingDetails) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Configuration(@org.jetbrains.annotations.NotNull()
        java.lang.String merchantDisplayName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay, @org.jetbrains.annotations.Nullable()
        android.content.res.ColorStateList primaryButtonColor, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.BillingDetails defaultBillingDetails, boolean allowsDelayedPaymentMethods) {
            super();
        }
        
        /**
         * Your customer-facing business name.
         *
         * The default value is the name of your app.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * Your customer-facing business name.
         *
         * The default value is the name of your app.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMerchantDisplayName() {
            return null;
        }
        
        /**
         * If set, the customer can select a previously saved payment method within PaymentSheet.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration component2() {
            return null;
        }
        
        /**
         * If set, the customer can select a previously saved payment method within PaymentSheet.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration getCustomer() {
            return null;
        }
        
        /**
         * Configuration related to the Stripe Customer making a payment.
         *
         * If set, PaymentSheet displays Google Pay as a payment option.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration component3() {
            return null;
        }
        
        /**
         * Configuration related to the Stripe Customer making a payment.
         *
         * If set, PaymentSheet displays Google Pay as a payment option.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration getGooglePay() {
            return null;
        }
        
        /**
         * The color of the Pay or Add button. Keep in mind the text color is white.
         *
         * If set, PaymentSheet displays the button with this color.
         */
        @org.jetbrains.annotations.Nullable()
        public final android.content.res.ColorStateList component4() {
            return null;
        }
        
        /**
         * The color of the Pay or Add button. Keep in mind the text color is white.
         *
         * If set, PaymentSheet displays the button with this color.
         */
        @org.jetbrains.annotations.Nullable()
        public final android.content.res.ColorStateList getPrimaryButtonColor() {
            return null;
        }
        
        /**
         * The billing information for the customer.
         *
         * If set, PaymentSheet will pre-populate the form fields with the values provided.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails component5() {
            return null;
        }
        
        /**
         * The billing information for the customer.
         *
         * If set, PaymentSheet will pre-populate the form fields with the values provided.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails getDefaultBillingDetails() {
            return null;
        }
        
        /**
         * If true, allows payment methods that do not move money at the end of the checkout.
         * Defaults to false.
         *
         * Some payment methods can't guarantee you will receive funds from your customer at the end
         * of the checkout because they take time to settle (eg. most bank debits, like SEPA or ACH)
         * or require customer action to complete (e.g. OXXO, Konbini, Boleto). If this is set to
         * true, make sure your integration listens to webhooks for notifications on whether a
         * payment has succeeded or not.
         *
         * See [payment-notification](https://stripe.com/docs/payments/payment-methods#payment-notification).
         */
        public final boolean component6() {
            return false;
        }
        
        /**
         * If true, allows payment methods that do not move money at the end of the checkout.
         * Defaults to false.
         *
         * Some payment methods can't guarantee you will receive funds from your customer at the end
         * of the checkout because they take time to settle (eg. most bank debits, like SEPA or ACH)
         * or require customer action to complete (e.g. OXXO, Konbini, Boleto). If this is set to
         * true, make sure your integration listens to webhooks for notifications on whether a
         * payment has succeeded or not.
         *
         * See [payment-notification](https://stripe.com/docs/payments/payment-methods#payment-notification).
         */
        public final boolean getAllowsDelayedPaymentMethods() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.Configuration> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * [Configuration] builder for cleaner object creation from Java.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;", "", "merchantDisplayName", "", "(Ljava/lang/String;)V", "allowsDelayedPaymentMethods", "", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "build", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_debug"})
        public static final class Builder {
            private java.lang.String merchantDisplayName;
            private com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer;
            private com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay;
            private android.content.res.ColorStateList primaryButtonColor;
            private com.stripe.android.paymentsheet.PaymentSheet.BillingDetails defaultBillingDetails;
            private boolean allowsDelayedPaymentMethods = false;
            
            public Builder(@org.jetbrains.annotations.NotNull()
            java.lang.String merchantDisplayName) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration.Builder merchantDisplayName(@org.jetbrains.annotations.NotNull()
            java.lang.String merchantDisplayName) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration.Builder customer(@org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration customer) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration.Builder googlePay(@org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration googlePay) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration.Builder primaryButtonColor(@org.jetbrains.annotations.Nullable()
            android.content.res.ColorStateList primaryButtonColor) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration.Builder defaultBillingDetails(@org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.BillingDetails defaultBillingDetails) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration.Builder allowsDelayedPaymentMethods(boolean allowsDelayedPaymentMethods) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Configuration build() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006&"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "Landroid/os/Parcelable;", "city", "", "country", "line1", "line2", "postalCode", "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getLine1", "getLine2", "getPostalCode", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_debug"})
    public static final class Address implements android.os.Parcelable {
        
        /**
         * City, district, suburb, town, or village.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String city = null;
        
        /**
         * Two-letter country code (ISO 3166-1 alpha-2).
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String country = null;
        
        /**
         * Address line 1 (e.g., street, PO Box, or company name).
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String line1 = null;
        
        /**
         * Address line 2 (e.g., apartment, suite, unit, or building).
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String line2 = null;
        
        /**
         * ZIP or postal code.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String postalCode = null;
        
        /**
         * State, county, province, or region.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String state = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.Address> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.Address copy(@org.jetbrains.annotations.Nullable()
        java.lang.String city, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String line1, @org.jetbrains.annotations.Nullable()
        java.lang.String line2, @org.jetbrains.annotations.Nullable()
        java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
        java.lang.String state) {
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
        
        public Address() {
            super();
        }
        
        public Address(@org.jetbrains.annotations.Nullable()
        java.lang.String city, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String line1, @org.jetbrains.annotations.Nullable()
        java.lang.String line2, @org.jetbrains.annotations.Nullable()
        java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
        java.lang.String state) {
            super();
        }
        
        /**
         * City, district, suburb, town, or village.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * City, district, suburb, town, or village.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCity() {
            return null;
        }
        
        /**
         * Two-letter country code (ISO 3166-1 alpha-2).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * Two-letter country code (ISO 3166-1 alpha-2).
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        /**
         * Address line 1 (e.g., street, PO Box, or company name).
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Address line 1 (e.g., street, PO Box, or company name).
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLine1() {
            return null;
        }
        
        /**
         * Address line 2 (e.g., apartment, suite, unit, or building).
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * Address line 2 (e.g., apartment, suite, unit, or building).
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLine2() {
            return null;
        }
        
        /**
         * ZIP or postal code.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        /**
         * ZIP or postal code.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPostalCode() {
            return null;
        }
        
        /**
         * State, county, province, or region.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        /**
         * State, county, province, or region.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getState() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.Address> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * [Address] builder for cleaner object creation from Java.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;", "", "()V", "city", "", "country", "line1", "line2", "postalCode", "state", "build", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "paymentsheet_debug"})
        public static final class Builder {
            private java.lang.String city;
            private java.lang.String country;
            private java.lang.String line1;
            private java.lang.String line2;
            private java.lang.String postalCode;
            private java.lang.String state;
            
            public Builder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address.Builder city(@org.jetbrains.annotations.Nullable()
            java.lang.String city) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address.Builder country(@org.jetbrains.annotations.Nullable()
            java.lang.String country) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address.Builder line1(@org.jetbrains.annotations.Nullable()
            java.lang.String line1) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address.Builder line2(@org.jetbrains.annotations.Nullable()
            java.lang.String line2) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address.Builder postalCode(@org.jetbrains.annotations.Nullable()
            java.lang.String postalCode) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address.Builder state(@org.jetbrains.annotations.Nullable()
            java.lang.String state) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.Address build() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "email", "", "name", "phone", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhone", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "paymentsheet_debug"})
    public static final class BillingDetails implements android.os.Parcelable {
        
        /**
         * The customer's billing address.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.Address address = null;
        
        /**
         * The customer's email.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String email = null;
        
        /**
         * The customer's full name.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        
        /**
         * The customer's phone number without formatting e.g. 5551234567
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.BillingDetails> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
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
        
        public BillingDetails() {
            super();
        }
        
        public BillingDetails(@org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Address address, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            super();
        }
        
        /**
         * The customer's billing address.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Address component1() {
            return null;
        }
        
        /**
         * The customer's billing address.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Address getAddress() {
            return null;
        }
        
        /**
         * The customer's email.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The customer's email.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        /**
         * The customer's full name.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * The customer's full name.
         * The value set is displayed in the payment sheet as-is. Depending on the payment method, the customer may be required to edit this value.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        /**
         * The customer's phone number without formatting e.g. 5551234567
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        /**
         * The customer's phone number without formatting e.g. 5551234567
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.BillingDetails> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * [BillingDetails] builder for cleaner object creation from Java.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;", "", "()V", "address", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "email", "", "name", "phone", "addressBuilder", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;", "build", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "paymentsheet_debug"})
        public static final class Builder {
            private com.stripe.android.paymentsheet.PaymentSheet.Address address;
            private java.lang.String email;
            private java.lang.String name;
            private java.lang.String phone;
            
            public Builder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails.Builder address(@org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.Address address) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails.Builder address(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.PaymentSheet.Address.Builder addressBuilder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails.Builder email(@org.jetbrains.annotations.Nullable()
            java.lang.String email) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails.Builder name(@org.jetbrains.annotations.Nullable()
            java.lang.String name) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails.Builder phone(@org.jetbrains.annotations.Nullable()
            java.lang.String phone) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheet.BillingDetails build() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Landroid/os/Parcelable;", "id", "", "ephemeralKeySecret", "(Ljava/lang/String;Ljava/lang/String;)V", "getEphemeralKeySecret", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class CustomerConfiguration implements android.os.Parcelable {
        
        /**
         * The identifier of the Stripe Customer object.
         * See [Stripe's documentation](https://stripe.com/docs/api/customers/object#customer_object-id).
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String id = null;
        
        /**
         * A short-lived token that allows the SDK to access a Customer's payment methods.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String ephemeralKeySecret = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration copy(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String ephemeralKeySecret) {
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
        
        public CustomerConfiguration(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        java.lang.String ephemeralKeySecret) {
            super();
        }
        
        /**
         * The identifier of the Stripe Customer object.
         * See [Stripe's documentation](https://stripe.com/docs/api/customers/object#customer_object-id).
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * The identifier of the Stripe Customer object.
         * See [Stripe's documentation](https://stripe.com/docs/api/customers/object#customer_object-id).
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getId() {
            return null;
        }
        
        /**
         * A short-lived token that allows the SDK to access a Customer's payment methods.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * A short-lived token that allows the SDK to access a Customer's payment methods.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEphemeralKeySecret() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "countryCode", "", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;)V", "currencyCode", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getCurrencyCode", "getEnvironment", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Environment", "paymentsheet_debug"})
    public static final class GooglePayConfiguration implements android.os.Parcelable {
        
        /**
         * The Google Pay environment to use.
         *
         * See [Google's documentation](https://developers.google.com/android/reference/com/google/android/gms/wallet/Wallet.WalletOptions#environment) for more information.
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment environment = null;
        
        /**
         * The two-letter ISO 3166 code of the country of your business, e.g. "US".
         * See your account's country value [here](https://dashboard.stripe.com/settings/account).
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String countryCode = null;
        
        /**
         * The three-letter ISO 4217 alphabetic currency code, e.g. "USD" or "EUR".
         * Required in order to support Google Pay when processing a Setup Intent.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String currencyCode = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String currencyCode) {
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
        
        public GooglePayConfiguration(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
        java.lang.String currencyCode) {
            super();
        }
        
        /**
         * The Google Pay environment to use.
         *
         * See [Google's documentation](https://developers.google.com/android/reference/com/google/android/gms/wallet/Wallet.WalletOptions#environment) for more information.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment component1() {
            return null;
        }
        
        /**
         * The Google Pay environment to use.
         *
         * See [Google's documentation](https://developers.google.com/android/reference/com/google/android/gms/wallet/Wallet.WalletOptions#environment) for more information.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment getEnvironment() {
            return null;
        }
        
        /**
         * The two-letter ISO 3166 code of the country of your business, e.g. "US".
         * See your account's country value [here](https://dashboard.stripe.com/settings/account).
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The two-letter ISO 3166 code of the country of your business, e.g. "US".
         * See your account's country value [here](https://dashboard.stripe.com/settings/account).
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCountryCode() {
            return null;
        }
        
        /**
         * The three-letter ISO 4217 alphabetic currency code, e.g. "USD" or "EUR".
         * Required in order to support Google Pay when processing a Setup Intent.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * The three-letter ISO 4217 alphabetic currency code, e.g. "USD" or "EUR".
         * Required in order to support Google Pay when processing a Setup Intent.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCurrencyCode() {
            return null;
        }
        
        public GooglePayConfiguration(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration.Environment environment, @org.jetbrains.annotations.NotNull()
        java.lang.String countryCode) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "", "(Ljava/lang/String;I)V", "Production", "Test", "paymentsheet_debug"})
        public static enum Environment {
            /*public static final*/ Production /* = new Production() */,
            /*public static final*/ Test /* = new Test() */;
            
            Environment() {
            }
        }
    }
    
    /**
     * A class that presents the individual steps of a payment sheet flow.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00102\u00020\u0001:\u0003\u0010\u0011\u0012J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u0003H&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "", "configureWithPaymentIntent", "", "paymentIntentClientSecret", "", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "configureWithSetupIntent", "setupIntentClientSecret", "confirm", "getPaymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "presentPaymentOptions", "Companion", "ConfigCallback", "Result", "paymentsheet_debug"})
    public static abstract interface FlowController {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.PaymentSheet.FlowController.Companion Companion = null;
        
        /**
         * Configure the FlowController to process a [PaymentIntent].
         *
         * @param paymentIntentClientSecret the client secret for the [PaymentIntent].
         * @param configuration optional [PaymentSheet] settings.
         * @param callback called with the result of configuring the FlowController.
         */
        public abstract void configureWithPaymentIntent(@org.jetbrains.annotations.NotNull()
        java.lang.String paymentIntentClientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback);
        
        /**
         * Configure the FlowController to process a [SetupIntent].
         *
         * @param setupIntentClientSecret the client secret for the [SetupIntent].
         * @param configuration optional [PaymentSheet] settings.
         * @param callback called with the result of configuring the FlowController.
         */
        public abstract void configureWithSetupIntent(@org.jetbrains.annotations.NotNull()
        java.lang.String setupIntentClientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheet.FlowController.ConfigCallback callback);
        
        /**
         * Retrieve information about the customer's desired payment option.
         * You can use this to e.g. display the payment option in your UI.
         */
        @org.jetbrains.annotations.Nullable()
        public abstract com.stripe.android.paymentsheet.model.PaymentOption getPaymentOption();
        
        /**
         * Present a sheet where the customer chooses how to pay, either by selecting an existing
         * payment method or adding a new one.
         * Call this when your "Select a payment method" button is tapped.
         */
        public abstract void presentPaymentOptions();
        
        /**
         * Complete the payment or setup.
         */
        public abstract void confirm();
        
        /**
         * Create the FlowController when launching the payment sheet from an Activity.
         *
         * @param activity  the Activity that is presenting the payment sheet.
         * @param paymentOptionCallback called when the customer's desired payment method
         *     changes.  Called in response to the [PaymentSheet#presentPaymentOptions()]
         * @param paymentResultCallback called when a [PaymentSheetResult] is available.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static com.stripe.android.paymentsheet.PaymentSheet.FlowController create(@org.jetbrains.annotations.NotNull()
        androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
            return null;
        }
        
        /**
         * Create the FlowController when launching the payment sheet from a Fragment.
         *
         * @param fragment the Fragment that is presenting the payment sheet.
         * @param paymentOptionCallback called when the customer's [PaymentOption] selection changes.
         * @param paymentResultCallback called when a [PaymentSheetResult] is available.
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public static com.stripe.android.paymentsheet.PaymentSheet.FlowController create(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "", "()V", "Failure", "Success", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Success;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Failure;", "paymentsheet_debug"})
        public static abstract class Result {
            
            private Result() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Success;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "()V", "paymentsheet_debug"})
            public static final class Success extends com.stripe.android.paymentsheet.PaymentSheet.FlowController.Result {
                @org.jetbrains.annotations.NotNull()
                public static final com.stripe.android.paymentsheet.PaymentSheet.FlowController.Result.Success INSTANCE = null;
                
                private Success() {
                    super();
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Failure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_debug"})
            public static final class Failure extends com.stripe.android.paymentsheet.PaymentSheet.FlowController.Result {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.Throwable error = null;
                
                public Failure(@org.jetbrains.annotations.NotNull()
                java.lang.Throwable error) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.Throwable getError() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "", "onConfigured", "", "success", "", "error", "", "paymentsheet_debug"})
        public static abstract interface ConfigCallback {
            
            public abstract void onConfigured(boolean success, @org.jetbrains.annotations.Nullable()
            java.lang.Throwable error);
        }
        
        /**
         * A class that presents the individual steps of a payment sheet flow.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class DefaultImpls {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Companion;", "", "()V", "create", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "activity", "Landroidx/activity/ComponentActivity;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "paymentsheet_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Create the FlowController when launching the payment sheet from an Activity.
             *
             * @param activity  the Activity that is presenting the payment sheet.
             * @param paymentOptionCallback called when the customer's desired payment method
             *     changes.  Called in response to the [PaymentSheet#presentPaymentOptions()]
             * @param paymentResultCallback called when a [PaymentSheetResult] is available.
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.stripe.android.paymentsheet.PaymentSheet.FlowController create(@org.jetbrains.annotations.NotNull()
            androidx.activity.ComponentActivity activity, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
                return null;
            }
            
            /**
             * Create the FlowController when launching the payment sheet from a Fragment.
             *
             * @param fragment the Fragment that is presenting the payment sheet.
             * @param paymentOptionCallback called when the customer's [PaymentOption] selection changes.
             * @param paymentResultCallback called when a [PaymentSheetResult] is available.
             */
            @org.jetbrains.annotations.NotNull()
            @kotlin.jvm.JvmStatic()
            public final com.stripe.android.paymentsheet.PaymentSheet.FlowController create(@org.jetbrains.annotations.NotNull()
            androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.PaymentOptionCallback paymentOptionCallback, @org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.PaymentSheetResultCallback paymentResultCallback) {
                return null;
            }
        }
    }
}
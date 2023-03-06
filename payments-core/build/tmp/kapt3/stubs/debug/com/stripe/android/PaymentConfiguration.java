package com.stripe.android;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/PaymentConfiguration;", "Landroid/os/Parcelable;", "publishableKey", "", "stripeAccountId", "(Ljava/lang/String;Ljava/lang/String;)V", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Store", "payments-core_debug"})
public final class PaymentConfiguration implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String publishableKey = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String stripeAccountId = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.PaymentConfiguration.Companion Companion = null;
    private static com.stripe.android.PaymentConfiguration instance;
    public static final android.os.Parcelable.Creator<com.stripe.android.PaymentConfiguration> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentConfiguration copy(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
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
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public PaymentConfiguration(@org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublishableKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeAccountId() {
        return null;
    }
    
    /**
     * Attempts to load a [PaymentConfiguration] instance. First attempt to use the class's
     * singleton instance. If unavailable, attempt to load from [Store].
     *
     * @param context application context
     * @return a [PaymentConfiguration] instance, or throw an exception
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.PaymentConfiguration getInstance(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * A publishable key from the Dashboard's [API keys](https://dashboard.stripe.com/apikeys) page.
     */
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey) {
    }
    
    /**
     * A publishable key from the Dashboard's [API keys](https://dashboard.stripe.com/apikeys) page.
     */
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeAccountId) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentConfiguration> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.PaymentConfiguration createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.PaymentConfiguration[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * Manages saving and loading [PaymentConfiguration] data to SharedPreferences.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/PaymentConfiguration$Store;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "load", "Lcom/stripe/android/PaymentConfiguration;", "load$payments_core_debug", "save", "", "publishableKey", "", "stripeAccountId", "Companion", "payments-core_debug"})
    static final class Store {
        private final android.content.SharedPreferences prefs = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.PaymentConfiguration.Store.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String NAME = null;
        @java.lang.Deprecated()
        private static final java.lang.String KEY_PUBLISHABLE_KEY = "key_publishable_key";
        @java.lang.Deprecated()
        private static final java.lang.String KEY_ACCOUNT_ID = "key_account_id";
        
        public Store(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/PaymentConfiguration$Store$Companion;", "", "()V", "KEY_ACCOUNT_ID", "", "KEY_PUBLISHABLE_KEY", "NAME", "kotlin.jvm.PlatformType", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/PaymentConfiguration$Companion;", "", "()V", "instance", "Lcom/stripe/android/PaymentConfiguration;", "clearInstance", "", "getInstance", "context", "Landroid/content/Context;", "init", "publishableKey", "", "stripeAccountId", "loadInstance", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Attempts to load a [PaymentConfiguration] instance. First attempt to use the class's
         * singleton instance. If unavailable, attempt to load from [Store].
         *
         * @param context application context
         * @return a [PaymentConfiguration] instance, or throw an exception
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.PaymentConfiguration getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.stripe.android.PaymentConfiguration loadInstance(android.content.Context context) {
            return null;
        }
        
        /**
         * A publishable key from the Dashboard's [API keys](https://dashboard.stripe.com/apikeys) page.
         */
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey) {
        }
        
        /**
         * A publishable key from the Dashboard's [API keys](https://dashboard.stripe.com/apikeys) page.
         */
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId) {
        }
    }
}
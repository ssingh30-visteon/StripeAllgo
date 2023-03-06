package com.stripe.android;

import java.lang.System;

/**
 * Data for identifying your plug-in or library.
 *
 * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
 *
 * @param name Name of your application (e.g. "MyAwesomeApp")
 * @param version Version of your application (e.g. "1.2.34")
 * @param url Website for your application (e.g. "https://myawesomeapp.info")
 * @param partnerId Your Stripe Partner ID (e.g. "pp_partner_1234")
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J7\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\'\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e0\u000eH\u0000\u00a2\u0006\u0002\b\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\r\u0010\u0018\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\u0019J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/AppInfo;", "Landroid/os/Parcelable;", "name", "", "version", "url", "partnerId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "createClientHeaders", "", "createClientHeaders$payments_core_debug", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "toUserAgent", "toUserAgent$payments_core_debug", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class AppInfo implements android.os.Parcelable {
    private final java.lang.String name = null;
    private final java.lang.String version = null;
    private final java.lang.String url = null;
    private final java.lang.String partnerId = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.AppInfo.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.AppInfo> CREATOR = null;
    
    /**
     * Data for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     *
     * @param name Name of your application (e.g. "MyAwesomeApp")
     * @param version Version of your application (e.g. "1.2.34")
     * @param url Website for your application (e.g. "https://myawesomeapp.info")
     * @param partnerId Your Stripe Partner ID (e.g. "pp_partner_1234")
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.AppInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String partnerId) {
        return null;
    }
    
    /**
     * Data for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     *
     * @param name Name of your application (e.g. "MyAwesomeApp")
     * @param version Version of your application (e.g. "1.2.34")
     * @param url Website for your application (e.g. "https://myawesomeapp.info")
     * @param partnerId Your Stripe Partner ID (e.g. "pp_partner_1234")
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Data for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     *
     * @param name Name of your application (e.g. "MyAwesomeApp")
     * @param version Version of your application (e.g. "1.2.34")
     * @param url Website for your application (e.g. "https://myawesomeapp.info")
     * @param partnerId Your Stripe Partner ID (e.g. "pp_partner_1234")
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Data for identifying your plug-in or library.
     *
     * See [Building Stripe Plug-ins and Libraries - Setting the API version](https://stripe.com/docs/building-plugins#setappinfo).
     *
     * @param name Name of your application (e.g. "MyAwesomeApp")
     * @param version Version of your application (e.g. "1.2.34")
     * @param url Website for your application (e.g. "https://myawesomeapp.info")
     * @param partnerId Your Stripe Partner ID (e.g. "pp_partner_1234")
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AppInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String partnerId) {
        super();
    }
    
    private final java.lang.String component1() {
        return null;
    }
    
    private final java.lang.String component2() {
        return null;
    }
    
    private final java.lang.String component3() {
        return null;
    }
    
    private final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toUserAgent$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> createClientHeaders$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String version) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String partnerId) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.AppInfo> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.AppInfo createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.AppInfo[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/AppInfo$Companion;", "", "()V", "create", "Lcom/stripe/android/AppInfo;", "name", "", "version", "url", "partnerId", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String version) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String version, @org.jetbrains.annotations.Nullable()
        java.lang.String url) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.AppInfo create(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String version, @org.jetbrains.annotations.Nullable()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String partnerId) {
            return null;
        }
    }
}
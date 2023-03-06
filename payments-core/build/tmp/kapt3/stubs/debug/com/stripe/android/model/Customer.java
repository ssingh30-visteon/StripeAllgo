package com.stripe.android.model;

import java.lang.System;

/**
 * Model for a Stripe Customer object
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010(\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0086\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010.J\t\u0010/\u001a\u00020\rH\u00d6\u0001J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000102H\u00d6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\t2\u0006\u00104\u001a\u00020\u0003J\t\u00105\u001a\u00020\rH\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\rH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u0006<"}, d2 = {"Lcom/stripe/android/model/Customer;", "Lcom/stripe/android/model/StripeModel;", "id", "", "defaultSource", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "sources", "", "Lcom/stripe/android/model/CustomerPaymentSource;", "hasMore", "", "totalCount", "", "url", "description", "email", "liveMode", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDefaultSource", "()Ljava/lang/String;", "getDescription", "getEmail", "getHasMore", "()Z", "getId", "getLiveMode", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "getSources", "()Ljava/util/List;", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/model/Customer;", "describeContents", "equals", "other", "", "getSourceById", "sourceId", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class Customer implements com.stripe.android.model.StripeModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String defaultSource = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.ShippingInformation shippingInformation = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.model.CustomerPaymentSource> sources = null;
    private final boolean hasMore = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer totalCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    private final boolean liveMode = false;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Customer> CREATOR = null;
    
    /**
     * Model for a Stripe Customer object
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Customer copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultSource, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.CustomerPaymentSource> sources, boolean hasMore, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCount, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String email, boolean liveMode) {
        return null;
    }
    
    /**
     * Model for a Stripe Customer object
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model for a Stripe Customer object
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model for a Stripe Customer object
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Customer(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultSource, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.CustomerPaymentSource> sources, boolean hasMore, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCount, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String email, boolean liveMode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefaultSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getShippingInformation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.CustomerPaymentSource> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.CustomerPaymentSource> getSources() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getHasMore() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getLiveMode() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CustomerPaymentSource getSourceById(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Customer> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Customer createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Customer[] newArray(int size) {
            return null;
        }
    }
}
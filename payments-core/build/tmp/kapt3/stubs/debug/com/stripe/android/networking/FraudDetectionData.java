package com.stripe.android.networking;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0001-B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0014J\u000e\u0010\u0015\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0016J\u000e\u0010\u0017\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0018J\u000e\u0010\u0019\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u001aJ1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u001dH\u00d6\u0001J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020&J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001dH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006."}, d2 = {"Lcom/stripe/android/networking/FraudDetectionData;", "Lcom/stripe/android/model/StripeModel;", "guid", "", "muid", "sid", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getGuid$payments_core_debug", "()Ljava/lang/String;", "getMuid$payments_core_debug", "params", "", "getParams", "()Ljava/util/Map;", "getSid$payments_core_debug", "getTimestamp$payments_core_debug", "()J", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isExpired", "currentTime", "toJson", "Lorg/json/JSONObject;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class FraudDetectionData implements com.stripe.android.model.StripeModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String guid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String muid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sid = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.networking.FraudDetectionData.Companion Companion = null;
    private static final java.lang.String KEY_GUID = "guid";
    private static final java.lang.String KEY_MUID = "muid";
    private static final java.lang.String KEY_SID = "sid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TIMESTAMP = "timestamp";
    private static final long TTL = 0L;
    public static final android.os.Parcelable.Creator<com.stripe.android.networking.FraudDetectionData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.networking.FraudDetectionData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String guid, @org.jetbrains.annotations.NotNull()
    java.lang.String muid, @org.jetbrains.annotations.NotNull()
    java.lang.String sid, long timestamp) {
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
    
    public FraudDetectionData(@org.jetbrains.annotations.NotNull()
    java.lang.String guid, @org.jetbrains.annotations.NotNull()
    java.lang.String muid, @org.jetbrains.annotations.NotNull()
    java.lang.String sid, long timestamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGuid$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMuid$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSid$payments_core_debug() {
        return null;
    }
    
    public final long component4$payments_core_debug() {
        return 0L;
    }
    
    public final long getTimestamp$payments_core_debug() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject toJson() {
        return null;
    }
    
    public final boolean isExpired(long currentTime) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.networking.FraudDetectionData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.networking.FraudDetectionData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.networking.FraudDetectionData[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionData$Companion;", "", "()V", "KEY_GUID", "", "KEY_MUID", "KEY_SID", "KEY_TIMESTAMP", "TTL", "", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
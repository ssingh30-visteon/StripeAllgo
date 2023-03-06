package com.stripe.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u0016\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u0018\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u0019\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u001a\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u001b\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u001c\u001a\u00020\fH\u00c2\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003Je\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u001f\u001a\u00020\fH\u00d6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\fH\u00d6\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020#0&H\u0016J\t\u0010\'\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\fH\u00d6\u0001R\u0014\u0010\u000f\u001a\u00020\u00108AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "sourceId", "", "sdkAppId", "sdkReferenceNumber", "sdkTransactionId", "deviceData", "sdkEphemeralPublicKey", "messageVersion", "maxTimeout", "", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "appParams", "Lorg/json/JSONObject;", "getAppParams$payments_core_debug", "()Lorg/json/JSONObject;", "deviceRenderOptions", "getDeviceRenderOptions", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
public final class Stripe3ds2AuthParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    private final java.lang.String sourceId = null;
    private final java.lang.String sdkAppId = null;
    private final java.lang.String sdkReferenceNumber = null;
    private final java.lang.String sdkTransactionId = null;
    private final java.lang.String deviceData = null;
    private final java.lang.String sdkEphemeralPublicKey = null;
    private final java.lang.String messageVersion = null;
    private final int maxTimeout = 0;
    private final java.lang.String returnUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.Stripe3ds2AuthParams.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_APP = "app";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_SOURCE = "source";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIELD_FALLBACK_RETURN_URL = "fallback_return_url";
    private static final java.lang.String FIELD_SDK_APP_ID = "sdkAppID";
    private static final java.lang.String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final java.lang.String FIELD_SDK_ENC_DATA = "sdkEncData";
    private static final java.lang.String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private static final java.lang.String FIELD_SDK_MAX_TIMEOUT = "sdkMaxTimeout";
    private static final java.lang.String FIELD_SDK_REFERENCE_NUMBER = "sdkReferenceNumber";
    private static final java.lang.String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final java.lang.String FIELD_DEVICE_RENDER_OPTIONS = "deviceRenderOptions";
    private static final java.lang.String FIELD_SDK_INTERFACE = "sdkInterface";
    private static final java.lang.String FIELD_SDK_UI_TYPE = "sdkUiType";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthParams> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Stripe3ds2AuthParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkAppId, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkReferenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkTransactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceData, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkEphemeralPublicKey, @org.jetbrains.annotations.NotNull()
    java.lang.String messageVersion, int maxTimeout, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl) {
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
    
    public Stripe3ds2AuthParams(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkAppId, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkReferenceNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkTransactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String deviceData, @org.jetbrains.annotations.NotNull()
    java.lang.String sdkEphemeralPublicKey, @org.jetbrains.annotations.NotNull()
    java.lang.String messageVersion, int maxTimeout, @org.jetbrains.annotations.Nullable()
    java.lang.String returnUrl) {
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
    
    private final java.lang.String component5() {
        return null;
    }
    
    private final java.lang.String component6() {
        return null;
    }
    
    private final java.lang.String component7() {
        return null;
    }
    
    private final int component8() {
        return 0;
    }
    
    private final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
        return null;
    }
    
    private final org.json.JSONObject getDeviceRenderOptions() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Stripe3ds2AuthParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Stripe3ds2AuthParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams$Companion;", "", "()V", "FIELD_APP", "", "FIELD_DEVICE_RENDER_OPTIONS", "FIELD_FALLBACK_RETURN_URL", "FIELD_MESSAGE_VERSION", "FIELD_SDK_APP_ID", "FIELD_SDK_ENC_DATA", "FIELD_SDK_EPHEM_PUB_KEY", "FIELD_SDK_INTERFACE", "FIELD_SDK_MAX_TIMEOUT", "FIELD_SDK_REFERENCE_NUMBER", "FIELD_SDK_TRANS_ID", "FIELD_SDK_UI_TYPE", "FIELD_SOURCE", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
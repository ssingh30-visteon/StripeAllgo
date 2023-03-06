package com.stripe.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003567Bk\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c2\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jx\u0010\'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010(J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020*H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017\u00a8\u00068"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult;", "Lcom/stripe/android/model/StripeModel;", "id", "", "ares", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "created", "", "source", "state", "liveMode", "", "error", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "fallbackRedirectUrl", "creq", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)V", "getAres", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "getCreated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreq", "()Ljava/lang/String;", "getError", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "getFallbackRedirectUrl", "getId", "getSource", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthResult;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Ares", "MessageExtension", "ThreeDS2Error", "payments-core_debug"})
public final class Stripe3ds2AuthResult implements com.stripe.android.model.StripeModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Stripe3ds2AuthResult.Ares ares = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long created = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String state = null;
    private final boolean liveMode = false;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error error = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fallbackRedirectUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String creq = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Stripe3ds2AuthResult copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Stripe3ds2AuthResult.Ares ares, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.Nullable()
    java.lang.String state, boolean liveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error error, @org.jetbrains.annotations.Nullable()
    java.lang.String fallbackRedirectUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String creq) {
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
    
    public Stripe3ds2AuthResult(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Stripe3ds2AuthResult.Ares ares, @org.jetbrains.annotations.Nullable()
    java.lang.Long created, @org.jetbrains.annotations.Nullable()
    java.lang.String source, @org.jetbrains.annotations.Nullable()
    java.lang.String state, boolean liveMode, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error error, @org.jetbrains.annotations.Nullable()
    java.lang.String fallbackRedirectUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String creq) {
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
    public final com.stripe.android.model.Stripe3ds2AuthResult.Ares component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Stripe3ds2AuthResult.Ares getAres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
        return null;
    }
    
    private final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error getError() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFallbackRedirectUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreq() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Stripe3ds2AuthResult createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Stripe3ds2AuthResult[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 52\u00020\u0001:\u00015B\u0091\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\"J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c2\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u009f\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0013\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020*H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*H\u00d6\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "Lcom/stripe/android/model/StripeModel;", "threeDSServerTransId", "", "acsChallengeMandated", "acsSignedContent", "acsTransId", "acsUrl", "authenticationType", "cardholderInfo", "messageExtension", "", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "messageType", "messageVersion", "sdkTransId", "transStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsSignedContent$payments_core_debug", "()Ljava/lang/String;", "getAcsTransId$payments_core_debug", "isChallenge", "", "()Z", "getThreeDSServerTransId$payments_core_debug", "component1", "component1$payments_core_debug", "component10", "component11", "component12", "component2", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Ares implements com.stripe.android.model.StripeModel {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String threeDSServerTransId = null;
        private final java.lang.String acsChallengeMandated = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String acsSignedContent = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String acsTransId = null;
        private final java.lang.String acsUrl = null;
        private final java.lang.String authenticationType = null;
        private final java.lang.String cardholderInfo = null;
        private final java.util.List<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> messageExtension = null;
        private final java.lang.String messageType = null;
        private final java.lang.String messageVersion = null;
        private final java.lang.String sdkTransId = null;
        private final java.lang.String transStatus = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.Stripe3ds2AuthResult.Ares.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VALUE_CHALLENGE = "C";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult.Ares> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Stripe3ds2AuthResult.Ares copy(@org.jetbrains.annotations.Nullable()
        java.lang.String threeDSServerTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String acsChallengeMandated, @org.jetbrains.annotations.Nullable()
        java.lang.String acsSignedContent, @org.jetbrains.annotations.Nullable()
        java.lang.String acsTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String acsUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String authenticationType, @org.jetbrains.annotations.Nullable()
        java.lang.String cardholderInfo, @org.jetbrains.annotations.Nullable()
        java.util.List<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> messageExtension, @org.jetbrains.annotations.Nullable()
        java.lang.String messageType, @org.jetbrains.annotations.Nullable()
        java.lang.String messageVersion, @org.jetbrains.annotations.Nullable()
        java.lang.String sdkTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String transStatus) {
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
        
        public Ares(@org.jetbrains.annotations.Nullable()
        java.lang.String threeDSServerTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String acsChallengeMandated, @org.jetbrains.annotations.Nullable()
        java.lang.String acsSignedContent, @org.jetbrains.annotations.Nullable()
        java.lang.String acsTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String acsUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String authenticationType, @org.jetbrains.annotations.Nullable()
        java.lang.String cardholderInfo, @org.jetbrains.annotations.Nullable()
        java.util.List<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> messageExtension, @org.jetbrains.annotations.Nullable()
        java.lang.String messageType, @org.jetbrains.annotations.Nullable()
        java.lang.String messageVersion, @org.jetbrains.annotations.Nullable()
        java.lang.String sdkTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String transStatus) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getThreeDSServerTransId$payments_core_debug() {
            return null;
        }
        
        private final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAcsSignedContent$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAcsTransId$payments_core_debug() {
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
        
        private final java.util.List<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> component8() {
            return null;
        }
        
        private final java.lang.String component9() {
            return null;
        }
        
        private final java.lang.String component10() {
            return null;
        }
        
        private final java.lang.String component11() {
            return null;
        }
        
        private final java.lang.String component12() {
            return null;
        }
        
        public final boolean isChallenge() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult.Ares> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2AuthResult.Ares createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2AuthResult.Ares[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares$Companion;", "", "()V", "VALUE_CHALLENGE", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c2\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u00c6\u0003JC\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "Lcom/stripe/android/model/StripeModel;", "name", "", "criticalityIndicator", "", "id", "data", "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class MessageExtension implements com.stripe.android.model.StripeModel {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String name = null;
        private final boolean criticalityIndicator = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Map<java.lang.String, java.lang.String> data = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension copy(@org.jetbrains.annotations.Nullable()
        java.lang.String name, boolean criticalityIndicator, @org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> data) {
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
        
        public MessageExtension(@org.jetbrains.annotations.Nullable()
        java.lang.String name, boolean criticalityIndicator, @org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        private final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.String> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Map<java.lang.String, java.lang.String> getData() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2AuthResult.MessageExtension[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u00d6\u0003J\t\u0010-\u001a\u00020(H\u00d6\u0001J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010\u00a8\u00064"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "Lcom/stripe/android/model/StripeModel;", "threeDSServerTransId", "", "acsTransId", "dsTransId", "errorCode", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", "messageType", "messageVersion", "sdkTransId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsTransId", "()Ljava/lang/String;", "getDsTransId", "getErrorCode", "getErrorComponent", "getErrorDescription", "getErrorDetail", "getErrorMessageType", "getMessageType", "getMessageVersion", "getSdkTransId", "getThreeDSServerTransId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class ThreeDS2Error implements com.stripe.android.model.StripeModel {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String threeDSServerTransId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String acsTransId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String dsTransId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorCode = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorComponent = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorDescription = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorDetail = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMessageType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String messageType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String messageVersion = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sdkTransId = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error copy(@org.jetbrains.annotations.Nullable()
        java.lang.String threeDSServerTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String acsTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String dsTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode, @org.jetbrains.annotations.Nullable()
        java.lang.String errorComponent, @org.jetbrains.annotations.Nullable()
        java.lang.String errorDescription, @org.jetbrains.annotations.Nullable()
        java.lang.String errorDetail, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessageType, @org.jetbrains.annotations.Nullable()
        java.lang.String messageType, @org.jetbrains.annotations.Nullable()
        java.lang.String messageVersion, @org.jetbrains.annotations.Nullable()
        java.lang.String sdkTransId) {
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
        
        public ThreeDS2Error(@org.jetbrains.annotations.Nullable()
        java.lang.String threeDSServerTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String acsTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String dsTransId, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode, @org.jetbrains.annotations.Nullable()
        java.lang.String errorComponent, @org.jetbrains.annotations.Nullable()
        java.lang.String errorDescription, @org.jetbrains.annotations.Nullable()
        java.lang.String errorDetail, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessageType, @org.jetbrains.annotations.Nullable()
        java.lang.String messageType, @org.jetbrains.annotations.Nullable()
        java.lang.String messageVersion, @org.jetbrains.annotations.Nullable()
        java.lang.String sdkTransId) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getThreeDSServerTransId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAcsTransId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDsTransId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorDetail() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessageType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessageType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessageVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSdkTransId() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.Stripe3ds2AuthResult.ThreeDS2Error[] newArray(int size) {
                return null;
            }
        }
    }
}
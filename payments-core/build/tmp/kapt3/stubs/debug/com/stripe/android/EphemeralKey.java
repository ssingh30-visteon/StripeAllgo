package com.stripe.android;

import java.lang.System;

/**
 * Represents an Ephemeral Key that can be used temporarily for API operations that typically
 * require a secret key.
 *
 * See [Using Android Standard UI Components - Prepare your API](https://stripe.com/docs/mobile/android/standard#prepare-your-api)
 * for more details on ephemeral keys.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u0019\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001aJ\u000e\u0010\u001b\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u001eJ\u000e\u0010\u001f\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b J\u000e\u0010!\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\b\"J\u000e\u0010#\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b$J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010&\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\'JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020*H\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\f\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012\u00a8\u00065"}, d2 = {"Lcom/stripe/android/EphemeralKey;", "Lcom/stripe/android/model/StripeModel;", "objectId", "", "created", "", "expires", "id", "isLiveMode", "", "objectType", "secret", "type", "(Ljava/lang/String;JJLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreated$payments_core_debug", "()J", "getExpires$payments_core_debug", "getId$payments_core_debug", "()Ljava/lang/String;", "isLiveMode$payments_core_debug", "()Z", "getObjectId$payments_core_debug", "getObjectType$payments_core_debug", "getSecret", "getType$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component8", "component8$payments_core_debug", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class EphemeralKey implements com.stripe.android.model.StripeModel {
    
    /**
     * Represents a customer id or issuing card id, depending on the context
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String objectId = null;
    private final long created = 0L;
    private final long expires = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final boolean isLiveMode = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String objectType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String secret = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.EphemeralKey> CREATOR = null;
    
    /**
     * Represents an Ephemeral Key that can be used temporarily for API operations that typically
     * require a secret key.
     *
     * See [Using Android Standard UI Components - Prepare your API](https://stripe.com/docs/mobile/android/standard#prepare-your-api)
     * for more details on ephemeral keys.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.EphemeralKey copy(@org.jetbrains.annotations.NotNull()
    java.lang.String objectId, long created, long expires, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean isLiveMode, @org.jetbrains.annotations.NotNull()
    java.lang.String objectType, @org.jetbrains.annotations.NotNull()
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    /**
     * Represents an Ephemeral Key that can be used temporarily for API operations that typically
     * require a secret key.
     *
     * See [Using Android Standard UI Components - Prepare your API](https://stripe.com/docs/mobile/android/standard#prepare-your-api)
     * for more details on ephemeral keys.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Represents an Ephemeral Key that can be used temporarily for API operations that typically
     * require a secret key.
     *
     * See [Using Android Standard UI Components - Prepare your API](https://stripe.com/docs/mobile/android/standard#prepare-your-api)
     * for more details on ephemeral keys.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Represents an Ephemeral Key that can be used temporarily for API operations that typically
     * require a secret key.
     *
     * See [Using Android Standard UI Components - Prepare your API](https://stripe.com/docs/mobile/android/standard#prepare-your-api)
     * for more details on ephemeral keys.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public EphemeralKey(@org.jetbrains.annotations.NotNull()
    java.lang.String objectId, long created, long expires, @org.jetbrains.annotations.NotNull()
    java.lang.String id, boolean isLiveMode, @org.jetbrains.annotations.NotNull()
    java.lang.String objectType, @org.jetbrains.annotations.NotNull()
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        super();
    }
    
    /**
     * Represents a customer id or issuing card id, depending on the context
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1$payments_core_debug() {
        return null;
    }
    
    /**
     * Represents a customer id or issuing card id, depending on the context
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getObjectId$payments_core_debug() {
        return null;
    }
    
    public final long component2$payments_core_debug() {
        return 0L;
    }
    
    public final long getCreated$payments_core_debug() {
        return 0L;
    }
    
    public final long component3$payments_core_debug() {
        return 0L;
    }
    
    public final long getExpires$payments_core_debug() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId$payments_core_debug() {
        return null;
    }
    
    public final boolean component5$payments_core_debug() {
        return false;
    }
    
    public final boolean isLiveMode$payments_core_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getObjectType$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSecret() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType$payments_core_debug() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.EphemeralKey> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.EphemeralKey createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.EphemeralKey[] newArray(int size) {
            return null;
        }
    }
}
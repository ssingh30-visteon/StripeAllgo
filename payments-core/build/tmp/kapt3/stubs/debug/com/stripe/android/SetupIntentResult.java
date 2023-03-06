package com.stripe.android;

import java.lang.System;

/**
 * A model representing the result of a [SetupIntent] confirmation via [Stripe.confirmSetupIntent]
 * or handling of next actions via [Stripe.handleNextActionForSetupIntent].
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c2\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/SetupIntentResult;", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/SetupIntent;", "intent", "outcomeFromFlow", "", "failureMessage", "", "(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)V", "getFailureMessage", "()Ljava/lang/String;", "getIntent", "()Lcom/stripe/android/model/SetupIntent;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
public final class SetupIntentResult extends com.stripe.android.StripeIntentResult<com.stripe.android.model.SetupIntent> {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.SetupIntent intent = null;
    private final int outcomeFromFlow = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String failureMessage = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.SetupIntentResult> CREATOR = null;
    
    /**
     * A model representing the result of a [SetupIntent] confirmation via [Stripe.confirmSetupIntent]
     * or handling of next actions via [Stripe.handleNextActionForSetupIntent].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.SetupIntentResult copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SetupIntent intent, @com.stripe.android.StripeIntentResult.Outcome()
    int outcomeFromFlow, @org.jetbrains.annotations.Nullable()
    java.lang.String failureMessage) {
        return null;
    }
    
    /**
     * A model representing the result of a [SetupIntent] confirmation via [Stripe.confirmSetupIntent]
     * or handling of next actions via [Stripe.handleNextActionForSetupIntent].
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A model representing the result of a [SetupIntent] confirmation via [Stripe.confirmSetupIntent]
     * or handling of next actions via [Stripe.handleNextActionForSetupIntent].
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A model representing the result of a [SetupIntent] confirmation via [Stripe.confirmSetupIntent]
     * or handling of next actions via [Stripe.handleNextActionForSetupIntent].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SetupIntentResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.SetupIntent intent, @com.stripe.android.StripeIntentResult.Outcome()
    int outcomeFromFlow, @org.jetbrains.annotations.Nullable()
    java.lang.String failureMessage) {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.SetupIntent component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.model.SetupIntent getIntent() {
        return null;
    }
    
    private final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getFailureMessage() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.SetupIntentResult> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.SetupIntentResult createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.SetupIntentResult[] newArray(int size) {
            return null;
        }
    }
}
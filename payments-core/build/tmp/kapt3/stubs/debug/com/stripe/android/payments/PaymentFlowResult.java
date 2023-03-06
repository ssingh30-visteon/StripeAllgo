package com.stripe.android.payments;

import java.lang.System;

/**
 * Represents the result of a [PaymentController] operation.
 *
 * This class is annotated with `@Parcelize` but uses custom parceling logic due to issues
 * with parceling an `Exception` subclass. See
 * [Parcel#writeException()](https://developer.android.com/reference/android/os/Parcel#writeException(java.lang.Exception))
 * for more details.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult;", "", "()V", "Unvalidated", "Validated", "payments-core_debug"})
public abstract class PaymentFlowResult {
    
    private PaymentFlowResult() {
        super();
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000e\u0010\u001e\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b!J\u0010\u0010\"\u001a\u0004\u0018\u00010\fH\u00c0\u0003\u00a2\u0006\u0002\b#J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b%JY\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010,\u001a\u00020-J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\r\u0010/\u001a\u000200H\u0000\u00a2\u0006\u0002\b1J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u00068"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/os/Parcelable;", "clientSecret", "", "flowOutcome", "", "exception", "Lcom/stripe/android/exception/StripeException;", "canCancelSource", "", "sourceId", "source", "Lcom/stripe/android/model/Source;", "stripeAccountId", "(Ljava/lang/String;ILcom/stripe/android/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getCanCancelSource$payments_core_debug", "()Z", "getClientSecret", "()Ljava/lang/String;", "getException", "()Lcom/stripe/android/exception/StripeException;", "getFlowOutcome", "()I", "getSource$payments_core_debug", "()Lcom/stripe/android/model/Source;", "getSourceId$payments_core_debug", "getStripeAccountId$payments_core_debug", "component1", "component2", "component3", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component7$payments_core_debug", "copy", "describeContents", "equals", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "validate", "Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "validate$payments_core_debug", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Unvalidated implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String clientSecret = null;
        private final int flowOutcome = 0;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.exception.StripeException exception = null;
        private final boolean canCancelSource = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sourceId = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Source source = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stripeAccountId = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.payments.PaymentFlowResult.Unvalidated.Companion Companion = null;
        private static final java.lang.String EXTRA = "extra_args";
        private static final java.lang.String CLIENT_SECRET_INTENT_ERROR = "Invalid client_secret value in result Intent.";
        public static final android.os.Parcelable.Creator<com.stripe.android.payments.PaymentFlowResult.Unvalidated> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.PaymentFlowResult.Unvalidated copy(@org.jetbrains.annotations.Nullable()
        java.lang.String clientSecret, @com.stripe.android.StripeIntentResult.Outcome()
        int flowOutcome, @org.jetbrains.annotations.Nullable()
        com.stripe.android.exception.StripeException exception, boolean canCancelSource, @org.jetbrains.annotations.Nullable()
        java.lang.String sourceId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
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
        
        public Unvalidated() {
            super();
        }
        
        public Unvalidated(@org.jetbrains.annotations.Nullable()
        java.lang.String clientSecret, @com.stripe.android.StripeIntentResult.Outcome()
        int flowOutcome, @org.jetbrains.annotations.Nullable()
        com.stripe.android.exception.StripeException exception, boolean canCancelSource, @org.jetbrains.annotations.Nullable()
        java.lang.String sourceId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getClientSecret() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getFlowOutcome() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.exception.StripeException component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.exception.StripeException getException() {
            return null;
        }
        
        public final boolean component4$payments_core_debug() {
            return false;
        }
        
        public final boolean getCanCancelSource$payments_core_debug() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSourceId$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source component6$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source getSource$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStripeAccountId$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.PaymentFlowResult.Validated validate$payments_core_debug() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.payments.PaymentFlowResult.Unvalidated> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.PaymentFlowResult.Unvalidated createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.payments.PaymentFlowResult.Unvalidated[] newArray(int size) {
                return null;
            }
        }
        
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "()V", "CLIENT_SECRET_INTENT_ERROR", "", "EXTRA", "create", "parcel", "Landroid/os/Parcel;", "fromIntent", "intent", "Landroid/content/Intent;", "write", "", "flags", "", "payments-core_debug"})
        public static final class Companion implements kotlinx.parcelize.Parceler<com.stripe.android.payments.PaymentFlowResult.Unvalidated> {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.payments.PaymentFlowResult.Unvalidated create(@org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel) {
                return null;
            }
            
            @java.lang.Override()
            public void write(@org.jetbrains.annotations.NotNull()
            com.stripe.android.payments.PaymentFlowResult.Unvalidated $this$write, @org.jetbrains.annotations.NotNull()
            android.os.Parcel parcel, int flags) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public com.stripe.android.payments.PaymentFlowResult.Unvalidated[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * The representation of a valid [PaymentFlowResult]. See [Unvalidated.validate].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0018\u001a\u00020\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0007H\u00c0\u0003\u00a2\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c0\u0003\u00a2\u0006\u0002\b!JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "", "clientSecret", "", "flowOutcome", "", "canCancelSource", "", "sourceId", "source", "Lcom/stripe/android/model/Source;", "stripeAccountId", "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getCanCancelSource$payments_core_debug", "()Z", "getClientSecret", "()Ljava/lang/String;", "getFlowOutcome$payments_core_debug", "()I", "getSource$payments_core_debug", "()Lcom/stripe/android/model/Source;", "getSourceId$payments_core_debug", "getStripeAccountId$payments_core_debug", "component1", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "copy", "equals", "other", "hashCode", "toString", "payments-core_debug"})
    public static final class Validated {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String clientSecret = null;
        private final int flowOutcome = 0;
        
        /**
         * The Source is eligible for cancellation.
         * See [PaymentFlowResultProcessor.shouldCancelIntent] for usage.
         */
        private final boolean canCancelSource = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String sourceId = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.Source source = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stripeAccountId = null;
        
        /**
         * The representation of a valid [PaymentFlowResult]. See [Unvalidated.validate].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.PaymentFlowResult.Validated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @com.stripe.android.StripeIntentResult.Outcome()
        int flowOutcome, boolean canCancelSource, @org.jetbrains.annotations.Nullable()
        java.lang.String sourceId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId) {
            return null;
        }
        
        /**
         * The representation of a valid [PaymentFlowResult]. See [Unvalidated.validate].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The representation of a valid [PaymentFlowResult]. See [Unvalidated.validate].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The representation of a valid [PaymentFlowResult]. See [Unvalidated.validate].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Validated(@org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @com.stripe.android.StripeIntentResult.Outcome()
        int flowOutcome, boolean canCancelSource, @org.jetbrains.annotations.Nullable()
        java.lang.String sourceId, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClientSecret() {
            return null;
        }
        
        public final int component2$payments_core_debug() {
            return 0;
        }
        
        public final int getFlowOutcome$payments_core_debug() {
            return 0;
        }
        
        /**
         * The Source is eligible for cancellation.
         * See [PaymentFlowResultProcessor.shouldCancelIntent] for usage.
         */
        public final boolean component3$payments_core_debug() {
            return false;
        }
        
        /**
         * The Source is eligible for cancellation.
         * See [PaymentFlowResultProcessor.shouldCancelIntent] for usage.
         */
        public final boolean getCanCancelSource$payments_core_debug() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSourceId$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source component5$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.Source getSource$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStripeAccountId$payments_core_debug() {
            return null;
        }
    }
}
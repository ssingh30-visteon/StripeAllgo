package com.stripe.android;

import java.lang.System;

/**
 * Starts an instance of [PaymentRelayStarter].
 * Should only be called from [StripePaymentController].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Args", "Legacy", "Modern", "payments-core_debug"})
public abstract interface PaymentRelayStarter extends com.stripe.android.view.AuthActivityStarter<com.stripe.android.PaymentRelayStarter.Args> {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Legacy;", "Lcom/stripe/android/PaymentRelayStarter;", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "(Lcom/stripe/android/view/AuthActivityStarterHost;)V", "start", "", "args", "Lcom/stripe/android/PaymentRelayStarter$Args;", "payments-core_debug"})
    public static final class Legacy implements com.stripe.android.PaymentRelayStarter {
        private final com.stripe.android.view.AuthActivityStarterHost host = null;
        
        public Legacy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AuthActivityStarterHost host) {
            super();
        }
        
        @java.lang.Override()
        public void start(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentRelayStarter.Args args) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Modern;", "Lcom/stripe/android/PaymentRelayStarter;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "(Landroidx/activity/result/ActivityResultLauncher;)V", "start", "", "args", "payments-core_debug"})
    public static final class Modern implements com.stripe.android.PaymentRelayStarter {
        private final androidx.activity.result.ActivityResultLauncher<com.stripe.android.PaymentRelayStarter.Args> launcher = null;
        
        public Modern(@org.jetbrains.annotations.NotNull()
        androidx.activity.result.ActivityResultLauncher<com.stripe.android.PaymentRelayStarter.Args> launcher) {
            super();
        }
        
        @java.lang.Override()
        public void start(@org.jetbrains.annotations.NotNull()
        com.stripe.android.PaymentRelayStarter.Args args) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args;", "Landroid/os/Parcelable;", "()V", "requestCode", "", "getRequestCode", "()I", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Companion", "ErrorArgs", "PaymentIntentArgs", "SetupIntentArgs", "SourceArgs", "Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "payments-core_debug"})
    public static abstract class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.PaymentRelayStarter.Args.Companion Companion = null;
        
        private Args() {
            super();
        }
        
        public abstract int getRequestCode();
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.payments.PaymentFlowResult.Unvalidated toResult();
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentIntent", "Lcom/stripe/android/model/PaymentIntent;", "stripeAccountId", "", "(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)V", "getPaymentIntent$payments_core_debug", "()Lcom/stripe/android/model/PaymentIntent;", "requestCode", "", "getRequestCode", "()I", "getStripeAccountId$payments_core_debug", "()Ljava/lang/String;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class PaymentIntentArgs extends com.stripe.android.PaymentRelayStarter.Args {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentIntent paymentIntent = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.PaymentIntentArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentRelayStarter.Args.PaymentIntentArgs copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentIntent paymentIntent, @org.jetbrains.annotations.Nullable()
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
            
            public PaymentIntentArgs(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentIntent paymentIntent, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentIntent component1$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentIntent getPaymentIntent$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStripeAccountId$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int getRequestCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.payments.PaymentFlowResult.Unvalidated toResult() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.PaymentIntentArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.PaymentIntentArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.PaymentIntentArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bH\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "setupIntent", "Lcom/stripe/android/model/SetupIntent;", "stripeAccountId", "", "(Lcom/stripe/android/model/SetupIntent;Ljava/lang/String;)V", "requestCode", "", "getRequestCode", "()I", "getSetupIntent$payments_core_debug", "()Lcom/stripe/android/model/SetupIntent;", "getStripeAccountId$payments_core_debug", "()Ljava/lang/String;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class SetupIntentArgs extends com.stripe.android.PaymentRelayStarter.Args {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.SetupIntent setupIntent = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.SetupIntentArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentRelayStarter.Args.SetupIntentArgs copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.SetupIntent setupIntent, @org.jetbrains.annotations.Nullable()
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
            
            public SetupIntentArgs(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.SetupIntent setupIntent, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SetupIntent component1$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.SetupIntent getSetupIntent$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStripeAccountId$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int getRequestCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.payments.PaymentFlowResult.Unvalidated toResult() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.SetupIntentArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.SetupIntentArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.SetupIntentArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\bH\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "source", "Lcom/stripe/android/model/Source;", "stripeAccountId", "", "(Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "requestCode", "", "getRequestCode", "()I", "getSource$payments_core_debug", "()Lcom/stripe/android/model/Source;", "getStripeAccountId$payments_core_debug", "()Ljava/lang/String;", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class SourceArgs extends com.stripe.android.PaymentRelayStarter.Args {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.Source source = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String stripeAccountId = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.SourceArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentRelayStarter.Args.SourceArgs copy(@org.jetbrains.annotations.NotNull()
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
            
            public SourceArgs(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.Source source, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.Source component1$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.Source getSource$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getStripeAccountId$payments_core_debug() {
                return null;
            }
            
            @java.lang.Override()
            public int getRequestCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.payments.PaymentFlowResult.Unvalidated toResult() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.SourceArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.SourceArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.SourceArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "exception", "Lcom/stripe/android/exception/StripeException;", "requestCode", "", "(Lcom/stripe/android/exception/StripeException;I)V", "getException$payments_core_debug", "()Lcom/stripe/android/exception/StripeException;", "getRequestCode", "()I", "component1", "component1$payments_core_debug", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class ErrorArgs extends com.stripe.android.PaymentRelayStarter.Args {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.exception.StripeException exception = null;
            private final int requestCode = 0;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.PaymentRelayStarter.Args.ErrorArgs.Companion Companion = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.ErrorArgs> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentRelayStarter.Args.ErrorArgs copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.exception.StripeException exception, int requestCode) {
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
            
            public ErrorArgs(@org.jetbrains.annotations.NotNull()
            com.stripe.android.exception.StripeException exception, int requestCode) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.exception.StripeException component1$payments_core_debug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.exception.StripeException getException$payments_core_debug() {
                return null;
            }
            
            public final int component2() {
                return 0;
            }
            
            @java.lang.Override()
            public int getRequestCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.payments.PaymentFlowResult.Unvalidated toResult() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentRelayStarter.Args.ErrorArgs> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.ErrorArgs createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.PaymentRelayStarter.Args.ErrorArgs[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "()V", "create", "parcel", "Landroid/os/Parcel;", "write", "", "flags", "", "payments-core_debug"})
            public static final class Companion implements kotlinx.parcelize.Parceler<com.stripe.android.PaymentRelayStarter.Args.ErrorArgs> {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.stripe.android.PaymentRelayStarter.Args.ErrorArgs create(@org.jetbrains.annotations.NotNull()
                android.os.Parcel parcel) {
                    return null;
                }
                
                @java.lang.Override()
                public void write(@org.jetbrains.annotations.NotNull()
                com.stripe.android.PaymentRelayStarter.Args.ErrorArgs $this$write, @org.jetbrains.annotations.NotNull()
                android.os.Parcel parcel, int flags) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public com.stripe.android.PaymentRelayStarter.Args.ErrorArgs[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/PaymentRelayStarter$Args;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "stripeAccountId", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.PaymentRelayStarter.Args create(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.Nullable()
            java.lang.String stripeAccountId) {
                return null;
            }
        }
    }
}
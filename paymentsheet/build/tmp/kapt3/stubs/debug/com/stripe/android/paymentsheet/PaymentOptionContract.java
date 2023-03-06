package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "paymentsheet_debug"})
public final class PaymentOptionContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.paymentsheet.PaymentOptionContract.Args, com.stripe.android.paymentsheet.PaymentOptionResult> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.PaymentOptionContract.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ARGS = "extra_activity_args";
    
    public PaymentOptionContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.PaymentOptionResult parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0001<Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\t\u0010,\u001a\u00020\u0010H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u00c6\u0003Jz\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u00c6\u0001\u00a2\u0006\u0002\u00100J\t\u00101\u001a\u00020\u000eH\u00d6\u0001J\u0013\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u00105\u001a\u00020\u000eH\u00d6\u0001J\t\u00106\u001a\u00020\u0010H\u00d6\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%\u00a8\u0006="}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "isGooglePayReady", "", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "statusBarColor", "", "injectorKey", "", "enableLogging", "productUsage", "", "(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Set;)V", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getEnableLogging", "()Z", "getInjectorKey", "()Ljava/lang/String;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getPaymentMethods", "()Ljava/util/List;", "getProductUsage", "()Ljava/util/Set;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Set;)Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_debug"})
    public static final class Args implements com.stripe.android.view.ActivityStarter.Args {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.StripeIntent stripeIntent = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.Configuration config = null;
        private final boolean isGooglePayReady = false;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.model.PaymentSelection.New.Card newCard = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String injectorKey = null;
        private final boolean enableLogging = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<java.lang.String> productUsage = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.PaymentOptionContract.Args.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentOptionContract.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentOptionContract.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
        java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config, boolean isGooglePayReady, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.model.PaymentSelection.New.Card newCard, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.ColorInt()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey, boolean enableLogging, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
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
        
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.NotNull()
        java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config, boolean isGooglePayReady, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.model.PaymentSelection.New.Card newCard, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.ColorInt()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey, boolean enableLogging, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> productUsage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeIntent component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.StripeIntent getStripeIntent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.PaymentMethod> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.model.PaymentMethod> getPaymentMethods() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration getConfig() {
            return null;
        }
        
        public final boolean component4() {
            return false;
        }
        
        public final boolean isGooglePayReady() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.model.PaymentSelection.New.Card component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.model.PaymentSelection.New.Card getNewCard() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusBarColor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getInjectorKey() {
            return null;
        }
        
        public final boolean component8() {
            return false;
        }
        
        public final boolean getEnableLogging() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getProductUsage() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentOptionContract.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentOptionContract.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentOptionContract.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "intent", "Landroid/content/Intent;", "fromIntent$paymentsheet_debug", "paymentsheet_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.paymentsheet.PaymentOptionContract.Args fromIntent$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Companion;", "", "()V", "EXTRA_ARGS", "", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
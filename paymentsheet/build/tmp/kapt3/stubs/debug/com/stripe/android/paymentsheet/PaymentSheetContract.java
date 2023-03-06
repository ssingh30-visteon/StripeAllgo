package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000e\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "Result", "paymentsheet_debug"})
public final class PaymentSheetContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.paymentsheet.PaymentSheetContract.Args, com.stripe.android.paymentsheet.PaymentSheetResult> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.PaymentSheetContract.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ARGS = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_args";
    private static final java.lang.String EXTRA_RESULT = "com.stripe.android.paymentsheet.PaymentSheetContract.extra_result";
    
    public PaymentSheetContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.PaymentSheetResult parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c0\u0003\u00a2\u0006\u0002\b\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c0\u0003\u00a2\u0006\u0004\b\u001d\u0010\u0016J\u000e\u0010\u001e\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\b\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00d6\u0001J\t\u0010(\u001a\u00020\tH\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0007H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "statusBarColor", "", "injectorKey", "", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/Integer;Ljava/lang/String;)V", "getClientSecret$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getConfig$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "googlePayConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getGooglePayConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getInjectorKey$paymentsheet_debug", "()Ljava/lang/String;", "getStatusBarColor$paymentsheet_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$paymentsheet_debug", "component2", "component2$paymentsheet_debug", "component3", "component3$paymentsheet_debug", "component4", "component4$paymentsheet_debug", "copy", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_debug"})
    public static final class Args implements com.stripe.android.view.ActivityStarter.Args {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.paymentsheet.model.ClientSecret clientSecret = null;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.paymentsheet.PaymentSheet.Configuration config = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String injectorKey = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.PaymentSheetContract.Args.Companion Companion = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetContract.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheetContract.Args copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.ColorInt()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey) {
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
        
        @androidx.annotation.VisibleForTesting()
        public Args(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.Nullable()
        @androidx.annotation.ColorInt()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.model.ClientSecret component1$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.model.ClientSecret getClientSecret$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration component2$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.Configuration getConfig$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusBarColor$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getInjectorKey$paymentsheet_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.PaymentSheet.GooglePayConfiguration getGooglePayConfig() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetContract.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u000bJ\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args$Companion;", "", "()V", "createPaymentIntentArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "clientSecret", "", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "createPaymentIntentArgsWithInjectorKey", "injectorKey", "createPaymentIntentArgsWithInjectorKey$paymentsheet_debug", "createSetupIntentArgs", "createSetupIntentArgsWithInjectorKey", "createSetupIntentArgsWithInjectorKey$paymentsheet_debug", "fromIntent", "intent", "Landroid/content/Intent;", "fromIntent$paymentsheet_debug", "paymentsheet_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args fromIntent$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
            android.content.Intent intent) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args createPaymentIntentArgs(@org.jetbrains.annotations.NotNull()
            java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args createSetupIntentArgs(@org.jetbrains.annotations.NotNull()
            java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args createPaymentIntentArgsWithInjectorKey$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
            java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Args createSetupIntentArgsWithInjectorKey$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
            java.lang.String clientSecret, @org.jetbrains.annotations.Nullable()
            com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.NotNull()
            @com.stripe.android.payments.core.injection.InjectorKey()
            java.lang.String injectorKey) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "paymentSheetResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", "getPaymentSheetResult", "()Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_debug"})
    public static final class Result implements com.stripe.android.view.ActivityStarter.Result {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.paymentsheet.PaymentSheetResult paymentSheetResult = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetContract.Result> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheetContract.Result copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetResult paymentSheetResult) {
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
        
        public Result(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentSheetResult paymentSheetResult) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheetResult component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.PaymentSheetResult getPaymentSheetResult() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.os.Bundle toBundle() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.paymentsheet.PaymentSheetContract.Result> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Result createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.paymentsheet.PaymentSheetContract.Result[] newArray(int size) {
                return null;
            }
        }
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Companion;", "", "()V", "EXTRA_ARGS", "", "getEXTRA_ARGS$annotations", "EXTRA_RESULT", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
        @java.lang.Deprecated()
        public static void getEXTRA_ARGS$annotations() {
        }
    }
}
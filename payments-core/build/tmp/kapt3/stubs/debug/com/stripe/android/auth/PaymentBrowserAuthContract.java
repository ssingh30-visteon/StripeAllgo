package com.stripe.android.auth;

import java.lang.System;

/**
 * An [ActivityResultContract] for completing payment authentication in a browser. This will
 * be handled in either [StripeBrowserLauncherActivity] or [PaymentAuthWebViewActivity].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Args", "Companion", "payments-core_debug"})
public final class PaymentBrowserAuthContract extends androidx.activity.result.contract.ActivityResultContract<com.stripe.android.auth.PaymentBrowserAuthContract.Args, com.stripe.android.payments.PaymentFlowResult.Unvalidated> {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.auth.PaymentBrowserAuthContract.Companion Companion = null;
    private static final java.lang.String EXTRA_ARGS = "extra_args";
    
    public PaymentBrowserAuthContract() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Intent createIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.auth.PaymentBrowserAuthContract.Args input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.payments.PaymentFlowResult.Unvalidated parseResult(int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\nH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\u008e\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00102J\t\u00103\u001a\u00020\u0005H\u00d6\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\u0015\u00107\u001a\u00020\n2\u0006\u00108\u001a\u000209H\u0000\u00a2\u0006\u0002\b:J\t\u0010;\u001a\u00020\u0005H\u00d6\u0001J\u0006\u0010<\u001a\u00020=J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014\u00a8\u0006D"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Landroid/os/Parcelable;", "objectId", "", "requestCode", "", "clientSecret", "url", "returnUrl", "enableLogging", "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "stripeAccountId", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "statusBarColor", "publishableKey", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;)V", "getClientSecret", "()Ljava/lang/String;", "getEnableLogging", "()Z", "getObjectId", "getPublishableKey", "getRequestCode", "()I", "getReturnUrl", "getShouldCancelIntentOnUserNavigation", "getShouldCancelSource", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStripeAccountId", "getToolbarCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getUrl", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "describeContents", "equals", "other", "", "hasDefaultReturnUrl", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "hasDefaultReturnUrl$payments_core_debug", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Args implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String objectId = null;
        private final int requestCode = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String clientSecret = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String returnUrl = null;
        private final boolean enableLogging = false;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization toolbarCustomization = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stripeAccountId = null;
        
        /**
         * TODO(mshafrir-stripe): we should probably rename this to `canCancelSource`
         */
        private final boolean shouldCancelSource = false;
        
        /**
         * For most payment methods, if the user navigates away from the webview
         * (e.g. by pressing the back button or tapping "close" in the menu bar),
         * we assume the confirmation flow has been cancelled.
         *
         * However, for some payment methods, such as OXXO, no immediate user action is required.
         * Simply displaying the web view is all we need to do, and we expect the user to
         * navigate away after this.
         */
        private final boolean shouldCancelIntentOnUserNavigation = false;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer statusBarColor = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String publishableKey = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.auth.PaymentBrowserAuthContract.Args> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.auth.PaymentBrowserAuthContract.Args copy(@org.jetbrains.annotations.NotNull()
        java.lang.String objectId, int requestCode, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String returnUrl, boolean enableLogging, @org.jetbrains.annotations.Nullable()
        com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization toolbarCustomization, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, boolean shouldCancelSource, boolean shouldCancelIntentOnUserNavigation, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey) {
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
        java.lang.String objectId, int requestCode, @org.jetbrains.annotations.NotNull()
        java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String returnUrl, boolean enableLogging, @org.jetbrains.annotations.Nullable()
        com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization toolbarCustomization, @org.jetbrains.annotations.Nullable()
        java.lang.String stripeAccountId, boolean shouldCancelSource, boolean shouldCancelIntentOnUserNavigation, @org.jetbrains.annotations.Nullable()
        java.lang.Integer statusBarColor, @org.jetbrains.annotations.NotNull()
        java.lang.String publishableKey) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getObjectId() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getRequestCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getClientSecret() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getReturnUrl() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        public final boolean getEnableLogging() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization getToolbarCustomization() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStripeAccountId() {
            return null;
        }
        
        /**
         * TODO(mshafrir-stripe): we should probably rename this to `canCancelSource`
         */
        public final boolean component9() {
            return false;
        }
        
        /**
         * TODO(mshafrir-stripe): we should probably rename this to `canCancelSource`
         */
        public final boolean getShouldCancelSource() {
            return false;
        }
        
        /**
         * For most payment methods, if the user navigates away from the webview
         * (e.g. by pressing the back button or tapping "close" in the menu bar),
         * we assume the confirmation flow has been cancelled.
         *
         * However, for some payment methods, such as OXXO, no immediate user action is required.
         * Simply displaying the web view is all we need to do, and we expect the user to
         * navigate away after this.
         */
        public final boolean component10() {
            return false;
        }
        
        /**
         * For most payment methods, if the user navigates away from the webview
         * (e.g. by pressing the back button or tapping "close" in the menu bar),
         * we assume the confirmation flow has been cancelled.
         *
         * However, for some payment methods, such as OXXO, no immediate user action is required.
         * Simply displaying the web view is all we need to do, and we expect the user to
         * navigate away after this.
         */
        public final boolean getShouldCancelIntentOnUserNavigation() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getStatusBarColor() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPublishableKey() {
            return null;
        }
        
        /**
         * Pre-requisite for using [StripeBrowserLauncherActivity].
         * If false, use [PaymentAuthWebViewActivity].
         */
        public final boolean hasDefaultReturnUrl$payments_core_debug(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.DefaultReturnUrl defaultReturnUrl) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.os.Bundle toBundle() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.auth.PaymentBrowserAuthContract.Args> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.auth.PaymentBrowserAuthContract.Args createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.auth.PaymentBrowserAuthContract.Args[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Companion;", "", "()V", "EXTRA_ARGS", "", "parseArgs", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "intent", "Landroid/content/Intent;", "parseArgs$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.auth.PaymentBrowserAuthContract.Args parseArgs$payments_core_debug(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return null;
        }
    }
}
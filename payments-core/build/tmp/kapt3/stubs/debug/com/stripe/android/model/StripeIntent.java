package com.stripe.android.model;

import java.lang.System;

/**
 * An interface for methods available in [PaymentIntent] and [SetupIntent]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004./01J\b\u0010,\u001a\u00020\u000fH&J\b\u0010-\u001a\u00020\u000fH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0005R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u0004\u0018\u00010\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b+\u0010%\u0082\u0001\u000223\u00a8\u00064"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/model/StripeModel;", "clientSecret", "", "getClientSecret", "()Ljava/lang/String;", "created", "", "getCreated", "()J", "description", "getDescription", "id", "getId", "isConfirmed", "", "()Z", "isLiveMode", "lastErrorMessage", "getLastErrorMessage", "nextActionData", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "nextActionType", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethodId", "getPaymentMethodId", "paymentMethodTypes", "", "getPaymentMethodTypes", "()Ljava/util/List;", "status", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "()Lcom/stripe/android/model/StripeIntent$Status;", "unactivatedPaymentMethods", "getUnactivatedPaymentMethods", "requiresAction", "requiresConfirmation", "NextActionData", "NextActionType", "Status", "Usage", "Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/SetupIntent;", "payments-core_debug"})
public abstract interface StripeIntent extends com.stripe.android.model.StripeModel {
    
    /**
     * Unique identifier for the object.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getId();
    
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public abstract long getCreated();
    
    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getDescription();
    
    /**
     * Has the value true if the object exists in live mode or the value false if the object exists
     * in test mode.
     */
    public abstract boolean isLiveMode();
    
    /**
     * The expanded [PaymentMethod] represented by [paymentMethodId].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.PaymentMethod getPaymentMethod();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getPaymentMethodId();
    
    /**
     * The list of payment method types (e.g. card) that this PaymentIntent is allowed to use.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getPaymentMethodTypes();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.StripeIntent.NextActionType getNextActionType();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getClientSecret();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.StripeIntent.Status getStatus();
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.stripe.android.model.StripeIntent.NextActionData getNextActionData();
    
    /**
     * Whether confirmation has succeeded and all required actions have been handled.
     */
    public abstract boolean isConfirmed();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getLastErrorMessage();
    
    /**
     * Payment types that have not been activated in livemode, but have been activated in testmode.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getUnactivatedPaymentMethods();
    
    public abstract boolean requiresAction();
    
    public abstract boolean requiresConfirmation();
    
    /**
     * Type of the next action to perform.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "RedirectToUrl", "UseStripeSdk", "DisplayOxxoDetails", "AlipayRedirect", "BlikAuthorize", "WeChatPayRedirect", "Companion", "payments-core_debug"})
    public static enum NextActionType {
        /*public static final*/ RedirectToUrl /* = new RedirectToUrl(null) */,
        /*public static final*/ UseStripeSdk /* = new UseStripeSdk(null) */,
        /*public static final*/ DisplayOxxoDetails /* = new DisplayOxxoDetails(null) */,
        /*public static final*/ AlipayRedirect /* = new AlipayRedirect(null) */,
        /*public static final*/ BlikAuthorize /* = new BlikAuthorize(null) */,
        /*public static final*/ WeChatPayRedirect /* = new WeChatPayRedirect(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.StripeIntent.NextActionType.Companion Companion = null;
        
        NextActionType(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionType$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.StripeIntent.NextActionType fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    /**
     * - [The Intent State Machine - Intent statuses](https://stripe.com/docs/payments/intents#intent-statuses)
     * - [PaymentIntent.status API reference](https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status)
     * - [SetupIntent.status API reference](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status)
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "Canceled", "Processing", "RequiresAction", "RequiresConfirmation", "RequiresPaymentMethod", "Succeeded", "RequiresCapture", "Companion", "payments-core_debug"})
    public static enum Status {
        /*public static final*/ Canceled /* = new Canceled(null) */,
        /*public static final*/ Processing /* = new Processing(null) */,
        /*public static final*/ RequiresAction /* = new RequiresAction(null) */,
        /*public static final*/ RequiresConfirmation /* = new RequiresConfirmation(null) */,
        /*public static final*/ RequiresPaymentMethod /* = new RequiresPaymentMethod(null) */,
        /*public static final*/ Succeeded /* = new Succeeded(null) */,
        /*public static final*/ RequiresCapture /* = new RequiresCapture(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.StripeIntent.Status.Companion Companion = null;
        
        Status(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Status;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.StripeIntent.Status fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    /**
     * See [setup_intent.usage](https://stripe.com/docs/api/setup_intents/object#setup_intent_object-usage) and
     * [Reusing Cards](https://stripe.com/docs/payments/cards/reusing-cards).
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "toString", "OnSession", "OffSession", "OneTime", "Companion", "payments-core_debug"})
    public static enum Usage {
        /*public static final*/ OnSession /* = new OnSession(null) */,
        /*public static final*/ OffSession /* = new OffSession(null) */,
        /*public static final*/ OneTime /* = new OneTime(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.StripeIntent.Usage.Companion Companion = null;
        
        Usage(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$Usage$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/StripeIntent$Usage;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.StripeIntent.Usage fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/model/StripeModel;", "()V", "AlipayRedirect", "BlikAuthorize", "DisplayOxxoDetails", "RedirectToUrl", "SdkData", "WeChatPayRedirect", "Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "payments-core_debug"})
    public static abstract class NextActionData implements com.stripe.android.model.StripeModel {
        
        private NextActionData() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$DisplayOxxoDetails;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "expiresAfter", "", "number", "", "hostedVoucherUrl", "(ILjava/lang/String;Ljava/lang/String;)V", "getExpiresAfter", "()I", "getHostedVoucherUrl", "()Ljava/lang/String;", "getNumber", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class DisplayOxxoDetails extends com.stripe.android.model.StripeIntent.NextActionData {
            
            /**
             * The timestamp after which the OXXO expires.
             */
            private final int expiresAfter = 0;
            
            /**
             * The OXXO number.
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String number = null;
            
            /**
             * URL of a webpage containing the voucher for this OXXO payment.
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String hostedVoucherUrl = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails copy(int expiresAfter, @org.jetbrains.annotations.Nullable()
            java.lang.String number, @org.jetbrains.annotations.Nullable()
            java.lang.String hostedVoucherUrl) {
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
            
            public DisplayOxxoDetails() {
                super();
            }
            
            public DisplayOxxoDetails(int expiresAfter, @org.jetbrains.annotations.Nullable()
            java.lang.String number, @org.jetbrains.annotations.Nullable()
            java.lang.String hostedVoucherUrl) {
                super();
            }
            
            /**
             * The timestamp after which the OXXO expires.
             */
            public final int component1() {
                return 0;
            }
            
            /**
             * The timestamp after which the OXXO expires.
             */
            public final int getExpiresAfter() {
                return 0;
            }
            
            /**
             * The OXXO number.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            /**
             * The OXXO number.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getNumber() {
                return null;
            }
            
            /**
             * URL of a webpage containing the voucher for this OXXO payment.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component3() {
                return null;
            }
            
            /**
             * URL of a webpage containing the voucher for this OXXO payment.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getHostedVoucherUrl() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.DisplayOxxoDetails[] newArray(int size) {
                    return null;
                }
            }
        }
        
        /**
         * Contains instructions for authenticating by redirecting your customer to another
         * page or application.
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$RedirectToUrl;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "url", "Landroid/net/Uri;", "returnUrl", "", "(Landroid/net/Uri;Ljava/lang/String;)V", "getReturnUrl", "()Ljava/lang/String;", "getUrl", "()Landroid/net/Uri;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class RedirectToUrl extends com.stripe.android.model.StripeIntent.NextActionData {
            
            /**
             * The URL you must redirect your customer to in order to authenticate.
             */
            @org.jetbrains.annotations.NotNull()
            private final android.net.Uri url = null;
            
            /**
             * If the customer does not exit their browser while authenticating, they will be redirected
             * to this specified URL after completion.
             */
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String returnUrl = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl> CREATOR = null;
            
            /**
             * Contains instructions for authenticating by redirecting your customer to another
             * page or application.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl copy(@org.jetbrains.annotations.NotNull()
            android.net.Uri url, @org.jetbrains.annotations.Nullable()
            java.lang.String returnUrl) {
                return null;
            }
            
            /**
             * Contains instructions for authenticating by redirecting your customer to another
             * page or application.
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Contains instructions for authenticating by redirecting your customer to another
             * page or application.
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Contains instructions for authenticating by redirecting your customer to another
             * page or application.
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public RedirectToUrl(@org.jetbrains.annotations.NotNull()
            android.net.Uri url, @org.jetbrains.annotations.Nullable()
            java.lang.String returnUrl) {
                super();
            }
            
            /**
             * The URL you must redirect your customer to in order to authenticate.
             */
            @org.jetbrains.annotations.NotNull()
            public final android.net.Uri component1() {
                return null;
            }
            
            /**
             * The URL you must redirect your customer to in order to authenticate.
             */
            @org.jetbrains.annotations.NotNull()
            public final android.net.Uri getUrl() {
                return null;
            }
            
            /**
             * If the customer does not exit their browser while authenticating, they will be redirected
             * to this specified URL after completion.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            /**
             * If the customer does not exit their browser while authenticating, they will be redirected
             * to this specified URL after completion.
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReturnUrl() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.RedirectToUrl[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "data", "", "webViewUrl", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "authCompleteUrl", "Landroid/net/Uri;", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getAuthCompleteUrl", "()Ljava/lang/String;", "getData", "getReturnUrl", "getWebViewUrl", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class AlipayRedirect extends com.stripe.android.model.StripeIntent.NextActionData {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String data = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String authCompleteUrl = null;
            @org.jetbrains.annotations.NotNull()
            private final android.net.Uri webViewUrl = null;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String returnUrl = null;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect.Companion Companion = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect copy(@org.jetbrains.annotations.NotNull()
            java.lang.String data, @org.jetbrains.annotations.Nullable()
            java.lang.String authCompleteUrl, @org.jetbrains.annotations.NotNull()
            android.net.Uri webViewUrl, @org.jetbrains.annotations.Nullable()
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
            
            public AlipayRedirect(@org.jetbrains.annotations.NotNull()
            java.lang.String data, @org.jetbrains.annotations.Nullable()
            java.lang.String authCompleteUrl, @org.jetbrains.annotations.NotNull()
            android.net.Uri webViewUrl, @org.jetbrains.annotations.Nullable()
            java.lang.String returnUrl) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getData() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getAuthCompleteUrl() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.net.Uri component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.net.Uri getWebViewUrl() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getReturnUrl() {
                return null;
            }
            
            public AlipayRedirect(@org.jetbrains.annotations.NotNull()
            java.lang.String data, @org.jetbrains.annotations.NotNull()
            java.lang.String webViewUrl, @org.jetbrains.annotations.Nullable()
            java.lang.String returnUrl) {
                super();
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$AlipayRedirect$Companion;", "", "()V", "extractReturnUrl", "", "data", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
                
                /**
                 * The alipay data string is formatted as query parameters.
                 * When authenticate is complete, we make a request to the
                 * return_url param, as a hint to the backend to ping Alipay for
                 * the updated state
                 */
                private final java.lang.String extractReturnUrl(java.lang.String data) {
                    return null;
                }
            }
        }
        
        /**
         * When confirming a [PaymentIntent] or [SetupIntent] with the Stripe SDK, the Stripe SDK
         * depends on this property to invoke authentication flows. The shape of the contents is subject
         * to change and is only intended to be used by the Stripe SDK.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "Use3DS1", "Use3DS2", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "payments-core_debug"})
        public static abstract class SdkData extends com.stripe.android.model.StripeIntent.NextActionData {
            
            private SdkData() {
                super();
            }
            
            @kotlinx.parcelize.Parcelize()
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS1;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
            public static final class Use3DS1 extends com.stripe.android.model.StripeIntent.NextActionData.SdkData {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String url = null;
                public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS1> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS1 copy(@org.jetbrains.annotations.NotNull()
                java.lang.String url) {
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
                
                public Use3DS1(@org.jetbrains.annotations.NotNull()
                java.lang.String url) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getUrl() {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS1> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS1 createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS1[] newArray(int size) {
                        return null;
                    }
                }
            }
            
            @kotlinx.parcelize.Parcelize()
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData;", "source", "", "serverName", "transactionId", "serverEncryption", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;)V", "getServerEncryption", "()Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "getServerName", "()Ljava/lang/String;", "getSource", "getTransactionId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "DirectoryServerEncryption", "payments-core_debug"})
            public static final class Use3DS2 extends com.stripe.android.model.StripeIntent.NextActionData.SdkData {
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String source = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String serverName = null;
                @org.jetbrains.annotations.NotNull()
                private final java.lang.String transactionId = null;
                @org.jetbrains.annotations.NotNull()
                private final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption serverEncryption = null;
                public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 copy(@org.jetbrains.annotations.NotNull()
                java.lang.String source, @org.jetbrains.annotations.NotNull()
                java.lang.String serverName, @org.jetbrains.annotations.NotNull()
                java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
                com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption serverEncryption) {
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
                
                public Use3DS2(@org.jetbrains.annotations.NotNull()
                java.lang.String source, @org.jetbrains.annotations.NotNull()
                java.lang.String serverName, @org.jetbrains.annotations.NotNull()
                java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
                com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption serverEncryption) {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getSource() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getServerName() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getTransactionId() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption getServerEncryption() {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2 createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2[] newArray(int size) {
                        return null;
                    }
                }
                
                @kotlinx.parcelize.Parcelize()
                @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "directoryServerId", "", "dsCertificateData", "rootCertsData", "", "keyId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDirectoryServerId", "()Ljava/lang/String;", "getDsCertificateData", "getKeyId", "getRootCertsData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
                public static final class DirectoryServerEncryption implements android.os.Parcelable {
                    @org.jetbrains.annotations.NotNull()
                    private final java.lang.String directoryServerId = null;
                    @org.jetbrains.annotations.NotNull()
                    private final java.lang.String dsCertificateData = null;
                    @org.jetbrains.annotations.NotNull()
                    private final java.util.List<java.lang.String> rootCertsData = null;
                    @org.jetbrains.annotations.Nullable()
                    private final java.lang.String keyId = null;
                    public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption> CREATOR = null;
                    
                    @org.jetbrains.annotations.NotNull()
                    public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption copy(@org.jetbrains.annotations.NotNull()
                    java.lang.String directoryServerId, @org.jetbrains.annotations.NotNull()
                    java.lang.String dsCertificateData, @org.jetbrains.annotations.NotNull()
                    java.util.List<java.lang.String> rootCertsData, @org.jetbrains.annotations.Nullable()
                    java.lang.String keyId) {
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
                    
                    public DirectoryServerEncryption(@org.jetbrains.annotations.NotNull()
                    java.lang.String directoryServerId, @org.jetbrains.annotations.NotNull()
                    java.lang.String dsCertificateData, @org.jetbrains.annotations.NotNull()
                    java.util.List<java.lang.String> rootCertsData, @org.jetbrains.annotations.Nullable()
                    java.lang.String keyId) {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final java.lang.String component1() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final java.lang.String getDirectoryServerId() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final java.lang.String component2() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final java.lang.String getDsCertificateData() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final java.util.List<java.lang.String> component3() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    public final java.util.List<java.lang.String> getRootCertsData() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable()
                    public final java.lang.String component4() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable()
                    public final java.lang.String getKeyId() {
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
                    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption> {
                        
                        public Creator() {
                            super();
                        }
                        
                        @org.jetbrains.annotations.NotNull()
                        @java.lang.Override()
                        public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption createFromParcel(@org.jetbrains.annotations.NotNull()
                        android.os.Parcel in) {
                            return null;
                        }
                        
                        @org.jetbrains.annotations.NotNull()
                        @java.lang.Override()
                        public final com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption[] newArray(int size) {
                            return null;
                        }
                    }
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$BlikAuthorize;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class BlikAuthorize extends com.stripe.android.model.StripeIntent.NextActionData {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize> CREATOR = null;
            
            private BlikAuthorize() {
                super();
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.BlikAuthorize[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/StripeIntent$NextActionData$WeChatPayRedirect;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "weChat", "Lcom/stripe/android/model/WeChat;", "(Lcom/stripe/android/model/WeChat;)V", "getWeChat", "()Lcom/stripe/android/model/WeChat;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
        public static final class WeChatPayRedirect extends com.stripe.android.model.StripeIntent.NextActionData {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.WeChat weChat = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.WeChat weChat) {
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
            
            public WeChatPayRedirect(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.WeChat weChat) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.WeChat component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.WeChat getWeChat() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.StripeIntent.NextActionData.WeChatPayRedirect[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}
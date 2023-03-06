package com.stripe.android.model;

import java.lang.System;

/**
 * Mandate Data parameters for
 * [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data)
 * or [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004H\u00c2\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\b\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00d6\u0001J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u00d6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/MandateDataParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/MandateDataParams$Type;", "(Lcom/stripe/android/model/MandateDataParams$Type;)V", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_debug"})
public final class MandateDataParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    private final com.stripe.android.model.MandateDataParams.Type type = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.MandateDataParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CUSTOMER_ACCEPTANCE = "customer_acceptance";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_TYPE = "type";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.MandateDataParams> CREATOR = null;
    
    /**
     * Mandate Data parameters for
     * [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data)
     * or [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.MandateDataParams copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.MandateDataParams.Type type) {
        return null;
    }
    
    /**
     * Mandate Data parameters for
     * [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data)
     * or [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Mandate Data parameters for
     * [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data)
     * or [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Mandate Data parameters for
     * [confirming a PaymentIntent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data)
     * or [confirming a SetupIntent](https://stripe.com/docs/api/setup_intents/confirm#confirm_setup_intent-mandate_data)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MandateDataParams(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.MandateDataParams.Type type) {
        super();
    }
    
    private final com.stripe.android.model.MandateDataParams.Type component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.MandateDataParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.MandateDataParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.MandateDataParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Type;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "code", "", "(Ljava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Online", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "payments-core_debug"})
    public static abstract class Type implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        private Type(java.lang.String code) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        /**
         * If this is a Mandate accepted online, this hash contains details about the online acceptance.
         *
         * [mandate_data.customer_acceptance.online](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online)
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B)\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\t\u0010\u000b\u001a\u00020\u0007H\u00c2\u0003J+\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u000eH\u00d6\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u00d6\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online;", "Lcom/stripe/android/model/MandateDataParams$Type;", "ipAddress", "", "userAgent", "(Ljava/lang/String;Ljava/lang/String;)V", "inferFromClient", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
        public static final class Online extends com.stripe.android.model.MandateDataParams.Type {
            
            /**
             * The IP address from which the Mandate was accepted by the customer.
             *
             * [mandate_data.customer_acceptance.online.ip_address](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online-ip_address)
             */
            private final java.lang.String ipAddress = null;
            
            /**
             * The user agent of the browser from which the Mandate was accepted by the customer.
             *
             * [mandate_data.customer_acceptance.online.user_agent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online-user_agent)
             */
            private final java.lang.String userAgent = null;
            private final boolean inferFromClient = false;
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.model.MandateDataParams.Type.Online.Companion Companion = null;
            private static final java.lang.String PARAM_IP_ADDRESS = "ip_address";
            private static final java.lang.String PARAM_USER_AGENT = "user_agent";
            private static final java.lang.String PARAM_INFER_FROM_CLIENT = "infer_from_client";
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.MandateDataParams.Type.Online DEFAULT = null;
            public static final android.os.Parcelable.Creator<com.stripe.android.model.MandateDataParams.Type.Online> CREATOR = null;
            
            /**
             * If this is a Mandate accepted online, this hash contains details about the online acceptance.
             *
             * [mandate_data.customer_acceptance.online](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.MandateDataParams.Type.Online copy(@org.jetbrains.annotations.Nullable()
            java.lang.String ipAddress, @org.jetbrains.annotations.Nullable()
            java.lang.String userAgent, boolean inferFromClient) {
                return null;
            }
            
            /**
             * If this is a Mandate accepted online, this hash contains details about the online acceptance.
             *
             * [mandate_data.customer_acceptance.online](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online)
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * If this is a Mandate accepted online, this hash contains details about the online acceptance.
             *
             * [mandate_data.customer_acceptance.online](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online)
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * If this is a Mandate accepted online, this hash contains details about the online acceptance.
             *
             * [mandate_data.customer_acceptance.online](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online)
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Online() {
                super(null);
            }
            
            public Online(@org.jetbrains.annotations.Nullable()
            java.lang.String ipAddress, @org.jetbrains.annotations.Nullable()
            java.lang.String userAgent, boolean inferFromClient) {
                super(null);
            }
            
            /**
             * The IP address from which the Mandate was accepted by the customer.
             *
             * [mandate_data.customer_acceptance.online.ip_address](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online-ip_address)
             */
            private final java.lang.String component1() {
                return null;
            }
            
            /**
             * The user agent of the browser from which the Mandate was accepted by the customer.
             *
             * [mandate_data.customer_acceptance.online.user_agent](https://stripe.com/docs/api/payment_intents/confirm#confirm_payment_intent-mandate_data-customer_acceptance-online-user_agent)
             */
            private final java.lang.String component2() {
                return null;
            }
            
            private final boolean component3() {
                return false;
            }
            
            public Online(@org.jetbrains.annotations.NotNull()
            java.lang.String ipAddress, @org.jetbrains.annotations.NotNull()
            java.lang.String userAgent) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.MandateDataParams.Type.Online> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.MandateDataParams.Type.Online createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.MandateDataParams.Type.Online[] newArray(int size) {
                    return null;
                }
            }
            
            @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;", "", "()V", "DEFAULT", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "getDEFAULT", "()Lcom/stripe/android/model/MandateDataParams$Type$Online;", "PARAM_INFER_FROM_CLIENT", "", "PARAM_IP_ADDRESS", "PARAM_USER_AGENT", "payments-core_debug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.MandateDataParams.Type.Online getDEFAULT() {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/MandateDataParams$Companion;", "", "()V", "PARAM_CUSTOMER_ACCEPTANCE", "", "PARAM_TYPE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.stripe.android.model;

import java.lang.System;

/**
 * Tokenization is the process Stripe uses to collect sensitive card, bank account details, Stripe
 * account details or personally identifiable information (PII), directly from your customers in a
 * secure manner. A Token representing this information is returned to you to use.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000223BG\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\'H\u00d6\u0001J\t\u0010,\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\'H\u00d6\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a\u00a8\u00064"}, d2 = {"Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", "type", "Lcom/stripe/android/model/Token$Type;", "created", "Ljava/util/Date;", "livemode", "", "used", "bankAccount", "Lcom/stripe/android/model/BankAccount;", "card", "Lcom/stripe/android/model/Card;", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Ljava/util/Date;ZZLcom/stripe/android/model/BankAccount;Lcom/stripe/android/model/Card;)V", "getBankAccount", "()Lcom/stripe/android/model/BankAccount;", "getCard", "()Lcom/stripe/android/model/Card;", "getCreated", "()Ljava/util/Date;", "getId", "()Ljava/lang/String;", "getLivemode", "()Z", "getType", "()Lcom/stripe/android/model/Token$Type;", "getUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_debug"})
public final class Token implements com.stripe.android.model.StripeModel, com.stripe.android.model.StripePaymentSource {
    
    /**
     * The Token id
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    
    /**
     * The [Type] of this token.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.Token.Type type = null;
    
    /**
     * The [Date] this token was created
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Date created = null;
    
    /**
     * `true` if this token is valid for a real payment, `false` if it is only usable for testing
     */
    private final boolean livemode = false;
    
    /**
     * `true` if this token has been used, `false` otherwise
     */
    private final boolean used = false;
    
    /**
     * If applicable, the [BankAccount] for this token
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.BankAccount bankAccount = null;
    
    /**
     * If applicable, the [Card] for this token
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Card card = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.Token.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.Token> CREATOR = null;
    
    /**
     * Tokenization is the process Stripe uses to collect sensitive card, bank account details, Stripe
     * account details or personally identifiable information (PII), directly from your customers in a
     * secure manner. A Token representing this information is returned to you to use.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Token copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Token.Type type, @org.jetbrains.annotations.NotNull()
    java.util.Date created, boolean livemode, boolean used, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccount bankAccount, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Card card) {
        return null;
    }
    
    /**
     * Tokenization is the process Stripe uses to collect sensitive card, bank account details, Stripe
     * account details or personally identifiable information (PII), directly from your customers in a
     * secure manner. A Token representing this information is returned to you to use.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Tokenization is the process Stripe uses to collect sensitive card, bank account details, Stripe
     * account details or personally identifiable information (PII), directly from your customers in a
     * secure manner. A Token representing this information is returned to you to use.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Tokenization is the process Stripe uses to collect sensitive card, bank account details, Stripe
     * account details or personally identifiable information (PII), directly from your customers in a
     * secure manner. A Token representing this information is returned to you to use.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Token(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.Token.Type type, @org.jetbrains.annotations.NotNull()
    java.util.Date created, boolean livemode, boolean used, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccount bankAccount, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Card card) {
        super();
    }
    
    /**
     * The Token id
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * The Token id
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    /**
     * The [Type] of this token.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Token.Type component2() {
        return null;
    }
    
    /**
     * The [Type] of this token.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.Token.Type getType() {
        return null;
    }
    
    /**
     * The [Date] this token was created
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component3() {
        return null;
    }
    
    /**
     * The [Date] this token was created
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCreated() {
        return null;
    }
    
    /**
     * `true` if this token is valid for a real payment, `false` if it is only usable for testing
     */
    public final boolean component4() {
        return false;
    }
    
    /**
     * `true` if this token is valid for a real payment, `false` if it is only usable for testing
     */
    public final boolean getLivemode() {
        return false;
    }
    
    /**
     * `true` if this token has been used, `false` otherwise
     */
    public final boolean component5() {
        return false;
    }
    
    /**
     * `true` if this token has been used, `false` otherwise
     */
    public final boolean getUsed() {
        return false;
    }
    
    /**
     * If applicable, the [BankAccount] for this token
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankAccount component6() {
        return null;
    }
    
    /**
     * If applicable, the [BankAccount] for this token
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankAccount getBankAccount() {
        return null;
    }
    
    /**
     * If applicable, the [Card] for this token
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Card component7() {
        return null;
    }
    
    /**
     * If applicable, the [Card] for this token
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Card getCard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.Token fromJson(@org.jetbrains.annotations.Nullable()
    org.json.JSONObject jsonObject) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.Token> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Token createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.Token[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/Token$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Card", "BankAccount", "Pii", "Account", "CvcUpdate", "Person", "Companion", "payments-core_debug"})
    public static enum Type {
        /*public static final*/ Card /* = new Card(null) */,
        /*public static final*/ BankAccount /* = new BankAccount(null) */,
        /*public static final*/ Pii /* = new Pii(null) */,
        /*public static final*/ Account /* = new Account(null) */,
        /*public static final*/ CvcUpdate /* = new CvcUpdate(null) */,
        /*public static final*/ Person /* = new Person(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.Token.Type.Companion Companion = null;
        
        Type(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Token$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Token$Type;", "code", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Token.Type fromCode(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/Token$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/Token;", "jsonObject", "Lorg/json/JSONObject;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.Token fromJson(@org.jetbrains.annotations.Nullable()
        org.json.JSONObject jsonObject) {
            return null;
        }
    }
}
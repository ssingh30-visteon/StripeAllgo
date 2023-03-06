package com.stripe.android.model;

import java.lang.System;

/**
 * [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002#$BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003JK\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018H\u00d6\u0001R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams;", "Lcom/stripe/android/model/TokenParams;", "country", "", "currency", "accountNumber", "accountHolderType", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "accountHolderName", "routingNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccountTokenParams$Type;Ljava/lang/String;Ljava/lang/String;)V", "typeDataParams", "", "", "getTypeDataParams", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_debug"})
public final class BankAccountTokenParams extends com.stripe.android.model.TokenParams {
    
    /**
     * The country in which the bank account is located.
     *
     * [bank_account.country](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-country)
     */
    private final java.lang.String country = null;
    
    /**
     * The currency the bank account is in. This must be a country/currency pairing that Stripe supports.
     *
     * [bank_account.currency](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-currency)
     */
    private final java.lang.String currency = null;
    
    /**
     * The account number for the bank account, in string form. Must be a checking account.
     *
     * [bank_account.account_number](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-account_number)
     */
    private final java.lang.String accountNumber = null;
    
    /**
     * The type of entity that holds the account. This can be either `individual` or `company`.
     * This field is required when attaching the bank account to a `Customer` object.
     *
     * [bank_account.account_holder_type](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-account_holder_type)
     */
    private final com.stripe.android.model.BankAccountTokenParams.Type accountHolderType = null;
    
    /**
     * The name of the person or business that owns the bank account. This field is required when
     * attaching the bank account to a `Customer` object.
     *
     * [bank_account.account_holder_name](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-account_holder_name)
     */
    private final java.lang.String accountHolderName = null;
    
    /**
     * The routing number, sort code, or other country-appropriate institution number for the
     * bank account. For US bank accounts, this is required and should be the ACH routing number,
     * not the wire routing number. If you are providing an IBAN for `account_number`,
     * this field is not required.
     *
     * [bank_account.routing_number](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-routing_number)
     */
    private final java.lang.String routingNumber = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.BankAccountTokenParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_COUNTRY = "country";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CURRENCY = "currency";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ACCOUNT_HOLDER_NAME = "account_holder_name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ACCOUNT_HOLDER_TYPE = "account_holder_type";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ROUTING_NUMBER = "routing_number";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ACCOUNT_NUMBER = "account_number";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.BankAccountTokenParams> CREATOR = null;
    
    /**
     * [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.BankAccountTokenParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccountTokenParams.Type accountHolderType, @org.jetbrains.annotations.Nullable()
    java.lang.String accountHolderName, @org.jetbrains.annotations.Nullable()
    java.lang.String routingNumber) {
        return null;
    }
    
    /**
     * [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [Create a bank account token](https://stripe.com/docs/api/tokens/create_bank_account)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public BankAccountTokenParams(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BankAccountTokenParams(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccountTokenParams.Type accountHolderType) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BankAccountTokenParams(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccountTokenParams.Type accountHolderType, @org.jetbrains.annotations.Nullable()
    java.lang.String accountHolderName) {
        super(null, null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BankAccountTokenParams(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccountTokenParams.Type accountHolderType, @org.jetbrains.annotations.Nullable()
    java.lang.String accountHolderName, @org.jetbrains.annotations.Nullable()
    java.lang.String routingNumber) {
        super(null, null);
    }
    
    /**
     * The country in which the bank account is located.
     *
     * [bank_account.country](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-country)
     */
    private final java.lang.String component1() {
        return null;
    }
    
    /**
     * The currency the bank account is in. This must be a country/currency pairing that Stripe supports.
     *
     * [bank_account.currency](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-currency)
     */
    private final java.lang.String component2() {
        return null;
    }
    
    /**
     * The account number for the bank account, in string form. Must be a checking account.
     *
     * [bank_account.account_number](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-account_number)
     */
    private final java.lang.String component3() {
        return null;
    }
    
    /**
     * The type of entity that holds the account. This can be either `individual` or `company`.
     * This field is required when attaching the bank account to a `Customer` object.
     *
     * [bank_account.account_holder_type](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-account_holder_type)
     */
    private final com.stripe.android.model.BankAccountTokenParams.Type component4() {
        return null;
    }
    
    /**
     * The name of the person or business that owns the bank account. This field is required when
     * attaching the bank account to a `Customer` object.
     *
     * [bank_account.account_holder_name](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-account_holder_name)
     */
    private final java.lang.String component5() {
        return null;
    }
    
    /**
     * The routing number, sort code, or other country-appropriate institution number for the
     * bank account. For US bank accounts, this is required and should be the ACH routing number,
     * not the wire routing number. If you are providing an IBAN for `account_number`,
     * this field is not required.
     *
     * [bank_account.routing_number](https://stripe.com/docs/api/tokens/create_bank_account#create_bank_account_token-bank_account-routing_number)
     */
    private final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> getTypeDataParams() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.BankAccountTokenParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.BankAccountTokenParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.BankAccountTokenParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Individual", "Company", "Companion", "payments-core_debug"})
    public static enum Type {
        /*public static final*/ Individual /* = new Individual(null) */,
        /*public static final*/ Company /* = new Company(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.BankAccountTokenParams.Type.Companion Companion = null;
        
        Type(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/BankAccountTokenParams$Type;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/BankAccountTokenParams$Companion;", "", "()V", "PARAM_ACCOUNT_HOLDER_NAME", "", "PARAM_ACCOUNT_HOLDER_TYPE", "PARAM_ACCOUNT_NUMBER", "PARAM_COUNTRY", "PARAM_CURRENCY", "PARAM_ROUTING_NUMBER", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
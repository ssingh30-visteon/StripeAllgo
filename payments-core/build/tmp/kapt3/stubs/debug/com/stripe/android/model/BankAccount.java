package com.stripe.android.model;

import java.lang.System;

/**
 * [The bank account object](https://stripe.com/docs/api/customer_bank_accounts/object)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u000267B\u007f\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0081\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u00d6\u0003J\t\u0010/\u001a\u00020*H\u00d6\u0001J\t\u00100\u001a\u00020\u0004H\u00d6\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00068"}, d2 = {"Lcom/stripe/android/model/BankAccount;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", "accountHolderName", "accountHolderType", "Lcom/stripe/android/model/BankAccount$Type;", "bankName", "countryCode", "currency", "fingerprint", "last4", "routingNumber", "status", "Lcom/stripe/android/model/BankAccount$Status;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)V", "getAccountHolderName", "()Ljava/lang/String;", "getAccountHolderType", "()Lcom/stripe/android/model/BankAccount$Type;", "getBankName", "getCountryCode", "getCurrency", "getFingerprint", "getId", "getLast4", "getRoutingNumber", "getStatus", "()Lcom/stripe/android/model/BankAccount$Status;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Status", "Type", "payments-core_debug"})
public final class BankAccount implements com.stripe.android.model.StripeModel, com.stripe.android.model.StripePaymentSource {
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String id = null;
    
    /**
     * The name of the person or business that owns the bank account.
     *
     * [account_holder_name](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-account_holder_name)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String accountHolderName = null;
    
    /**
     * The type of entity that holds the account. This can be either individual or company.
     *
     * [account_holder_type](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-account_holder_type)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.BankAccount.Type accountHolderType = null;
    
    /**
     * Name of the bank associated with the routing number (e.g., WELLS FARGO).
     *
     * [bank_name](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-bank_name)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bankName = null;
    
    /**
     * Two-letter ISO code representing the country the bank account is located in.
     *
     * [country](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-country)
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 2L)
    private final java.lang.String countryCode = null;
    
    /**
     * Three-letter ISO code for the currency paid out to the bank account.
     *
     * [currency](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-currency)
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 3L)
    private final java.lang.String currency = null;
    
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check
     * whether two bank accounts are the same.
     *
     * [fingerprint](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-fingerprint)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String fingerprint = null;
    
    /**
     * [last4](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-last4)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last4 = null;
    
    /**
     * The routing transit number for the bank account.
     *
     * [routing_number](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-routing_number)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String routingNumber = null;
    
    /**
     * For bank accounts, possible values are `new`, `validated`, `verified`, `verification_failed`,
     * or `errored`. A bank account that hasn’t had any activity or validation performed is new.
     * If Stripe can determine that the bank account exists, its status will be `validated`. Note
     * that there often isn’t enough information to know (e.g., for smaller credit unions), and
     * the validation is not always run. If customer bank account verification has succeeded,
     * the bank account status will be `verified`. If the verification failed for any reason,
     * such as microdeposit failure, the status will be `verification_failed`. If a transfer sent
     * to this bank account fails, we’ll set the status to `errored` and will not continue to send
     * transfers until the bank details are updated.
     *
     * For external accounts, possible values are `new` and `errored`. Validations aren’t run
     * against external accounts because they’re only used for payouts. This means the other
     * statuses don’t apply. If a transfer fails, the status is set to `errored` and transfers
     * are stopped until account details are updated.
     *
     * [status](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-status)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.BankAccount.Status status = null;
    public static final android.os.Parcelable.Creator<com.stripe.android.model.BankAccount> CREATOR = null;
    
    /**
     * [The bank account object](https://stripe.com/docs/api/customer_bank_accounts/object)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.BankAccount copy(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String accountHolderName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccount.Type accountHolderType, @org.jetbrains.annotations.Nullable()
    java.lang.String bankName, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 2L)
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 3L)
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
    java.lang.String last4, @org.jetbrains.annotations.Nullable()
    java.lang.String routingNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccount.Status status) {
        return null;
    }
    
    /**
     * [The bank account object](https://stripe.com/docs/api/customer_bank_accounts/object)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [The bank account object](https://stripe.com/docs/api/customer_bank_accounts/object)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [The bank account object](https://stripe.com/docs/api/customer_bank_accounts/object)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BankAccount() {
        super();
    }
    
    public BankAccount(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    java.lang.String accountHolderName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccount.Type accountHolderType, @org.jetbrains.annotations.Nullable()
    java.lang.String bankName, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 2L)
    java.lang.String countryCode, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 3L)
    java.lang.String currency, @org.jetbrains.annotations.Nullable()
    java.lang.String fingerprint, @org.jetbrains.annotations.Nullable()
    java.lang.String last4, @org.jetbrains.annotations.Nullable()
    java.lang.String routingNumber, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankAccount.Status status) {
        super();
    }
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Unique identifier for the object.
     *
     * [id](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-id)
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getId() {
        return null;
    }
    
    /**
     * The name of the person or business that owns the bank account.
     *
     * [account_holder_name](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-account_holder_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * The name of the person or business that owns the bank account.
     *
     * [account_holder_name](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-account_holder_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountHolderName() {
        return null;
    }
    
    /**
     * The type of entity that holds the account. This can be either individual or company.
     *
     * [account_holder_type](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-account_holder_type)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankAccount.Type component3() {
        return null;
    }
    
    /**
     * The type of entity that holds the account. This can be either individual or company.
     *
     * [account_holder_type](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-account_holder_type)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankAccount.Type getAccountHolderType() {
        return null;
    }
    
    /**
     * Name of the bank associated with the routing number (e.g., WELLS FARGO).
     *
     * [bank_name](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-bank_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Name of the bank associated with the routing number (e.g., WELLS FARGO).
     *
     * [bank_name](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-bank_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBankName() {
        return null;
    }
    
    /**
     * Two-letter ISO code representing the country the bank account is located in.
     *
     * [country](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-country)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * Two-letter ISO code representing the country the bank account is located in.
     *
     * [country](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-country)
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 2L)
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    /**
     * Three-letter ISO code for the currency paid out to the bank account.
     *
     * [currency](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-currency)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Three-letter ISO code for the currency paid out to the bank account.
     *
     * [currency](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-currency)
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Size(value = 3L)
    public final java.lang.String getCurrency() {
        return null;
    }
    
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check
     * whether two bank accounts are the same.
     *
     * [fingerprint](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-fingerprint)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check
     * whether two bank accounts are the same.
     *
     * [fingerprint](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-fingerprint)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFingerprint() {
        return null;
    }
    
    /**
     * [last4](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-last4)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * [last4](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-last4)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast4() {
        return null;
    }
    
    /**
     * The routing transit number for the bank account.
     *
     * [routing_number](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-routing_number)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * The routing transit number for the bank account.
     *
     * [routing_number](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-routing_number)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRoutingNumber() {
        return null;
    }
    
    /**
     * For bank accounts, possible values are `new`, `validated`, `verified`, `verification_failed`,
     * or `errored`. A bank account that hasn’t had any activity or validation performed is new.
     * If Stripe can determine that the bank account exists, its status will be `validated`. Note
     * that there often isn’t enough information to know (e.g., for smaller credit unions), and
     * the validation is not always run. If customer bank account verification has succeeded,
     * the bank account status will be `verified`. If the verification failed for any reason,
     * such as microdeposit failure, the status will be `verification_failed`. If a transfer sent
     * to this bank account fails, we’ll set the status to `errored` and will not continue to send
     * transfers until the bank details are updated.
     *
     * For external accounts, possible values are `new` and `errored`. Validations aren’t run
     * against external accounts because they’re only used for payouts. This means the other
     * statuses don’t apply. If a transfer fails, the status is set to `errored` and transfers
     * are stopped until account details are updated.
     *
     * [status](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-status)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankAccount.Status component10() {
        return null;
    }
    
    /**
     * For bank accounts, possible values are `new`, `validated`, `verified`, `verification_failed`,
     * or `errored`. A bank account that hasn’t had any activity or validation performed is new.
     * If Stripe can determine that the bank account exists, its status will be `validated`. Note
     * that there often isn’t enough information to know (e.g., for smaller credit unions), and
     * the validation is not always run. If customer bank account verification has succeeded,
     * the bank account status will be `verified`. If the verification failed for any reason,
     * such as microdeposit failure, the status will be `verification_failed`. If a transfer sent
     * to this bank account fails, we’ll set the status to `errored` and will not continue to send
     * transfers until the bank details are updated.
     *
     * For external accounts, possible values are `new` and `errored`. Validations aren’t run
     * against external accounts because they’re only used for payouts. This means the other
     * statuses don’t apply. If a transfer fails, the status is set to `errored` and transfers
     * are stopped until account details are updated.
     *
     * [status](https://stripe.com/docs/api/customer_bank_accounts/object#customer_bank_account_object-status)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankAccount.Status getStatus() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.BankAccount> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.BankAccount createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.BankAccount[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/BankAccount$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "toString", "Company", "Individual", "Companion", "payments-core_debug"})
    public static enum Type {
        /*public static final*/ Company /* = new Company(null) */,
        /*public static final*/ Individual /* = new Individual(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.BankAccount.Type.Companion Companion = null;
        
        Type(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/BankAccount$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/BankAccount$Type;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.BankAccount.Type fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/BankAccount$Status;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "toString", "New", "Validated", "Verified", "VerificationFailed", "Errored", "Companion", "payments-core_debug"})
    public static enum Status {
        /*public static final*/ New /* = new New(null) */,
        /*public static final*/ Validated /* = new Validated(null) */,
        /*public static final*/ Verified /* = new Verified(null) */,
        /*public static final*/ VerificationFailed /* = new VerificationFailed(null) */,
        /*public static final*/ Errored /* = new Errored(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.BankAccount.Status.Companion Companion = null;
        
        Status(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/BankAccount$Status$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/BankAccount$Status;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.BankAccount.Status fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
            java.lang.String code) {
                return null;
            }
        }
    }
}
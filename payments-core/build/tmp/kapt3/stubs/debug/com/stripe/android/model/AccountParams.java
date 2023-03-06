package com.stripe.android.model;

import java.lang.System;

/**
 * [Create an account token](https://stripe.com/docs/api/tokens/create_account)
 *
 * Creates a single-use token that wraps a user’s legal entity information. Use this when creating
 * or updating a Connect account. See the
 * [account tokens documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c2\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\tH\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u00d6\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/AccountParams;", "Lcom/stripe/android/model/TokenParams;", "tosShownAndAccepted", "", "businessTypeParams", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "(ZLcom/stripe/android/model/AccountParams$BusinessTypeParams;)V", "typeDataParams", "", "", "", "getTypeDataParams", "()Ljava/util/Map;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BusinessType", "BusinessTypeParams", "Companion", "payments-core_debug"})
public final class AccountParams extends com.stripe.android.model.TokenParams {
    
    /**
     * Whether the user described by the data in the token has been shown the
     * [Stripe Connected Account Agreement](https://stripe.com/docs/connect/account-tokens#stripe-connected-account-agreement).
     * When creating an account token to create a new Connect account, this value must be `true`.
     *
     * [account.tos_shown_and_accepted](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted)
     */
    private final boolean tosShownAndAccepted = false;
    private final com.stripe.android.model.AccountParams.BusinessTypeParams businessTypeParams = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.AccountParams.Companion Companion = null;
    private static final java.lang.String PARAM_BUSINESS_TYPE = "business_type";
    private static final java.lang.String PARAM_TOS_SHOWN_AND_ACCEPTED = "tos_shown_and_accepted";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams> CREATOR = null;
    
    /**
     * [Create an account token](https://stripe.com/docs/api/tokens/create_account)
     *
     * Creates a single-use token that wraps a user’s legal entity information. Use this when creating
     * or updating a Connect account. See the
     * [account tokens documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.AccountParams copy(boolean tosShownAndAccepted, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.AccountParams.BusinessTypeParams businessTypeParams) {
        return null;
    }
    
    /**
     * [Create an account token](https://stripe.com/docs/api/tokens/create_account)
     *
     * Creates a single-use token that wraps a user’s legal entity information. Use this when creating
     * or updating a Connect account. See the
     * [account tokens documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * [Create an account token](https://stripe.com/docs/api/tokens/create_account)
     *
     * Creates a single-use token that wraps a user’s legal entity information. Use this when creating
     * or updating a Connect account. See the
     * [account tokens documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * [Create an account token](https://stripe.com/docs/api/tokens/create_account)
     *
     * Creates a single-use token that wraps a user’s legal entity information. Use this when creating
     * or updating a Connect account. See the
     * [account tokens documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AccountParams(boolean tosShownAndAccepted, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.AccountParams.BusinessTypeParams businessTypeParams) {
        super(null, null);
    }
    
    /**
     * Whether the user described by the data in the token has been shown the
     * [Stripe Connected Account Agreement](https://stripe.com/docs/connect/account-tokens#stripe-connected-account-agreement).
     * When creating an account token to create a new Connect account, this value must be `true`.
     *
     * [account.tos_shown_and_accepted](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted)
     */
    private final boolean component1() {
        return false;
    }
    
    private final com.stripe.android.model.AccountParams.BusinessTypeParams component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> getTypeDataParams() {
        return null;
    }
    
    /**
     * Create an [AccountParams] instance with information about the person represented by the account.
     *
     * @param tosShownAndAccepted Whether the user described by the data in the token has been
     * shown the
     * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
     * When creating an account token to create a new Connect account, this value must be `true`.
     * @param individual Information about the person represented by the account.
     *
     * @return [AccountParams]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams.BusinessTypeParams.Individual individual) {
        return null;
    }
    
    /**
     * Create an [AccountParams] instance with information about the company or business.
     *
     * @param tosShownAndAccepted Whether the user described by the data in the token has been
     * shown the
     * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
     * When creating an account token to create a new Connect account, this value must be `true`.
     * @param company Information about the company or business.
     *
     * @return [AccountParams]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams.BusinessTypeParams.Company company) {
        return null;
    }
    
    /**
     * Create an [AccountParams] instance.
     *
     * @param tosShownAndAccepted Whether the user described by the data in the token has been
     * shown the
     * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
     * When creating an account token to create a new Connect account, this value must be `true`.
     * @param businessType The business type.
     *
     * @return [AccountParams]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted, @org.jetbrains.annotations.NotNull()
    com.stripe.android.model.AccountParams.BusinessType businessType) {
        return null;
    }
    
    /**
     * Create an [AccountParams] instance.
     *
     * @param tosShownAndAccepted Whether the user described by the data in the token has been
     * shown the
     * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
     * When creating an account token to create a new Connect account, this value must be `true`.
     *
     * @return [AccountParams]
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.AccountParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.AccountParams[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * The business type.
     *
     * [account.business_type](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-business_type)
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Individual", "Company", "payments-core_debug"})
    public static enum BusinessType {
        /*public static final*/ Individual /* = new Individual(null) */,
        /*public static final*/ Company /* = new Company(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        BusinessType(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0010H\u0016R&\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/AccountParams$BusinessType;", "(Lcom/stripe/android/model/AccountParams$BusinessType;)V", "paramsList", "", "Lkotlin/Pair;", "", "", "getParamsList", "()Ljava/util/List;", "getType$payments_core_debug", "()Lcom/stripe/android/model/AccountParams$BusinessType;", "toParamMap", "", "Company", "Individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_debug"})
    public static abstract class BusinessTypeParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.AccountParams.BusinessType type = null;
        
        private BusinessTypeParams(com.stripe.android.model.AccountParams.BusinessType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.AccountParams.BusinessType getType$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParamsList();
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        /**
         * Information about the company or business.
         *
         * [account.company](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company)
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0004^_`aB\u00ad\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010L\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u00b6\u0001\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\t\u0010S\u001a\u00020TH\u00d6\u0001J\u0013\u0010U\u001a\u00020\b2\b\u0010V\u001a\u0004\u0018\u000104H\u00d6\u0003J\t\u0010W\u001a\u00020TH\u00d6\u0001J\t\u0010X\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020TH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R(\u00101\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010403028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u00a8\u0006b"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "directorsProvided", "", "executivesProvided", "name", "", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", "verification", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getAddressKanji", "setAddressKanji", "getDirectorsProvided", "()Ljava/lang/Boolean;", "setDirectorsProvided", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getExecutivesProvided", "setExecutivesProvided", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNameKana", "setNameKana", "getNameKanji", "setNameKanji", "getOwnersProvided", "setOwnersProvided", "paramsList", "", "Lkotlin/Pair;", "", "getParamsList", "()Ljava/util/List;", "getPhone", "setPhone", "getTaxId", "setTaxId", "getTaxIdRegistrar", "setTaxIdRegistrar", "getVatId", "setVatId", "getVerification", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "describeContents", "", "equals", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "Document", "Verification", "payments-core_debug"})
        public static final class Company extends com.stripe.android.model.AccountParams.BusinessTypeParams {
            
            /**
             * The company’s primary address.
             *
             * [account.company.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.Address address;
            
            /**
             * The Kana variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kana)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.AddressJapanParams addressKana;
            
            /**
             * The Kanji variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.AddressJapanParams addressKanji;
            
            /**
             * Whether the company’s directors have been provided. Set this Boolean to `true` after
             * creating all the company’s directors with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.director` requirement. This value is not automatically set to `true`
             * after creating directors, so it needs to be updated to indicate all directors have
             * been provided.
             *
             * [account.company.directors_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-directors_provided)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean directorsProvided;
            
            /**
             * Whether the company’s executives have been provided. Set this Boolean to `true` after
             * creating all the company’s executives with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.executive` requirement.
             *
             * [account.company.executives_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-executives_provided)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean executivesProvided;
            
            /**
             * The company’s legal name.
             *
             * [account.company.name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String name;
            
            /**
             * The Kana variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String nameKana;
            
            /**
             * The Kanji variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String nameKanji;
            
            /**
             * Whether the company’s owners have been provided. Set this Boolean to `true` after
             * creating all the company’s owners with the
             * [Persons API](https://stripe.com/docs/api/persons)
             * for accounts with a `relationship.owner` requirement.
             *
             * [account.company.owners_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-owners_provided)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.Boolean ownersProvided;
            
            /**
             * The company’s phone number (used for verification).
             *
             * [account.company.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-phone)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String phone;
            
            /**
             * The business ID number of the company, as appropriate for the company’s country.
             * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
             * Company Number in the UK.)
             *
             * [account.company.tax_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String taxId;
            
            /**
             * The jurisdiction in which the `tax_id` is registered (Germany-based companies only).
             *
             * [account.company.tax_id_registrar](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id_registrar)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String taxIdRegistrar;
            
            /**
             * The VAT number of the company.
             *
             * [account.company.vat_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-vat_id)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String vatId;
            
            /**
             * Information on the verification state of the company.
             *
             * [account.company.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification verification;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ADDRESS = "address";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ADDRESS_KANA = "address_kana";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ADDRESS_KANJI = "address_kanji";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_DIRECTORS_PROVIDED = "directors_provided";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_EXECUTIVES_PROVIDED = "executives_provided";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_NAME = "name";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_NAME_KANA = "name_kana";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_NAME_KANJI = "name_kanji";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_OWNERS_PROVIDED = "owners_provided";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_PHONE = "phone";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_TAX_ID = "tax_id";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_TAX_ID_REGISTRAR = "tax_id_registrar";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_VAT_ID = "vat_id";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_VERIFICATION = "verification";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Company> CREATOR = null;
            
            /**
             * Information about the company or business.
             *
             * [account.company](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company copy(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKana, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKanji, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean directorsProvided, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean executivesProvided, @org.jetbrains.annotations.Nullable()
            java.lang.String name, @org.jetbrains.annotations.Nullable()
            java.lang.String nameKana, @org.jetbrains.annotations.Nullable()
            java.lang.String nameKanji, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean ownersProvided, @org.jetbrains.annotations.Nullable()
            java.lang.String phone, @org.jetbrains.annotations.Nullable()
            java.lang.String taxId, @org.jetbrains.annotations.Nullable()
            java.lang.String taxIdRegistrar, @org.jetbrains.annotations.Nullable()
            java.lang.String vatId, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification verification) {
                return null;
            }
            
            /**
             * Information about the company or business.
             *
             * [account.company](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company)
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Information about the company or business.
             *
             * [account.company](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company)
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Information about the company or business.
             *
             * [account.company](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company)
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Company() {
                super(null);
            }
            
            public Company(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKana, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKanji, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean directorsProvided, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean executivesProvided, @org.jetbrains.annotations.Nullable()
            java.lang.String name, @org.jetbrains.annotations.Nullable()
            java.lang.String nameKana, @org.jetbrains.annotations.Nullable()
            java.lang.String nameKanji, @org.jetbrains.annotations.Nullable()
            java.lang.Boolean ownersProvided, @org.jetbrains.annotations.Nullable()
            java.lang.String phone, @org.jetbrains.annotations.Nullable()
            java.lang.String taxId, @org.jetbrains.annotations.Nullable()
            java.lang.String taxIdRegistrar, @org.jetbrains.annotations.Nullable()
            java.lang.String vatId, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification verification) {
                super(null);
            }
            
            /**
             * The company’s primary address.
             *
             * [account.company.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Address component1() {
                return null;
            }
            
            /**
             * The company’s primary address.
             *
             * [account.company.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Address getAddress() {
                return null;
            }
            
            /**
             * The company’s primary address.
             *
             * [account.company.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address)
             */
            public final void setAddress(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address p0) {
            }
            
            /**
             * The Kana variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams component2() {
                return null;
            }
            
            /**
             * The Kana variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams getAddressKana() {
                return null;
            }
            
            /**
             * The Kana variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kana)
             */
            public final void setAddressKana(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams p0) {
            }
            
            /**
             * The Kanji variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams component3() {
                return null;
            }
            
            /**
             * The Kanji variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams getAddressKanji() {
                return null;
            }
            
            /**
             * The Kanji variation of the company’s primary address (Japan only).
             *
             * [account.company.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kanji)
             */
            public final void setAddressKanji(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams p0) {
            }
            
            /**
             * Whether the company’s directors have been provided. Set this Boolean to `true` after
             * creating all the company’s directors with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.director` requirement. This value is not automatically set to `true`
             * after creating directors, so it needs to be updated to indicate all directors have
             * been provided.
             *
             * [account.company.directors_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-directors_provided)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean component4() {
                return null;
            }
            
            /**
             * Whether the company’s directors have been provided. Set this Boolean to `true` after
             * creating all the company’s directors with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.director` requirement. This value is not automatically set to `true`
             * after creating directors, so it needs to be updated to indicate all directors have
             * been provided.
             *
             * [account.company.directors_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-directors_provided)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getDirectorsProvided() {
                return null;
            }
            
            /**
             * Whether the company’s directors have been provided. Set this Boolean to `true` after
             * creating all the company’s directors with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.director` requirement. This value is not automatically set to `true`
             * after creating directors, so it needs to be updated to indicate all directors have
             * been provided.
             *
             * [account.company.directors_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-directors_provided)
             */
            public final void setDirectorsProvided(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
            
            /**
             * Whether the company’s executives have been provided. Set this Boolean to `true` after
             * creating all the company’s executives with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.executive` requirement.
             *
             * [account.company.executives_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-executives_provided)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean component5() {
                return null;
            }
            
            /**
             * Whether the company’s executives have been provided. Set this Boolean to `true` after
             * creating all the company’s executives with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.executive` requirement.
             *
             * [account.company.executives_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-executives_provided)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getExecutivesProvided() {
                return null;
            }
            
            /**
             * Whether the company’s executives have been provided. Set this Boolean to `true` after
             * creating all the company’s executives with the
             * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
             * `relationship.executive` requirement.
             *
             * [account.company.executives_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-executives_provided)
             */
            public final void setExecutivesProvided(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
            
            /**
             * The company’s legal name.
             *
             * [account.company.name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component6() {
                return null;
            }
            
            /**
             * The company’s legal name.
             *
             * [account.company.name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getName() {
                return null;
            }
            
            /**
             * The company’s legal name.
             *
             * [account.company.name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name)
             */
            public final void setName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The Kana variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component7() {
                return null;
            }
            
            /**
             * The Kana variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getNameKana() {
                return null;
            }
            
            /**
             * The Kana variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kana)
             */
            public final void setNameKana(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The Kanji variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component8() {
                return null;
            }
            
            /**
             * The Kanji variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getNameKanji() {
                return null;
            }
            
            /**
             * The Kanji variation of the company’s legal name (Japan only).
             *
             * [account.company.name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kanji)
             */
            public final void setNameKanji(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * Whether the company’s owners have been provided. Set this Boolean to `true` after
             * creating all the company’s owners with the
             * [Persons API](https://stripe.com/docs/api/persons)
             * for accounts with a `relationship.owner` requirement.
             *
             * [account.company.owners_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-owners_provided)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean component9() {
                return null;
            }
            
            /**
             * Whether the company’s owners have been provided. Set this Boolean to `true` after
             * creating all the company’s owners with the
             * [Persons API](https://stripe.com/docs/api/persons)
             * for accounts with a `relationship.owner` requirement.
             *
             * [account.company.owners_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-owners_provided)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Boolean getOwnersProvided() {
                return null;
            }
            
            /**
             * Whether the company’s owners have been provided. Set this Boolean to `true` after
             * creating all the company’s owners with the
             * [Persons API](https://stripe.com/docs/api/persons)
             * for accounts with a `relationship.owner` requirement.
             *
             * [account.company.owners_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-owners_provided)
             */
            public final void setOwnersProvided(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean p0) {
            }
            
            /**
             * The company’s phone number (used for verification).
             *
             * [account.company.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-phone)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component10() {
                return null;
            }
            
            /**
             * The company’s phone number (used for verification).
             *
             * [account.company.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-phone)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhone() {
                return null;
            }
            
            /**
             * The company’s phone number (used for verification).
             *
             * [account.company.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-phone)
             */
            public final void setPhone(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The business ID number of the company, as appropriate for the company’s country.
             * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
             * Company Number in the UK.)
             *
             * [account.company.tax_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component11() {
                return null;
            }
            
            /**
             * The business ID number of the company, as appropriate for the company’s country.
             * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
             * Company Number in the UK.)
             *
             * [account.company.tax_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTaxId() {
                return null;
            }
            
            /**
             * The business ID number of the company, as appropriate for the company’s country.
             * (Examples are an Employer ID Number in the U.S., a Business Number in Canada, or a
             * Company Number in the UK.)
             *
             * [account.company.tax_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id)
             */
            public final void setTaxId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The jurisdiction in which the `tax_id` is registered (Germany-based companies only).
             *
             * [account.company.tax_id_registrar](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id_registrar)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component12() {
                return null;
            }
            
            /**
             * The jurisdiction in which the `tax_id` is registered (Germany-based companies only).
             *
             * [account.company.tax_id_registrar](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id_registrar)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getTaxIdRegistrar() {
                return null;
            }
            
            /**
             * The jurisdiction in which the `tax_id` is registered (Germany-based companies only).
             *
             * [account.company.tax_id_registrar](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id_registrar)
             */
            public final void setTaxIdRegistrar(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The VAT number of the company.
             *
             * [account.company.vat_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-vat_id)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component13() {
                return null;
            }
            
            /**
             * The VAT number of the company.
             *
             * [account.company.vat_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-vat_id)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getVatId() {
                return null;
            }
            
            /**
             * The VAT number of the company.
             *
             * [account.company.vat_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-vat_id)
             */
            public final void setVatId(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * Information on the verification state of the company.
             *
             * [account.company.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification component14() {
                return null;
            }
            
            /**
             * Information on the verification state of the company.
             *
             * [account.company.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification getVerification() {
                return null;
            }
            
            /**
             * Information on the verification state of the company.
             *
             * [account.company.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification)
             */
            public final void setVerification(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParamsList() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Company> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlinx.parcelize.Parcelize()
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\fH\u00d6\u0001J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u00d6\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "document", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;)V", "getDocument", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "setDocument", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
            public static final class Verification implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
                
                /**
                 * A document verifying the business.
                 */
                @org.jetbrains.annotations.Nullable()
                private com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document document;
                @org.jetbrains.annotations.NotNull()
                private static final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification.Companion Companion = null;
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_DOCUMENT = "document";
                public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification copy(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document document) {
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
                
                public Verification() {
                    super();
                }
                
                public Verification(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document document) {
                    super();
                }
                
                /**
                 * A document verifying the business.
                 */
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document component1() {
                    return null;
                }
                
                /**
                 * A document verifying the business.
                 */
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document getDocument() {
                    return null;
                }
                
                /**
                 * A document verifying the business.
                 */
                public final void setDocument(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document p0) {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification[] newArray(int size) {
                        return null;
                    }
                }
                
                @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification$Companion;", "", "()V", "PARAM_DOCUMENT", "", "payments-core_debug"})
                static final class Companion {
                    
                    private Companion() {
                        super();
                    }
                }
            }
            
            @kotlinx.parcelize.Parcelize()
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "front", "", "back", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
            public static final class Document implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
                
                /**
                 * The front of a document returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file)
                 * with a `purpose` value of `additional_verification`. The uploaded file needs to
                 * be a color image (smaller than 8,000px by 8,000px), in JPG or PNG format, and
                 * less than 10 MB in size.
                 *
                 * [account.company.verification.document.front](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification-document-front)
                 */
                private final java.lang.String front = null;
                
                /**
                 * The back of a document returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file)
                 * with a `purpose` value of `additional_verification`. The uploaded file needs to
                 * be a color image (smaller than 8,000px by 8,000px), in JPG or PNG format, and
                 * less than 10 MB in size.
                 *
                 * [account.company.verification.document.back](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification-document-back)
                 */
                private final java.lang.String back = null;
                @org.jetbrains.annotations.NotNull()
                private static final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document.Companion Companion = null;
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_BACK = "back";
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_FRONT = "front";
                public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document copy(@org.jetbrains.annotations.Nullable()
                java.lang.String front, @org.jetbrains.annotations.Nullable()
                java.lang.String back) {
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
                
                @kotlin.jvm.JvmOverloads()
                public Document() {
                    super();
                }
                
                @kotlin.jvm.JvmOverloads()
                public Document(@org.jetbrains.annotations.Nullable()
                java.lang.String front) {
                    super();
                }
                
                @kotlin.jvm.JvmOverloads()
                public Document(@org.jetbrains.annotations.Nullable()
                java.lang.String front, @org.jetbrains.annotations.Nullable()
                java.lang.String back) {
                    super();
                }
                
                /**
                 * The front of a document returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file)
                 * with a `purpose` value of `additional_verification`. The uploaded file needs to
                 * be a color image (smaller than 8,000px by 8,000px), in JPG or PNG format, and
                 * less than 10 MB in size.
                 *
                 * [account.company.verification.document.front](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification-document-front)
                 */
                private final java.lang.String component1() {
                    return null;
                }
                
                /**
                 * The back of a document returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file)
                 * with a `purpose` value of `additional_verification`. The uploaded file needs to
                 * be a color image (smaller than 8,000px by 8,000px), in JPG or PNG format, and
                 * less than 10 MB in size.
                 *
                 * [account.company.verification.document.back](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification-document-back)
                 */
                private final java.lang.String component2() {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Document[] newArray(int size) {
                        return null;
                    }
                }
                
                @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Document$Companion;", "", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_debug"})
                static final class Companion {
                    
                    private Companion() {
                        super();
                    }
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010 \u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\"\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\'\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "directorsProvided", "", "Ljava/lang/Boolean;", "executivesProvided", "name", "", "nameKana", "nameKanji", "ownersProvided", "phone", "taxId", "taxIdRegistrar", "vatId", "verification", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Verification;", "build", "setAddress", "setAddressKana", "setAddressKanji", "setDirectorsProvided", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Builder;", "setExecutivesProvided", "setName", "setNameKana", "setNameKanji", "setOwnersProvided", "setPhone", "setTaxId", "setTaxIdRegistrar", "setVatId", "setVerification", "payments-core_debug"})
            public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.AccountParams.BusinessTypeParams.Company> {
                private com.stripe.android.model.Address address;
                private com.stripe.android.model.AddressJapanParams addressKana;
                private com.stripe.android.model.AddressJapanParams addressKanji;
                private java.lang.Boolean directorsProvided;
                private java.lang.Boolean executivesProvided;
                private java.lang.String name;
                private java.lang.String nameKana;
                private java.lang.String nameKanji;
                private java.lang.Boolean ownersProvided;
                private java.lang.String phone;
                private java.lang.String taxId;
                private java.lang.String taxIdRegistrar;
                private java.lang.String vatId;
                private com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification verification;
                
                public Builder() {
                    super();
                }
                
                /**
                 * @param address The company’s primary address.
                 *
                 * [account.company.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setAddress(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.Address address) {
                    return null;
                }
                
                /**
                 * @param addressKana The Kana variation of the company’s primary address (Japan only).
                 *
                 * [account.company.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kana)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setAddressKana(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AddressJapanParams addressKana) {
                    return null;
                }
                
                /**
                 * @param addressKanji The Kanji variation of the company’s primary address (Japan only).
                 *
                 * [account.company.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-address_kanji)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setAddressKanji(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AddressJapanParams addressKanji) {
                    return null;
                }
                
                /**
                 * @param directorsProvided Whether the company’s directors have been provided. Set
                 * this Boolean to `true` after creating all the company’s directors with the
                 * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
                 * `relationship.director` requirement. This value is not automatically set to
                 * `true` after creating directors, so it needs to be updated to indicate all
                 * directors have been provided.
                 *
                 * [account.company.directors_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-directors_provided)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setDirectorsProvided(@org.jetbrains.annotations.Nullable()
                java.lang.Boolean directorsProvided) {
                    return null;
                }
                
                /**
                 * @param executivesProvided Whether the company’s executives have been provided.
                 * Set this Boolean to `true` after creating all the company’s executives with the
                 * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
                 * `relationship.executive` requirement.
                 *
                 * [account.company.executives_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-executives_provided)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setExecutivesProvided(@org.jetbrains.annotations.Nullable()
                java.lang.Boolean executivesProvided) {
                    return null;
                }
                
                /**
                 * @param name The company’s legal name.
                 *
                 * [account.company.name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setName(@org.jetbrains.annotations.Nullable()
                java.lang.String name) {
                    return null;
                }
                
                /**
                 * @param nameKana The Kana variation of the company’s legal name (Japan only).
                 *
                 * [account.company.name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kana)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setNameKana(@org.jetbrains.annotations.Nullable()
                java.lang.String nameKana) {
                    return null;
                }
                
                /**
                 * @param nameKanji The Kanji variation of the company’s legal name (Japan only).
                 *
                 * [account.company.name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-name_kanji)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setNameKanji(@org.jetbrains.annotations.Nullable()
                java.lang.String nameKanji) {
                    return null;
                }
                
                /**
                 * @param ownersProvided Whether the company’s owners have been provided. Set this
                 * Boolean to `true` after creating all the company’s owners with the
                 * [Persons API](https://stripe.com/docs/api/persons) for accounts with a
                 * `relationship.owner` requirement.
                 *
                 * [account.company.owners_provided](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-owners_provided)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setOwnersProvided(@org.jetbrains.annotations.Nullable()
                java.lang.Boolean ownersProvided) {
                    return null;
                }
                
                /**
                 * @param phone The company’s phone number (used for verification).
                 *
                 * [account.company.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-phone)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setPhone(@org.jetbrains.annotations.Nullable()
                java.lang.String phone) {
                    return null;
                }
                
                /**
                 * @param taxId The business ID number of the company, as appropriate for the
                 * company’s country. (Examples are an Employer ID Number in the U.S.,
                 * a Business Number in Canada, or a Company Number in the UK.)
                 *
                 * [account.company.tax_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setTaxId(@org.jetbrains.annotations.Nullable()
                java.lang.String taxId) {
                    return null;
                }
                
                /**
                 * @param taxIdRegistrar The jurisdiction in which the `tax_id` is registered
                 * (Germany-based companies only).
                 *
                 * [account.company.tax_id_registrar](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-tax_id_registrar)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setTaxIdRegistrar(@org.jetbrains.annotations.Nullable()
                java.lang.String taxIdRegistrar) {
                    return null;
                }
                
                /**
                 * @param vatId The VAT number of the company.
                 *
                 * [account.company.vat_id](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-vat_id)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setVatId(@org.jetbrains.annotations.Nullable()
                java.lang.String vatId) {
                    return null;
                }
                
                /**
                 * @param verification Information on the verification state of the company.
                 *
                 * [account.company.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-company-verification)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Builder setVerification(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Company.Verification verification) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.stripe.android.model.AccountParams.BusinessTypeParams.Company build() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DIRECTORS_PROVIDED", "PARAM_EXECUTIVES_PROVIDED", "PARAM_NAME", "PARAM_NAME_KANA", "PARAM_NAME_KANJI", "PARAM_OWNERS_PROVIDED", "PARAM_PHONE", "PARAM_TAX_ID", "PARAM_TAX_ID_REGISTRAR", "PARAM_VAT_ID", "PARAM_VERIFICATION", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        /**
         * Information about the person represented by the account.
         *
         * [account.individual](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual)
         */
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 q2\u00020\u0001:\u0004pqrsB\u00e9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0017\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u00ed\u0001\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001J\t\u0010d\u001a\u00020eH\u00d6\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010i\u001a\u00020eH\u00d6\u0001J\t\u0010j\u001a\u00020\nH\u00d6\u0001J\u0019\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020eH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010*\"\u0004\b:\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010*\"\u0004\b<\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010C\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010F0E0D8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bG\u0010HR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010*\"\u0004\bL\u0010,R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P\u00a8\u0006t"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", "metadata", "", "phone", "ssnLast4", "verification", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "setAddress", "(Lcom/stripe/android/model/Address;)V", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "setAddressKana", "(Lcom/stripe/android/model/AddressJapanParams;)V", "getAddressKanji", "setAddressKanji", "getDateOfBirth", "()Lcom/stripe/android/model/DateOfBirth;", "setDateOfBirth", "(Lcom/stripe/android/model/DateOfBirth;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getFirstNameKana", "setFirstNameKana", "getFirstNameKanji", "setFirstNameKanji", "getGender", "setGender", "getIdNumber", "setIdNumber", "getLastName", "setLastName", "getLastNameKana", "setLastNameKana", "getLastNameKanji", "setLastNameKanji", "getMaidenName", "setMaidenName", "getMetadata", "()Ljava/util/Map;", "setMetadata", "(Ljava/util/Map;)V", "paramsList", "", "Lkotlin/Pair;", "", "getParamsList", "()Ljava/util/List;", "getPhone", "setPhone", "getSsnLast4", "setSsnLast4", "getVerification", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "setVerification", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "Document", "Verification", "payments-core_debug"})
        public static final class Individual extends com.stripe.android.model.AccountParams.BusinessTypeParams {
            
            /**
             * The individual’s primary address.
             *
             * [account.individual.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.Address address;
            
            /**
             * The Kana variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kana)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.AddressJapanParams addressKana;
            
            /**
             * The Kanji variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.AddressJapanParams addressKanji;
            
            /**
             * The individual’s date of birth.
             *
             * [account.individual.dob](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-dob)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.DateOfBirth dateOfBirth;
            
            /**
             * The individual’s email.
             *
             * [account.individual.email](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-email)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String email;
            
            /**
             * The individual’s first name.
             *
             * [account.individual.first_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String firstName;
            
            /**
             * The Kana variation of the the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String firstNameKana;
            
            /**
             * The Kanji variation of the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String firstNameKanji;
            
            /**
             * The individual’s gender (International regulations require either “male” or “female”).
             *
             * [account.individual.gender](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-gender)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String gender;
            
            /**
             * The government-issued ID number of the individual, as appropriate for the
             * representative’s country. (Examples are a Social Security Number in the U.S., or a
             * Social Insurance Number in Canada). Instead of the number itself, you can also
             * provide a PII token.
             *
             * [account.individual.id_number](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-id_number)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String idNumber;
            
            /**
             * The individual’s last name.
             *
             * [account.individual.last_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String lastName;
            
            /**
             * The Kana varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String lastNameKana;
            
            /**
             * The Kanji varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String lastNameKanji;
            
            /**
             * The individual’s maiden name.
             *
             * [account.individual.maiden_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-maiden_name)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String maidenName;
            
            /**
             * Set of key-value pairs that you can attach to an object. This can be useful for
             * storing additional information about the object in a structured format. Individual keys
             * can be unset by posting an empty value to them. All keys can be unset by posting an
             * empty value to `metadata`.
             *
             * [account.individual.metadata](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-metadata)
             */
            @org.jetbrains.annotations.Nullable()
            private java.util.Map<java.lang.String, java.lang.String> metadata;
            
            /**
             * The individual’s phone number.
             *
             * [account.individual.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-phone)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String phone;
            
            /**
             * The last four digits of the individual’s Social Security Number (U.S. only).
             *
             * [account.individual.ssn_last_4](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-ssn_last_4)
             */
            @org.jetbrains.annotations.Nullable()
            private java.lang.String ssnLast4;
            
            /**
             * The individual’s verification document information.
             *
             * [account.individual.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-verification)
             */
            @org.jetbrains.annotations.Nullable()
            private com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification verification;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Companion Companion = null;
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ADDRESS = "address";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ADDRESS_KANA = "address_kana";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ADDRESS_KANJI = "address_kanji";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_DOB = "dob";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_EMAIL = "email";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_FIRST_NAME = "first_name";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_FIRST_NAME_KANA = "first_name_kana";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_GENDER = "gender";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_ID_NUMBER = "id_number";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_LAST_NAME = "last_name";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_LAST_NAME_KANA = "last_name_kana";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_LAST_NAME_KANJI = "last_name_kanji";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_MAIDEN_NAME = "maiden_name";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_METADATA = "metadata";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_PHONE = "phone";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_SSN_LAST_4 = "ssn_last_4";
            @java.lang.Deprecated()
            private static final java.lang.String PARAM_VERIFICATION = "verification";
            public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual> CREATOR = null;
            
            /**
             * Information about the person represented by the account.
             *
             * [account.individual](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual)
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual copy(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKana, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKanji, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.DateOfBirth dateOfBirth, @org.jetbrains.annotations.Nullable()
            java.lang.String email, @org.jetbrains.annotations.Nullable()
            java.lang.String firstName, @org.jetbrains.annotations.Nullable()
            java.lang.String firstNameKana, @org.jetbrains.annotations.Nullable()
            java.lang.String firstNameKanji, @org.jetbrains.annotations.Nullable()
            java.lang.String gender, @org.jetbrains.annotations.Nullable()
            java.lang.String idNumber, @org.jetbrains.annotations.Nullable()
            java.lang.String lastName, @org.jetbrains.annotations.Nullable()
            java.lang.String lastNameKana, @org.jetbrains.annotations.Nullable()
            java.lang.String lastNameKanji, @org.jetbrains.annotations.Nullable()
            java.lang.String maidenName, @org.jetbrains.annotations.Nullable()
            java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
            java.lang.String phone, @org.jetbrains.annotations.Nullable()
            java.lang.String ssnLast4, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification verification) {
                return null;
            }
            
            /**
             * Information about the person represented by the account.
             *
             * [account.individual](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual)
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Information about the person represented by the account.
             *
             * [account.individual](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual)
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Information about the person represented by the account.
             *
             * [account.individual](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual)
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Individual() {
                super(null);
            }
            
            public Individual(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKana, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams addressKanji, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.DateOfBirth dateOfBirth, @org.jetbrains.annotations.Nullable()
            java.lang.String email, @org.jetbrains.annotations.Nullable()
            java.lang.String firstName, @org.jetbrains.annotations.Nullable()
            java.lang.String firstNameKana, @org.jetbrains.annotations.Nullable()
            java.lang.String firstNameKanji, @org.jetbrains.annotations.Nullable()
            java.lang.String gender, @org.jetbrains.annotations.Nullable()
            java.lang.String idNumber, @org.jetbrains.annotations.Nullable()
            java.lang.String lastName, @org.jetbrains.annotations.Nullable()
            java.lang.String lastNameKana, @org.jetbrains.annotations.Nullable()
            java.lang.String lastNameKanji, @org.jetbrains.annotations.Nullable()
            java.lang.String maidenName, @org.jetbrains.annotations.Nullable()
            java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
            java.lang.String phone, @org.jetbrains.annotations.Nullable()
            java.lang.String ssnLast4, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification verification) {
                super(null);
            }
            
            /**
             * The individual’s primary address.
             *
             * [account.individual.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Address component1() {
                return null;
            }
            
            /**
             * The individual’s primary address.
             *
             * [account.individual.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.Address getAddress() {
                return null;
            }
            
            /**
             * The individual’s primary address.
             *
             * [account.individual.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address)
             */
            public final void setAddress(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.Address p0) {
            }
            
            /**
             * The Kana variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams component2() {
                return null;
            }
            
            /**
             * The Kana variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams getAddressKana() {
                return null;
            }
            
            /**
             * The Kana variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kana)
             */
            public final void setAddressKana(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams p0) {
            }
            
            /**
             * The Kanji variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams component3() {
                return null;
            }
            
            /**
             * The Kanji variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AddressJapanParams getAddressKanji() {
                return null;
            }
            
            /**
             * The Kanji variation of the the individual’s primary address (Japan only).
             *
             * [account.individual.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kanji)
             */
            public final void setAddressKanji(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AddressJapanParams p0) {
            }
            
            /**
             * The individual’s date of birth.
             *
             * [account.individual.dob](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-dob)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.DateOfBirth component4() {
                return null;
            }
            
            /**
             * The individual’s date of birth.
             *
             * [account.individual.dob](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-dob)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.DateOfBirth getDateOfBirth() {
                return null;
            }
            
            /**
             * The individual’s date of birth.
             *
             * [account.individual.dob](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-dob)
             */
            public final void setDateOfBirth(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.DateOfBirth p0) {
            }
            
            /**
             * The individual’s email.
             *
             * [account.individual.email](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-email)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component5() {
                return null;
            }
            
            /**
             * The individual’s email.
             *
             * [account.individual.email](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-email)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getEmail() {
                return null;
            }
            
            /**
             * The individual’s email.
             *
             * [account.individual.email](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-email)
             */
            public final void setEmail(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The individual’s first name.
             *
             * [account.individual.first_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component6() {
                return null;
            }
            
            /**
             * The individual’s first name.
             *
             * [account.individual.first_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFirstName() {
                return null;
            }
            
            /**
             * The individual’s first name.
             *
             * [account.individual.first_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name)
             */
            public final void setFirstName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The Kana variation of the the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component7() {
                return null;
            }
            
            /**
             * The Kana variation of the the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFirstNameKana() {
                return null;
            }
            
            /**
             * The Kana variation of the the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kana)
             */
            public final void setFirstNameKana(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The Kanji variation of the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component8() {
                return null;
            }
            
            /**
             * The Kanji variation of the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getFirstNameKanji() {
                return null;
            }
            
            /**
             * The Kanji variation of the individual’s first name (Japan only).
             *
             * [account.individual.first_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kanji)
             */
            public final void setFirstNameKanji(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The individual’s gender (International regulations require either “male” or “female”).
             *
             * [account.individual.gender](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-gender)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component9() {
                return null;
            }
            
            /**
             * The individual’s gender (International regulations require either “male” or “female”).
             *
             * [account.individual.gender](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-gender)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getGender() {
                return null;
            }
            
            /**
             * The individual’s gender (International regulations require either “male” or “female”).
             *
             * [account.individual.gender](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-gender)
             */
            public final void setGender(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The government-issued ID number of the individual, as appropriate for the
             * representative’s country. (Examples are a Social Security Number in the U.S., or a
             * Social Insurance Number in Canada). Instead of the number itself, you can also
             * provide a PII token.
             *
             * [account.individual.id_number](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-id_number)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component10() {
                return null;
            }
            
            /**
             * The government-issued ID number of the individual, as appropriate for the
             * representative’s country. (Examples are a Social Security Number in the U.S., or a
             * Social Insurance Number in Canada). Instead of the number itself, you can also
             * provide a PII token.
             *
             * [account.individual.id_number](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-id_number)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getIdNumber() {
                return null;
            }
            
            /**
             * The government-issued ID number of the individual, as appropriate for the
             * representative’s country. (Examples are a Social Security Number in the U.S., or a
             * Social Insurance Number in Canada). Instead of the number itself, you can also
             * provide a PII token.
             *
             * [account.individual.id_number](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-id_number)
             */
            public final void setIdNumber(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The individual’s last name.
             *
             * [account.individual.last_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component11() {
                return null;
            }
            
            /**
             * The individual’s last name.
             *
             * [account.individual.last_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLastName() {
                return null;
            }
            
            /**
             * The individual’s last name.
             *
             * [account.individual.last_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name)
             */
            public final void setLastName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The Kana varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component12() {
                return null;
            }
            
            /**
             * The Kana varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kana)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLastNameKana() {
                return null;
            }
            
            /**
             * The Kana varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kana)
             */
            public final void setLastNameKana(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The Kanji varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component13() {
                return null;
            }
            
            /**
             * The Kanji varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kanji)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getLastNameKanji() {
                return null;
            }
            
            /**
             * The Kanji varation of the individual’s last name (Japan only).
             *
             * [account.individual.last_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kanji)
             */
            public final void setLastNameKanji(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The individual’s maiden name.
             *
             * [account.individual.maiden_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-maiden_name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component14() {
                return null;
            }
            
            /**
             * The individual’s maiden name.
             *
             * [account.individual.maiden_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-maiden_name)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getMaidenName() {
                return null;
            }
            
            /**
             * The individual’s maiden name.
             *
             * [account.individual.maiden_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-maiden_name)
             */
            public final void setMaidenName(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * Set of key-value pairs that you can attach to an object. This can be useful for
             * storing additional information about the object in a structured format. Individual keys
             * can be unset by posting an empty value to them. All keys can be unset by posting an
             * empty value to `metadata`.
             *
             * [account.individual.metadata](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-metadata)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.util.Map<java.lang.String, java.lang.String> component15() {
                return null;
            }
            
            /**
             * Set of key-value pairs that you can attach to an object. This can be useful for
             * storing additional information about the object in a structured format. Individual keys
             * can be unset by posting an empty value to them. All keys can be unset by posting an
             * empty value to `metadata`.
             *
             * [account.individual.metadata](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-metadata)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
                return null;
            }
            
            /**
             * Set of key-value pairs that you can attach to an object. This can be useful for
             * storing additional information about the object in a structured format. Individual keys
             * can be unset by posting an empty value to them. All keys can be unset by posting an
             * empty value to `metadata`.
             *
             * [account.individual.metadata](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-metadata)
             */
            public final void setMetadata(@org.jetbrains.annotations.Nullable()
            java.util.Map<java.lang.String, java.lang.String> p0) {
            }
            
            /**
             * The individual’s phone number.
             *
             * [account.individual.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-phone)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component16() {
                return null;
            }
            
            /**
             * The individual’s phone number.
             *
             * [account.individual.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-phone)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getPhone() {
                return null;
            }
            
            /**
             * The individual’s phone number.
             *
             * [account.individual.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-phone)
             */
            public final void setPhone(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The last four digits of the individual’s Social Security Number (U.S. only).
             *
             * [account.individual.ssn_last_4](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-ssn_last_4)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component17() {
                return null;
            }
            
            /**
             * The last four digits of the individual’s Social Security Number (U.S. only).
             *
             * [account.individual.ssn_last_4](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-ssn_last_4)
             */
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getSsnLast4() {
                return null;
            }
            
            /**
             * The last four digits of the individual’s Social Security Number (U.S. only).
             *
             * [account.individual.ssn_last_4](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-ssn_last_4)
             */
            public final void setSsnLast4(@org.jetbrains.annotations.Nullable()
            java.lang.String p0) {
            }
            
            /**
             * The individual’s verification document information.
             *
             * [account.individual.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-verification)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification component18() {
                return null;
            }
            
            /**
             * The individual’s verification document information.
             *
             * [account.individual.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-verification)
             */
            @org.jetbrains.annotations.Nullable()
            public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification getVerification() {
                return null;
            }
            
            /**
             * The individual’s verification document information.
             *
             * [account.individual.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-verification)
             */
            public final void setVerification(@org.jetbrains.annotations.Nullable()
            com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.util.List<kotlin.Pair<java.lang.String, java.lang.Object>> getParamsList() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlinx.parcelize.Parcelize()
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006!"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "document", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "additionalDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getAdditionalDocument", "()Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "setAdditionalDocument", "(Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;)V", "getDocument", "setDocument", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
            public static final class Verification implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
                
                /**
                 * An identifying document, either a passport or local ID card.
                 */
                @org.jetbrains.annotations.Nullable()
                private com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document document;
                
                /**
                 * A document showing address, either a passport, local ID card, or utility bill from
                 * a well-known utility company.
                 */
                @org.jetbrains.annotations.Nullable()
                private com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document additionalDocument;
                @org.jetbrains.annotations.NotNull()
                private static final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification.Companion Companion = null;
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_DOCUMENT = "document";
                public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification copy(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document document, @org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document additionalDocument) {
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
                
                @kotlin.jvm.JvmOverloads()
                public Verification() {
                    super();
                }
                
                @kotlin.jvm.JvmOverloads()
                public Verification(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document document) {
                    super();
                }
                
                @kotlin.jvm.JvmOverloads()
                public Verification(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document document, @org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document additionalDocument) {
                    super();
                }
                
                /**
                 * An identifying document, either a passport or local ID card.
                 */
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document component1() {
                    return null;
                }
                
                /**
                 * An identifying document, either a passport or local ID card.
                 */
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document getDocument() {
                    return null;
                }
                
                /**
                 * An identifying document, either a passport or local ID card.
                 */
                public final void setDocument(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document p0) {
                }
                
                /**
                 * A document showing address, either a passport, local ID card, or utility bill from
                 * a well-known utility company.
                 */
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document component2() {
                    return null;
                }
                
                /**
                 * A document showing address, either a passport, local ID card, or utility bill from
                 * a well-known utility company.
                 */
                @org.jetbrains.annotations.Nullable()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document getAdditionalDocument() {
                    return null;
                }
                
                /**
                 * A document showing address, either a passport, local ID card, or utility bill from
                 * a well-known utility company.
                 */
                public final void setAdditionalDocument(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document p0) {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification[] newArray(int size) {
                        return null;
                    }
                }
                
                @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification$Companion;", "", "()V", "PARAM_ADDITIONAL_DOCUMENT", "", "PARAM_DOCUMENT", "payments-core_debug"})
                static final class Companion {
                    
                    private Companion() {
                        super();
                    }
                }
            }
            
            @kotlinx.parcelize.Parcelize()
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c2\u0003J!\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "front", "", "back", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
            public static final class Document implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
                
                /**
                 * The front of an ID returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file) with
                 * a `purpose` value of `identity_document`. The uploaded file needs to be a color
                 * image (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than
                 * 10 MB in size.
                 */
                private java.lang.String front;
                
                /**
                 * The back of an ID returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file)
                 * with a `purpose` value of `identity_document`. The uploaded file needs to be a
                 * color image (smaller than 8,000px by 8,000px), in JPG or PNG format, and less
                 * than 10 MB in size.
                 */
                private java.lang.String back;
                @org.jetbrains.annotations.NotNull()
                private static final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document.Companion Companion = null;
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_BACK = "back";
                @java.lang.Deprecated()
                private static final java.lang.String PARAM_FRONT = "front";
                public static final android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document> CREATOR = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document copy(@org.jetbrains.annotations.Nullable()
                java.lang.String front, @org.jetbrains.annotations.Nullable()
                java.lang.String back) {
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
                
                @kotlin.jvm.JvmOverloads()
                public Document() {
                    super();
                }
                
                @kotlin.jvm.JvmOverloads()
                public Document(@org.jetbrains.annotations.Nullable()
                java.lang.String front) {
                    super();
                }
                
                @kotlin.jvm.JvmOverloads()
                public Document(@org.jetbrains.annotations.Nullable()
                java.lang.String front, @org.jetbrains.annotations.Nullable()
                java.lang.String back) {
                    super();
                }
                
                /**
                 * The front of an ID returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file) with
                 * a `purpose` value of `identity_document`. The uploaded file needs to be a color
                 * image (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than
                 * 10 MB in size.
                 */
                private final java.lang.String component1() {
                    return null;
                }
                
                /**
                 * The back of an ID returned by a
                 * [file upload](https://stripe.com/docs/api/tokens/create_account#create_file)
                 * with a `purpose` value of `identity_document`. The uploaded file needs to be a
                 * color image (smaller than 8,000px by 8,000px), in JPG or PNG format, and less
                 * than 10 MB in size.
                 */
                private final java.lang.String component2() {
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
                public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document> {
                    
                    public Creator() {
                        super();
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document createFromParcel(@org.jetbrains.annotations.NotNull()
                    android.os.Parcel in) {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull()
                    @java.lang.Override()
                    public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Document[] newArray(int size) {
                        return null;
                    }
                }
                
                @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Document$Companion;", "", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_debug"})
                static final class Companion {
                    
                    private Companion() {
                        super();
                    }
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010 \u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010!\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010\'\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u0010+\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017J\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\fJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", "metadata", "", "phone", "ssnLast4", "verification", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Verification;", "build", "setAddress", "setAddressKana", "setAddressKanji", "setDateOfBirth", "setEmail", "setFirstName", "setFirstNameKana", "setFirstNameKanji", "setGender", "setIdNumber", "setLastName", "setLastNameKana", "setLastNameKanji", "setMaidenName", "setMetadata", "setPhone", "setSsnLast4", "setVerification", "payments-core_debug"})
            public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.AccountParams.BusinessTypeParams.Individual> {
                private com.stripe.android.model.Address address;
                private com.stripe.android.model.AddressJapanParams addressKana;
                private com.stripe.android.model.AddressJapanParams addressKanji;
                private com.stripe.android.model.DateOfBirth dateOfBirth;
                private java.lang.String email;
                private java.lang.String firstName;
                private java.lang.String firstNameKana;
                private java.lang.String firstNameKanji;
                private java.lang.String gender;
                private java.lang.String idNumber;
                private java.lang.String lastName;
                private java.lang.String lastNameKana;
                private java.lang.String lastNameKanji;
                private java.lang.String maidenName;
                private java.util.Map<java.lang.String, java.lang.String> metadata;
                private java.lang.String phone;
                private java.lang.String ssnLast4;
                private com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification verification;
                
                public Builder() {
                    super();
                }
                
                /**
                 * @param address The individual’s primary address.
                 *
                 * [account.individual.address](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setAddress(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.Address address) {
                    return null;
                }
                
                /**
                 * @param addressKana The Kana variation of the the individual’s primary address (Japan only).
                 *
                 * [account.individual.address_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kana)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setAddressKana(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AddressJapanParams addressKana) {
                    return null;
                }
                
                /**
                 * @param addressKanji The Kanji variation of the the individual’s primary address (Japan only).
                 *
                 * [account.individual.address_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-address_kanji)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setAddressKanji(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AddressJapanParams addressKanji) {
                    return null;
                }
                
                /**
                 * @param dateOfBirth The individual’s date of birth.
                 *
                 * [account.individual.dob](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-dob)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setDateOfBirth(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.DateOfBirth dateOfBirth) {
                    return null;
                }
                
                /**
                 * @param email The individual’s email.
                 *
                 * [account.individual.email](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-email)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setEmail(@org.jetbrains.annotations.Nullable()
                java.lang.String email) {
                    return null;
                }
                
                /**
                 * @param firstName The individual’s first name.
                 *
                 * [account.individual.first_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setFirstName(@org.jetbrains.annotations.Nullable()
                java.lang.String firstName) {
                    return null;
                }
                
                /**
                 * @param firstNameKana The Kana variation of the the individual’s first name (Japan only).
                 *
                 * [account.individual.first_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kana)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setFirstNameKana(@org.jetbrains.annotations.Nullable()
                java.lang.String firstNameKana) {
                    return null;
                }
                
                /**
                 * @param firstNameKanji The Kanji variation of the individual’s first name (Japan only).
                 *
                 * [account.individual.first_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-first_name_kanji)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setFirstNameKanji(@org.jetbrains.annotations.Nullable()
                java.lang.String firstNameKanji) {
                    return null;
                }
                
                /**
                 * @param gender The individual’s gender (International regulations require either “male” or “female”).
                 *
                 * [account.individual.gender](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-gender)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setGender(@org.jetbrains.annotations.Nullable()
                java.lang.String gender) {
                    return null;
                }
                
                /**
                 * @param idNumber The government-issued ID number of the individual, as appropriate
                 * for the representative’s country. (Examples are a Social Security Number in the
                 * U.S., or a Social Insurance Number in Canada). Instead of the number itself, you
                 * can also provide a PII token.
                 *
                 * [account.individual.id_number](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-id_number)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setIdNumber(@org.jetbrains.annotations.Nullable()
                java.lang.String idNumber) {
                    return null;
                }
                
                /**
                 * @param lastName The individual’s last name.
                 *
                 * [account.individual.last_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setLastName(@org.jetbrains.annotations.Nullable()
                java.lang.String lastName) {
                    return null;
                }
                
                /**
                 * @param lastNameKana The Kana varation of the individual’s last name (Japan only).
                 *
                 * [account.individual.last_name_kana](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kana)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setLastNameKana(@org.jetbrains.annotations.Nullable()
                java.lang.String lastNameKana) {
                    return null;
                }
                
                /**
                 * @param lastNameKanji The Kanji varation of the individual’s last name (Japan only).
                 *
                 * [account.individual.last_name_kanji](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-last_name_kanji)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setLastNameKanji(@org.jetbrains.annotations.Nullable()
                java.lang.String lastNameKanji) {
                    return null;
                }
                
                /**
                 * @param maidenName The individual’s maiden name.
                 *
                 * [account.individual.maiden_name](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-maiden_name)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setMaidenName(@org.jetbrains.annotations.Nullable()
                java.lang.String maidenName) {
                    return null;
                }
                
                /**
                 * @param metadata Set of key-value pairs that you can attach to an object. This
                 * can be useful for storing additional information about the object in a
                 * structured format. Individual keys can be unset by posting an empty value to
                 * them. All keys can be unset by posting an empty value to `metadata`.
                 *
                 * [account.individual.metadata](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-metadata)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setMetadata(@org.jetbrains.annotations.Nullable()
                java.util.Map<java.lang.String, java.lang.String> metadata) {
                    return null;
                }
                
                /**
                 * @param phone The individual’s phone number.
                 *
                 * [account.individual.phone](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-phone)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setPhone(@org.jetbrains.annotations.Nullable()
                java.lang.String phone) {
                    return null;
                }
                
                /**
                 * @param ssnLast4 The last four digits of the individual’s Social Security Number (U.S. only).
                 *
                 * [account.individual.ssn_last_4](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-ssn_last_4)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setSsnLast4(@org.jetbrains.annotations.Nullable()
                java.lang.String ssnLast4) {
                    return null;
                }
                
                /**
                 * @param verification The individual’s verification document information.
                 *
                 * [account.individual.verification](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-individual-verification)
                 */
                @org.jetbrains.annotations.NotNull()
                public final com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Builder setVerification(@org.jetbrains.annotations.Nullable()
                com.stripe.android.model.AccountParams.BusinessTypeParams.Individual.Verification verification) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public com.stripe.android.model.AccountParams.BusinessTypeParams.Individual build() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PHONE", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "payments-core_debug"})
            static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/AccountParams$Companion;", "", "()V", "PARAM_BUSINESS_TYPE", "", "PARAM_TOS_SHOWN_AND_ACCEPTED", "create", "Lcom/stripe/android/model/AccountParams;", "tosShownAndAccepted", "", "businessType", "Lcom/stripe/android/model/AccountParams$BusinessType;", "company", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Company;", "individual", "Lcom/stripe/android/model/AccountParams$BusinessTypeParams$Individual;", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create an [AccountParams] instance with information about the person represented by the account.
         *
         * @param tosShownAndAccepted Whether the user described by the data in the token has been
         * shown the
         * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
         * When creating an account token to create a new Connect account, this value must be `true`.
         * @param individual Information about the person represented by the account.
         *
         * @return [AccountParams]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.AccountParams.BusinessTypeParams.Individual individual) {
            return null;
        }
        
        /**
         * Create an [AccountParams] instance with information about the company or business.
         *
         * @param tosShownAndAccepted Whether the user described by the data in the token has been
         * shown the
         * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
         * When creating an account token to create a new Connect account, this value must be `true`.
         * @param company Information about the company or business.
         *
         * @return [AccountParams]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.AccountParams.BusinessTypeParams.Company company) {
            return null;
        }
        
        /**
         * Create an [AccountParams] instance.
         *
         * @param tosShownAndAccepted Whether the user described by the data in the token has been
         * shown the
         * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
         * When creating an account token to create a new Connect account, this value must be `true`.
         * @param businessType The business type.
         *
         * @return [AccountParams]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.AccountParams.BusinessType businessType) {
            return null;
        }
        
        /**
         * Create an [AccountParams] instance.
         *
         * @param tosShownAndAccepted Whether the user described by the data in the token has been
         * shown the
         * [Stripe Connected Account Agreement](https://stripe.com/docs/api/tokens/create_account#create_account_token-account-tos_shown_and_accepted).
         * When creating an account token to create a new Connect account, this value must be `true`.
         *
         * @return [AccountParams]
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.stripe.android.model.AccountParams create(boolean tosShownAndAccepted) {
            return null;
        }
    }
}
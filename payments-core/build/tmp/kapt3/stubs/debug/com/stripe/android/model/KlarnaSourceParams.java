package com.stripe.android.model;

import java.lang.System;

/**
 * Model representing parameters for creating a Klarna Source.
 *
 * See [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
 *
 * Note:
 * The optional fields [billingEmail], [billingPhone], [billingAddress], [billingFirstName],
 * [billingLastName], and [billingDob] can be provided to skip Klarna's customer information form.
 *
 * If this information is missing, Klarna will prompt the customer for these values during checkout.
 * Be careful with this option: If the provided information is invalid,
 * Klarna may reject the transaction without giving the customer a chance to correct it.
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004@ABCB\u0081\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0087\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u00107\u001a\u000202H\u00d6\u0001J\u0014\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020609H\u0016J\t\u0010:\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000202H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b\u00a8\u0006D"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "purchaseCountry", "", "lineItems", "", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "customPaymentMethods", "", "Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "billingEmail", "billingPhone", "billingAddress", "Lcom/stripe/android/model/Address;", "billingFirstName", "billingLastName", "billingDob", "Lcom/stripe/android/model/DateOfBirth;", "pageOptions", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DateOfBirth;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;)V", "getBillingAddress", "()Lcom/stripe/android/model/Address;", "getBillingDob", "()Lcom/stripe/android/model/DateOfBirth;", "getBillingEmail", "()Ljava/lang/String;", "getBillingFirstName", "getBillingLastName", "getBillingPhone", "getCustomPaymentMethods", "()Ljava/util/Set;", "getLineItems", "()Ljava/util/List;", "getPageOptions", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "getPurchaseCountry", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "CustomPaymentMethods", "LineItem", "PaymentPageOptions", "payments-core_debug"})
public final class KlarnaSourceParams implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
    
    /**
     * The URL the customer should be redirected to after they have successfully verified the
     * payment.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String purchaseCountry = null;
    
    /**
     * A list of [LineItem]. Klarna will present these on the confirmation page.
     * The total amount charged will be a sum of the [LineItem.totalAmount] of each of these items.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems = null;
    
    /**
     * Required for customers located in the US. This determines whether Pay Later and/or Slice It
     * is offered to a US customer.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods = null;
    
    /**
     * An email address for the customer.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String billingEmail = null;
    
    /**
     * A phone number for the customer.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String billingPhone = null;
    
    /**
     * An [Address] for the customer. At a minimum, [Address.line1], [Address.postalCode],
     * [Address.city], and [Address.country] must be provided.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Address billingAddress = null;
    
    /**
     * The customer's first name.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String billingFirstName = null;
    
    /**
     * The customer's last name.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String billingLastName = null;
    
    /**
     * The customer's date of birth.
     * This will be used by Klarna for a credit check in some EU countries.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.DateOfBirth billingDob = null;
    
    /**
     * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
     *
     * You can customize the style of the Klarna hosted payment page by providing additional options
     * when creating the source. Refer to the
     * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
     * for more information.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions pageOptions = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.KlarnaSourceParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_PURCHASE_COUNTRY = "purchase_country";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_PRODUCT = "product";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_FIRST_NAME = "first_name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LAST_NAME = "last_name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_DOB_DAY = "owner_dob_day";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_DOB_MONTH = "owner_dob_month";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_DOB_YEAR = "owner_dob_year";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.KlarnaSourceParams> CREATOR = null;
    
    /**
     * Model representing parameters for creating a Klarna Source.
     *
     * See [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
     *
     * Note:
     * The optional fields [billingEmail], [billingPhone], [billingAddress], [billingFirstName],
     * [billingLastName], and [billingDob] can be provided to skip Klarna's customer information form.
     *
     * If this information is missing, Klarna will prompt the customer for these values during checkout.
     * Be careful with this option: If the provided information is invalid,
     * Klarna may reject the transaction without giving the customer a chance to correct it.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.KlarnaSourceParams copy(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address billingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String billingFirstName, @org.jetbrains.annotations.Nullable()
    java.lang.String billingLastName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.DateOfBirth billingDob, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions pageOptions) {
        return null;
    }
    
    /**
     * Model representing parameters for creating a Klarna Source.
     *
     * See [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
     *
     * Note:
     * The optional fields [billingEmail], [billingPhone], [billingAddress], [billingFirstName],
     * [billingLastName], and [billingDob] can be provided to skip Klarna's customer information form.
     *
     * If this information is missing, Klarna will prompt the customer for these values during checkout.
     * Be careful with this option: If the provided information is invalid,
     * Klarna may reject the transaction without giving the customer a chance to correct it.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Model representing parameters for creating a Klarna Source.
     *
     * See [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
     *
     * Note:
     * The optional fields [billingEmail], [billingPhone], [billingAddress], [billingFirstName],
     * [billingLastName], and [billingDob] can be provided to skip Klarna's customer information form.
     *
     * If this information is missing, Klarna will prompt the customer for these values during checkout.
     * Be careful with this option: If the provided information is invalid,
     * Klarna may reject the transaction without giving the customer a chance to correct it.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model representing parameters for creating a Klarna Source.
     *
     * See [Klarna Payments with Sources](https://stripe.com/docs/sources/klarna)
     *
     * Note:
     * The optional fields [billingEmail], [billingPhone], [billingAddress], [billingFirstName],
     * [billingLastName], and [billingDob] can be provided to skip Klarna's customer information form.
     *
     * If this information is missing, Klarna will prompt the customer for these values during checkout.
     * Be careful with this option: If the provided information is invalid,
     * Klarna may reject the transaction without giving the customer a chance to correct it.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address billingAddress) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address billingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String billingFirstName) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address billingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String billingFirstName, @org.jetbrains.annotations.Nullable()
    java.lang.String billingLastName) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address billingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String billingFirstName, @org.jetbrains.annotations.Nullable()
    java.lang.String billingLastName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.DateOfBirth billingDob) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public KlarnaSourceParams(@org.jetbrains.annotations.NotNull()
    java.lang.String purchaseCountry, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> lineItems, @org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> customPaymentMethods, @org.jetbrains.annotations.Nullable()
    java.lang.String billingEmail, @org.jetbrains.annotations.Nullable()
    java.lang.String billingPhone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address billingAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String billingFirstName, @org.jetbrains.annotations.Nullable()
    java.lang.String billingLastName, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.DateOfBirth billingDob, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions pageOptions) {
        super();
    }
    
    /**
     * The URL the customer should be redirected to after they have successfully verified the
     * payment.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * The URL the customer should be redirected to after they have successfully verified the
     * payment.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPurchaseCountry() {
        return null;
    }
    
    /**
     * A list of [LineItem]. Klarna will present these on the confirmation page.
     * The total amount charged will be a sum of the [LineItem.totalAmount] of each of these items.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> component2() {
        return null;
    }
    
    /**
     * A list of [LineItem]. Klarna will present these on the confirmation page.
     * The total amount charged will be a sum of the [LineItem.totalAmount] of each of these items.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.KlarnaSourceParams.LineItem> getLineItems() {
        return null;
    }
    
    /**
     * Required for customers located in the US. This determines whether Pay Later and/or Slice It
     * is offered to a US customer.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> component3() {
        return null;
    }
    
    /**
     * Required for customers located in the US. This determines whether Pay Later and/or Slice It
     * is offered to a US customer.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.stripe.android.model.KlarnaSourceParams.CustomPaymentMethods> getCustomPaymentMethods() {
        return null;
    }
    
    /**
     * An email address for the customer.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * An email address for the customer.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillingEmail() {
        return null;
    }
    
    /**
     * A phone number for the customer.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * A phone number for the customer.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillingPhone() {
        return null;
    }
    
    /**
     * An [Address] for the customer. At a minimum, [Address.line1], [Address.postalCode],
     * [Address.city], and [Address.country] must be provided.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address component6() {
        return null;
    }
    
    /**
     * An [Address] for the customer. At a minimum, [Address.line1], [Address.postalCode],
     * [Address.city], and [Address.country] must be provided.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address getBillingAddress() {
        return null;
    }
    
    /**
     * The customer's first name.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * The customer's first name.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillingFirstName() {
        return null;
    }
    
    /**
     * The customer's last name.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * The customer's last name.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBillingLastName() {
        return null;
    }
    
    /**
     * The customer's date of birth.
     * This will be used by Klarna for a credit check in some EU countries.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.DateOfBirth component9() {
        return null;
    }
    
    /**
     * The customer's date of birth.
     * This will be used by Klarna for a credit check in some EU countries.
     *
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.DateOfBirth getBillingDob() {
        return null;
    }
    
    /**
     * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
     *
     * You can customize the style of the Klarna hosted payment page by providing additional options
     * when creating the source. Refer to the
     * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
     * for more information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions component10() {
        return null;
    }
    
    /**
     * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
     *
     * You can customize the style of the Klarna hosted payment page by providing additional options
     * when creating the source. Refer to the
     * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
     * for more information.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions getPageOptions() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.KlarnaSourceParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.KlarnaSourceParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.KlarnaSourceParams[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "Landroid/os/Parcelable;", "itemType", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "itemDescription", "", "totalAmount", "", "quantity", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)V", "getItemDescription", "()Ljava/lang/String;", "getItemType", "()Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "getQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalAmount", "()I", "component1", "component2", "component3", "component4", "copy", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Type", "payments-core_debug"})
    public static final class LineItem implements android.os.Parcelable {
        
        /**
         * The line item's type. One of `sku` (for a product), `tax` (for taxes),
         * or `shipping` (for shipping costs).
         */
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.KlarnaSourceParams.LineItem.Type itemType = null;
        
        /**
         * The human-readable description for the line item.
         */
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String itemDescription = null;
        
        /**
         * The total price of this line item.
         * Note: This is the total price after multiplying by the quantity,
         * not the price of an individual item.
         */
        private final int totalAmount = 0;
        
        /**
         * The quantity to display for this line item.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer quantity = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.model.KlarnaSourceParams.LineItem> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.KlarnaSourceParams.LineItem copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.KlarnaSourceParams.LineItem.Type itemType, @org.jetbrains.annotations.NotNull()
        java.lang.String itemDescription, int totalAmount, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity) {
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
        public LineItem(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.KlarnaSourceParams.LineItem.Type itemType, @org.jetbrains.annotations.NotNull()
        java.lang.String itemDescription, int totalAmount) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public LineItem(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.KlarnaSourceParams.LineItem.Type itemType, @org.jetbrains.annotations.NotNull()
        java.lang.String itemDescription, int totalAmount, @org.jetbrains.annotations.Nullable()
        java.lang.Integer quantity) {
            super();
        }
        
        /**
         * The line item's type. One of `sku` (for a product), `tax` (for taxes),
         * or `shipping` (for shipping costs).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.KlarnaSourceParams.LineItem.Type component1() {
            return null;
        }
        
        /**
         * The line item's type. One of `sku` (for a product), `tax` (for taxes),
         * or `shipping` (for shipping costs).
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.KlarnaSourceParams.LineItem.Type getItemType() {
            return null;
        }
        
        /**
         * The human-readable description for the line item.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The human-readable description for the line item.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getItemDescription() {
            return null;
        }
        
        /**
         * The total price of this line item.
         * Note: This is the total price after multiplying by the quantity,
         * not the price of an individual item.
         */
        public final int component3() {
            return 0;
        }
        
        /**
         * The total price of this line item.
         * Note: This is the total price after multiplying by the quantity,
         * not the price of an individual item.
         */
        public final int getTotalAmount() {
            return 0;
        }
        
        /**
         * The quantity to display for this line item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        /**
         * The quantity to display for this line item.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getQuantity() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.KlarnaSourceParams.LineItem> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.KlarnaSourceParams.LineItem createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.KlarnaSourceParams.LineItem[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Sku", "Tax", "Shipping", "payments-core_debug"})
        public static enum Type {
            /*public static final*/ Sku /* = new Sku(null) */,
            /*public static final*/ Tax /* = new Tax(null) */,
            /*public static final*/ Shipping /* = new Shipping(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            Type(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode$payments_core_debug() {
                return null;
            }
        }
    }
    
    /**
     * Required for customers located in the US.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "PayIn4", "Installments", "payments-core_debug"})
    public static enum CustomPaymentMethods {
        /*public static final*/ PayIn4 /* = new PayIn4(null) */,
        /*public static final*/ Installments /* = new Installments(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        
        CustomPaymentMethods(java.lang.String code) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
    }
    
    /**
     * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
     *
     * You can customize the style of the Klarna hosted payment page by providing additional options
     * when creating the source. Refer to the
     * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
     * for more information.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0016H\u00d6\u0001J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a0\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006&"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "logoUrl", "", "backgroundImageUrl", "pageTitle", "purchaseType", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;)V", "getBackgroundImageUrl", "()Ljava/lang/String;", "getLogoUrl", "getPageTitle", "getPurchaseType", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "PurchaseType", "payments-core_debug"})
    public static final class PaymentPageOptions implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * A public URL for your businesses logo, must be served over HTTPS.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String logoUrl = null;
        
        /**
         * A public URL for a background image, must be served over HTTPS.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String backgroundImageUrl = null;
        
        /**
         * Title displayed on the top of the Klarna Hosted Payment Page.
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String pageTitle = null;
        
        /**
         * The buy button type.
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions.PurchaseType purchaseType = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_LOGO_URL = "logo_url";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_BACKGROUND_IMAGE_URL = "background_image_url";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PAGE_TITLE = "page_title";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PURCHASE_TYPE = "purchase_type";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions> CREATOR = null;
        
        /**
         * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
         *
         * You can customize the style of the Klarna hosted payment page by providing additional options
         * when creating the source. Refer to the
         * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
         * for more information.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions copy(@org.jetbrains.annotations.Nullable()
        java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String backgroundImageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String pageTitle, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions.PurchaseType purchaseType) {
            return null;
        }
        
        /**
         * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
         *
         * You can customize the style of the Klarna hosted payment page by providing additional options
         * when creating the source. Refer to the
         * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
         * for more information.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
         *
         * You can customize the style of the Klarna hosted payment page by providing additional options
         * when creating the source. Refer to the
         * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
         * for more information.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * See [Styling the Klarna Hosted Payment Page](https://stripe.com/docs/sources/klarna#styling-the-klarna-hosted-payment-page)
         *
         * You can customize the style of the Klarna hosted payment page by providing additional options
         * when creating the source. Refer to the
         * [Klarna SDK documentation](https://developers.klarna.com/en/us/kco-v3/hpp/4-customize/)
         * for more information.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PaymentPageOptions() {
            super();
        }
        
        public PaymentPageOptions(@org.jetbrains.annotations.Nullable()
        java.lang.String logoUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String backgroundImageUrl, @org.jetbrains.annotations.Nullable()
        java.lang.String pageTitle, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions.PurchaseType purchaseType) {
            super();
        }
        
        /**
         * A public URL for your businesses logo, must be served over HTTPS.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * A public URL for your businesses logo, must be served over HTTPS.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLogoUrl() {
            return null;
        }
        
        /**
         * A public URL for a background image, must be served over HTTPS.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * A public URL for a background image, must be served over HTTPS.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBackgroundImageUrl() {
            return null;
        }
        
        /**
         * Title displayed on the top of the Klarna Hosted Payment Page.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        /**
         * Title displayed on the top of the Klarna Hosted Payment Page.
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPageTitle() {
            return null;
        }
        
        /**
         * The buy button type.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions.PurchaseType component4() {
            return null;
        }
        
        /**
         * The buy button type.
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions.PurchaseType getPurchaseType() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions[] newArray(int size) {
                return null;
            }
        }
        
        /**
         * The buy button type
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Buy", "Rent", "Book", "Subscribe", "Download", "Order", "Continue", "payments-core_debug"})
        public static enum PurchaseType {
            /*public static final*/ Buy /* = new Buy(null) */,
            /*public static final*/ Rent /* = new Rent(null) */,
            /*public static final*/ Book /* = new Book(null) */,
            /*public static final*/ Subscribe /* = new Subscribe(null) */,
            /*public static final*/ Download /* = new Download(null) */,
            /*public static final*/ Order /* = new Order(null) */,
            /*public static final*/ Continue /* = new Continue(null) */;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String code = null;
            
            PurchaseType(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getCode() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$Companion;", "", "()V", "PARAM_BACKGROUND_IMAGE_URL", "", "PARAM_LOGO_URL", "PARAM_PAGE_TITLE", "PARAM_PURCHASE_TYPE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$Companion;", "", "()V", "PARAM_CUSTOM_PAYMENT_METHODS", "", "PARAM_DOB_DAY", "PARAM_DOB_MONTH", "PARAM_DOB_YEAR", "PARAM_FIRST_NAME", "PARAM_LAST_NAME", "PARAM_PRODUCT", "PARAM_PURCHASE_COUNTRY", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
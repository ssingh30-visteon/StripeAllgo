package com.stripe.android;

import java.lang.System;

/**
 * Configuration for [PaymentSession].
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0005WXYZ[B\u00c5\u0001\b\u0000\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001dJ\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u00108\u001a\u00020\u0015H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\u000e\u0010:\u001a\u00020\tH\u00c0\u0003\u00a2\u0006\u0002\b;J\u000e\u0010<\u001a\u00020\u0019H\u00c0\u0003\u00a2\u0006\u0002\b=J\u0010\u0010>\u001a\u0004\u0018\u00010\u001bH\u00c0\u0003\u00a2\u0006\u0002\b?J\u0012\u0010@\u001a\u0004\u0018\u00010\fH\u00c0\u0003\u00a2\u0006\u0004\bA\u00104J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\tH\u00c6\u0003J\t\u0010E\u001a\u00020\tH\u00c6\u0003J\t\u0010F\u001a\u00020\fH\u00c6\u0003J\t\u0010G\u001a\u00020\fH\u00c6\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\tH\u00c6\u0003J\u00cc\u0001\u0010J\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010KJ\t\u0010L\u001a\u00020\fH\u00d6\u0001J\u0013\u0010M\u001a\u00020\t2\b\u0010N\u001a\u0004\u0018\u00010OH\u00d6\u0003J\t\u0010P\u001a\u00020\fH\u00d6\u0001J\t\u0010Q\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\fH\u00d6\u0001R\u0013\u0010\r\u001a\u00020\f8\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010%R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010%R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\'R\u0013\u0010\u000b\u001a\u00020\f8\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0018\u001a\u00020\u0019X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0017\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\fX\u0080\u0004\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104\u00a8\u0006\\"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig;", "Landroid/os/Parcelable;", "hiddenShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "prepopulatedShippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "isShippingInfoRequired", "", "isShippingMethodRequired", "paymentMethodsFooterLayoutId", "", "addPaymentMethodFooterLayoutId", "paymentMethodTypes", "Lcom/stripe/android/model/PaymentMethod$Type;", "shouldShowGooglePay", "allowedShippingCountryCodes", "", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "canDeletePaymentMethods", "shouldPrefetchCustomer", "shippingInformationValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "windowFlags", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)V", "getAddPaymentMethodFooterLayoutId", "()I", "getAllowedShippingCountryCodes", "()Ljava/util/Set;", "getBillingAddressFields", "()Lcom/stripe/android/view/BillingAddressFields;", "getCanDeletePaymentMethods", "()Z", "getHiddenShippingInfoFields", "()Ljava/util/List;", "getOptionalShippingInfoFields", "getPaymentMethodTypes", "getPaymentMethodsFooterLayoutId", "getPrepopulatedShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "getShippingInformationValidator$payments_core_debug", "()Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "getShippingMethodsFactory$payments_core_debug", "()Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "getShouldPrefetchCustomer$payments_core_debug", "getShouldShowGooglePay", "getWindowFlags$payments_core_debug", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component13$payments_core_debug", "component14", "component14$payments_core_debug", "component15", "component15$payments_core_debug", "component16", "component16$payments_core_debug", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)Lcom/stripe/android/PaymentSessionConfig;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "DefaultShippingInfoValidator", "ShippingInformationValidator", "ShippingMethodsFactory", "payments-core_debug"})
public final class PaymentSessionConfig implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.ShippingInformation prepopulatedShippingInfo = null;
    private final boolean isShippingInfoRequired = false;
    private final boolean isShippingMethodRequired = false;
    private final int paymentMethodsFooterLayoutId = 0;
    private final int addPaymentMethodFooterLayoutId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes = null;
    private final boolean shouldShowGooglePay = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> allowedShippingCountryCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.BillingAddressFields billingAddressFields = null;
    private final boolean canDeletePaymentMethods = false;
    private final boolean shouldPrefetchCustomer = false;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer windowFlags = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.PaymentSessionConfig.Companion Companion = null;
    @java.lang.Deprecated()
    private static final com.stripe.android.view.BillingAddressFields DEFAULT_BILLING_ADDRESS_FIELDS = com.stripe.android.view.BillingAddressFields.PostalCode;
    public static final android.os.Parcelable.Creator<com.stripe.android.PaymentSessionConfig> CREATOR = null;
    
    /**
     * Configuration for [PaymentSession].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionConfig copy(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation prepopulatedShippingInfo, boolean isShippingInfoRequired, boolean isShippingMethodRequired, @androidx.annotation.LayoutRes()
    int paymentMethodsFooterLayoutId, @androidx.annotation.LayoutRes()
    int addPaymentMethodFooterLayoutId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes, boolean shouldShowGooglePay, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedShippingCountryCodes, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.BillingAddressFields billingAddressFields, boolean canDeletePaymentMethods, boolean shouldPrefetchCustomer, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, @org.jetbrains.annotations.Nullable()
    com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, @org.jetbrains.annotations.Nullable()
    java.lang.Integer windowFlags) {
        return null;
    }
    
    /**
     * Configuration for [PaymentSession].
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Configuration for [PaymentSession].
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Configuration for [PaymentSession].
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaymentSessionConfig() {
        super();
    }
    
    public PaymentSessionConfig(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation prepopulatedShippingInfo, boolean isShippingInfoRequired, boolean isShippingMethodRequired, @androidx.annotation.LayoutRes()
    int paymentMethodsFooterLayoutId, @androidx.annotation.LayoutRes()
    int addPaymentMethodFooterLayoutId, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes, boolean shouldShowGooglePay, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedShippingCountryCodes, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.BillingAddressFields billingAddressFields, boolean canDeletePaymentMethods, boolean shouldPrefetchCustomer, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, @org.jetbrains.annotations.Nullable()
    com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, @org.jetbrains.annotations.Nullable()
    java.lang.Integer windowFlags) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> getHiddenShippingInfoFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> getOptionalShippingInfoFields() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getPrepopulatedShippingInfo() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isShippingInfoRequired() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean isShippingMethodRequired() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    @androidx.annotation.LayoutRes()
    public final int getPaymentMethodsFooterLayoutId() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    @androidx.annotation.LayoutRes()
    public final int getAddPaymentMethodFooterLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.PaymentMethod.Type> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.PaymentMethod.Type> getPaymentMethodTypes() {
        return null;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getShouldShowGooglePay() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getAllowedShippingCountryCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.BillingAddressFields component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.BillingAddressFields getBillingAddressFields() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getCanDeletePaymentMethods() {
        return false;
    }
    
    public final boolean component13$payments_core_debug() {
        return false;
    }
    
    public final boolean getShouldPrefetchCustomer$payments_core_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionConfig.ShippingInformationValidator component14$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.PaymentSessionConfig.ShippingInformationValidator getShippingInformationValidator$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory component15$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory getShippingMethodsFactory$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWindowFlags$payments_core_debug() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.PaymentSessionConfig> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.PaymentSessionConfig createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.PaymentSessionConfig[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Ljava/io/Serializable;", "getErrorMessage", "", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "isValid", "", "payments-core_debug"})
    public static abstract interface ShippingInformationValidator extends java.io.Serializable {
        
        /**
         * @return whether the customer's [ShippingInformation] is valid. Will run on
         * a background thread.
         */
        @androidx.annotation.WorkerThread()
        public abstract boolean isValid(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.ShippingInformation shippingInformation);
        
        /**
         * @return the error message to show if [isValid] returns `false`. Will run on
         * a background thread.
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.WorkerThread()
        public abstract java.lang.String getErrorMessage(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.ShippingInformation shippingInformation);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Ljava/io/Serializable;", "create", "", "Lcom/stripe/android/model/ShippingMethod;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "payments-core_debug"})
    public static abstract interface ShippingMethodsFactory extends java.io.Serializable {
        
        /**
         * @return a list of [ShippingMethod] options to present to the customer. Will run on
         * a background thread.
         */
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.WorkerThread()
        public abstract java.util.List<com.stripe.android.model.ShippingMethod> create(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.ShippingInformation shippingInformation);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\"\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u001f\u0010%\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0&\"\u00020\u000f\u00a2\u0006\u0002\u0010\'J\u001f\u0010(\u001a\u00020\u00002\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0&\"\u00020\u000f\u00a2\u0006\u0002\u0010\'J\u0014\u0010)\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\u0013\u001a\u00020\u0005J\u0010\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0016J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\fJ\u0015\u00103\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u00104R\u0012\u0010\u0004\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001f\u00a8\u00065"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentSessionConfig;", "()V", "addPaymentMethodFooterLayoutId", "", "allowedShippingCountryCodes", "", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "canDeletePaymentMethods", "", "hiddenShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "paymentMethodTypes", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodsFooterLayoutId", "shippingInfoRequired", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformationValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingMethodsFactory", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsRequired", "shouldPrefetchCustomer", "shouldShowGooglePay", "windowFlags", "Ljava/lang/Integer;", "build", "setAddPaymentMethodFooter", "setAllowedShippingCountryCodes", "setBillingAddressFields", "setCanDeletePaymentMethods", "setHiddenShippingInfoFields", "", "([Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "setOptionalShippingInfoFields", "setPaymentMethodTypes", "setPaymentMethodsFooter", "setPrepopulatedShippingInfo", "shippingInfo", "setShippingInfoRequired", "setShippingInformationValidator", "setShippingMethodsFactory", "setShippingMethodsRequired", "setShouldPrefetchCustomer", "setShouldShowGooglePay", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "payments-core_debug"})
    public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.PaymentSessionConfig> {
        private com.stripe.android.view.BillingAddressFields billingAddressFields;
        private boolean shippingInfoRequired = true;
        private boolean shippingMethodsRequired = true;
        private java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
        private java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
        private com.stripe.android.model.ShippingInformation shippingInformation;
        private java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes;
        private boolean shouldShowGooglePay = false;
        private java.util.Set<java.lang.String> allowedShippingCountryCodes;
        private com.stripe.android.PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator;
        private com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory;
        private java.lang.Integer windowFlags;
        private boolean shouldPrefetchCustomer = true;
        private boolean canDeletePaymentMethods = true;
        @androidx.annotation.LayoutRes()
        private int paymentMethodsFooterLayoutId = 0;
        @androidx.annotation.LayoutRes()
        private int addPaymentMethodFooterLayoutId = 0;
        
        public Builder() {
            super();
        }
        
        /**
         * @param billingAddressFields the billing address fields to require on [AddPaymentMethodActivity]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setBillingAddressFields(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.BillingAddressFields billingAddressFields) {
            return null;
        }
        
        /**
         * @param hiddenShippingInfoFields [CustomizableShippingField] fields that should be
         * hidden in the shipping information screen. All fields will be shown if this list is
         * empty. Note that not all fields can be hidden, such as country or name.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setHiddenShippingInfoFields(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField... hiddenShippingInfoFields) {
            return null;
        }
        
        /**
         * @param optionalShippingInfoFields [CustomizableShippingField] fields that should be
         * optional in the [ShippingInfoWidget]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setOptionalShippingInfoFields(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField... optionalShippingInfoFields) {
            return null;
        }
        
        /**
         * @param shippingInfo [ShippingInformation] that will pre-populate the [ShippingInfoWidget]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setPrepopulatedShippingInfo(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.ShippingInformation shippingInfo) {
            return null;
        }
        
        /**
         * @param shippingInfoRequired whether a [ShippingInformation] should be required.
         * If it is required, a screen with a [ShippingInfoWidget] is shown to collect it.
         *
         * Default is `true`.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setShippingInfoRequired(boolean shippingInfoRequired) {
            return null;
        }
        
        /**
         * @param shippingMethodsRequired whether a [ShippingMethod] should be required.
         * If it is required, a screen with a [SelectShippingMethodWidget] is shown to collect it.
         *
         * Default is `true`.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setShippingMethodsRequired(boolean shippingMethodsRequired) {
            return null;
        }
        
        /**
         * @param paymentMethodsFooterLayoutId optional layout id that will be inflated and
         * displayed beneath the payment method selection list on [PaymentMethodsActivity]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setPaymentMethodsFooter(@androidx.annotation.LayoutRes()
        int paymentMethodsFooterLayoutId) {
            return null;
        }
        
        /**
         * @param addPaymentMethodFooterLayoutId optional layout id that will be inflated and
         * displayed beneath the payment details collection form on [AddPaymentMethodActivity]
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setAddPaymentMethodFooter(@androidx.annotation.LayoutRes()
        int addPaymentMethodFooterLayoutId) {
            return null;
        }
        
        /**
         * @param paymentMethodTypes a list of [PaymentMethod.Type] that indicates the types of
         * Payment Methods that the customer can select or add via Stripe UI components.
         *
         * The order of the [PaymentMethod.Type] values in the list will be used to
         * arrange the add buttons in the Stripe UI components. They will be arranged vertically
         * from first to last.
         *
         * Currently only [PaymentMethod.Type.Card] and [PaymentMethod.Type.Fpx] are supported.
         * If not specified or empty, [PaymentMethod.Type.Card] will be used.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setPaymentMethodTypes(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> paymentMethodTypes) {
            return null;
        }
        
        /**
         * @param shouldShowGooglePay if `true`, will show "Google Pay" as an option on the
         * Payment Methods selection screen. If a user selects the Google Pay option,
         * [PaymentSessionData.useGooglePay] will be `true`.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setShouldShowGooglePay(boolean shouldShowGooglePay) {
            return null;
        }
        
        /**
         * @param canDeletePaymentMethods controls whether the user can
         * delete a payment method by swiping on it in [PaymentMethodsActivity]. Defaults to true.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setCanDeletePaymentMethods(boolean canDeletePaymentMethods) {
            return null;
        }
        
        /**
         * @param allowedShippingCountryCodes A set of allowed country codes for the
         * customer's shipping address. Will be ignored if empty.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setAllowedShippingCountryCodes(@org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> allowedShippingCountryCodes) {
            return null;
        }
        
        /**
         * @param windowFlags optional flags to set on the `Window` object of Stripe Activities
         *
         * See [WindowManager.LayoutParams](https://developer.android.com/reference/android/view/WindowManager.LayoutParams)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setWindowFlags(@org.jetbrains.annotations.Nullable()
        java.lang.Integer windowFlags) {
            return null;
        }
        
        /**
         * @param shippingInformationValidator used to validate [ShippingInformation] in [PaymentFlowActivity]
         *
         * Note: this instance must be [Serializable].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setShippingInformationValidator(@org.jetbrains.annotations.Nullable()
        com.stripe.android.PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator) {
            return null;
        }
        
        /**
         * @param shippingMethodsFactory required if [shippingInformationValidator] is specified
         * and [shippingMethodsRequired] is `true`. Used to create the [ShippingMethod] options
         * to be displayed in [PaymentFlowActivity].
         *
         * Note: this instance must be [Serializable].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setShippingMethodsFactory(@org.jetbrains.annotations.Nullable()
        com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory) {
            return null;
        }
        
        /**
         * @param shouldPrefetchCustomer If true, will immediately fetch the [Customer] associated
         * with this session. Otherwise, will only fetch when needed.
         *
         * Defaults to true.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.PaymentSessionConfig.Builder setShouldPrefetchCustomer(boolean shouldPrefetchCustomer) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.PaymentSessionConfig build() {
            return null;
        }
    }
    
    /**
     * A [ShippingInformationValidator] that accepts any [ShippingInformation] as valid.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$DefaultShippingInfoValidator;", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "()V", "getErrorMessage", "", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "isValid", "", "payments-core_debug"})
    static final class DefaultShippingInfoValidator implements com.stripe.android.PaymentSessionConfig.ShippingInformationValidator {
        
        public DefaultShippingInfoValidator() {
            super();
        }
        
        @java.lang.Override()
        public boolean isValid(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.ShippingInformation shippingInformation) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getErrorMessage(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.ShippingInformation shippingInformation) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$Companion;", "", "()V", "DEFAULT_BILLING_ADDRESS_FIELDS", "Lcom/stripe/android/view/BillingAddressFields;", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
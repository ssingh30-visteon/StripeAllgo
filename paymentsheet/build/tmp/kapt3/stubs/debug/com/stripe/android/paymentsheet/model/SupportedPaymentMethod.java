package com.stripe.android.paymentsheet.model;

import java.lang.System;

/**
 * Enum defining all payment method types for which Payment Sheet can collect
 * payment data.
 *
 * FormSpec is optionally null only because Card is not converted to the
 * compose model.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\u0001\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001:BK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cH\u0002J\"\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010\"J!\u0010\'\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0000\u00a2\u0006\u0002\b(J\u0006\u0010)\u001a\u00020\u001aJ\u0012\u0010*\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010+\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u001a\u0010,\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020-2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010.\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010/\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9\u00a8\u0006;"}, d2 = {"Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "", "type", "Lcom/stripe/android/model/PaymentMethod$Type;", "displayNameResource", "", "iconResource", "requirement", "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "paramKey", "", "", "", "formSpec", "Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "(Ljava/lang/String;ILcom/stripe/android/model/PaymentMethod$Type;IILcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Ljava/util/Map;Lcom/stripe/android/paymentsheet/elements/LayoutSpec;)V", "getDisplayNameResource", "()I", "getFormSpec", "()Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "getIconResource", "getParamKey", "()Ljava/util/Map;", "getType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "allHaveKnownReuseSupport", "", "paymentMethodsInIntent", "", "checkRequirements", "requirements", "", "Lcom/stripe/android/paymentsheet/forms/Requirement;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getPMAddForm", "Lcom/stripe/android/paymentsheet/elements/LayoutFormDescriptor;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "getSpecWithFullfilledRequirements", "getSpecWithFullfilledRequirements$paymentsheet_debug", "supportsCustomerSavedPM", "supportsPaymentIntentSfuNotSettable", "supportsPaymentIntentSfuSet", "supportsPaymentIntentSfuSettable", "Lcom/stripe/android/model/PaymentIntent;", "supportsSetupIntent", "toString", "Card", "Bancontact", "Sofort", "Ideal", "SepaDebit", "Eps", "P24", "Giropay", "AfterpayClearpay", "Klarna", "Companion", "paymentsheet_debug"})
public enum SupportedPaymentMethod {
    /*public static final*/ Card /* = new Card(null, 0, 0, null, null, null) */,
    /*public static final*/ Bancontact /* = new Bancontact(null, 0, 0, null, null, null) */,
    /*public static final*/ Sofort /* = new Sofort(null, 0, 0, null, null, null) */,
    /*public static final*/ Ideal /* = new Ideal(null, 0, 0, null, null, null) */,
    /*public static final*/ SepaDebit /* = new SepaDebit(null, 0, 0, null, null, null) */,
    /*public static final*/ Eps /* = new Eps(null, 0, 0, null, null, null) */,
    /*public static final*/ P24 /* = new P24(null, 0, 0, null, null, null) */,
    /*public static final*/ Giropay /* = new Giropay(null, 0, 0, null, null, null) */,
    /*public static final*/ AfterpayClearpay /* = new AfterpayClearpay(null, 0, 0, null, null, null) */,
    /*public static final*/ Klarna /* = new Klarna(null, 0, 0, null, null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.model.PaymentMethod.Type type = null;
    private final int displayNameResource = 0;
    private final int iconResource = 0;
    private final com.stripe.android.paymentsheet.forms.PaymentMethodRequirements requirement = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, java.lang.Object> paramKey = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.elements.LayoutSpec formSpec = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.model.SupportedPaymentMethod.Companion Companion = null;
    
    /**
     * This is a list of the payment methods that we are allowing in the release
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.stripe.android.paymentsheet.model.SupportedPaymentMethod> exposedPaymentMethods = null;
    
    SupportedPaymentMethod(com.stripe.android.model.PaymentMethod.Type type, @androidx.annotation.StringRes()
    int displayNameResource, @androidx.annotation.DrawableRes()
    int iconResource, com.stripe.android.paymentsheet.forms.PaymentMethodRequirements requirement, java.util.Map<java.lang.String, java.lang.Object> paramKey, com.stripe.android.paymentsheet.elements.LayoutSpec formSpec) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PaymentMethod.Type getType() {
        return null;
    }
    
    public final int getDisplayNameResource() {
        return 0;
    }
    
    public final int getIconResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getParamKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.elements.LayoutSpec getFormSpec() {
        return null;
    }
    
    /**
     * This will get the form layout for the supported method that matches the top pick for the
     * payment method.  It should be known that this payment method has a form
     * that matches the capabilities already.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.LayoutFormDescriptor getPMAddForm(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return null;
    }
    
    /**
     * This function will determine if there is a valid for the payment method
     * given the [PaymentSheet.Configuration] and the [StripeIntent]
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.elements.LayoutFormDescriptor getSpecWithFullfilledRequirements$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return null;
    }
    
    /**
     * Returns true if the payment method supports confirming from a saved
     * payment method of this type.  See [PaymentMethodRequirements] for
     * description of the values
     */
    public final boolean supportsCustomerSavedPM() {
        return false;
    }
    
    /**
     * This checks to see if the payment method is supported from a SetupIntent.
     */
    private final boolean supportsSetupIntent(com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return false;
    }
    
    /**
     * This checks if there is support using this payment method when SFU
     * is already set in the PaymentIntent.  If SFU is set it must be possible
     * to confirm this payment method from a PM ID attached to a customer for
     * a consistent user experience.
     */
    private final boolean supportsPaymentIntentSfuSet(com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return false;
    }
    
    /**
     * This detects if there is support with using this PM with the PI
     * where SFU is not settable by the user.
     */
    private final boolean supportsPaymentIntentSfuNotSettable(com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return false;
    }
    
    /**
     * This checks to see if this PM is supported with the given
     * payment intent and configuration.
     *
     * The customer ID is required to be passed in the configuration
     * (the sdk cannot know if the PI has a customer ID associated with it),
     * so that we can guarantee to the user that the PM will be associated
     * with their customer object AND accessible when opening PaymentSheet
     * and seeing the saved PMs associate with their customer object.
     */
    private final boolean supportsPaymentIntentSfuSettable(com.stripe.android.model.PaymentIntent stripeIntent, com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return false;
    }
    
    /**
     * Currently the only required requirement in the SDK is Delayed PMs
     */
    private final boolean checkRequirements(java.util.Set<? extends com.stripe.android.paymentsheet.forms.Requirement> requirements, com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
        return false;
    }
    
    /**
     * This checks that all PMs in the Intent have support for reuse.
     *
     * Currently a PaymentIntent can have multiple PaymentMethods allowed for confirm.
     * Some of those PaymentMethods may support setup_future_usage = off_session,
     * some might not. If a merchant creates a PaymentIntent with setup_future_usage
     * set to null, the user should be able to select if they want to save it (thus
     * setting setup_future_usage to off_session on confirm).  The problem is that
     * if all the PaymentMethods in the PaymentIntent do not support off_session
     * payments, the server will fail the confirmation.
     *
     * TODO: Fix when there is support on the server
     */
    private final boolean allHaveKnownReuseSupport(java.util.List<java.lang.String> paymentMethodsInIntent) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0002\b\u0011J\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0002\b\u0013R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod$Companion;", "", "()V", "exposedPaymentMethods", "", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "getExposedPaymentMethods$paymentsheet_debug$annotations", "getExposedPaymentMethods$paymentsheet_debug", "()Ljava/util/List;", "fromCode", "code", "", "getPMsToAdd", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getPMsToAdd$paymentsheet_debug", "getSupportedSavedCustomerPMs", "getSupportedSavedCustomerPMs$paymentsheet_debug", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.paymentsheet.model.SupportedPaymentMethod> getExposedPaymentMethods$paymentsheet_debug() {
            return null;
        }
        
        /**
         * This is a list of the payment methods that we are allowing in the release
         */
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getExposedPaymentMethods$paymentsheet_debug$annotations() {
        }
        
        /**
         * This will use only those payment methods that are allowed in the release
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.paymentsheet.model.SupportedPaymentMethod fromCode(@org.jetbrains.annotations.Nullable()
        java.lang.String code) {
            return null;
        }
        
        /**
         * Get the LPMS that are supported when used as a Customer Saved LPM given
         * the intent.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.paymentsheet.model.SupportedPaymentMethod> getSupportedSavedCustomerPMs$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
            return null;
        }
        
        /**
         * This will return a list of payment methods that have a supported form given
         * the [PaymentSheet.Configuration] and [StripeIntent].
         */
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.paymentsheet.model.SupportedPaymentMethod> getPMsToAdd$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config) {
            return null;
        }
    }
}
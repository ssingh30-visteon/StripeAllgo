package com.stripe.android.view;

import java.lang.System;

/**
 * A widget used to collect address data from a user.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001OB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000205H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020\u0015H\u0002J\u0010\u0010<\u001a\u0002052\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002052\b\u0010*\u001a\u0004\u0018\u00010\'J\b\u0010@\u001a\u000205H\u0002J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u000205H\u0002J\u0014\u0010E\u001a\u0002052\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GJ\b\u0010I\u001a\u000205H\u0002J\u0010\u0010J\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0002J\u0006\u0010N\u001a\u000208R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u000e\u0010 \u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010\'8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010)R\u000e\u0010,\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b2\u00103\u001a\u0004\b0\u00101\u00a8\u0006P"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "addressEditText", "Lcom/stripe/android/view/StripeEditText;", "addressEditText2", "addressLine1TextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "addressLine2TextInputLayout", "cityEditText", "cityTextInputLayout", "countryAutoCompleteTextView", "Lcom/stripe/android/view/CountryTextInputLayout;", "value", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenFields", "getHiddenFields", "()Ljava/util/List;", "setHiddenFields", "(Ljava/util/List;)V", "nameEditText", "nameTextInputLayout", "optionalFields", "getOptionalFields", "setOptionalFields", "phoneNumberEditText", "phoneNumberTextInputLayout", "postalCodeEditText", "postalCodeTextInputLayout", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "rawShippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getRawShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "getShippingInformation", "stateEditText", "stateTextInputLayout", "viewBinding", "Lcom/stripe/android/databinding/AddressWidgetBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/AddressWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "hideHiddenFields", "", "initView", "isFieldHidden", "", "field", "isFieldOptional", "isFieldRequired", "populateAddressFields", "address", "Lcom/stripe/android/model/Address;", "populateShippingInfo", "renderCanadianForm", "renderGreatBritainForm", "renderInternationalForm", "renderLabels", "renderUSForm", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setupErrorHandling", "updateConfigForCountry", "country", "Lcom/stripe/android/view/Country;", "updatePostalCodeInputFilter", "validateAllFields", "CustomizableShippingField", "payments-core_debug"})
public final class ShippingInfoWidget extends android.widget.LinearLayout {
    private final kotlin.Lazy viewBinding$delegate = null;
    private final com.stripe.android.view.PostalCodeValidator postalCodeValidator = null;
    
    /**
     * Address fields that should be optional.
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalFields;
    
    /**
     * Address fields that should be hidden. Hidden fields are automatically optional.
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenFields;
    private final com.stripe.android.view.CountryTextInputLayout countryAutoCompleteTextView = null;
    private final com.google.android.material.textfield.TextInputLayout addressLine1TextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout addressLine2TextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout cityTextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout nameTextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout postalCodeTextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout stateTextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout phoneNumberTextInputLayout = null;
    private final com.stripe.android.view.StripeEditText addressEditText = null;
    private final com.stripe.android.view.StripeEditText addressEditText2 = null;
    private final com.stripe.android.view.StripeEditText cityEditText = null;
    private final com.stripe.android.view.StripeEditText nameEditText = null;
    private final com.stripe.android.view.StripeEditText postalCodeEditText = null;
    private final com.stripe.android.view.StripeEditText stateEditText = null;
    private final com.stripe.android.view.StripeEditText phoneNumberEditText = null;
    
    @kotlin.jvm.JvmOverloads()
    public ShippingInfoWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingInfoWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ShippingInfoWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final com.stripe.android.databinding.AddressWidgetBinding getViewBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> getOptionalFields() {
        return null;
    }
    
    public final void setOptionalFields(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> getHiddenFields() {
        return null;
    }
    
    public final void setHiddenFields(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getShippingInformation() {
        return null;
    }
    
    private final com.stripe.android.model.ShippingInformation getRawShippingInformation() {
        return null;
    }
    
    /**
     * @param shippingInformation shippingInformation to populated into the widget input fields.
     */
    public final void populateShippingInfo(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation shippingInformation) {
    }
    
    private final void populateAddressFields(com.stripe.android.model.Address address) {
    }
    
    public final void setAllowedCountryCodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedCountryCodes) {
    }
    
    /**
     * Validates all fields and shows error messages if appropriate.
     *
     * @return `true` if all shown fields are valid, `false` otherwise
     */
    public final boolean validateAllFields() {
        return false;
    }
    
    private final boolean isFieldRequired(com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField field) {
        return false;
    }
    
    private final boolean isFieldOptional(com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField field) {
        return false;
    }
    
    private final boolean isFieldHidden(com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField field) {
        return false;
    }
    
    private final void initView() {
    }
    
    private final void setupErrorHandling() {
    }
    
    private final void renderLabels() {
    }
    
    private final void hideHiddenFields() {
    }
    
    private final void updateConfigForCountry(com.stripe.android.view.Country country) {
    }
    
    private final void updatePostalCodeInputFilter(com.stripe.android.view.Country country) {
    }
    
    private final void renderUSForm() {
    }
    
    private final void renderGreatBritainForm() {
    }
    
    private final void renderCanadianForm() {
    }
    
    private final void renderInternationalForm() {
    }
    
    /**
     * Constants that can be used to mark fields in this widget as optional or hidden.
     * Some fields cannot be hidden.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "", "(Ljava/lang/String;I)V", "Line1", "Line2", "City", "PostalCode", "State", "Phone", "payments-core_debug"})
    public static enum CustomizableShippingField {
        /*public static final*/ Line1 /* = new Line1() */,
        /*public static final*/ Line2 /* = new Line2() */,
        /*public static final*/ City /* = new City() */,
        /*public static final*/ PostalCode /* = new PostalCode() */,
        /*public static final*/ State /* = new State() */,
        /*public static final*/ Phone /* = new Phone() */;
        
        CustomizableShippingField() {
        }
    }
}
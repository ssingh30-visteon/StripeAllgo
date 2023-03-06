package com.stripe.android.paymentsheet.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0004~\u007f\u0080\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010p\u001a\u00020CH\u0002J\n\u0010q\u001a\u0004\u0018\u00010\u000bH\u0002J\u001c\u0010r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010s\u001a\u00020B2\b\u0010t\u001a\u0004\u0018\u00010mH\u0002J\u0006\u0010u\u001a\u00020CJ\b\u0010v\u001a\u00020wH\u0002J\u0017\u0010x\u001a\u00020C2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000\u00a2\u0006\u0002\byJ\u0010\u0010z\u001a\u00020C2\u0006\u0010{\u001a\u000204H\u0016J\u0012\u0010|\u001a\u00020C2\b\u0010s\u001a\u0004\u0018\u00010BH\u0002J\u0012\u0010}\u001a\u00020C2\b\u0010s\u001a\u0004\u0018\u00010BH\u0002R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00118\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00118\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u00020\u001d8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u00020\"8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u00020\u00118\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0013\u001a\u0004\b(\u0010\u0015R\u001c\u0010)\u001a\u00020*8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010-R\u001c\u0010.\u001a\u00020/8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0013\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00105R1\u00108\u001a\u0002072\u0006\u00106\u001a\u0002078@@@X\u0081\u008e\u0002\u00a2\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\b9\u0010\u0013\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010@\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010D\u001a\b\u0012\u0004\u0012\u00020C0EX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR+\u0010K\u001a\u00020J2\u0006\u00106\u001a\u00020J8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bP\u0010?\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010Q\u001a\u00020\u001d8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bR\u0010\u0013\u001a\u0004\bS\u0010 R\u000e\u0010T\u001a\u00020UX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010V\u001a\u00020W8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bX\u0010\u0013\u001a\u0004\bY\u0010ZR&\u0010[\u001a\u0004\u0018\u00010\\8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b]\u0010\u0013\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010d\u001a\u00020\u001d8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\be\u0010\u0013\u001a\u0004\bf\u0010 R\u001c\u0010g\u001a\u00020\u00118\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bh\u0010\u0013\u001a\u0004\bi\u0010\u0015R\u000e\u0010j\u001a\u00020kX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010l\u001a\u0004\u0018\u00010m*\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bn\u0010o\u00a8\u0006\u0081\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_address", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/model/Address;", "address", "Landroidx/lifecycle/LiveData;", "getAddress$paymentsheet_debug", "()Landroidx/lifecycle/LiveData;", "address1View", "Lcom/google/android/material/textfield/TextInputEditText;", "getAddress1View$paymentsheet_debug$annotations", "()V", "getAddress1View$paymentsheet_debug", "()Lcom/google/android/material/textfield/TextInputEditText;", "address2View", "getAddress2View$paymentsheet_debug$annotations", "getAddress2View$paymentsheet_debug", "allFields", "", "Landroid/widget/EditText;", "cityLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getCityLayout$paymentsheet_debug$annotations", "getCityLayout$paymentsheet_debug", "()Lcom/google/android/material/textfield/TextInputLayout;", "cityPostalContainer", "Landroid/widget/LinearLayout;", "getCityPostalContainer$paymentsheet_debug$annotations", "getCityPostalContainer$paymentsheet_debug", "()Landroid/widget/LinearLayout;", "cityView", "getCityView$paymentsheet_debug$annotations", "getCityView$paymentsheet_debug", "countryLayout", "Lcom/stripe/android/view/CountryTextInputLayout;", "getCountryLayout$paymentsheet_debug$annotations", "getCountryLayout$paymentsheet_debug", "()Lcom/stripe/android/view/CountryTextInputLayout;", "countryView", "Landroid/widget/AutoCompleteTextView;", "getCountryView$paymentsheet_debug$annotations", "getCountryView$paymentsheet_debug", "()Landroid/widget/AutoCompleteTextView;", "isUnitedStates", "", "()Z", "<set-?>", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "level", "getLevel$paymentsheet_debug$annotations", "getLevel$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "setLevel$paymentsheet_debug", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;)V", "level$delegate", "Lkotlin/properties/ReadWriteProperty;", "newCountryCodeCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/CountryCode;", "", "onFocus", "Lkotlin/Function0;", "getOnFocus$paymentsheet_debug", "()Lkotlin/jvm/functions/Function0;", "setOnFocus$paymentsheet_debug", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "postalCodeConfig", "getPostalCodeConfig", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "setPostalCodeConfig", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;)V", "postalCodeConfig$delegate", "postalCodeLayout", "getPostalCodeLayout$paymentsheet_debug$annotations", "getPostalCodeLayout$paymentsheet_debug", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeView", "Lcom/stripe/android/view/StripeEditText;", "getPostalCodeView$paymentsheet_debug$annotations", "getPostalCodeView$paymentsheet_debug", "()Lcom/stripe/android/view/StripeEditText;", "postalCodeViewListener", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "getPostalCodeViewListener$paymentsheet_debug$annotations", "getPostalCodeViewListener$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "setPostalCodeViewListener$paymentsheet_debug", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;)V", "requiredViews", "Landroid/view/View;", "stateLayout", "getStateLayout$paymentsheet_debug$annotations", "getStateLayout$paymentsheet_debug", "stateView", "getStateView$paymentsheet_debug$annotations", "getStateView$paymentsheet_debug", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;", "value", "", "getValue", "(Landroid/widget/EditText;)Ljava/lang/String;", "configureForLevel", "createAddress", "createRequiredAddress", "countryCode", "postalCode", "focusFirstField", "getLocale", "Ljava/util/Locale;", "populate", "populate$paymentsheet_debug", "setEnabled", "enabled", "updatePostalCodeView", "updateStateView", "BillingAddressCollectionLevel", "PostalCodeConfig", "PostalCodeViewListener", "paymentsheet_debug"})
public final class BillingAddressView extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty level$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFocus;
    private final com.stripe.android.paymentsheet.databinding.StripeBillingAddressLayoutBinding viewBinding = null;
    private final com.stripe.android.view.PostalCodeValidator postalCodeValidator = null;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.model.Address> _address = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.model.Address> address = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.CountryTextInputLayout countryLayout = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.AutoCompleteTextView countryView = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.LinearLayout cityPostalContainer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.StripeEditText postalCodeView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputLayout postalCodeLayout = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputEditText address1View = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputEditText address2View = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputLayout cityLayout = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputEditText cityView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputEditText stateView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputLayout stateLayout = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeViewListener postalCodeViewListener;
    private final kotlin.properties.ReadWriteProperty postalCodeConfig$delegate = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.model.CountryCode, kotlin.Unit> newCountryCodeCallback = null;
    private final java.util.Set<android.view.View> requiredViews = null;
    private final java.util.Set<android.widget.EditText> allFields = null;
    
    @kotlin.jvm.JvmOverloads()
    public BillingAddressView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BillingAddressView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BillingAddressView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.ui.BillingAddressView.BillingAddressCollectionLevel getLevel$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getLevel$paymentsheet_debug$annotations() {
    }
    
    public final void setLevel$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.ui.BillingAddressView.BillingAddressCollectionLevel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnFocus$paymentsheet_debug() {
        return null;
    }
    
    public final void setOnFocus$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.model.Address> getAddress$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CountryTextInputLayout getCountryLayout$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCountryLayout$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.AutoCompleteTextView getCountryView$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCountryView$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getCityPostalContainer$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCityPostalContainer$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.StripeEditText getPostalCodeView$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getPostalCodeView$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPostalCodeLayout$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getPostalCodeLayout$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getAddress1View$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getAddress1View$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getAddress2View$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getAddress2View$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getCityLayout$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCityLayout$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getCityView$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCityView$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputEditText getStateView$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStateView$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getStateLayout$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getStateLayout$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeViewListener getPostalCodeViewListener$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getPostalCodeViewListener$paymentsheet_debug$annotations() {
    }
    
    public final void setPostalCodeViewListener$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeViewListener p0) {
    }
    
    private final boolean isUnitedStates() {
        return false;
    }
    
    private final com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig getPostalCodeConfig() {
        return null;
    }
    
    private final void setPostalCodeConfig(com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig p0) {
    }
    
    /**
     * An [Address] if the country and postal code are valid; otherwise `null`.
     */
    private final com.stripe.android.model.Address createAddress() {
        return null;
    }
    
    private final com.stripe.android.model.Address createRequiredAddress(com.stripe.android.model.CountryCode countryCode, java.lang.String postalCode) {
        return null;
    }
    
    private final void updateStateView(com.stripe.android.model.CountryCode countryCode) {
    }
    
    private final void updatePostalCodeView(com.stripe.android.model.CountryCode countryCode) {
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    private final void configureForLevel() {
    }
    
    public final void focusFirstField() {
    }
    
    public final void populate$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address) {
    }
    
    private final java.lang.String getValue(android.widget.EditText $this$value) {
        return null;
    }
    
    private final java.util.Locale getLocale() {
        return null;
    }
    
    /**
     * Listener to notify events related to [postalCodeView]
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "", "onCountryChanged", "", "country", "Lcom/stripe/android/view/Country;", "isPostalValid", "", "onGainingFocus", "onLosingFocus", "paymentsheet_debug"})
    public static abstract interface PostalCodeViewListener {
        
        public abstract void onLosingFocus(@org.jetbrains.annotations.Nullable()
        com.stripe.android.view.Country country, boolean isPostalValid);
        
        public abstract void onGainingFocus(@org.jetbrains.annotations.Nullable()
        com.stripe.android.view.Country country, boolean isPostalValid);
        
        public abstract void onCountryChanged(@org.jetbrains.annotations.Nullable()
        com.stripe.android.view.Country country, boolean isPostalValid);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "", "()V", "inputType", "", "getInputType", "()I", "maxLength", "getMaxLength", "getKeyListener", "Landroid/text/method/KeyListener;", "Global", "UnitedStates", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;", "paymentsheet_debug"})
    public static abstract class PostalCodeConfig {
        
        private PostalCodeConfig() {
            super();
        }
        
        public abstract int getMaxLength();
        
        public abstract int getInputType();
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.text.method.KeyListener getKeyListener();
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "()V", "inputType", "", "getInputType", "()I", "maxLength", "getMaxLength", "getKeyListener", "Landroid/text/method/KeyListener;", "paymentsheet_debug"})
        public static final class UnitedStates extends com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig.UnitedStates INSTANCE = null;
            private static final int maxLength = 5;
            private static final int inputType = 18;
            
            private UnitedStates() {
                super();
            }
            
            @java.lang.Override()
            public int getMaxLength() {
                return 0;
            }
            
            @java.lang.Override()
            public int getInputType() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public android.text.method.KeyListener getKeyListener() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "()V", "inputType", "", "getInputType", "()I", "maxLength", "getMaxLength", "getKeyListener", "Landroid/text/method/KeyListener;", "paymentsheet_debug"})
        public static final class Global extends com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig.Global INSTANCE = null;
            private static final int maxLength = 13;
            private static final int inputType = android.text.InputType.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            
            private Global() {
                super();
            }
            
            @java.lang.Override()
            public int getMaxLength() {
                return 0;
            }
            
            @java.lang.Override()
            public int getInputType() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public android.text.method.KeyListener getKeyListener() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "", "(Ljava/lang/String;I)V", "Automatic", "Required", "paymentsheet_debug"})
    public static enum BillingAddressCollectionLevel {
        /*public static final*/ Automatic /* = new Automatic() */,
        /*public static final*/ Required /* = new Required() */;
        
        BillingAddressCollectionLevel() {
        }
    }
}
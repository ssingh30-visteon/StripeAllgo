package com.stripe.android.view;

import java.lang.System;

/**
 * A subclass of [TextInputLayout] that programmatically wraps a styleable [AutoCompleteTextView],
 * which configures a [CountryAdapter] to display list of countries in its popup.
 *
 * The style of [AutoCompleteTextView] can be changed via
 * [R.styleable.StripeCountryAutoCompleteTextInputLayout_countryAutoCompleteStyle],
 * the layout of popup items can be changed via
 * [R.styleable.StripeCountryAutoCompleteTextInputLayout_countryItemLayout], note this layout must
 * be a [TextView].
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002JKB%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020.H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u00100\u001a\u00020\rH\u0002J\u0012\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u000103H\u0014J\n\u00104\u001a\u0004\u0018\u000103H\u0016J\u0015\u00105\u001a\u00020\u00152\u0006\u00102\u001a\u000206H\u0001\u00a2\u0006\u0002\b7J\u001b\u00108\u001a\u00020\u00152\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0000\u00a2\u0006\u0002\b<J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0001\u00a2\u0006\u0002\b?J\u0015\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020;H\u0001\u00a2\u0006\u0002\b?J\u0010\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020BH\u0016J\u0012\u0010C\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010\u001cH\u0007J\b\u0010D\u001a\u00020\u0015H\u0002J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0007J\u0015\u0010F\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\bGJ\r\u0010H\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\bIR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0012\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u00148@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R5\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u001c8@@@X\u0081\u008e\u0002\u00a2\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00a8\u0006L"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "countryAutoCompleteStyleRes", "countryAutocomplete", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$annotations", "()V", "getCountryAutocomplete", "()Landroid/widget/AutoCompleteTextView;", "countryChangeCallback", "Lkotlin/Function1;", "Lcom/stripe/android/view/Country;", "", "getCountryChangeCallback$payments_core_debug$annotations", "getCountryChangeCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function1;", "setCountryChangeCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function1;)V", "countryCodeChangeCallback", "Lcom/stripe/android/model/CountryCode;", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "itemLayoutRes", "selectedCountry", "getSelectedCountry$payments_core_debug", "()Lcom/stripe/android/view/Country;", "<set-?>", "selectedCountryCode", "getSelectedCountryCode$payments_core_debug$annotations", "getSelectedCountryCode$payments_core_debug", "()Lcom/stripe/android/model/CountryCode;", "setSelectedCountryCode$payments_core_debug", "(Lcom/stripe/android/model/CountryCode;)V", "selectedCountryCode$delegate", "Lkotlin/properties/ReadWriteProperty;", "clearError", "getLocale", "Ljava/util/Locale;", "getSelectedCountryCode", "initializeCountryAutoCompleteWithStyle", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "restoreSelectedCountry", "Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "restoreSelectedCountry$payments_core_debug", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setAllowedCountryCodes$payments_core_debug", "setCountrySelected", "countryCode", "setCountrySelected$payments_core_debug", "setEnabled", "enabled", "", "setSelectedCountryCode", "updateInitialCountry", "updateUiForCountryEntered", "updatedSelectedCountryCode", "updatedSelectedCountryCode$payments_core_debug", "validateCountry", "validateCountry$payments_core_debug", "Companion", "SelectedCountryState", "payments-core_debug"})
public final class CountryTextInputLayout extends com.google.android.material.textfield.TextInputLayout {
    @androidx.annotation.StyleRes()
    private int countryAutoCompleteStyleRes = 0;
    @androidx.annotation.LayoutRes()
    private int itemLayoutRes;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final android.widget.AutoCompleteTextView countryAutocomplete = null;
    
    /**
     * The 2 digit country code of the country selected by this input.
     */
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty selectedCountryCode$delegate = null;
    private com.stripe.android.view.CountryAdapter countryAdapter;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.CountryTextInputLayout.Companion Companion = null;
    @java.lang.Deprecated()
    public static final int INVALID_COUNTRY_AUTO_COMPLETE_STYLE = 0;
    @java.lang.Deprecated()
    private static final int DEFAULT_ITEM_LAYOUT = 0;
    
    @kotlin.jvm.JvmOverloads()
    public CountryTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CountryTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CountryTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.AutoCompleteTextView getCountryAutocomplete() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCountryAutocomplete$annotations() {
    }
    
    /**
     * The 2 digit country code of the country selected by this input.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CountryCode getSelectedCountryCode$payments_core_debug() {
        return null;
    }
    
    /**
     * The 2 digit country code of the country selected by this input.
     */
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getSelectedCountryCode$payments_core_debug$annotations() {
    }
    
    /**
     * The 2 digit country code of the country selected by this input.
     */
    public final void setSelectedCountryCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.CountryCode p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final com.stripe.android.model.CountryCode getSelectedCountryCode() {
        return null;
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setSelectedCountryCode(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.CountryCode countryCode) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.Country getSelectedCountry$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final kotlin.jvm.functions.Function1<com.stripe.android.view.Country, kotlin.Unit> getCountryChangeCallback$payments_core_debug() {
        return null;
    }
    
    @java.lang.Deprecated()
    public static void getCountryChangeCallback$payments_core_debug$annotations() {
    }
    
    @java.lang.Deprecated()
    public final void setCountryChangeCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.view.Country, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.model.CountryCode, kotlin.Unit> getCountryCodeChangeCallback() {
        return null;
    }
    
    public final void setCountryCodeChangeCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.CountryCode, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void restoreSelectedCountry$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.CountryTextInputLayout.SelectedCountryState state) {
    }
    
    /**
     * Initialize the encapsulated [AutoCompleteTextView] with [countryAutoCompleteStyleRes] style
     * resource read from styleable.
     * If no style resource is set, create one with default style attributes
     * [R.attr.autoCompleteTextViewStyle].
     */
    private final android.widget.AutoCompleteTextView initializeCountryAutoCompleteWithStyle() {
        return null;
    }
    
    private final void updateInitialCountry() {
    }
    
    /**
     * @param allowedCountryCodes A set of allowed country codes. Will be ignored if empty.
     */
    public final void setAllowedCountryCodes$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedCountryCodes) {
    }
    
    /**
     * @param countryCode specify a country code to display in the input. The input will display
     * the full country display name.
     */
    @androidx.annotation.VisibleForTesting()
    public final void setCountrySelected$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CountryCode countryCode) {
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public final void setCountrySelected$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @androidx.annotation.VisibleForTesting()
    public final void updateUiForCountryEntered(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CountryCode countryCode) {
    }
    
    public final void updatedSelectedCountryCode$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CountryCode countryCode) {
    }
    
    public final void validateCountry$payments_core_debug() {
    }
    
    private final void clearError() {
    }
    
    private final java.util.Locale getLocale() {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "Landroid/os/Parcelable;", "countryCode", "Lcom/stripe/android/model/CountryCode;", "superState", "(Lcom/stripe/android/model/CountryCode;Landroid/os/Parcelable;)V", "getCountryCode", "()Lcom/stripe/android/model/CountryCode;", "getSuperState", "()Landroid/os/Parcelable;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class SelectedCountryState implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.model.CountryCode countryCode = null;
        @org.jetbrains.annotations.Nullable()
        private final android.os.Parcelable superState = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.CountryTextInputLayout.SelectedCountryState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.CountryTextInputLayout.SelectedCountryState copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CountryCode countryCode, @org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState) {
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
        
        public SelectedCountryState(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CountryCode countryCode, @org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CountryCode component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.CountryCode getCountryCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Parcelable component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Parcelable getSuperState() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.CountryTextInputLayout.SelectedCountryState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.CountryTextInputLayout.SelectedCountryState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.CountryTextInputLayout.SelectedCountryState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$Companion;", "", "()V", "DEFAULT_ITEM_LAYOUT", "", "getDEFAULT_ITEM_LAYOUT", "()I", "INVALID_COUNTRY_AUTO_COMPLETE_STYLE", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getDEFAULT_ITEM_LAYOUT() {
            return 0;
        }
    }
}
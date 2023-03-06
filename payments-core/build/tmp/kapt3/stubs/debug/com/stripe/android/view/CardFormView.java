package com.stripe.android.view;

import java.lang.System;

/**
 * A view to collect credit card information and provide [CardParams] for API invocation.
 * The postal code field adjust its form accordingly based on currently selected country.
 *
 * Use [R.styleable.StripeCardFormView_cardFormStyle] to toggle style between [Style.Standard] and [Style.Borderless],
 * Use [R.styleable.StripeCardFormView_backgroundColorStateList] to change the card form's background color in enable and disabled state.
 *
 * To access the [CardParams], see details in [cardParams] property.
 * To get notified if the current card params are valid, set a [CardValidCallback] object with [setCardValidCallback].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 L2\u00020\u0001:\u0002LMB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000206H\u0002J\b\u00108\u001a\u000209H\u0002J\u001a\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\"2\b\u0010<\u001a\u0004\u0018\u00010#H\u0002J\u0012\u0010=\u001a\u0002062\b\u0010>\u001a\u0004\u0018\u00010?H\u0014J\b\u0010@\u001a\u00020?H\u0014J\u0010\u0010A\u001a\u0002062\b\u0010B\u001a\u0004\u0018\u00010\u0017J\u0010\u0010C\u001a\u0002062\u0006\u0010D\u001a\u000209H\u0016J\b\u0010E\u001a\u000206H\u0002J\b\u0010F\u001a\u000206H\u0002J\b\u0010G\u001a\u000206H\u0002J\u0012\u0010H\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010#H\u0002J\u0012\u0010I\u001a\u0002062\b\u0010J\u001a\u0004\u0018\u00010KH\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010#0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u0016\u0010(\u001a\n **\u0004\u0018\u00010)0)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/stripe/android/view/CardFormView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allEditTextFields", "", "Lcom/stripe/android/view/StripeEditText;", "getAllEditTextFields", "()Ljava/util/Collection;", "cardContainer", "Lcom/google/android/material/card/MaterialCardView;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "Lcom/stripe/android/view/StripeTextWatcher;", "countryLayout", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryPostalDivider", "Landroid/view/View;", "errors", "Landroid/widget/TextView;", "errorsMap", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "", "invalidFields", "", "getInvalidFields", "()Ljava/util/Set;", "layoutInflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "postalCodeContainer", "Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeView", "Lcom/stripe/android/view/PostalCodeEditText;", "style", "Lcom/stripe/android/view/CardFormView$Style;", "viewBinding", "Lcom/stripe/android/databinding/StripeCardFormViewBinding;", "applyBorderlessStyle", "", "applyStandardStyle", "isPostalValid", "", "onFieldError", "field", "errorMessage", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "setCardValidCallback", "callback", "setEnabled", "enabled", "setupCardWidget", "setupCountryAndPostal", "showPostalError", "updateErrorsView", "updatePostalCodeViewLocale", "countryCode", "Lcom/stripe/android/model/CountryCode;", "Companion", "Style", "payments-core_debug"})
public final class CardFormView extends android.widget.LinearLayout {
    private final android.view.LayoutInflater layoutInflater = null;
    private final com.stripe.android.databinding.StripeCardFormViewBinding viewBinding = null;
    private final com.google.android.material.card.MaterialCardView cardContainer = null;
    private final com.stripe.android.view.CardMultilineWidget cardMultilineWidget = null;
    private final android.view.View countryPostalDivider = null;
    private final com.google.android.material.textfield.TextInputLayout postalCodeContainer = null;
    private final android.widget.TextView errors = null;
    private final com.stripe.android.view.PostalCodeEditText postalCodeView = null;
    private final com.stripe.android.view.CountryTextInputLayout countryLayout = null;
    private final com.stripe.android.view.PostalCodeValidator postalCodeValidator = null;
    private com.stripe.android.view.CardFormView.Style style = com.stripe.android.view.CardFormView.Style.Standard;
    private final java.util.Map<com.stripe.android.view.CardValidCallback.Fields, java.lang.String> errorsMap = null;
    private com.stripe.android.view.CardValidCallback cardValidCallback;
    private final com.stripe.android.view.StripeTextWatcher cardValidTextWatcher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.CardFormView.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CARD_FORM_VIEW = "CardFormView";
    private static final java.lang.String STATE_ENABLED = "state_enabled";
    private static final java.lang.String STATE_SUPER_STATE = "state_super_state";
    
    @kotlin.jvm.JvmOverloads()
    public CardFormView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardFormView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardFormView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final java.util.Collection<com.stripe.android.view.StripeEditText> getAllEditTextFields() {
        return null;
    }
    
    private final java.util.Set<com.stripe.android.view.CardValidCallback.Fields> getInvalidFields() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.CardParams getCardParams() {
        return null;
    }
    
    public final void setCardValidCallback(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardValidCallback callback) {
    }
    
    private final void setupCountryAndPostal() {
    }
    
    private final void updatePostalCodeViewLocale(com.stripe.android.model.CountryCode countryCode) {
    }
    
    private final boolean isPostalValid() {
        return false;
    }
    
    private final void showPostalError() {
    }
    
    private final void setupCardWidget() {
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    private final void applyStandardStyle() {
    }
    
    private final void applyBorderlessStyle() {
    }
    
    private final void onFieldError(com.stripe.android.view.CardValidCallback.Fields field, java.lang.String errorMessage) {
    }
    
    private final void updateErrorsView(java.lang.String errorMessage) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardFormView$Style;", "", "attrValue", "", "(Ljava/lang/String;II)V", "getAttrValue$payments_core_debug", "()I", "Standard", "Borderless", "payments-core_debug"})
    static enum Style {
        /*public static final*/ Standard /* = new Standard(0) */,
        /*public static final*/ Borderless /* = new Borderless(0) */;
        private final int attrValue = 0;
        
        Style(int attrValue) {
        }
        
        public final int getAttrValue$payments_core_debug() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardFormView$Companion;", "", "()V", "CARD_FORM_VIEW", "", "STATE_ENABLED", "STATE_SUPER_STATE", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
package com.stripe.android.view;

import java.lang.System;

/**
 * A single-line card input widget.
 *
 * To enable 19-digit card support, [PaymentConfiguration.init] must be called before
 * [CardInputWidget] is instantiated.
 *
 * The individual `EditText` views of this widget can be styled by defining a style
 * `Stripe.CardInputWidget.EditText` that extends `Stripe.Base.CardInputWidget.EditText`.
 *
 * The card number, cvc, and expiry date will always be left to right regardless of locale.  Postal
 * code layout direction will be set according to the locale.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010#\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u00dc\u00012\u00020\u00012\u00020\u0002:\u001c\u00d8\u0001\u00d9\u0001\u00da\u0001\u00db\u0001\u00dc\u0001\u00dd\u0001\u00de\u0001\u00df\u0001\u00e0\u0001\u00e1\u0001\u00e2\u0001\u00e3\u0001\u00e4\u0001\u00e5\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\u0091\u0001\u001a\u00030\u0092\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0016J\u0018\u0010\u0094\u0001\u001a\u0002022\u0007\u0010\u0095\u0001\u001a\u00020\bH\u0001\u00a2\u0006\u0003\b\u0096\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\b2\u0007\u0010\u0098\u0001\u001a\u0002022\u0007\u0010\u0099\u0001\u001a\u00020\fH\u0002J\u001d\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020\b2\u0006\u0010D\u001a\u00020\bH\u0002J\u0014\u0010\u009d\u0001\u001a\u00030\u0092\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\t\u0010\u009e\u0001\u001a\u00020UH\u0016J\t\u0010\u009f\u0001\u001a\u00020UH\u0002J\n\u0010\u00a0\u0001\u001a\u00030\u0092\u0001H\u0014J\u0013\u0010\u00a1\u0001\u001a\u00020U2\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001H\u0016J7\u0010\u00a4\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u00a5\u0001\u001a\u00020U2\u0007\u0010\u00a6\u0001\u001a\u00020\b2\u0007\u0010\u00a7\u0001\u001a\u00020\b2\u0007\u0010\u00a8\u0001\u001a\u00020\b2\u0007\u0010\u00a9\u0001\u001a\u00020\bH\u0014J\u0014\u0010\u00aa\u0001\u001a\u00030\u0092\u00012\b\u0010\u00ab\u0001\u001a\u00030\u00ac\u0001H\u0014J\n\u0010\u00ad\u0001\u001a\u00030\u00ac\u0001H\u0014J\n\u0010\u00ae\u0001\u001a\u00030\u0092\u0001H\u0002J\n\u0010\u00af\u0001\u001a\u00030\u0092\u0001H\u0002J\u0013\u0010\u00b0\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u00b1\u0001\u001a\u000202H\u0016J\u0015\u0010\u00b2\u0001\u001a\u00030\u0092\u00012\t\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u001aH\u0016J\u0015\u0010\u00b4\u0001\u001a\u00030\u0092\u00012\t\u0010\u00b5\u0001\u001a\u0004\u0018\u000102H\u0016J\u0016\u0010\u00b6\u0001\u001a\u00030\u0092\u00012\n\u0010\u00b7\u0001\u001a\u0005\u0018\u00010\u00b8\u0001H\u0016J\u0015\u0010\u00b9\u0001\u001a\u00030\u0092\u00012\t\u0010\u00ba\u0001\u001a\u0004\u0018\u00010&H\u0016J\u0015\u0010\u00bb\u0001\u001a\u00030\u0092\u00012\t\u0010\u00bc\u0001\u001a\u0004\u0018\u000102H\u0016J\u0013\u0010\u00bd\u0001\u001a\u00030\u0092\u00012\t\u0010\u00be\u0001\u001a\u0004\u0018\u000102J\u0016\u0010\u00bf\u0001\u001a\u00030\u0092\u00012\n\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00b8\u0001H\u0016J\u0013\u0010\u00c1\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u009e\u0001\u001a\u00020UH\u0016J \u0010\u00c2\u0001\u001a\u00030\u0092\u00012\t\b\u0001\u0010\u00c3\u0001\u001a\u00020\b2\t\b\u0001\u0010\u00c4\u0001\u001a\u00020\bH\u0016J\u0016\u0010\u00c5\u0001\u001a\u00030\u0092\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00b8\u0001H\u0016J\u001b\u0010\u00c7\u0001\u001a\u00030\u0092\u00012\t\u0010\u00c8\u0001\u001a\u0004\u0018\u000102H\u0000\u00a2\u0006\u0003\b\u00c9\u0001J\u0016\u0010\u00ca\u0001\u001a\u00030\u0092\u00012\n\u0010\u00cb\u0001\u001a\u0005\u0018\u00010\u00b8\u0001H\u0016J\u001a\u0010\u00cc\u0001\u001a\u00030\u0092\u00012\u000e\u0010\u00cd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010,H\u0002J\n\u0010\u00cf\u0001\u001a\u00030\u0092\u0001H\u0002J&\u0010\u00d0\u0001\u001a\u00030\u0092\u00012\b\u0010\u00d1\u0001\u001a\u00030\u00d2\u00012\u0007\u0010\u00d3\u0001\u001a\u00020\b2\u0007\u0010\u00d4\u0001\u001a\u00020\bH\u0002J\n\u0010\u00d5\u0001\u001a\u00030\u0092\u0001H\u0002J,\u0010\u00d6\u0001\u001a\u00030\u0092\u00012\u0006\u0010T\u001a\u00020U2\b\b\u0002\u0010G\u001a\u00020\b2\b\b\u0002\u0010D\u001a\u00020\bH\u0001\u00a2\u0006\u0003\b\u00d7\u0001R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010+\u001a\b\u0012\u0004\u0012\u00020\f0,8@X\u0081\u0004\u00a2\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00103\u001a\u0004\u0018\u0001048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u000208X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u0002028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010D\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bH\u0010FR \u0010I\u001a\b\u0012\u0004\u0012\u00020\b0JX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u000e\u0010O\u001a\u000202X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020UX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u000e\u0010Z\u001a\u00020UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010[\u001a\u00020\\X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010a\u001a\u0004\u0018\u00010b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010e\u001a\u0004\u0018\u00010f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010i\u001a\u0002028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bj\u0010>R\u0014\u0010k\u001a\u00020lX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020pX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010rR+\u0010t\u001a\u00020U2\u0006\u0010s\u001a\u00020U8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\bu\u0010W\"\u0004\bv\u0010YR+\u0010y\u001a\u00020U2\u0006\u0010s\u001a\u00020U8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b|\u0010x\u001a\u0004\bz\u0010W\"\u0004\b{\u0010YR\u0014\u0010}\u001a\u00020 X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0018\u0010\u0080\u0001\u001a\u0004\u0018\u0001028BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010>R&\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0083\u00018\u0000X\u0081\u0004\u00a2\u0006\u0010\n\u0000\u0012\u0005\b\u0084\u0001\u0010.\u001a\u0005\b\u0085\u0001\u0010SR1\u0010\u0087\u0001\u001a\u00020U2\u0007\u0010\u0086\u0001\u001a\u00020U8\u0000@BX\u0081\u000e\u00a2\u0006\u0017\n\u0000\u0012\u0005\b\u0088\u0001\u0010.\u001a\u0005\b\u0089\u0001\u0010W\"\u0005\b\u008a\u0001\u0010YR/\u0010\u008b\u0001\u001a\u00020U2\u0006\u0010s\u001a\u00020U8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u008e\u0001\u0010x\u001a\u0005\b\u008c\u0001\u0010W\"\u0005\b\u008d\u0001\u0010YR\u0010\u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00e6\u0001"}, d2 = {"Lcom/stripe/android/view/CardInputWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "allFields", "", "Lcom/stripe/android/view/StripeEditText;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_debug", "()Lcom/stripe/android/view/CardBrandView;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText$payments_core_debug", "()Lcom/stripe/android/view/CardNumberEditText;", "cardNumberTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "Lcom/stripe/android/view/StripeTextWatcher;", "containerLayout", "Landroid/widget/FrameLayout;", "currentFields", "", "getCurrentFields$payments_core_debug$annotations", "()V", "getCurrentFields$payments_core_debug", "()Ljava/util/List;", "customCvcLabel", "", "cvc", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc", "()Lcom/stripe/android/cards/Cvc$Validated;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText$payments_core_debug", "()Lcom/stripe/android/view/CvcEditText;", "cvcNumberTextInputLayout", "cvcPlaceHolder", "getCvcPlaceHolder", "()Ljava/lang/String;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText$payments_core_debug", "()Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateTextInputLayout", "frameStart", "getFrameStart", "()I", "frameWidth", "getFrameWidth", "frameWidthSupplier", "Lkotlin/Function0;", "getFrameWidthSupplier$payments_core_debug", "()Lkotlin/jvm/functions/Function0;", "setFrameWidthSupplier$payments_core_debug", "(Lkotlin/jvm/functions/Function0;)V", "hiddenCardText", "invalidFields", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields", "()Ljava/util/Set;", "isShowingFullCard", "", "isShowingFullCard$payments_core_debug", "()Z", "setShowingFullCard$payments_core_debug", "(Z)V", "isViewInitialized", "layoutWidthCalculator", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "getLayoutWidthCalculator$payments_core_debug", "()Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "setLayoutWidthCalculator$payments_core_debug", "(Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;)V", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "peekCardText", "getPeekCardText", "placement", "Lcom/stripe/android/view/CardInputWidgetPlacement;", "getPlacement$payments_core_debug", "()Lcom/stripe/android/view/CardInputWidgetPlacement;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_debug", "()Lcom/stripe/android/view/PostalCodeEditText;", "<set-?>", "postalCodeEnabled", "getPostalCodeEnabled", "setPostalCodeEnabled", "postalCodeEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "postalCodeRequired", "getPostalCodeRequired", "setPostalCodeRequired", "postalCodeRequired$delegate", "postalCodeTextInputLayout", "getPostalCodeTextInputLayout$payments_core_debug", "()Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeValue", "getPostalCodeValue", "requiredFields", "", "getRequiredFields$payments_core_debug$annotations", "getRequiredFields$payments_core_debug", "value", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_debug$annotations", "getShouldShowErrorIcon$payments_core_debug", "setShouldShowErrorIcon", "usZipCodeRequired", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired$delegate", "viewBinding", "Lcom/stripe/android/databinding/CardInputWidgetBinding;", "applyCardElementAttributes", "", "clear", "createHiddenCardText", "panLength", "createHiddenCardText$payments_core_debug", "getDesiredWidthInPixels", "text", "editText", "getFocusField", "Lcom/stripe/android/view/CardInputWidget$Field;", "touchX", "initView", "isEnabled", "isPostalRequired", "onFinishInflate", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onLayout", "changed", "l", "t", "r", "b", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "scrollEnd", "scrollStart", "setCardHint", "cardHint", "setCardInputListener", "listener", "setCardNumber", "cardNumber", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setCardValidCallback", "callback", "setCvcCode", "cvcCode", "setCvcLabel", "cvcLabel", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setEnabled", "setExpiryDate", "month", "year", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setPostalCode", "postalCode", "setPostalCode$payments_core_debug", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "startSlideAnimation", "animations", "Landroid/view/animation/Animation;", "updateCvc", "updateFieldLayout", "view", "Landroid/view/View;", "newWidth", "newMarginStart", "updatePostalRequired", "updateSpaceSizes", "updateSpaceSizes$payments_core_debug", "AnimationEndListener", "CardFieldAnimation", "CardNumberSlideEndAnimation", "CardNumberSlideStartAnimation", "Companion", "CvcSlideEndAnimation", "CvcSlideStartAnimation", "DefaultLayoutWidthCalculator", "ExpiryDateSlideEndAnimation", "ExpiryDateSlideStartAnimation", "Field", "LayoutWidthCalculator", "PostalCodeSlideEndAnimation", "PostalCodeSlideStartAnimation", "payments-core_debug"})
public final class CardInputWidget extends android.widget.LinearLayout implements com.stripe.android.view.CardWidget {
    private java.lang.String customCvcLabel;
    private final com.stripe.android.databinding.CardInputWidgetBinding viewBinding = null;
    private final android.widget.FrameLayout containerLayout = null;
    private final com.google.android.material.textfield.TextInputLayout cardNumberTextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout expiryDateTextInputLayout = null;
    private final com.google.android.material.textfield.TextInputLayout cvcNumberTextInputLayout = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputLayout postalCodeTextInputLayout = null;
    private com.stripe.android.view.CardInputListener cardInputListener;
    private com.stripe.android.view.CardValidCallback cardValidCallback;
    private final com.stripe.android.view.StripeTextWatcher cardValidTextWatcher = null;
    private boolean shouldShowErrorIcon = false;
    private boolean isViewInitialized = false;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.CardInputWidgetPlacement placement = null;
    private final java.util.Set<com.stripe.android.view.StripeEditText> allFields = null;
    
    /**
     * The postal code field is enabled by default. Disabling the postal code field may impact
     * auth success rates, so it is discouraged to disable it unless you are collecting the postal
     * code outside of this form.  If the postal code is disabled it will not be shown in the view.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty postalCodeEnabled$delegate = null;
    
    /**
     * If [postalCodeEnabled] is true and [postalCodeRequired] is true, then postal code is a
     * required field.
     *
     * If [postalCodeEnabled] is false, this value is ignored.
     *
     * Note that some countries do not have postal codes, so requiring postal code will prevent
     * those users from submitting this form successfully.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty postalCodeRequired$delegate = null;
    
    /**
     * If [postalCodeEnabled] is true and [usZipCodeRequired] is true, then postal code is a
     * required field and must be a 5-digit US zip code.
     *
     * If [postalCodeEnabled] is false, this value is ignored.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty usZipCodeRequired$delegate = null;
    private java.lang.String hiddenCardText;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.CardInputWidget.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGGING_TOKEN = "CardInputView";
    private static final java.lang.String CVC_PLACEHOLDER_COMMON = "CVC";
    private static final java.lang.String CVC_PLACEHOLDER_AMEX = "2345";
    private static final java.lang.String FULL_SIZING_CARD_TEXT = "4242 4242 4242 4242 424";
    private static final java.lang.String FULL_SIZING_DATE_TEXT = "MM/MM";
    private static final java.lang.String FULL_SIZING_POSTAL_CODE_TEXT = "1234567890";
    private static final java.lang.String STATE_CARD_VIEWED = "state_card_viewed";
    private static final java.lang.String STATE_SUPER_STATE = "state_super_state";
    private static final java.lang.String STATE_POSTAL_CODE_ENABLED = "state_postal_code_enabled";
    @androidx.annotation.IdRes()
    private static final int DEFAULT_READER_ID = 0;
    
    @kotlin.jvm.JvmOverloads()
    public CardInputWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardInputWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardInputWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardBrandView getCardBrandView$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPostalCodeTextInputLayout$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardNumberEditText getCardNumberEditText$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.ExpiryDateEditText getExpiryDateEditText$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CvcEditText getCvcEditText$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.PostalCodeEditText getPostalCodeEditText$payments_core_debug() {
        return null;
    }
    
    private final java.util.Set<com.stripe.android.view.CardValidCallback.Fields> getInvalidFields() {
        return null;
    }
    
    public final boolean getShouldShowErrorIcon$payments_core_debug() {
        return false;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getShouldShowErrorIcon$payments_core_debug$annotations() {
    }
    
    private final void setShouldShowErrorIcon(boolean value) {
    }
    
    public final boolean isShowingFullCard$payments_core_debug() {
        return false;
    }
    
    public final void setShowingFullCard$payments_core_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardInputWidget.LayoutWidthCalculator getLayoutWidthCalculator$payments_core_debug() {
        return null;
    }
    
    public final void setLayoutWidthCalculator$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.CardInputWidget.LayoutWidthCalculator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardInputWidgetPlacement getPlacement$payments_core_debug() {
        return null;
    }
    
    private final java.lang.String getPostalCodeValue() {
        return null;
    }
    
    private final com.stripe.android.cards.Cvc.Validated getCvc() {
        return null;
    }
    
    private final com.stripe.android.model.CardBrand getBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.stripe.android.view.StripeEditText> getRequiredFields$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getRequiredFields$payments_core_debug$annotations() {
    }
    
    /**
     * The [StripeEditText] fields that are currently enabled and active in the UI.
     */
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCurrentFields$payments_core_debug$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams.Card getPaymentMethodCard() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethod.BillingDetails getBillingDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.CardParams getCardParams() {
        return null;
    }
    
    private final int getFrameWidth() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<java.lang.Integer> getFrameWidthSupplier$payments_core_debug() {
        return null;
    }
    
    public final void setFrameWidthSupplier$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Integer> p0) {
    }
    
    /**
     * The postal code field is enabled by default. Disabling the postal code field may impact
     * auth success rates, so it is discouraged to disable it unless you are collecting the postal
     * code outside of this form.  If the postal code is disabled it will not be shown in the view.
     */
    public final boolean getPostalCodeEnabled() {
        return false;
    }
    
    /**
     * The postal code field is enabled by default. Disabling the postal code field may impact
     * auth success rates, so it is discouraged to disable it unless you are collecting the postal
     * code outside of this form.  If the postal code is disabled it will not be shown in the view.
     */
    public final void setPostalCodeEnabled(boolean p0) {
    }
    
    /**
     * If [postalCodeEnabled] is true and [postalCodeRequired] is true, then postal code is a
     * required field.
     *
     * If [postalCodeEnabled] is false, this value is ignored.
     *
     * Note that some countries do not have postal codes, so requiring postal code will prevent
     * those users from submitting this form successfully.
     */
    public final boolean getPostalCodeRequired() {
        return false;
    }
    
    /**
     * If [postalCodeEnabled] is true and [postalCodeRequired] is true, then postal code is a
     * required field.
     *
     * If [postalCodeEnabled] is false, this value is ignored.
     *
     * Note that some countries do not have postal codes, so requiring postal code will prevent
     * those users from submitting this form successfully.
     */
    public final void setPostalCodeRequired(boolean p0) {
    }
    
    /**
     * If [postalCodeEnabled] is true and [usZipCodeRequired] is true, then postal code is a
     * required field and must be a 5-digit US zip code.
     *
     * If [postalCodeEnabled] is false, this value is ignored.
     */
    public final boolean getUsZipCodeRequired() {
        return false;
    }
    
    /**
     * If [postalCodeEnabled] is true and [usZipCodeRequired] is true, then postal code is a
     * required field and must be a 5-digit US zip code.
     *
     * If [postalCodeEnabled] is false, this value is ignored.
     */
    public final void setUsZipCodeRequired(boolean p0) {
    }
    
    private final void updatePostalRequired() {
    }
    
    private final boolean isPostalRequired() {
        return false;
    }
    
    private final int getFrameStart() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    @java.lang.Override()
    public void setCardValidCallback(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardValidCallback callback) {
    }
    
    /**
     * Set a [CardInputListener] to be notified of card input events.
     *
     * @param listener the listener
     */
    @java.lang.Override()
    public void setCardInputListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardInputListener listener) {
    }
    
    /**
     * Set the card number. Method does not change text field focus.
     *
     * @param cardNumber card number to be set
     */
    @java.lang.Override()
    public void setCardNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String cardNumber) {
    }
    
    @java.lang.Override()
    public void setCardHint(@org.jetbrains.annotations.NotNull()
    java.lang.String cardHint) {
    }
    
    /**
     * Set the expiration date. Method invokes completion listener and changes focus
     * to the CVC field if a valid date is entered.
     *
     * Note that while a four-digit and two-digit year will both work, information
     * beyond the tens digit of a year will be truncated. Logic elsewhere in the SDK
     * makes assumptions about what century is implied by various two-digit years, and
     * will override any information provided here.
     *
     * @param month a month of the year, represented as a number between 1 and 12
     * @param year a year number, either in two-digit form or four-digit form
     */
    @java.lang.Override()
    public void setExpiryDate(@androidx.annotation.IntRange(from = 1L, to = 12L)
    int month, @androidx.annotation.IntRange(from = 0L, to = 9999L)
    int year) {
    }
    
    /**
     * Set the CVC value for the card. Note that the maximum length is assumed to
     * be 3, unless the brand of the card has already been set (by setting the card number).
     *
     * @param cvcCode the CVC value to be set
     */
    @java.lang.Override()
    public void setCvcCode(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcCode) {
    }
    
    /**
     * Clear all text fields in the CardInputWidget.
     */
    @java.lang.Override()
    public void clear() {
    }
    
    /**
     * Enable or disable text fields
     *
     * @param isEnabled boolean indicating whether fields should be enabled
     */
    @java.lang.Override()
    public void setEnabled(boolean isEnabled) {
    }
    
    /**
     * Set a `TextWatcher` to receive card number changes.
     */
    @java.lang.Override()
    public void setCardNumberTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher cardNumberTextWatcher) {
    }
    
    /**
     * Set a `TextWatcher` to receive expiration date changes.
     */
    @java.lang.Override()
    public void setExpiryDateTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher expiryDateTextWatcher) {
    }
    
    /**
     * Set a `TextWatcher` to receive CVC value changes.
     */
    @java.lang.Override()
    public void setCvcNumberTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher cvcNumberTextWatcher) {
    }
    
    /**
     * Set a `TextWatcher` to receive postal code changes.
     */
    @java.lang.Override()
    public void setPostalCodeTextWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher postalCodeTextWatcher) {
    }
    
    /**
     * Override of [View.isEnabled] that returns `true` only
     * if all three sub-controls are enabled.
     *
     * @return `true` if the card number field, expiry field, cvc field, and postal (if required)
     * are enabled, `false` otherwise
     */
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable state) {
    }
    
    private final com.stripe.android.view.CardInputWidget.Field getFocusField(int touchX, int frameStart) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void updateSpaceSizes$payments_core_debug(boolean isShowingFullCard, int frameWidth, int frameStart) {
    }
    
    private final void updateFieldLayout(android.view.View view, int newWidth, int newMarginStart) {
    }
    
    private final int getDesiredWidthInPixels(java.lang.String text, com.stripe.android.view.StripeEditText editText) {
        return 0;
    }
    
    private final void initView(android.util.AttributeSet attrs) {
    }
    
    /**
     * Set an optional CVC field label to override defaults, or `null` to use defaults.
     */
    public final void setCvcLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcLabel) {
    }
    
    private final void updateCvc() {
    }
    
    /**
     * @return a [String] that is the length of a full formatted PAN for the given PAN length,
     * without the last group of digits. This is used for measuring the rendered width of the
     * hidden portion (i.e. when the card number is "peeking") and does not have to be a valid
     * card number.
     *
     * e.g. if [panLength] is `16`, this will generate `"0000 0000 0000 "` (including the
     * trailing space).
     *
     * This should only be called when [brand] changes.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.String createHiddenCardText$payments_core_debug(int panLength) {
        return null;
    }
    
    private final void applyCardElementAttributes(android.util.AttributeSet attrs) {
    }
    
    private final void scrollStart() {
    }
    
    private final void scrollEnd() {
    }
    
    private final void startSlideAnimation(java.util.List<? extends android.view.animation.Animation> animations) {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
    
    private final java.lang.String getCvcPlaceHolder() {
        return null;
    }
    
    private final java.lang.String getPeekCardText() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "Landroid/view/animation/Animation;", "()V", "Companion", "payments-core_debug"})
    static abstract class CardFieldAnimation extends android.view.animation.Animation {
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.view.CardInputWidget.CardFieldAnimation.Companion Companion = null;
        @java.lang.Deprecated()
        private static final long ANIMATION_LENGTH = 150L;
        
        public CardFieldAnimation() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;", "", "()V", "ANIMATION_LENGTH", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class CardNumberSlideStartAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        
        public CardNumberSlideStartAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class ExpiryDateSlideStartAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int startPosition = 0;
        private final int destination = 0;
        
        public ExpiryDateSlideStartAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int startPosition, int destination) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class CvcSlideStartAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int startPosition = 0;
        private final int destination = 0;
        private final int newWidth = 0;
        
        public CvcSlideStartAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int startPosition, int destination, int newWidth) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideStartAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startPosition", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class PostalCodeSlideStartAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int startPosition = 0;
        private final int destination = 0;
        private final int newWidth = 0;
        
        public PostalCodeSlideStartAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int startPosition, int destination, int newWidth) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.Nullable()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CardNumberSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "hiddenCardWidth", "", "focusOnEndView", "(Landroid/view/View;ILandroid/view/View;)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class CardNumberSlideEndAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int hiddenCardWidth = 0;
        private final android.view.View focusOnEndView = null;
        
        public CardNumberSlideEndAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int hiddenCardWidth, @org.jetbrains.annotations.NotNull()
        android.view.View focusOnEndView) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$ExpiryDateSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "(Landroid/view/View;II)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class ExpiryDateSlideEndAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int startMargin = 0;
        private final int destination = 0;
        
        public ExpiryDateSlideEndAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int startMargin, int destination) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$CvcSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class CvcSlideEndAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int startMargin = 0;
        private final int destination = 0;
        private final int newWidth = 0;
        
        public CvcSlideEndAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int startMargin, int destination, int newWidth) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$PostalCodeSlideEndAnimation;", "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;", "view", "Landroid/view/View;", "startMargin", "", "destination", "newWidth", "(Landroid/view/View;III)V", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "payments-core_debug"})
    static final class PostalCodeSlideEndAnimation extends com.stripe.android.view.CardInputWidget.CardFieldAnimation {
        private final android.view.View view = null;
        private final int startMargin = 0;
        private final int destination = 0;
        private final int newWidth = 0;
        
        public PostalCodeSlideEndAnimation(@org.jetbrains.annotations.NotNull()
        android.view.View view, int startMargin, int destination, int newWidth) {
            super();
        }
        
        @java.lang.Override()
        protected void applyTransformation(float interpolatedTime, @org.jetbrains.annotations.NotNull()
        android.view.animation.Transformation t) {
        }
    }
    
    /**
     * A convenience class for when we only want to listen for when an animation ends.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\"\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$AnimationEndListener;", "Landroid/view/animation/Animation$AnimationListener;", "()V", "onAnimationRepeat", "", "animation", "Landroid/view/animation/Animation;", "onAnimationStart", "payments-core_debug"})
    static abstract class AnimationEndListener implements android.view.animation.Animation.AnimationListener {
        
        public AnimationEndListener() {
            super();
        }
        
        @java.lang.Override()
        public void onAnimationStart(@org.jetbrains.annotations.NotNull()
        android.view.animation.Animation animation) {
        }
        
        @java.lang.Override()
        public void onAnimationRepeat(@org.jetbrains.annotations.NotNull()
        android.view.animation.Animation animation) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e0\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "", "calculate", "", "text", "", "paint", "Landroid/text/TextPaint;", "payments-core_debug"})
    public static abstract interface LayoutWidthCalculator {
        
        public abstract int calculate(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        android.text.TextPaint paint);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$DefaultLayoutWidthCalculator;", "Lcom/stripe/android/view/CardInputWidget$LayoutWidthCalculator;", "()V", "calculate", "", "text", "", "paint", "Landroid/text/TextPaint;", "payments-core_debug"})
    public static final class DefaultLayoutWidthCalculator implements com.stripe.android.view.CardInputWidget.LayoutWidthCalculator {
        
        public DefaultLayoutWidthCalculator() {
            super();
        }
        
        @java.lang.Override()
        public int calculate(@org.jetbrains.annotations.NotNull()
        java.lang.String text, @org.jetbrains.annotations.NotNull()
        android.text.TextPaint paint) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$Field;", "", "(Ljava/lang/String;I)V", "Number", "Expiry", "Cvc", "PostalCode", "payments-core_debug"})
    public static enum Field {
        /*public static final*/ Number /* = new Number() */,
        /*public static final*/ Expiry /* = new Expiry() */,
        /*public static final*/ Cvc /* = new Cvc() */,
        /*public static final*/ PostalCode /* = new PostalCode() */;
        
        Field() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001\u00a2\u0006\u0002\b\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/CardInputWidget$Companion;", "", "()V", "CVC_PLACEHOLDER_AMEX", "", "CVC_PLACEHOLDER_COMMON", "DEFAULT_READER_ID", "", "FULL_SIZING_CARD_TEXT", "FULL_SIZING_DATE_TEXT", "FULL_SIZING_POSTAL_CODE_TEXT", "LOGGING_TOKEN", "STATE_CARD_VIEWED", "STATE_POSTAL_CODE_ENABLED", "STATE_SUPER_STATE", "shouldIconShowBrand", "", "brand", "Lcom/stripe/android/model/CardBrand;", "cvcHasFocus", "cvcText", "shouldIconShowBrand$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Determines whether or not the icon should show the card brand instead of the
         * CVC helper icon.
         *
         * @param brand the [CardBrand] of the card number
         * @param cvcHasFocus `true` if the CVC entry field has focus, `false` otherwise
         * @param cvcText the current content of [cvcEditText]
         *
         * @return `true` if we should show the brand of the card, or `false` if we
         * should show the CVC helper icon instead
         */
        @androidx.annotation.VisibleForTesting()
        public final boolean shouldIconShowBrand$payments_core_debug(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardBrand brand, boolean cvcHasFocus, @org.jetbrains.annotations.Nullable()
        java.lang.String cvcText) {
            return false;
        }
    }
}
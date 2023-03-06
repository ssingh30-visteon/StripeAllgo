package com.stripe.android.view;

import java.lang.System;

/**
 * A multiline card input widget that uses Material Components for Android.
 *
 * To enable 19-digit card support, [PaymentConfiguration.init] must be called before
 * [CardMultilineWidget] is instantiated.
 *
 * The card number, cvc, and expiry date will always be left to right regardless of locale.  Postal
 * code layout direction will be set according to the locale.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00f8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 \u00d1\u00012\u00020\u00012\u00020\u0002:\u0006\u00cf\u0001\u00d0\u0001\u00d1\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010\t\u001a\u00020\nH\u0002J\u0014\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u0099\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u009a\u0001\u001a\u00030\u0097\u0001H\u0002J\t\u0010\u009b\u0001\u001a\u00020\u0012H\u0007J\n\u0010\u009c\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010\u009d\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010\u009e\u0001\u001a\u00030\u0097\u0001H\u0002J\b\u0010`\u001a\u00020\nH\u0016J\n\u0010\u009f\u0001\u001a\u00030\u0097\u0001H\u0014J\u0013\u0010\u00a0\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a1\u0001\u001a\u00020\nH\u0016J\u0015\u0010\u00a2\u0001\u001a\u00030\u0097\u00012\t\u0010\u00a3\u0001\u001a\u0004\u0018\u00010jH\u0007J\u0013\u0010\u00a4\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a5\u0001\u001a\u000209H\u0016J\u0015\u0010\u00a6\u0001\u001a\u00030\u0097\u00012\t\u0010\u00a7\u0001\u001a\u0004\u0018\u00010 H\u0016J\u0015\u0010\u00a8\u0001\u001a\u00030\u0097\u00012\t\u0010\u00a9\u0001\u001a\u0004\u0018\u000109H\u0016J\u0013\u0010\u00aa\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a7\u0001\u001a\u00020%H\u0007J\u0016\u0010\u00ab\u0001\u001a\u00030\u0097\u00012\n\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0016J\u0015\u0010\u00ae\u0001\u001a\u00030\u0097\u00012\t\u0010\u00af\u0001\u001a\u0004\u0018\u000105H\u0016J\u0015\u0010\u00b0\u0001\u001a\u00030\u0097\u00012\t\u0010\u00b1\u0001\u001a\u0004\u0018\u000109H\u0016J\u0013\u0010\u00b2\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a7\u0001\u001a\u00020%H\u0007J\u001a\u0010\u00b3\u0001\u001a\u00030\u0097\u00012\t\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010SJ\u0013\u0010\u00b5\u0001\u001a\u00030\u0097\u00012\t\u0010\u00b6\u0001\u001a\u0004\u0018\u000109J\u0016\u0010\u00b7\u0001\u001a\u00030\u0097\u00012\n\u0010\u00b8\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0016J\u0015\u0010\u00b9\u0001\u001a\u00030\u0097\u00012\t\u0010\u00ba\u0001\u001a\u0004\u0018\u000109H\u0007J\u0013\u0010\u00bb\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00bc\u0001\u001a\u00020\nH\u0016J\u0013\u0010\u00bd\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00a7\u0001\u001a\u00020%H\u0007J\u001c\u0010\u00be\u0001\u001a\u00030\u0097\u00012\u000b\b\u0001\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010SJ \u0010\u00bf\u0001\u001a\u00030\u0097\u00012\t\b\u0001\u0010\u00c0\u0001\u001a\u00020\b2\t\b\u0001\u0010\u00c1\u0001\u001a\u00020\bH\u0016J\u0016\u0010\u00c2\u0001\u001a\u00030\u0097\u00012\n\u0010\u00c3\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0016J\u0015\u0010\u00c4\u0001\u001a\u00030\u0097\u00012\t\u0010\u00a7\u0001\u001a\u0004\u0018\u00010%H\u0007J\u0016\u0010\u00c5\u0001\u001a\u00030\u0097\u00012\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0016J\u0010\u0010\u00c7\u0001\u001a\u00030\u0097\u00012\u0006\u0010\t\u001a\u00020\nJ\n\u0010\u00c8\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010\u00c9\u0001\u001a\u00030\u0097\u0001H\u0002J\u001e\u0010\u00ca\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u00cb\u0001\u001a\u00020\u000e2\t\b\u0001\u0010\u00cc\u0001\u001a\u00020\bH\u0002J\u0007\u0010\u00cd\u0001\u001a\u00020\nJ\u0007\u0010\u00ce\u0001\u001a\u00020\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010!\u001a\u00020\"8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R+\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020-8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010;\u001a\u00020<8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R+\u0010?\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\bB\u0010\u001e\u001a\u0004\b@\u0010(\"\u0004\bA\u0010*R\u0016\u0010C\u001a\u00020D8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010G\u001a\u0004\u0018\u00010H8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bI\u0010JR+\u0010K\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\bN\u0010\u001e\u001a\u0004\bL\u0010(\"\u0004\bM\u0010*R/\u0010O\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\bT\u0010\u001e\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020V8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020D8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010FR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b^\u0010_R\u000e\u0010`\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010a\u001a\u0004\u0018\u00010b8F\u00a2\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010e\u001a\u0004\u0018\u00010f8F\u00a2\u0006\u0006\u001a\u0004\bg\u0010hR\u0016\u0010i\u001a\u0004\u0018\u00010j8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010m\u001a\u0004\u0018\u00010n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bo\u0010pR\u0016\u0010q\u001a\u00020r8\u0000X\u0081\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010tR/\u0010u\u001a\u0004\u0018\u00010%2\b\u0010\u0016\u001a\u0004\u0018\u00010%8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\bx\u0010\u001e\u001a\u0004\bv\u0010(\"\u0004\bw\u0010*R\u001a\u0010y\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020DX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010FR\u0019\u0010\u0080\u0001\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R2\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\n8\u0000@@X\u0081\u000e\u00a2\u0006\u0018\n\u0000\u0012\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010{\"\u0005\b\u0088\u0001\u0010}R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020D0\u008b\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u008c\u0001\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u008f\u0001\u0010\u001e\u001a\u0005\b\u008d\u0001\u0010{\"\u0005\b\u008e\u0001\u0010}R\u001a\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0091\u00018@X\u0080\u0004\u00a2\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0010\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00d2\u0001"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardWidget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "shouldShowPostalCode", "", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "allFields", "", "Lcom/stripe/android/view/StripeEditText;", "getAllFields", "()Ljava/util/Collection;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand$payments_core_debug", "()Lcom/stripe/android/model/CardBrand;", "cardBrand", "<set-?>", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "cardBrandIconSupplier", "getCardBrandIconSupplier$payments_core_debug", "()Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "setCardBrandIconSupplier$payments_core_debug", "(Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;)V", "cardBrandIconSupplier$delegate", "Lkotlin/properties/ReadWriteProperty;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText", "()Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_debug", "()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "setCardNumberErrorListener$payments_core_debug", "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V", "cardNumberErrorListener$delegate", "cardNumberTextInputLayout", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "getCardNumberTextInputLayout", "()Lcom/stripe/android/view/CardNumberTextInputLayout;", "cardParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "cardValidTextWatcher", "Lcom/stripe/android/view/StripeTextWatcher;", "customCvcLabel", "", "customCvcPlaceholderText", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText", "()Lcom/stripe/android/view/CvcEditText;", "cvcErrorListener", "getCvcErrorListener$payments_core_debug", "setCvcErrorListener$payments_core_debug", "cvcErrorListener$delegate", "cvcInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getCvcInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "expirationDate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getExpirationDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_debug", "setExpirationDateErrorListener$payments_core_debug", "expirationDateErrorListener$delegate", "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_debug", "()Ljava/lang/Integer;", "setExpirationDatePlaceholderRes$payments_core_debug", "(Ljava/lang/Integer;)V", "expirationDatePlaceholderRes$delegate", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText", "()Lcom/stripe/android/view/ExpiryDateEditText;", "expiryTextInputLayout", "getExpiryTextInputLayout", "invalidFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields$payments_core_debug", "()Ljava/util/Set;", "isEnabled", "paymentMethodBillingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getPaymentMethodBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentMethodBillingDetailsBuilder", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "getPaymentMethodBillingDetailsBuilder", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_debug", "()Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_debug", "setPostalCodeErrorListener$payments_core_debug", "postalCodeErrorListener$delegate", "postalCodeRequired", "getPostalCodeRequired", "()Z", "setPostalCodeRequired", "(Z)V", "postalInputLayout", "getPostalInputLayout$payments_core_debug", "secondRowLayout", "getSecondRowLayout", "()Landroid/widget/LinearLayout;", "value", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_debug$annotations", "()V", "getShouldShowErrorIcon$payments_core_debug", "setShouldShowErrorIcon$payments_core_debug", "showCvcIconInCvcField", "textInputLayouts", "", "usZipCodeRequired", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired$delegate", "validatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_debug", "()Lcom/stripe/android/cards/CardNumber$Validated;", "viewBinding", "Lcom/stripe/android/databinding/CardMultilineWidgetBinding;", "adjustViewForPostalCodeAttribute", "", "checkAttributeSet", "clear", "flipToCvcIconIfNotFinished", "getBrand", "initDeleteEmptyListeners", "initFocusChangeListeners", "initTextInputLayoutErrorHandlers", "onAttachedToWindow", "onWindowFocusChanged", "hasWindowFocus", "populate", "card", "setCardHint", "cardHint", "setCardInputListener", "listener", "setCardNumber", "cardNumber", "setCardNumberErrorListener", "setCardNumberTextWatcher", "cardNumberTextWatcher", "Landroid/text/TextWatcher;", "setCardValidCallback", "callback", "setCvcCode", "cvcCode", "setCvcErrorListener", "setCvcIcon", "resId", "setCvcLabel", "cvcLabel", "setCvcNumberTextWatcher", "cvcNumberTextWatcher", "setCvcPlaceholderText", "cvcPlaceholderText", "setEnabled", "enabled", "setExpirationDateErrorListener", "setExpirationDatePlaceholderRes", "setExpiryDate", "month", "year", "setExpiryDateTextWatcher", "expiryDateTextWatcher", "setPostalCodeErrorListener", "setPostalCodeTextWatcher", "postalCodeTextWatcher", "setShouldShowPostalCode", "updateBrandUi", "updateCvc", "updateEndIcon", "editText", "iconResourceId", "validateAllFields", "validateCardNumber", "CardBrandIcon", "CardBrandIconSupplier", "Companion", "payments-core_debug"})
public final class CardMultilineWidget extends android.widget.LinearLayout implements com.stripe.android.view.CardWidget {
    private boolean shouldShowPostalCode;
    private final com.stripe.android.databinding.CardMultilineWidgetBinding viewBinding = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.stripe.android.view.CardNumberEditText cardNumberEditText = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.stripe.android.view.ExpiryDateEditText expiryDateEditText = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.stripe.android.view.CvcEditText cvcEditText = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.stripe.android.view.PostalCodeEditText postalCodeEditText = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final android.widget.LinearLayout secondRowLayout = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.stripe.android.view.CardNumberTextInputLayout cardNumberTextInputLayout = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.google.android.material.textfield.TextInputLayout expiryTextInputLayout = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final com.google.android.material.textfield.TextInputLayout cvcInputLayout = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.textfield.TextInputLayout postalInputLayout = null;
    private final java.util.List<com.google.android.material.textfield.TextInputLayout> textInputLayouts = null;
    private com.stripe.android.view.CardInputListener cardInputListener;
    private com.stripe.android.view.CardValidCallback cardValidCallback;
    private final com.stripe.android.view.StripeTextWatcher cardValidTextWatcher = null;
    private boolean isEnabled = false;
    private java.lang.String customCvcLabel;
    private java.lang.String customCvcPlaceholderText;
    private com.stripe.android.model.CardBrand cardBrand = com.stripe.android.model.CardBrand.Unknown;
    
    /**
     * If [shouldShowPostalCode] is true and [postalCodeRequired] is true, then postal code is a
     * required field.
     *
     * If [shouldShowPostalCode] is false, this value is ignored.
     *
     * Note that some countries do not have postal codes, so requiring postal code will prevent
     * those users from submitting this form successfully.
     */
    private boolean postalCodeRequired = false;
    
    /**
     * If [shouldShowPostalCode] is true and [usZipCodeRequired] is true, then postal code is a
     * required field and must be a 5-digit US zip code.
     *
     * If [shouldShowPostalCode] is false, this value is ignored.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty usZipCodeRequired$delegate = null;
    private boolean shouldShowErrorIcon = false;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty expirationDatePlaceholderRes$delegate = null;
    private boolean showCvcIconInCvcField = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty cardBrandIconSupplier$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty cardNumberErrorListener$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty expirationDateErrorListener$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty cvcErrorListener$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty postalCodeErrorListener$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.CardMultilineWidget.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String CARD_MULTILINE_TOKEN = "CardMultilineView";
    @java.lang.Deprecated()
    private static final com.stripe.android.view.CardMultilineWidget.CardBrandIconSupplier DEFAULT_CARD_BRAND_ICON_SUPPLIER = null;
    
    @kotlin.jvm.JvmOverloads()
    public CardMultilineWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardMultilineWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardMultilineWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardMultilineWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, boolean shouldShowPostalCode) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardNumberEditText getCardNumberEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.ExpiryDateEditText getExpiryDateEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CvcEditText getCvcEditText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.PostalCodeEditText getPostalCodeEditText$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getSecondRowLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getExpiryTextInputLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getCvcInputLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.textfield.TextInputLayout getPostalInputLayout$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.stripe.android.view.CardValidCallback.Fields> getInvalidFields$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final com.stripe.android.model.CardBrand getBrand() {
        return null;
    }
    
    public final boolean getPostalCodeRequired() {
        return false;
    }
    
    public final void setPostalCodeRequired(boolean p0) {
    }
    
    /**
     * If [shouldShowPostalCode] is true and [usZipCodeRequired] is true, then postal code is a
     * required field and must be a 5-digit US zip code.
     *
     * If [shouldShowPostalCode] is false, this value is ignored.
     */
    public final boolean getUsZipCodeRequired() {
        return false;
    }
    
    /**
     * If [shouldShowPostalCode] is true and [usZipCodeRequired] is true, then postal code is a
     * required field and must be a 5-digit US zip code.
     *
     * If [shouldShowPostalCode] is false, this value is ignored.
     */
    public final void setUsZipCodeRequired(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams.Card getPaymentMethodCard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.BillingDetails getPaymentMethodBillingDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod.BillingDetails.Builder getPaymentMethodBillingDetailsBuilder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.CardParams getCardParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.cards.CardNumber.Validated getValidatedCardNumber$payments_core_debug() {
        return null;
    }
    
    private final com.stripe.android.model.ExpirationDate.Validated getExpirationDate() {
        return null;
    }
    
    private final java.util.Collection<com.stripe.android.view.StripeEditText> getAllFields() {
        return null;
    }
    
    public final boolean getShouldShowErrorIcon$payments_core_debug() {
        return false;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getShouldShowErrorIcon$payments_core_debug$annotations() {
    }
    
    public final void setShouldShowErrorIcon$payments_core_debug(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExpirationDatePlaceholderRes$payments_core_debug() {
        return null;
    }
    
    public final void setExpirationDatePlaceholderRes$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDatePlaceholderRes(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer resId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardMultilineWidget.CardBrandIconSupplier getCardBrandIconSupplier$payments_core_debug() {
        return null;
    }
    
    public final void setCardBrandIconSupplier$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.CardMultilineWidget.CardBrandIconSupplier p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.StripeEditText.ErrorMessageListener getCardNumberErrorListener$payments_core_debug() {
        return null;
    }
    
    public final void setCardNumberErrorListener$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText.ErrorMessageListener p0) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCardNumberErrorListener(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText.ErrorMessageListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.StripeEditText.ErrorMessageListener getExpirationDateErrorListener$payments_core_debug() {
        return null;
    }
    
    public final void setExpirationDateErrorListener$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText.ErrorMessageListener p0) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setExpirationDateErrorListener(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText.ErrorMessageListener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.StripeEditText.ErrorMessageListener getCvcErrorListener$payments_core_debug() {
        return null;
    }
    
    public final void setCvcErrorListener$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText.ErrorMessageListener p0) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcErrorListener(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText.ErrorMessageListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.StripeEditText.ErrorMessageListener getPostalCodeErrorListener$payments_core_debug() {
        return null;
    }
    
    public final void setPostalCodeErrorListener$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.StripeEditText.ErrorMessageListener p0) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setPostalCodeErrorListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.StripeEditText.ErrorMessageListener listener) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    /**
     * Clear all entered data and hide all error messages.
     */
    @java.lang.Override()
    public void clear() {
    }
    
    /**
     * @param listener A [CardInputListener] to be notified of changes to the user's focused field
     */
    @java.lang.Override()
    public void setCardInputListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardInputListener listener) {
    }
    
    @java.lang.Override()
    public void setCardValidCallback(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.CardValidCallback callback) {
    }
    
    @java.lang.Override()
    public void setCardHint(@org.jetbrains.annotations.NotNull()
    java.lang.String cardHint) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void populate(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PaymentMethodCreateParams.Card card) {
    }
    
    /**
     * Validates all fields and shows error messages if appropriate.
     *
     * @return `true` if all shown fields are valid, `false` otherwise
     */
    public final boolean validateAllFields() {
        return false;
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasWindowFocus) {
    }
    
    /**
     * Set an optional CVC placeholder text to override defaults, or `null` to use defaults.
     */
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setCvcPlaceholderText(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcPlaceholderText) {
    }
    
    /**
     * Set an optional CVC field label to override defaults, or `null` to use defaults.
     */
    public final void setCvcLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcLabel) {
    }
    
    /**
     * The postal code field is enabled by default. Disabling the postal code field may impact
     * auth success rates, so it is discouraged to disable it unless you are collecting the postal
     * code outside of this form.
     */
    public final void setShouldShowPostalCode(boolean shouldShowPostalCode) {
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
    public void setExpiryDate(@androidx.annotation.IntRange(from = 1L, to = 12L)
    int month, @androidx.annotation.IntRange(from = 0L, to = 9999L)
    int year) {
    }
    
    @java.lang.Override()
    public void setCvcCode(@org.jetbrains.annotations.Nullable()
    java.lang.String cvcCode) {
    }
    
    /**
     * Checks whether the current card number is valid
     */
    public final boolean validateCardNumber() {
        return false;
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
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    private final void adjustViewForPostalCodeAttribute(boolean shouldShowPostalCode) {
    }
    
    private final void checkAttributeSet(android.util.AttributeSet attrs) {
    }
    
    private final void flipToCvcIconIfNotFinished() {
    }
    
    private final void initDeleteEmptyListeners() {
    }
    
    private final void initFocusChangeListeners() {
    }
    
    private final void initTextInputLayoutErrorHandlers() {
    }
    
    private final void updateBrandUi() {
    }
    
    private final void updateCvc() {
    }
    
    private final void updateEndIcon(com.stripe.android.view.StripeEditText editText, @androidx.annotation.DrawableRes()
    int iconResourceId) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e0\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "", "get", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "payments-core_debug"})
    public static abstract interface CardBrandIconSupplier {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.view.CardMultilineWidget.CardBrandIcon get(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.CardBrand cardBrand);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget$CardBrandIcon;", "", "iconResourceId", "", "(I)V", "getIconResourceId", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "payments-core_debug"})
    public static final class CardBrandIcon {
        private final int iconResourceId = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.CardMultilineWidget.CardBrandIcon copy(int iconResourceId) {
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
        
        public CardBrandIcon(int iconResourceId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getIconResourceId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/CardMultilineWidget$Companion;", "", "()V", "CARD_MULTILINE_TOKEN", "", "DEFAULT_CARD_BRAND_ICON_SUPPLIER", "Lcom/stripe/android/view/CardMultilineWidget$CardBrandIconSupplier;", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
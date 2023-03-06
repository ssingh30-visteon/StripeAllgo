package com.stripe.android.view;

import java.lang.System;

/**
 * A [StripeEditText] for CVC input.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010!J9\u0010\"\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0000\u00a2\u0006\u0002\b\'R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "completionCallback", "Lkotlin/Function0;", "", "getCompletionCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function0;)V", "cvc", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc$payments_core_debug", "()Lcom/stripe/android/cards/Cvc$Validated;", "unvalidatedCvc", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "getUnvalidatedCvc", "()Lcom/stripe/android/cards/Cvc$Unvalidated;", "createFilters", "", "Landroid/text/InputFilter;", "(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;", "updateBrand", "customHintText", "customPlaceholderText", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "updateBrand$payments_core_debug", "payments-core_debug"})
public final class CvcEditText extends com.stripe.android.view.StripeEditText {
    private com.stripe.android.model.CardBrand cardBrand = com.stripe.android.model.CardBrand.Unknown;
    
    @kotlin.jvm.JvmOverloads()
    public CvcEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CvcEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CvcEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final com.stripe.android.cards.Cvc.Unvalidated getUnvalidatedCvc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.cards.Cvc.Validated getCvc$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCompletionCallback$payments_core_debug() {
        return null;
    }
    
    public final void setCompletionCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getAccessibilityText() {
        return null;
    }
    
    private final android.text.InputFilter[] createFilters(com.stripe.android.model.CardBrand cardBrand) {
        return null;
    }
}
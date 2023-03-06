package com.stripe.android.view;

import java.lang.System;

/**
 * An [TextInputLayout] that can show a loading indicator.
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "", "isLoading", "isLoading$payments_core_debug", "()Z", "setLoading$payments_core_debug", "(Z)V", "isLoading$delegate", "Lkotlin/properties/ReadWriteProperty;", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "attachProgressView", "", "payments-core_debug"})
public final class CardNumberTextInputLayout extends com.google.android.material.textfield.TextInputLayout {
    private final com.stripe.android.view.CardWidgetProgressView progressView = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty isLoading$delegate = null;
    
    @kotlin.jvm.JvmOverloads()
    public CardNumberTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardNumberTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardNumberTextInputLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final boolean isLoading$payments_core_debug() {
        return false;
    }
    
    public final void setLoading$payments_core_debug(boolean p0) {
    }
    
    private final void attachProgressView() {
    }
}
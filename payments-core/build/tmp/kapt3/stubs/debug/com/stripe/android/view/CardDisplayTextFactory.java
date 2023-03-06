package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\b\u0016J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/CardDisplayTextFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resources", "Landroid/content/res/Resources;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V", "createStyled", "Landroid/text/SpannableString;", "brand", "Lcom/stripe/android/model/CardBrand;", "last4", "", "isSelected", "", "createStyled$payments_core_debug", "createUnstyled", "card", "Lcom/stripe/android/model/PaymentMethod$Card;", "createUnstyled$payments_core_debug", "setSpan", "", "displayString", "span", "Landroid/text/ParcelableSpan;", "start", "", "end", "payments-core_debug"})
public final class CardDisplayTextFactory {
    private final android.content.res.Resources resources = null;
    private final com.stripe.android.view.ThemeConfig themeConfig = null;
    
    public CardDisplayTextFactory(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.ThemeConfig themeConfig) {
        super();
    }
    
    public CardDisplayTextFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final void setSpan(android.text.SpannableString displayString, android.text.ParcelableSpan span, int start, int end) {
    }
}
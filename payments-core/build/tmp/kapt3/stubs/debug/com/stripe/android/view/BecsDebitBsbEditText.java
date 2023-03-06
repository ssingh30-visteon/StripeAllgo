package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0014H\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bank", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "getBank", "()Lcom/stripe/android/view/BecsDebitBanks$Bank;", "banks", "Lcom/stripe/android/view/BecsDebitBanks;", "bsb", "", "getBsb$payments_core_debug", "()Ljava/lang/String;", "isComplete", "", "()Z", "onBankChangedCallback", "Lkotlin/Function1;", "", "getOnBankChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnBankChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "onCompletedCallback", "Lkotlin/Function0;", "getOnCompletedCallback", "()Lkotlin/jvm/functions/Function0;", "setOnCompletedCallback", "(Lkotlin/jvm/functions/Function0;)V", "formatBsb", "updateIcon", "isError", "Companion", "payments-core_debug"})
public final class BecsDebitBsbEditText extends com.stripe.android.view.StripeEditText {
    private final com.stripe.android.view.BecsDebitBanks banks = null;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.stripe.android.view.BecsDebitBanks.Bank, kotlin.Unit> onBankChangedCallback;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onCompletedCallback;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.BecsDebitBsbEditText.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int MAX_LENGTH = 7;
    @java.lang.Deprecated()
    private static final int MIN_VALIDATION_THRESHOLD = 2;
    @java.lang.Deprecated()
    private static final java.lang.String SEPARATOR = "-";
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitBsbEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitBsbEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitBsbEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.view.BecsDebitBanks.Bank, kotlin.Unit> getOnBankChangedCallback() {
        return null;
    }
    
    public final void setOnBankChangedCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.view.BecsDebitBanks.Bank, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCompletedCallback() {
        return null;
    }
    
    public final void setOnCompletedCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBsb$payments_core_debug() {
        return null;
    }
    
    private final boolean isComplete() {
        return false;
    }
    
    private final com.stripe.android.view.BecsDebitBanks.Bank getBank() {
        return null;
    }
    
    private final void updateIcon(boolean isError) {
    }
    
    /**
     * Correctly formats a BSB.
     *
     * For example, `"032003"` will be formatted as `"032-003"`.
     */
    private final java.lang.String formatBsb(java.lang.String bsb) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText$Companion;", "", "()V", "MAX_LENGTH", "", "MIN_VALIDATION_THRESHOLD", "SEPARATOR", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
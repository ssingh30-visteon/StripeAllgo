package com.stripe.android.paymentsheet.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/GooglePayButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;", "getViewBinding$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/databinding/StripeGooglePayButtonBinding;", "onFinishProcessing", "", "onReadyState", "onStartProcessing", "setEnabled", "enabled", "", "updateAlpha", "updateState", "paymentsheet_debug"})
public final class GooglePayButton extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.databinding.StripeGooglePayButtonBinding viewBinding = null;
    private com.stripe.android.paymentsheet.ui.PrimaryButton.State state;
    
    @kotlin.jvm.JvmOverloads()
    public GooglePayButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public GooglePayButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public GooglePayButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.databinding.StripeGooglePayButtonBinding getViewBinding$paymentsheet_debug() {
        return null;
    }
    
    private final void onReadyState() {
    }
    
    private final void onStartProcessing() {
    }
    
    private final void onFinishProcessing() {
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    private final void updateAlpha() {
    }
    
    public final void updateState(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.ui.PrimaryButton.State state) {
    }
}
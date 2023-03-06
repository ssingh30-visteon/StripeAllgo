package com.stripe.android.paymentsheet.ui;

import java.lang.System;

/**
 * The primary call-to-action for a payment sheet screen.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001/B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0$H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\u0012\u0010\'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0012H\u0016J\u0010\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u0010J\b\u0010-\u001a\u00020\"H\u0002J\u0010\u0010.\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u00020\u001a8\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animator", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "confirmedIcon", "Landroid/widget/ImageView;", "defaultTintList", "Landroid/content/res/ColorStateList;", "externalLabel", "", "lockVisible", "", "getLockVisible$paymentsheet_debug", "()Z", "setLockVisible$paymentsheet_debug", "(Z)V", "state", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;", "getViewBinding$paymentsheet_debug$annotations", "()V", "getViewBinding$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;", "getTextAttributeValue", "", "onFinishProcessing", "", "onAnimationEnd", "Lkotlin/Function0;", "onReadyState", "onStartProcessing", "setBackgroundTintList", "tintList", "setEnabled", "enabled", "setLabel", "text", "updateAlpha", "updateState", "State", "paymentsheet_debug"})
public final class PrimaryButton extends android.widget.FrameLayout {
    private android.content.res.ColorStateList defaultTintList;
    private com.stripe.android.paymentsheet.ui.PrimaryButton.State state;
    private final com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator animator = null;
    private java.lang.String externalLabel;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.databinding.PrimaryButtonBinding viewBinding = null;
    private boolean lockVisible = true;
    private final android.widget.ImageView confirmedIcon = null;
    
    @kotlin.jvm.JvmOverloads()
    public PrimaryButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PrimaryButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PrimaryButton(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.databinding.PrimaryButtonBinding getViewBinding$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getViewBinding$paymentsheet_debug$annotations() {
    }
    
    public final boolean getLockVisible$paymentsheet_debug() {
        return false;
    }
    
    public final void setLockVisible$paymentsheet_debug(boolean p0) {
    }
    
    @java.lang.Override()
    public void setBackgroundTintList(@org.jetbrains.annotations.Nullable()
    android.content.res.ColorStateList tintList) {
    }
    
    private final java.lang.CharSequence getTextAttributeValue(android.util.AttributeSet attrs) {
        return null;
    }
    
    public final void setLabel(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    private final void onReadyState() {
    }
    
    private final void onStartProcessing() {
    }
    
    private final void onFinishProcessing(kotlin.jvm.functions.Function0<kotlin.Unit> onAnimationEnd) {
    }
    
    @java.lang.Override()
    public void setEnabled(boolean enabled) {
    }
    
    public final void updateState(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.ui.PrimaryButton.State state) {
    }
    
    private final void updateAlpha() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "", "()V", "FinishProcessing", "Ready", "StartProcessing", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "paymentsheet_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        /**
         * The label will be applied if the value is not null.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "()V", "paymentsheet_debug"})
        public static final class Ready extends com.stripe.android.paymentsheet.ui.PrimaryButton.State {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.ui.PrimaryButton.State.Ready INSTANCE = null;
            
            private Ready() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "()V", "paymentsheet_debug"})
        public static final class StartProcessing extends com.stripe.android.paymentsheet.ui.PrimaryButton.State {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.ui.PrimaryButton.State.StartProcessing INSTANCE = null;
            
            private StartProcessing() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "onComplete", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class FinishProcessing extends com.stripe.android.paymentsheet.ui.PrimaryButton.State {
            @org.jetbrains.annotations.NotNull()
            private final kotlin.jvm.functions.Function0<kotlin.Unit> onComplete = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.ui.PrimaryButton.State.FinishProcessing copy(@org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
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
            
            public FinishProcessing(@org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnComplete() {
                return null;
            }
        }
    }
}
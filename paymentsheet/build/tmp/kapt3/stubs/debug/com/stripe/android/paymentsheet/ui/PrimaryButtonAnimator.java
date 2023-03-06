package com.stripe.android.paymentsheet.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002J+\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0000\u00a2\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u00a2\u0006\u0002\b\u0012J&\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "slideAnimationDuration", "", "delay", "", "view", "Landroid/view/View;", "onAnimationEnd", "Lkotlin/Function0;", "fadeIn", "parentWidth", "", "fadeIn$paymentsheet_debug", "fadeOut", "fadeOut$paymentsheet_debug", "slideToCenter", "Companion", "paymentsheet_debug"})
public final class PrimaryButtonAnimator {
    private final android.content.Context context = null;
    private final long slideAnimationDuration = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator.Companion Companion = null;
    public static final long HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION = 1500L;
    
    public PrimaryButtonAnimator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void fadeIn$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view, int parentWidth, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAnimationEnd) {
    }
    
    private final void slideToCenter(android.view.View view, int parentWidth, kotlin.jvm.functions.Function0<kotlin.Unit> onAnimationEnd) {
    }
    
    private final void delay(android.view.View view, kotlin.jvm.functions.Function0<kotlin.Unit> onAnimationEnd) {
    }
    
    public final void fadeOut$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator$Companion;", "", "()V", "HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION", "", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
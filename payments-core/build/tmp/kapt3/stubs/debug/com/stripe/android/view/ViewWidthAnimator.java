package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/ViewWidthAnimator;", "", "view", "Landroid/view/View;", "duration", "", "(Landroid/view/View;J)V", "animate", "", "startWidth", "", "endWidth", "onAnimationEnd", "Lkotlin/Function0;", "payments-core_debug"})
public final class ViewWidthAnimator {
    private final android.view.View view = null;
    private final long duration = 0L;
    
    public ViewWidthAnimator(@org.jetbrains.annotations.NotNull()
    android.view.View view, long duration) {
        super();
    }
    
    /**
     * @param startWidth the starting width of the View
     * @param endWidth the ending width of the View after animation completes
     * @param onAnimationEnd callback to invoke when animation completes
     */
    public final void animate(int startWidth, int endWidth, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAnimationEnd) {
    }
}
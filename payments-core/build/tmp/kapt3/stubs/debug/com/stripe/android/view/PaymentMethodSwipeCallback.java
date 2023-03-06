package com.stripe.android.view;

import java.lang.System;

/**
 * A [ItemTouchHelper.SimpleCallback] subclass for enabling swiping on Payment Methods in
 * [PaymentMethodsActivity]'s list
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002*+B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J@\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0016J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\fH\u0016J(\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "context", "Landroid/content/Context;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "listener", "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;)V", "background", "Landroid/graphics/drawable/ColorDrawable;", "iconStartOffset", "", "itemViewStartPadding", "swipeStartColor", "swipeThresholdColor", "trashIcon", "Landroid/graphics/drawable/Drawable;", "getSwipeDirs", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getSwipeThreshold", "", "onChildDraw", "", "canvas", "Landroid/graphics/Canvas;", "dX", "dY", "actionState", "isCurrentlyActive", "", "onMove", "target", "onSwiped", "direction", "updateSwipedPaymentMethod", "itemView", "Landroid/view/View;", "transitionFraction", "Companion", "Listener", "payments-core_debug"})
public final class PaymentMethodSwipeCallback extends androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback {
    private final com.stripe.android.view.PaymentMethodsAdapter adapter = null;
    private final com.stripe.android.view.PaymentMethodSwipeCallback.Listener listener = null;
    private final android.graphics.drawable.Drawable trashIcon = null;
    private final int swipeStartColor = 0;
    private final int swipeThresholdColor = 0;
    private final android.graphics.drawable.ColorDrawable background = null;
    private final int itemViewStartPadding = 0;
    private final int iconStartOffset = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentMethodSwipeCallback.Companion Companion = null;
    private static final float START_TRANSITION_THRESHOLD = 0.25F;
    private static final float END_TRANSITION_THRESHOLD = 0.5F;
    
    public PaymentMethodSwipeCallback(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.PaymentMethodsAdapter adapter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.PaymentMethodSwipeCallback.Listener listener) {
        super(0, 0);
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public int getSwipeDirs(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @java.lang.Override()
    public float getSwipeThreshold(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0.0F;
    }
    
    private final void updateSwipedPaymentMethod(android.view.View itemView, int dX, float transitionFraction, android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "", "onSwiped", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_debug"})
    public static abstract interface Listener {
        
        public abstract void onSwiped(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback$Companion;", "", "()V", "END_TRANSITION_THRESHOLD", "", "START_TRANSITION_THRESHOLD", "calculateTransitionColor", "", "fraction", "startValue", "endValue", "calculateTransitionColor$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int calculateTransitionColor$payments_core_debug(float fraction, @androidx.annotation.ColorInt()
        int startValue, @androidx.annotation.ColorInt()
        int endValue) {
            return 0;
        }
    }
}
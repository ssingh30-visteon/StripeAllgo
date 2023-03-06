package com.stripe.android.view;

import java.lang.System;

/**
 * Adapter that populates a list with shipping methods
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rH\u0016J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\rH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\rH\u0016J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b(R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "()V", "onShippingMethodSelectedCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/ShippingMethod;", "", "getOnShippingMethodSelectedCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function1;", "setOnShippingMethodSelectedCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "selectedIndex", "getSelectedIndex$payments_core_debug", "()I", "setSelectedIndex$payments_core_debug", "(I)V", "selectedShippingMethod", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "", "shippingMethods", "getShippingMethods$payments_core_debug", "()Ljava/util/List;", "setShippingMethods$payments_core_debug", "(Ljava/util/List;)V", "getItemCount", "getItemId", "", "position", "onBindViewHolder", "holder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "setSelected", "shippingMethod", "setSelected$payments_core_debug", "ShippingMethodViewHolder", "payments-core_debug"})
public final class ShippingMethodAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stripe.android.view.ShippingMethodAdapter.ShippingMethodViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.stripe.android.model.ShippingMethod, kotlin.Unit> onShippingMethodSelectedCallback;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stripe.android.model.ShippingMethod> shippingMethods;
    
    public ShippingMethodAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.model.ShippingMethod, kotlin.Unit> getOnShippingMethodSelectedCallback$payments_core_debug() {
        return null;
    }
    
    public final void setOnShippingMethodSelectedCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.ShippingMethod, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.ShippingMethod> getShippingMethods$payments_core_debug() {
        return null;
    }
    
    public final void setShippingMethods$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.ShippingMethod> value) {
    }
    
    public final int getSelectedIndex$payments_core_debug() {
        return 0;
    }
    
    public final void setSelectedIndex$payments_core_debug(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingMethod getSelectedShippingMethod() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.view.ShippingMethodAdapter.ShippingMethodViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.ShippingMethodAdapter.ShippingMethodViewHolder holder, int i) {
    }
    
    public final void setSelected$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.ShippingMethod shippingMethod) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "shippingMethodView", "Lcom/stripe/android/view/ShippingMethodView;", "(Lcom/stripe/android/view/ShippingMethodView;)V", "getShippingMethodView$payments_core_debug", "()Lcom/stripe/android/view/ShippingMethodView;", "setSelected", "", "selected", "", "setShippingMethod", "shippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "payments-core_debug"})
    public static final class ShippingMethodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.view.ShippingMethodView shippingMethodView = null;
        
        public ShippingMethodViewHolder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.ShippingMethodView shippingMethodView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.ShippingMethodView getShippingMethodView$payments_core_debug() {
            return null;
        }
        
        public final void setShippingMethod(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.ShippingMethod shippingMethod) {
        }
        
        public final void setSelected(boolean selected) {
        }
    }
}
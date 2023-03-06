package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001@B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ \u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000202H\u0016J\u0010\u00106\u001a\u0002022\u0006\u00107\u001a\u000204H\u0016J\u0017\u00108\u001a\u0004\u0018\u00010\u00172\u0006\u00101\u001a\u000202H\u0000\u00a2\u0006\u0002\b9J\u0012\u0010:\u001a\u0004\u0018\u00010;2\u0006\u00101\u001a\u000202H\u0016J\u0018\u0010<\u001a\u0002042\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0018\u0010=\u001a\u00020\u000f2\u0006\u00103\u001a\u00020>2\u0006\u0010?\u001a\u000204H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u000e\u001a\u0004\u0018\u00010\"@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R7\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010!\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010+R\u000e\u0010-\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "allowedShippingCountryCodes", "", "", "onShippingMethodSelectedCallback", "Lkotlin/Function1;", "Lcom/stripe/android/model/ShippingMethod;", "", "(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "value", "", "isShippingInfoSubmitted", "isShippingInfoSubmitted$payments_core_debug", "()Z", "setShippingInfoSubmitted$payments_core_debug", "(Z)V", "pages", "", "Lcom/stripe/android/view/PaymentFlowPage;", "getPages", "()Ljava/util/List;", "<set-?>", "selectedShippingMethod", "getSelectedShippingMethod$payments_core_debug", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_debug", "(Lcom/stripe/android/model/ShippingMethod;)V", "selectedShippingMethod$delegate", "Lkotlin/properties/ReadWriteProperty;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "getShippingInformation$payments_core_debug", "()Lcom/stripe/android/model/ShippingInformation;", "setShippingInformation$payments_core_debug", "(Lcom/stripe/android/model/ShippingInformation;)V", "shippingMethods", "getShippingMethods$payments_core_debug", "setShippingMethods$payments_core_debug", "(Ljava/util/List;)V", "shippingMethods$delegate", "shouldRecreateShippingMethodsScreen", "destroyItem", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "getItemPosition", "obj", "getPageAt", "getPageAt$payments_core_debug", "getPageTitle", "", "instantiateItem", "isViewFromObject", "Landroid/view/View;", "o", "PaymentFlowViewHolder", "payments-core_debug"})
public final class PaymentFlowPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    private final android.content.Context context = null;
    private final com.stripe.android.PaymentSessionConfig paymentSessionConfig = null;
    private final java.util.Set<java.lang.String> allowedShippingCountryCodes = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.model.ShippingMethod, kotlin.Unit> onShippingMethodSelectedCallback = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.ShippingInformation shippingInformation;
    private boolean isShippingInfoSubmitted = false;
    private boolean shouldRecreateShippingMethodsScreen = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty shippingMethods$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.properties.ReadWriteProperty selectedShippingMethod$delegate = null;
    
    public PaymentFlowPagerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.stripe.android.PaymentSessionConfig paymentSessionConfig, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedShippingCountryCodes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.ShippingMethod, kotlin.Unit> onShippingMethodSelectedCallback) {
        super();
    }
    
    private final java.util.List<com.stripe.android.view.PaymentFlowPage> getPages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingInformation getShippingInformation$payments_core_debug() {
        return null;
    }
    
    public final void setShippingInformation$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingInformation value) {
    }
    
    public final boolean isShippingInfoSubmitted$payments_core_debug() {
        return false;
    }
    
    public final void setShippingInfoSubmitted$payments_core_debug(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.ShippingMethod> getShippingMethods$payments_core_debug() {
        return null;
    }
    
    public final void setShippingMethods$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.ShippingMethod> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ShippingMethod getSelectedShippingMethod$payments_core_debug() {
        return null;
    }
    
    public final void setSelectedShippingMethod$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.ShippingMethod p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup collection, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup collection, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object view) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.PaymentFlowPage getPageAt$payments_core_debug(int position) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isViewFromObject(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.Object o) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemPosition(@org.jetbrains.annotations.NotNull()
    java.lang.Object obj) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ShippingInformationViewHolder", "ShippingMethodViewHolder", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "payments-core_debug"})
    public static abstract class PaymentFlowViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        private PaymentFlowViewHolder(android.view.View itemView) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "root", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/ShippingInfoPageBinding;", "(Lcom/stripe/android/databinding/ShippingInfoPageBinding;)V", "shippingInfoWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "bind", "", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "allowedShippingCountryCodes", "", "", "payments-core_debug"})
        public static final class ShippingInformationViewHolder extends com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder {
            private final com.stripe.android.view.ShippingInfoWidget shippingInfoWidget = null;
            
            public ShippingInformationViewHolder(@org.jetbrains.annotations.NotNull()
            com.stripe.android.databinding.ShippingInfoPageBinding viewBinding) {
                super(null);
            }
            
            public ShippingInformationViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup root) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            com.stripe.android.PaymentSessionConfig paymentSessionConfig, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.ShippingInformation shippingInformation, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> allowedShippingCountryCodes) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J2\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "root", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/ShippingMethodPageBinding;", "(Lcom/stripe/android/databinding/ShippingMethodPageBinding;)V", "shippingMethodWidget", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "bind", "", "shippingMethods", "", "Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "onShippingMethodSelectedCallback", "Lkotlin/Function1;", "payments-core_debug"})
        public static final class ShippingMethodViewHolder extends com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder {
            private final com.stripe.android.view.SelectShippingMethodWidget shippingMethodWidget = null;
            
            public ShippingMethodViewHolder(@org.jetbrains.annotations.NotNull()
            com.stripe.android.databinding.ShippingMethodPageBinding viewBinding) {
                super(null);
            }
            
            public ShippingMethodViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup root) {
                super(null);
            }
            
            public final void bind(@org.jetbrains.annotations.NotNull()
            java.util.List<com.stripe.android.model.ShippingMethod> shippingMethods, @org.jetbrains.annotations.Nullable()
            com.stripe.android.model.ShippingMethod selectedShippingMethod, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super com.stripe.android.model.ShippingMethod, kotlin.Unit> onShippingMethodSelectedCallback) {
            }
        }
    }
}
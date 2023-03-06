package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nH\u0016J\u000e\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\nJ\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\nH\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\nH\u0016J\u0015\u0010*\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\nH\u0000\u00a2\u0006\u0002\b+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006-"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "items", "", "Lcom/stripe/android/view/Bank;", "itemSelectedCallback", "Lkotlin/Function1;", "", "", "(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "bankStatuses", "Lcom/stripe/android/model/BankStatuses;", "getBankStatuses$payments_core_debug", "()Lcom/stripe/android/model/BankStatuses;", "setBankStatuses$payments_core_debug", "(Lcom/stripe/android/model/BankStatuses;)V", "getItemSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "getItems", "()Ljava/util/List;", "value", "selectedPosition", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "getThemeConfig", "()Lcom/stripe/android/view/ThemeConfig;", "getItemCount", "getItemId", "", "position", "notifyAdapterItemChanged", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSelected", "updateSelected$payments_core_debug", "BankViewHolder", "payments-core_debug"})
public final class AddPaymentMethodListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.ThemeConfig themeConfig = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.view.Bank> items = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemSelectedCallback = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.model.BankStatuses bankStatuses;
    private int selectedPosition = androidx.recyclerview.widget.RecyclerView.NO_POSITION;
    
    public AddPaymentMethodListAdapter(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.ThemeConfig themeConfig, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.Bank> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemSelectedCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.ThemeConfig getThemeConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.Bank> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getItemSelectedCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.BankStatuses getBankStatuses$payments_core_debug() {
        return null;
    }
    
    public final void setBankStatuses$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.BankStatuses p0) {
    }
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    public final void setSelectedPosition(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
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
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void updateSelected$payments_core_debug(int position) {
    }
    
    public final void notifyAdapterItemChanged(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u00a2\u0006\u0002\b\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/stripe/android/databinding/BankItemBinding;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "(Lcom/stripe/android/databinding/BankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V", "resources", "Landroid/content/res/Resources;", "setSelected", "", "isSelected", "", "setSelected$payments_core_debug", "update", "bank", "Lcom/stripe/android/view/Bank;", "isOnline", "payments-core_debug"})
    public static final class BankViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.stripe.android.databinding.BankItemBinding viewBinding = null;
        private final com.stripe.android.view.ThemeConfig themeConfig = null;
        private final android.content.res.Resources resources = null;
        
        public BankViewHolder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.databinding.BankItemBinding viewBinding, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.ThemeConfig themeConfig) {
            super(null);
        }
        
        public final void update(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.Bank bank, boolean isOnline) {
        }
        
        public final void setSelected$payments_core_debug(boolean isSelected) {
        }
    }
}
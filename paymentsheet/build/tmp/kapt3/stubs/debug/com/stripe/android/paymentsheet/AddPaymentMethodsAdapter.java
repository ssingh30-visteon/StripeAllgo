package com.stripe.android.paymentsheet;

import java.lang.System;

@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B>\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u0007H\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007H\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R,\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/AddPaymentMethodsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/paymentsheet/AddPaymentMethodsAdapter$AddPaymentMethodViewHolder;", "paymentMethods", "", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "selectedItemPosition", "", "paymentMethodSelectedListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "paymentMethod", "", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "<set-?>", "", "isEnabled", "isEnabled$paymentsheet_debug", "()Z", "setEnabled$paymentsheet_debug", "(Z)V", "isEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "getPaymentMethodSelectedListener", "()Lkotlin/jvm/functions/Function1;", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemSelected", "AddPaymentMethodViewHolder", "paymentsheet_debug"})
public final class AddPaymentMethodsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stripe.android.paymentsheet.AddPaymentMethodsAdapter.AddPaymentMethodViewHolder> {
    private final java.util.List<com.stripe.android.paymentsheet.model.SupportedPaymentMethod> paymentMethods = null;
    private int selectedItemPosition;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.model.SupportedPaymentMethod, kotlin.Unit> paymentMethodSelectedListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty isEnabled$delegate = null;
    
    public AddPaymentMethodsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.model.SupportedPaymentMethod> paymentMethods, int selectedItemPosition, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.paymentsheet.model.SupportedPaymentMethod, kotlin.Unit> paymentMethodSelectedListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.model.SupportedPaymentMethod, kotlin.Unit> getPaymentMethodSelectedListener() {
        return null;
    }
    
    public final boolean isEnabled$paymentsheet_debug() {
        return false;
    }
    
    public final void setEnabled$paymentsheet_debug(boolean p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.AddPaymentMethodsAdapter.AddPaymentMethodViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.AddPaymentMethodsAdapter.AddPaymentMethodViewHolder holder, int position) {
    }
    
    private final void onItemSelected(int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/AddPaymentMethodsAdapter$AddPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetAddPaymentMethodCardViewBinding;", "(Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetAddPaymentMethodCardViewBinding;)V", "bind", "", "paymentMethod", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "setEnabled", "enabled", "", "setSelected", "selected", "paymentsheet_debug"})
    public static final class AddPaymentMethodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetAddPaymentMethodCardViewBinding binding = null;
        
        public AddPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetAddPaymentMethodCardViewBinding binding) {
            super(null);
        }
        
        public AddPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null);
        }
        
        public final void setSelected(boolean selected) {
        }
        
        public final void setEnabled(boolean enabled) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod) {
        }
    }
}
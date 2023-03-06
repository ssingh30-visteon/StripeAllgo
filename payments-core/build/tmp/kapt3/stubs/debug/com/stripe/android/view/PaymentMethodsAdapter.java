package com.stripe.android.view;

import java.lang.System;

/**
 * A [RecyclerView.Adapter] that holds a set of [MaskedCardView] items for a given set
 * of [PaymentMethod] objects.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0019\b\u0000\u0018\u0000 W2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004WXYZBG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000eJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00102\u001a\u000203H\u0002J\u0010\u00106\u001a\u0002072\u0006\u00102\u001a\u000203H\u0002J\u0010\u00108\u001a\u0002092\u0006\u00102\u001a\u000203H\u0002J\u0015\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020%H\u0000\u00a2\u0006\u0002\b=J\u0010\u0010>\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\u001cH\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010?\u001a\u00020\u001cH\u0016J\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001cH\u0016J\u0015\u0010D\u001a\u00020%2\u0006\u0010?\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\bEJ\u0010\u0010F\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001cH\u0002J\u0019\u0010G\u001a\u0004\u0018\u00010\u001c2\u0006\u0010<\u001a\u00020%H\u0000\u00a2\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u001cH\u0002J\u0010\u0010K\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u001cH\u0002J\u0018\u0010L\u001a\u00020;2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u001cH\u0016J\u0018\u0010N\u001a\u00020\u00022\u0006\u00102\u001a\u0002032\u0006\u0010O\u001a\u00020\u001cH\u0016J\u0015\u0010P\u001a\u00020;2\u0006\u0010?\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020;2\u0006\u0010<\u001a\u00020%H\u0000\u00a2\u0006\u0002\bSJ\u001b\u0010T\u001a\u00020;2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0\u0006H\u0000\u00a2\u0006\u0002\bUJ\u0010\u0010V\u001a\u00020;2\u0006\u0010?\u001a\u00020\u001cH\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0011X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0011X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010(\u001a\u0004\u0018\u00010%8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "intentArgs", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "addableTypes", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "initiallySelectedPaymentMethodId", "", "shouldShowGooglePay", "", "useGooglePay", "canDeletePaymentMethods", "(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V", "_addPaymentMethodArgs", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "addCardArgs", "getAddCardArgs$payments_core_debug", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "addFpxArgs", "getAddFpxArgs$payments_core_debug", "addPaymentMethodArgs", "Landroidx/lifecycle/LiveData;", "getAddPaymentMethodArgs", "()Landroidx/lifecycle/LiveData;", "googlePayCount", "", "listener", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "getListener$payments_core_debug", "()Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "setListener$payments_core_debug", "(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethods$payments_core_debug", "()Ljava/util/List;", "selectedPaymentMethod", "getSelectedPaymentMethod$payments_core_debug", "()Lcom/stripe/android/model/PaymentMethod;", "selectedPaymentMethodId", "getSelectedPaymentMethodId$payments_core_debug", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_debug", "(Ljava/lang/String;)V", "createAddCardPaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "parent", "Landroid/view/ViewGroup;", "createAddFpxPaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "createGooglePayViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "createPaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "deletePaymentMethod", "", "paymentMethod", "deletePaymentMethod$payments_core_debug", "getAddableTypesPosition", "position", "getItemCount", "getItemId", "", "getItemViewType", "getPaymentMethodAtPosition", "getPaymentMethodAtPosition$payments_core_debug", "getPaymentMethodIndex", "getPosition", "getPosition$payments_core_debug", "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;", "isGooglePayPosition", "isPaymentMethodsPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "onPositionClicked", "onPositionClicked$payments_core_debug", "resetPaymentMethod", "resetPaymentMethod$payments_core_debug", "setPaymentMethods", "setPaymentMethods$payments_core_debug", "updateSelectedPaymentMethod", "Companion", "Listener", "ViewHolder", "ViewType", "payments-core_debug"})
public final class PaymentMethodsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<com.stripe.android.model.PaymentMethod.Type> addableTypes = null;
    private final boolean shouldShowGooglePay = false;
    private final boolean useGooglePay = false;
    private final boolean canDeletePaymentMethods = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedPaymentMethodId;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.view.PaymentMethodsAdapter.Listener listener;
    private final int googlePayCount = 0;
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.view.AddPaymentMethodActivityStarter.Args> _addPaymentMethodArgs = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.view.AddPaymentMethodActivityStarter.Args> addPaymentMethodArgs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.AddPaymentMethodActivityStarter.Args addCardArgs = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.view.AddPaymentMethodActivityStarter.Args addFpxArgs = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.PaymentMethodsAdapter.Companion Companion = null;
    private static final long GOOGLE_PAY_ITEM_ID = 0L;
    
    public PaymentMethodsAdapter(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.PaymentMethodsActivityStarter.Args intentArgs, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> addableTypes, @org.jetbrains.annotations.Nullable()
    java.lang.String initiallySelectedPaymentMethodId, boolean shouldShowGooglePay, boolean useGooglePay, boolean canDeletePaymentMethods) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.model.PaymentMethod> getPaymentMethods$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedPaymentMethodId$payments_core_debug() {
        return null;
    }
    
    public final void setSelectedPaymentMethodId$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethod getSelectedPaymentMethod$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.PaymentMethodsAdapter.Listener getListener$payments_core_debug() {
        return null;
    }
    
    public final void setListener$payments_core_debug(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.PaymentMethodsAdapter.Listener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.view.AddPaymentMethodActivityStarter.Args> getAddPaymentMethodArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args getAddCardArgs$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.AddPaymentMethodActivityStarter.Args getAddFpxArgs$payments_core_debug() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    private final boolean isGooglePayPosition(int position) {
        return false;
    }
    
    private final boolean isPaymentMethodsPosition(int position) {
        return false;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    private final void updateSelectedPaymentMethod(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.AddCardPaymentMethodViewHolder createAddCardPaymentMethodViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.AddFpxPaymentMethodViewHolder createAddFpxPaymentMethodViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder createPaymentMethodViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    private final com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.GooglePayViewHolder createGooglePayViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    /**
     * Given an adapter position, translate to a `paymentMethods` index
     */
    private final int getPaymentMethodIndex(int position) {
        return 0;
    }
    
    /**
     * Given a Payment Method, get its adapter position. For example, if the Google Pay button is
     * being shown, the 2nd element in [paymentMethods] is actually the 3rd item in the adapter.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPosition$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod paymentMethod) {
        return null;
    }
    
    private final int getAddableTypesPosition(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0001\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "AddCardPaymentMethodViewHolder", "AddFpxPaymentMethodViewHolder", "GooglePayViewHolder", "PaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "payments-core_debug"})
    public static abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        private ViewHolder(android.view.View itemView) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "(Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;)V", "payments-core_debug"})
        public static final class AddCardPaymentMethodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            
            public AddCardPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
            com.stripe.android.databinding.AddPaymentMethodRowBinding viewBinding) {
                super(null);
            }
            
            public AddCardPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
            android.content.Context context, @org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "(Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;)V", "payments-core_debug"})
        public static final class AddFpxPaymentMethodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            
            public AddFpxPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
            com.stripe.android.databinding.AddPaymentMethodRowBinding viewBinding) {
                super(null);
            }
            
            public AddFpxPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
            android.content.Context context, @org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                super(null);
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/GooglePayRowBinding;", "(Lcom/stripe/android/databinding/GooglePayRowBinding;)V", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "bind", "", "isSelected", "", "payments-core_debug"})
        public static final class GooglePayViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            private final com.stripe.android.databinding.GooglePayRowBinding viewBinding = null;
            private final com.stripe.android.view.ThemeConfig themeConfig = null;
            
            public GooglePayViewHolder(@org.jetbrains.annotations.NotNull()
            com.stripe.android.databinding.GooglePayRowBinding viewBinding) {
                super(null);
            }
            
            public GooglePayViewHolder(@org.jetbrains.annotations.NotNull()
            android.content.Context context, @org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                super(null);
            }
            
            public final void bind(boolean isSelected) {
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "viewBinding", "Lcom/stripe/android/databinding/MaskedCardRowBinding;", "(Lcom/stripe/android/databinding/MaskedCardRowBinding;)V", "setPaymentMethod", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "setSelected", "selected", "", "payments-core_debug"})
        public static final class PaymentMethodViewHolder extends com.stripe.android.view.PaymentMethodsAdapter.ViewHolder {
            private final com.stripe.android.databinding.MaskedCardRowBinding viewBinding = null;
            
            public PaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
            com.stripe.android.databinding.MaskedCardRowBinding viewBinding) {
                super(null);
            }
            
            public PaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                super(null);
            }
            
            public final void setPaymentMethod(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod paymentMethod) {
            }
            
            public final void setSelected(boolean selected) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "", "onDeletePaymentMethodAction", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "onGooglePayClick", "onPaymentMethodClick", "payments-core_debug"})
    public static abstract interface Listener {
        
        public abstract void onPaymentMethodClick(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod);
        
        public abstract void onGooglePayClick();
        
        public abstract void onDeletePaymentMethodAction(@org.jetbrains.annotations.NotNull()
        com.stripe.android.model.PaymentMethod paymentMethod);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "Card", "AddCard", "AddFpx", "GooglePay", "payments-core_debug"})
    public static enum ViewType {
        /*public static final*/ Card /* = new Card() */,
        /*public static final*/ AddCard /* = new AddCard() */,
        /*public static final*/ AddFpx /* = new AddFpx() */,
        /*public static final*/ GooglePay /* = new GooglePay() */;
        
        ViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;", "", "()V", "GOOGLE_PAY_ITEM_ID", "", "getGOOGLE_PAY_ITEM_ID$payments_core_debug", "()J", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final long getGOOGLE_PAY_ITEM_ID$payments_core_debug() {
            return 0L;
        }
    }
}
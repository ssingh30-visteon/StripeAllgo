package com.stripe.android.paymentsheet;

import java.lang.System;

@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006LMNOPQBp\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00126\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002002\u0006\u0010\n\u001a\u00020\u0007H\u0002J\b\u00105\u001a\u000200H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000200H\u0016J\u0010\u00109\u001a\u0002002\u0006\u00108\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u000200H\u0016J\u0018\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000200H\u0016J\u001d\u0010@\u001a\u00020\f2\u0006\u00108\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\bAJ\u000e\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020!J\u000e\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u0004J(\u0010F\u001a\u00020\f2\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007J$\u0010K\u001a\b\u0012\u0004\u0012\u00020J0 2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 2\u0006\u00102\u001a\u000203H\u0002R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R,\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)RA\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010!8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006R"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "canClickSelectedItem", "", "paymentOptionSelectedListener", "Lkotlin/Function2;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Lkotlin/ParameterName;", "name", "paymentSelection", "isClick", "", "paymentMethodDeleteListener", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$SavedPaymentMethod;", "paymentMethod", "addCardClickListener", "Landroid/view/View$OnClickListener;", "(ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;)V", "getAddCardClickListener", "()Landroid/view/View$OnClickListener;", "isEditing", "<set-?>", "isEnabled", "isEnabled$paymentsheet_debug", "()Z", "setEnabled$paymentsheet_debug", "(Z)V", "isEnabled$delegate", "Lkotlin/properties/ReadWriteProperty;", "items", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "getItems$paymentsheet_debug$annotations", "()V", "getItems$paymentsheet_debug", "()Ljava/util/List;", "setItems$paymentsheet_debug", "(Ljava/util/List;)V", "getPaymentMethodDeleteListener", "()Lkotlin/jvm/functions/Function1;", "getPaymentOptionSelectedListener", "()Lkotlin/jvm/functions/Function2;", "selectedItem", "getSelectedItem$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "selectedItemPosition", "", "findInitialSelectedPosition", "savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "findSelectedPosition", "getItemCount", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemSelected", "onItemSelected$paymentsheet_debug", "removeItem", "item", "setEditing", "editing", "setItems", "config", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "paymentMethods", "Lcom/stripe/android/model/PaymentMethod;", "sortedPaymentMethods", "AddNewPaymentMethodViewHolder", "GooglePayViewHolder", "Item", "PaymentOptionViewHolder", "SavedPaymentMethodViewHolder", "ViewType", "paymentsheet_debug"})
public final class PaymentOptionsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder> {
    private final boolean canClickSelectedItem = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<com.stripe.android.paymentsheet.model.PaymentSelection, java.lang.Boolean, kotlin.Unit> paymentOptionSelectedListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod, kotlin.Unit> paymentMethodDeleteListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener addCardClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item> items;
    private int selectedItemPosition = androidx.recyclerview.widget.RecyclerView.NO_POSITION;
    private boolean isEditing = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty isEnabled$delegate = null;
    
    public PaymentOptionsAdapter(boolean canClickSelectedItem, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.stripe.android.paymentsheet.model.PaymentSelection, ? super java.lang.Boolean, kotlin.Unit> paymentOptionSelectedListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod, kotlin.Unit> paymentMethodDeleteListener, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener addCardClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<com.stripe.android.paymentsheet.model.PaymentSelection, java.lang.Boolean, kotlin.Unit> getPaymentOptionSelectedListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod, kotlin.Unit> getPaymentMethodDeleteListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getAddCardClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item> getItems$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getItems$paymentsheet_debug$annotations() {
    }
    
    public final void setItems$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item getSelectedItem$paymentsheet_debug() {
        return null;
    }
    
    public final boolean isEnabled$paymentsheet_debug() {
        return false;
    }
    
    public final void setEnabled$paymentsheet_debug(boolean p0) {
    }
    
    public final void setEditing(boolean editing) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.FragmentConfig config, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    public final void removeItem(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item item) {
    }
    
    /**
     * The initial selection position follows this prioritization:
     * 1. The index of [Item.SavedPaymentMethod] if it matches the [SavedSelection]
     * 2. The index of [Item.GooglePay] if it exists
     * 3. The index of the first [Item.SavedPaymentMethod]
     * 4. None (-1)
     */
    private final int findInitialSelectedPosition(com.stripe.android.paymentsheet.model.SavedSelection savedSelection) {
        return 0;
    }
    
    /**
     * Find the index of [paymentSelection] in the current items. Return -1 if not found.
     */
    private final int findSelectedPosition(com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
        return 0;
    }
    
    private final java.util.List<com.stripe.android.model.PaymentMethod> sortedPaymentMethods(java.util.List<com.stripe.android.model.PaymentMethod> paymentMethods, com.stripe.android.paymentsheet.model.SavedSelection savedSelection) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void onItemSelected$paymentsheet_debug(int position, boolean isClick) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bB!\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$SavedPaymentMethodViewHolder;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "parent", "Landroid/view/ViewGroup;", "onRemoveListener", "Lkotlin/Function1;", "", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "binding", "Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetPaymentMethodItemBinding;", "(Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetPaymentMethodItemBinding;Lkotlin/jvm/functions/Function1;)V", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "bindSavedPaymentMethod", "item", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$SavedPaymentMethod;", "setEditing", "editing", "", "setEnabled", "enabled", "setSelected", "selected", "paymentsheet_debug"})
    static final class SavedPaymentMethodViewHolder extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder {
        private final com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetPaymentMethodItemBinding binding = null;
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onRemoveListener = null;
        
        public SavedPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetPaymentMethodItemBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onRemoveListener) {
            super(null);
        }
        
        public SavedPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onRemoveListener) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getCardView() {
            return null;
        }
        
        public final void bindSavedPaymentMethod(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod item) {
        }
        
        public final void setSelected(boolean selected) {
        }
        
        @java.lang.Override()
        public void setEnabled(boolean enabled) {
        }
        
        public final void setEditing(boolean editing) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$AddNewPaymentMethodViewHolder;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetAddNewPaymentMethodItemBinding;", "(Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetAddNewPaymentMethodItemBinding;)V", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "setEnabled", "", "enabled", "", "paymentsheet_debug"})
    static final class AddNewPaymentMethodViewHolder extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder {
        private final com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetAddNewPaymentMethodItemBinding binding = null;
        
        public AddNewPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetAddNewPaymentMethodItemBinding binding) {
            super(null);
        }
        
        public AddNewPaymentMethodViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getCardView() {
            return null;
        }
        
        @java.lang.Override()
        public void setEnabled(boolean enabled) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$GooglePayViewHolder;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetGooglePayItemBinding;", "(Lcom/stripe/android/paymentsheet/databinding/LayoutPaymentsheetGooglePayItemBinding;)V", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "setEnabled", "", "enabled", "", "setSelected", "selected", "paymentsheet_debug"})
    static final class GooglePayViewHolder extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.PaymentOptionViewHolder {
        private final com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetGooglePayItemBinding binding = null;
        
        public GooglePayViewHolder(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.databinding.LayoutPaymentsheetGooglePayItemBinding binding) {
            super(null);
        }
        
        public GooglePayViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getCardView() {
            return null;
        }
        
        public final void setSelected(boolean selected) {
        }
        
        @java.lang.Override()
        public void setEnabled(boolean enabled) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH&R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "cardView", "Landroid/view/View;", "getCardView", "()Landroid/view/View;", "cardStrokeWidth", "", "selected", "", "setEnabled", "", "enabled", "paymentsheet_debug"})
    public static abstract class PaymentOptionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public PaymentOptionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract android.view.View getCardView();
        
        public abstract void setEnabled(boolean enabled);
        
        public final int cardStrokeWidth(boolean selected) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "SavedPaymentMethod", "AddCard", "GooglePay", "paymentsheet_debug"})
    public static enum ViewType {
        /*public static final*/ SavedPaymentMethod /* = new SavedPaymentMethod() */,
        /*public static final*/ AddCard /* = new AddCard() */,
        /*public static final*/ GooglePay /* = new GooglePay() */;
        
        ViewType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "AddCard", "GooglePay", "SavedPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$SavedPaymentMethod;", "paymentsheet_debug"})
    public static abstract class Item {
        
        private Item() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType getViewType();
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "paymentsheet_debug"})
        public static final class AddCard extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.AddCard INSTANCE = null;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType viewType = com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType.AddCard;
            
            private AddCard() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType getViewType() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "()V", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "paymentsheet_debug"})
        public static final class GooglePay extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.GooglePay INSTANCE = null;
            @org.jetbrains.annotations.NotNull()
            private static final com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType viewType = com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType.GooglePay;
            
            private GooglePay() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType getViewType() {
                return null;
            }
        }
        
        /**
         * Represents a [PaymentMethod] that is already saved and attached to the current customer.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$SavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "component1", "copy", "equals", "", "other", "", "getDescription", "", "resources", "Landroid/content/res/Resources;", "getStripeAllgoDescription", "hashCode", "", "toString", "paymentsheet_debug"})
        public static final class SavedPaymentMethod extends com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.model.PaymentMethod paymentMethod = null;
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType viewType = com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType.SavedPaymentMethod;
            
            /**
             * Represents a [PaymentMethod] that is already saved and attached to the current customer.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod paymentMethod) {
                return null;
            }
            
            /**
             * Represents a [PaymentMethod] that is already saved and attached to the current customer.
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Represents a [PaymentMethod] that is already saved and attached to the current customer.
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Represents a [PaymentMethod] that is already saved and attached to the current customer.
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public SavedPaymentMethod(@org.jetbrains.annotations.NotNull()
            com.stripe.android.model.PaymentMethod paymentMethod) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PaymentMethod getPaymentMethod() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.PaymentOptionsAdapter.ViewType getViewType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDescription(@org.jetbrains.annotations.NotNull()
            android.content.res.Resources resources) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getStripeAllgoDescription(@org.jetbrains.annotations.NotNull()
            android.content.res.Resources resources) {
                return null;
            }
        }
    }
}
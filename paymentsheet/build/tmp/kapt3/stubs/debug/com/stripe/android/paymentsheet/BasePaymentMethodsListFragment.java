package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000 <2\u00020\u0001:\u0001<B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0018\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003H\u0016J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\'H\u0016J\u001a\u00104\u001a\u00020\"2\u0006\u00105\u001a\u0002062\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010;\u001a\u00020\"H&R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038\u0000@@X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/stripe/android/paymentsheet/BasePaymentMethodsListFragment;", "Landroidx/fragment/app/Fragment;", "canClickSelectedItem", "", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "(ZLcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "adapter", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter;", "config", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "setConfig", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "editMenuItem", "Landroid/view/MenuItem;", "value", "isEditing", "isEditing$paymentsheet_debug$annotations", "()V", "isEditing$paymentsheet_debug", "()Z", "setEditing$paymentsheet_debug", "(Z)V", "mConfirmationDialog", "Landroid/app/Dialog;", "sheetViewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "text", "", "deletePaymentMethod", "", "item", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$SavedPaymentMethod;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "onPaymentOptionSelected", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "isClick", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "setupRecyclerView", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/FragmentPaymentsheetPaymentMethodsListBinding;", "showConfirmationDialog", "transitionToAddPaymentMethod", "Companion", "paymentsheet_debug"})
public abstract class BasePaymentMethodsListFragment extends androidx.fragment.app.Fragment {
    private final boolean canClickSelectedItem = false;
    private final com.stripe.android.paymentsheet.analytics.EventReporter eventReporter = null;
    private android.app.Dialog mConfirmationDialog;
    protected com.stripe.android.paymentsheet.model.FragmentConfig config;
    private com.stripe.android.paymentsheet.PaymentOptionsAdapter adapter;
    private android.view.MenuItem editMenuItem;
    private java.lang.String text;
    private boolean isEditing = false;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.paymentsheet.BasePaymentMethodsListFragment.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String IS_EDITING = "is_editing";
    
    public BasePaymentMethodsListFragment(boolean canClickSelectedItem, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel<?> getSheetViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final com.stripe.android.paymentsheet.model.FragmentConfig getConfig() {
        return null;
    }
    
    protected final void setConfig(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.FragmentConfig p0) {
    }
    
    public final boolean isEditing$paymentsheet_debug() {
        return false;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void isEditing$paymentsheet_debug$annotations() {
    }
    
    public final void setEditing$paymentsheet_debug(boolean value) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void setupRecyclerView(com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetPaymentMethodsListBinding viewBinding) {
    }
    
    public abstract void transitionToAddPaymentMethod();
    
    public void onPaymentOptionSelected(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection, boolean isClick) {
    }
    
    private final void deletePaymentMethod(com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod item) {
    }
    
    private final void showConfirmationDialog(com.stripe.android.paymentsheet.PaymentOptionsAdapter.Item.SavedPaymentMethod item) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/BasePaymentMethodsListFragment$Companion;", "", "()V", "IS_EDITING", "", "paymentsheet_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
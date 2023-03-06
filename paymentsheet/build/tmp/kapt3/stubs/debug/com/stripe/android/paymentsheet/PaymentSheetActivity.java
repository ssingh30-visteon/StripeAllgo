package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\\B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020\u0012H\u0016J\u0012\u0010N\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010PH\u0014J\b\u0010Q\u001a\u00020\u0012H\u0014J\u0018\u0010R\u001a\u00020\u00122\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020PH\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u0002H\u0016J\b\u0010X\u001a\u00020\u0012H\u0002J\u0014\u0010Y\u001a\u00020\u00122\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010[H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\t\u001a\u0004\b#\u0010\rR\u001b\u0010%\u001a\u00020&8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\t\u001a\u0004\b\'\u0010(R\u001d\u0010*\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u00020\u001e8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b0\u0010 R\u001b\u00102\u001a\u0002038VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b4\u00105R!\u00107\u001a\u0002088@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\b<\u0010\t\u0012\u0004\b9\u0010\u0003\u001a\u0004\b:\u0010;R\u001b\u0010=\u001a\u00020>8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\b?\u0010@R$\u0010B\u001a\u00020C8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bD\u0010\u0003\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u00a8\u0006]"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "()V", "appbar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appbar$delegate", "Lkotlin/Lazy;", "bottomSheet", "Landroid/view/ViewGroup;", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheet$delegate", "buyButtonStateObserver", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "", "currencyFormatter", "Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "fragmentContainerId", "", "getFragmentContainerId", "()I", "fragmentContainerParent", "getFragmentContainerParent", "fragmentContainerParent$delegate", "googlePayButtonStateObserver", "messageView", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "messageView$delegate", "rootView", "getRootView", "rootView$delegate", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView$delegate", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "starterArgs$delegate", "testModeIndicator", "getTestModeIndicator", "testModeIndicator$delegate", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar$delegate", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;", "getViewBinding$paymentsheet_debug$annotations", "getViewBinding$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentSheetBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_debug$annotations", "getViewModelFactory$paymentsheet_debug", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_debug", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getLabelText", "", "amount", "Lcom/stripe/android/paymentsheet/model/Amount;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onTransitionTarget", "transitionTarget", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "fragmentArgs", "setActivityResult", "result", "setupBuyButton", "updateErrorMessage", "userMessage", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "Companion", "paymentsheet_debug"})
public final class PaymentSheetActivity extends com.stripe.android.paymentsheet.ui.BaseSheetActivity<com.stripe.android.paymentsheet.PaymentSheetResult> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewBinding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy starterArgs$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy rootView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy bottomSheet$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy appbar$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy toolbar$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy scrollView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy messageView$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fragmentContainerParent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy testModeIndicator$delegate = null;
    private final com.stripe.android.paymentsheet.CurrencyFormatter currencyFormatter = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.model.PaymentSheetViewState, kotlin.Unit> buyButtonStateObserver = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.model.PaymentSheetViewState, kotlin.Unit> googlePayButtonStateObserver = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.PaymentSheetActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    
    public PaymentSheetActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.databinding.ActivityPaymentSheetBinding getViewBinding$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getViewBinding$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getViewModelFactory$paymentsheet_debug$annotations() {
    }
    
    public final void setViewModelFactory$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.PaymentSheetViewModel getViewModel() {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.PaymentSheetContract.Args getStarterArgs() {
        return null;
    }
    
    @androidx.annotation.IdRes()
    private final int getFragmentContainerId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.ViewGroup getRootView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.ViewGroup getBottomSheet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.material.appbar.AppBarLayout getAppbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.material.appbar.MaterialToolbar getToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.ScrollView getScrollView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.TextView getMessageView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.ViewGroup getFragmentContainerParent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.TextView getTestModeIndicator() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void updateErrorMessage(com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage userMessage) {
    }
    
    private final void onTransitionTarget(com.stripe.android.paymentsheet.PaymentSheetViewModel.TransitionTarget transitionTarget, android.os.Bundle fragmentArgs) {
    }
    
    private final void setupBuyButton() {
    }
    
    private final java.lang.String getLabelText(com.stripe.android.paymentsheet.model.Amount amount) {
        return null;
    }
    
    @java.lang.Override()
    public void setActivityResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentSheetResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;", "", "()V", "EXTRA_FRAGMENT_CONFIG", "", "EXTRA_STARTER_ARGS", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
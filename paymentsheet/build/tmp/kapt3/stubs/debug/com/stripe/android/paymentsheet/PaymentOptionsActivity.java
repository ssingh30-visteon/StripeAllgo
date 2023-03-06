package com.stripe.android.paymentsheet;

import java.lang.System;

/**
 * An `Activity` for selecting a payment option.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001OB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0018\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020EH\u0002J\u0010\u0010J\u001a\u00020C2\u0006\u0010K\u001a\u00020\u0002H\u0016J\u0010\u0010L\u001a\u00020C2\u0006\u0010M\u001a\u00020NH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00108CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0014\u0010\rR\u001b\u0010\u0016\u001a\u00020\u00178VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001c\u0010\rR\u001b\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!R\u001d\u0010#\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\t\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020\u00178VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b)\u0010\u0019R\u001b\u0010+\u001a\u00020,8VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b-\u0010.R!\u00100\u001a\u0002018@X\u0081\u0084\u0002\u00a2\u0006\u0012\n\u0004\b5\u0010\t\u0012\u0004\b2\u0010\u0003\u001a\u0004\b3\u00104R\u001b\u00106\u001a\u0002078VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\t\u001a\u0004\b8\u00109R$\u0010;\u001a\u00020<8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b=\u0010\u0003\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A\u00a8\u0006P"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "()V", "appbar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appbar$delegate", "Lkotlin/Lazy;", "bottomSheet", "Landroid/view/ViewGroup;", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheet$delegate", "fragmentContainerId", "", "getFragmentContainerId", "()I", "fragmentContainerParent", "getFragmentContainerParent", "fragmentContainerParent$delegate", "messageView", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "messageView$delegate", "rootView", "getRootView", "rootView$delegate", "scrollView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView$delegate", "starterArgs", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "starterArgs$delegate", "testModeIndicator", "getTestModeIndicator", "testModeIndicator$delegate", "toolbar", "Lcom/google/android/material/appbar/MaterialToolbar;", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar$delegate", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentOptionsBinding;", "getViewBinding$paymentsheet_debug$annotations", "getViewBinding$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/databinding/ActivityPaymentOptionsBinding;", "viewBinding$delegate", "viewModel", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$paymentsheet_debug$annotations", "getViewModelFactory$paymentsheet_debug", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory$paymentsheet_debug", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onTransitionTarget", "transitionTarget", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "fragmentArgs", "setActivityResult", "result", "setupContinueButton", "addButton", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Companion", "paymentsheet_debug"})
public final class PaymentOptionsActivity extends com.stripe.android.paymentsheet.ui.BaseSheetActivity<com.stripe.android.paymentsheet.PaymentOptionResult> {
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
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.PaymentOptionsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    
    public PaymentOptionsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.databinding.ActivityPaymentOptionsBinding getViewBinding$paymentsheet_debug() {
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
    public com.stripe.android.paymentsheet.PaymentOptionsViewModel getViewModel() {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.PaymentOptionContract.Args getStarterArgs() {
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
    
    private final void setupContinueButton(com.stripe.android.paymentsheet.ui.PrimaryButton addButton) {
    }
    
    private final void onTransitionTarget(com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget transitionTarget, android.os.Bundle fragmentArgs) {
    }
    
    @java.lang.Override()
    public void setActivityResult(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionResult result) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity$Companion;", "", "()V", "EXTRA_FRAGMENT_CONFIG", "", "EXTRA_STARTER_ARGS", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
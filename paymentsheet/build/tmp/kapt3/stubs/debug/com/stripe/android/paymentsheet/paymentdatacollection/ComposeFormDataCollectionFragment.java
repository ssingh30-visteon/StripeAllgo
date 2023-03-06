package com.stripe.android.paymentsheet.paymentdatacollection;

import java.lang.System;

/**
 * Fragment that displays a form for payment data collection based on the [SupportedPaymentMethod]
 * received in the arguments bundle.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0017J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR)\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ComposeFormDataCollectionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "formLayout", "Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "getFormLayout", "()Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "formLayout$delegate", "Lkotlin/Lazy;", "formViewModel", "Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "getFormViewModel", "()Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "formViewModel$delegate", "paramKeySpec", "", "", "", "getParamKeySpec", "()Ljava/util/Map;", "paramKeySpec$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setProcessing", "", "processing", "", "Companion", "paymentsheet_debug"})
public final class ComposeFormDataCollectionFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy formLayout$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy paramKeySpec$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy formViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_CONFIG = "com.stripe.android.paymentsheet.extra_config";
    
    public ComposeFormDataCollectionFragment() {
        super();
    }
    
    private final com.stripe.android.paymentsheet.elements.LayoutSpec getFormLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getParamKeySpec() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.forms.FormViewModel getFormViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @androidx.compose.animation.ExperimentalAnimationApi()
    @androidx.compose.ui.unit.ExperimentalUnitApi()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Informs the fragment whether PaymentSheet is in a processing state, so the fragment knows it
     * should show its UI as enabled or disabled.
     */
    public final void setProcessing(boolean processing) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/ComposeFormDataCollectionFragment$Companion;", "", "()V", "EXTRA_CONFIG", "", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
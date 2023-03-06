package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b \u0018\u0000 /2\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0015\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0019H\u0016J\u001a\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\'\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J&\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0,2\u0006\u0010-\u001a\u00020.H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/BaseAddPaymentMethodFragment;", "Landroidx/fragment/app/Fragment;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "addPaymentMethodHeader", "Landroid/widget/TextView;", "getAddPaymentMethodHeader", "()Landroid/widget/TextView;", "setAddPaymentMethodHeader", "(Landroid/widget/TextView;)V", "selectedPaymentMethod", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "sheetViewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getFragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPaymentMethodSelected", "paymentMethod", "onPaymentMethodSelected$paymentsheet_debug", "onSaveInstanceState", "outState", "onViewCreated", "view", "replacePaymentMethodFragment", "setupRecyclerView", "viewBinding", "Lcom/stripe/android/paymentsheet/databinding/FragmentPaymentsheetAddPaymentMethodBinding;", "paymentMethods", "", "selectedItemPosition", "", "Companion", "paymentsheet_debug"})
public abstract class BaseAddPaymentMethodFragment extends androidx.fragment.app.Fragment {
    private final com.stripe.android.paymentsheet.analytics.EventReporter eventReporter = null;
    protected android.widget.TextView addPaymentMethodHeader;
    private com.stripe.android.paymentsheet.model.SupportedPaymentMethod selectedPaymentMethod;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment.Companion Companion = null;
    private static final java.lang.String SELECTED_PAYMENT_METHOD = "selected_pm";
    private static final com.stripe.android.paymentsheet.paymentdatacollection.TransformToPaymentMethodCreateParams transformToPaymentMethodCreateParams = null;
    
    public BaseAddPaymentMethodFragment(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel<?> getSheetViewModel();
    
    @org.jetbrains.annotations.NotNull()
    protected final android.widget.TextView getAddPaymentMethodHeader() {
        return null;
    }
    
    protected final void setAddPaymentMethodHeader(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupRecyclerView(com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetAddPaymentMethodBinding viewBinding, java.util.List<? extends com.stripe.android.paymentsheet.model.SupportedPaymentMethod> paymentMethods, int selectedItemPosition) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void onPaymentMethodSelected$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void replacePaymentMethodFragment(com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod) {
    }
    
    private final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002JE\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u0017J7\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0001\u00a2\u0006\u0002\b\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/BaseAddPaymentMethodFragment$Companion;", "", "()V", "SELECTED_PAYMENT_METHOD", "", "transformToPaymentMethodCreateParams", "Lcom/stripe/android/paymentsheet/paymentdatacollection/TransformToPaymentMethodCreateParams;", "fragmentForPaymentMethod", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "paymentMethod", "Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethod;", "getFormArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "showPaymentMethod", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "merchantName", "amount", "Lcom/stripe/android/paymentsheet/model/Amount;", "injectorKey", "getFormArguments$paymentsheet_debug", "transformToPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;", "formFieldValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "paramKey", "", "selectedPaymentMethodResources", "transformToPaymentSelection$paymentsheet_debug", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.Class<? extends androidx.fragment.app.Fragment> fragmentForPaymentMethod(com.stripe.android.paymentsheet.model.SupportedPaymentMethod paymentMethod) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @androidx.annotation.VisibleForTesting()
        public final com.stripe.android.paymentsheet.model.PaymentSelection.New.GenericPaymentMethod transformToPaymentSelection$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.forms.FormFieldValues formFieldValues, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.lang.Object> paramKey, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.SupportedPaymentMethod selectedPaymentMethodResources) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @androidx.annotation.VisibleForTesting()
        public final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments getFormArguments$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.model.SupportedPaymentMethod showPaymentMethod, @org.jetbrains.annotations.NotNull()
        com.stripe.android.model.StripeIntent stripeIntent, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration config, @org.jetbrains.annotations.NotNull()
        java.lang.String merchantName, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.model.Amount amount, @org.jetbrains.annotations.NotNull()
        @com.stripe.android.payments.core.injection.InjectorKey()
        java.lang.String injectorKey) {
            return null;
        }
    }
}
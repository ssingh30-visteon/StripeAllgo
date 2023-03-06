package com.stripe.android.paymentsheet;

import java.lang.System;

@kotlin.jvm.JvmSuppressWildcards()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020-H\u0016J\u0006\u00101\u001a\u00020-J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0002J\u000e\u00106\u001a\u00020-2\u0006\u00107\u001a\u000208R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180&X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0014\u0010)\u001a\u00020\u001e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+\u00a8\u0006;"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "args", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "prefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "application", "Landroid/app/Application;", "logger", "Lcom/stripe/android/Logger;", "injectorKey", "", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lkotlin/coroutines/CoroutineContext;Landroid/app/Application;Lcom/stripe/android/Logger;Ljava/lang/String;)V", "_paymentOptionResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "get_paymentOptionResult$paymentsheet_debug$annotations", "()V", "get_paymentOptionResult$paymentsheet_debug", "()Landroidx/lifecycle/MutableLiveData;", "hasTransitionToUnsavedCard", "", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "setNewCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)V", "paymentOptionResult", "Landroidx/lifecycle/LiveData;", "getPaymentOptionResult$paymentsheet_debug", "()Landroidx/lifecycle/LiveData;", "shouldTransitionToUnsavedCard", "getShouldTransitionToUnsavedCard", "()Z", "onFatal", "", "throwable", "", "onUserCancel", "onUserSelection", "processExistingCard", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "processNewCard", "resolveTransitionTarget", "config", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "Factory", "TransitionTarget", "paymentsheet_debug"})
public final class PaymentOptionsViewModel extends com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel<com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.PaymentOptionResult> _paymentOptionResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.PaymentOptionResult> paymentOptionResult = null;
    @org.jetbrains.annotations.Nullable()
    private com.stripe.android.paymentsheet.model.PaymentSelection.New.Card newCard;
    private boolean hasTransitionToUnsavedCard = false;
    
    @javax.inject.Inject()
    public PaymentOptionsViewModel(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.PaymentOptionContract.Args args, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration, com.stripe.android.paymentsheet.PrefsRepository> prefsRepositoryFactory, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.analytics.EventReporter eventReporter, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.repositories.CustomerRepository customerRepository, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.IOContext()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.stripe.android.Logger logger, @org.jetbrains.annotations.NotNull()
    @com.stripe.android.payments.core.injection.InjectorKey()
    java.lang.String injectorKey) {
        super(null, null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.stripe.android.paymentsheet.PaymentOptionResult> get_paymentOptionResult$paymentsheet_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void get_paymentOptionResult$paymentsheet_debug$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.stripe.android.paymentsheet.PaymentOptionResult> getPaymentOptionResult$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.model.PaymentSelection.New.Card getNewCard() {
        return null;
    }
    
    @java.lang.Override()
    public void setNewCard(@org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.model.PaymentSelection.New.Card p0) {
    }
    
    private final boolean getShouldTransitionToUnsavedCard() {
        return false;
    }
    
    @java.lang.Override()
    public void onFatal(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void onUserCancel() {
    }
    
    public final void onUserSelection() {
    }
    
    private final void processExistingCard(com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    private final void processNewCard(com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
    }
    
    public final void resolveTransitionTarget(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.FragmentConfig config) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "", "()V", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "AddPaymentMethodFull", "AddPaymentMethodSheet", "SelectSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodSheet;", "paymentsheet_debug"})
    public static abstract class TransitionTarget {
        
        private TransitionTarget() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig();
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class SelectSavedPaymentMethod extends com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget.SelectSavedPaymentMethod copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public SelectSavedPaymentMethod(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.FragmentConfig component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class AddPaymentMethodFull extends com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodFull copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public AddPaymentMethodFull(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.FragmentConfig component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodSheet;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "fragmentConfig", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class AddPaymentMethodSheet extends com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodSheet copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public AddPaymentMethodSheet(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.model.FragmentConfig fragmentConfig) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.model.FragmentConfig component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.paymentsheet.model.FragmentConfig getFragmentConfig() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u00a2\u0006\u0002\u0010\tJ\'\u0010\u0011\u001a\u0002H\u0012\"\n\b\u0000\u0010\u0012*\u0004\u0018\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/payments/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory$FallbackInitializeParam;", "applicationSupplier", "Lkotlin/Function0;", "Landroid/app/Application;", "starterArgsSupplier", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "subComponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/PaymentOptionsViewModelSubcomponent$Builder;", "getSubComponentBuilderProvider", "()Ljavax/inject/Provider;", "setSubComponentBuilderProvider", "(Ljavax/inject/Provider;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "fallbackInitialize", "", "arg", "FallbackInitializeParam", "paymentsheet_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory, com.stripe.android.payments.core.injection.Injectable<com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.FallbackInitializeParam> {
        private final kotlin.jvm.functions.Function0<android.app.Application> applicationSupplier = null;
        private final kotlin.jvm.functions.Function0<com.stripe.android.paymentsheet.PaymentOptionContract.Args> starterArgsSupplier = null;
        @javax.inject.Inject()
        public javax.inject.Provider<com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder> subComponentBuilderProvider;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<android.app.Application> applicationSupplier, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<com.stripe.android.paymentsheet.PaymentOptionContract.Args> starterArgsSupplier) {
            super();
        }
        
        @java.lang.Override()
        public void fallbackInitialize(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.FallbackInitializeParam arg) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final javax.inject.Provider<com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            return null;
        }
        
        public final void setSubComponentBuilderProvider(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.stripe.android.paymentsheet.injection.PaymentOptionsViewModelSubcomponent.Builder> p0) {
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "productUsage", "", "", "(Landroid/app/Application;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getProductUsage", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "paymentsheet_debug"})
        public static final class FallbackInitializeParam {
            @org.jetbrains.annotations.NotNull()
            private final android.app.Application application = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.Set<java.lang.String> productUsage = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.PaymentOptionsViewModel.Factory.FallbackInitializeParam copy(@org.jetbrains.annotations.NotNull()
            android.app.Application application, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public FallbackInitializeParam(@org.jetbrains.annotations.NotNull()
            android.app.Application application, @org.jetbrains.annotations.NotNull()
            java.util.Set<java.lang.String> productUsage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.Application component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.Application getApplication() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.Set<java.lang.String> getProductUsage() {
                return null;
            }
        }
    }
}
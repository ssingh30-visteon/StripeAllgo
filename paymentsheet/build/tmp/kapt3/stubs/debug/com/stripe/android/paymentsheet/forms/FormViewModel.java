package com.stripe.android.paymentsheet.forms;

import java.lang.System;

/**
 * This class stores the visual field layout for the [Form] and then sets up the controller
 * for all the fields on screen.  When all fields are reported as complete, the completedFieldValues
 * holds the resulting values for each field.
 *
 * @param: layout - this contains the visual layout of the fields on the screen used by [Form]
 * to display the UI fields on screen.  It also informs us of the backing fields to be created.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u00014B\'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b-J\u0015\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b0J\u0015\u00101\u001a\u00020,2\u0006\u00102\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\b3R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u0015\u0010!\u001a\t\u0018\u00010\"\u00a2\u0006\u0002\b#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00190\fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "Landroidx/lifecycle/ViewModel;", "layout", "Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "config", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "resourceRepository", "Lcom/stripe/android/paymentsheet/elements/ResourceRepository;", "transformSpecToElement", "Lcom/stripe/android/paymentsheet/forms/TransformSpecToElement;", "(Lcom/stripe/android/paymentsheet/elements/LayoutSpec;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;Lcom/stripe/android/paymentsheet/elements/ResourceRepository;Lcom/stripe/android/paymentsheet/forms/TransformSpecToElement;)V", "completeFormValues", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "getCompleteFormValues", "()Lkotlinx/coroutines/flow/Flow;", "elements", "", "Lcom/stripe/android/paymentsheet/elements/FormElement;", "getElements$paymentsheet_debug", "()Ljava/util/List;", "setElements$paymentsheet_debug", "(Ljava/util/List;)V", "enabled", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getEnabled$paymentsheet_debug", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "hiddenIdentifiers", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getHiddenIdentifiers$paymentsheet_debug", "saveForFutureUse", "getSaveForFutureUse$paymentsheet_debug", "saveForFutureUseElement", "Lcom/stripe/android/paymentsheet/elements/SaveForFutureUseElement;", "Lkotlin/internal/NoInfer;", "saveForFutureUseVisible", "sectionToFieldIdentifierMap", "", "showingMandate", "getShowingMandate$paymentsheet_debug", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "setEnabled", "", "setEnabled$paymentsheet_debug", "setSaveForFutureUse", "value", "setSaveForFutureUse$paymentsheet_debug", "setSaveForFutureUseVisibility", "isVisible", "setSaveForFutureUseVisibility$paymentsheet_debug", "Factory", "paymentsheet_debug"})
public final class FormViewModel extends androidx.lifecycle.ViewModel {
    private final com.stripe.android.paymentsheet.forms.TransformSpecToElement transformSpecToElement = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> enabled = null;
    public java.util.List<? extends com.stripe.android.paymentsheet.elements.FormElement> elements;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> saveForFutureUseVisible = null;
    private final com.stripe.android.paymentsheet.elements.SaveForFutureUseElement saveForFutureUseElement = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> saveForFutureUse = null;
    private final java.util.Map<com.stripe.android.paymentsheet.elements.IdentifierSpec, java.util.List<com.stripe.android.paymentsheet.elements.IdentifierSpec>> sectionToFieldIdentifierMap = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.IdentifierSpec>> hiddenIdentifiers = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> showingMandate = null;
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave> userRequestedReuse = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldValues> completeFormValues = null;
    
    @javax.inject.Inject()
    public FormViewModel(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.LayoutSpec layout, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments config, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.ResourceRepository resourceRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.forms.TransformSpecToElement transformSpecToElement) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getEnabled$paymentsheet_debug() {
        return null;
    }
    
    public final void setEnabled$paymentsheet_debug(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.FormElement> getElements$paymentsheet_debug() {
        return null;
    }
    
    public final void setElements$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.FormElement> p0) {
    }
    
    public final void setSaveForFutureUseVisibility$paymentsheet_debug(boolean isVisible) {
    }
    
    public final void setSaveForFutureUse$paymentsheet_debug(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getSaveForFutureUse$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.stripe.android.paymentsheet.elements.IdentifierSpec>> getHiddenIdentifiers$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getShowingMandate$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.stripe.android.paymentsheet.forms.FormFieldValues> getCompleteFormValues() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001#B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\u001a\u001a\u0002H\u001b\"\n\b\u0000\u0010\u001b*\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/payments/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory$FallbackInitializeParam;", "config", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "resource", "Landroid/content/res/Resources;", "layout", "Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;Landroid/content/res/Resources;Lcom/stripe/android/paymentsheet/elements/LayoutSpec;)V", "getConfig", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormFragmentArguments;", "getLayout", "()Lcom/stripe/android/paymentsheet/elements/LayoutSpec;", "setLayout", "(Lcom/stripe/android/paymentsheet/elements/LayoutSpec;)V", "getResource", "()Landroid/content/res/Resources;", "subComponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/FormViewModelSubcomponent$Builder;", "getSubComponentBuilderProvider", "()Ljavax/inject/Provider;", "setSubComponentBuilderProvider", "(Ljavax/inject/Provider;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "fallbackInitialize", "", "arg", "FallbackInitializeParam", "paymentsheet_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory, com.stripe.android.payments.core.injection.Injectable<com.stripe.android.paymentsheet.forms.FormViewModel.Factory.FallbackInitializeParam> {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments config = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.res.Resources resource = null;
        @org.jetbrains.annotations.NotNull()
        private com.stripe.android.paymentsheet.elements.LayoutSpec layout;
        @javax.inject.Inject()
        public javax.inject.Provider<com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder> subComponentBuilderProvider;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments config, @org.jetbrains.annotations.NotNull()
        android.content.res.Resources resource, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.elements.LayoutSpec layout) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments getConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.res.Resources getResource() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.elements.LayoutSpec getLayout() {
            return null;
        }
        
        public final void setLayout(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.elements.LayoutSpec p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final javax.inject.Provider<com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            return null;
        }
        
        public final void setSubComponentBuilderProvider(@org.jetbrains.annotations.NotNull()
        javax.inject.Provider<com.stripe.android.paymentsheet.injection.FormViewModelSubcomponent.Builder> p0) {
        }
        
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
        
        @java.lang.Override()
        public void fallbackInitialize(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.forms.FormViewModel.Factory.FallbackInitializeParam arg) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory$FallbackInitializeParam;", "", "resource", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "getResource", "()Landroid/content/res/Resources;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class FallbackInitializeParam {
            @org.jetbrains.annotations.NotNull()
            private final android.content.res.Resources resource = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.forms.FormViewModel.Factory.FallbackInitializeParam copy(@org.jetbrains.annotations.NotNull()
            android.content.res.Resources resource) {
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
            android.content.res.Resources resource) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.content.res.Resources component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.content.res.Resources getResource() {
                return null;
            }
        }
    }
}
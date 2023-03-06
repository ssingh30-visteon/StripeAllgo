package com.stripe.android.paymentsheet.paymentdatacollection;

import java.lang.System;

/**
 * A [Fragment] for collecting data for a new card payment method.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0001:B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020#H\u0002J\u001a\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020#H\u0002J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020#H\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020#H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment;", "ViewModelType", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Landroidx/fragment/app/Fragment;", "viewModelClass", "Ljava/lang/Class;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Ljava/lang/Class;Landroidx/lifecycle/ViewModelProvider$Factory;)V", "addCardViewModel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment$AddCardViewModel;", "getAddCardViewModel", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment$AddCardViewModel;", "addCardViewModel$delegate", "Lkotlin/Lazy;", "billingAddressView", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView;", "billingErrors", "Landroid/widget/TextView;", "bottomSpace", "Landroid/widget/Space;", "cardErrors", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "paymentMethodParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "saveCardCheckbox", "Landroid/widget/CheckBox;", "sheetViewModel", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel$delegate", "onCardError", "", "field", "Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment$AddCardViewModel$Field;", "errorMessage", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveCardCheckboxChanged", "onViewCreated", "view", "populateFieldsFromArguments", "populateFieldsFromNewCard", "setupCardWidget", "setupSaveCardCheckbox", "shouldSaveCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "updateSelection", "AddCardViewModel", "paymentsheet_debug"})
public final class CardDataCollectionFragment<ViewModelType extends com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel<?>> extends androidx.fragment.app.Fragment {
    private final java.lang.Class<ViewModelType> viewModelClass = null;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy sheetViewModel$delegate = null;
    private com.stripe.android.view.CardMultilineWidget cardMultilineWidget;
    private com.stripe.android.paymentsheet.ui.BillingAddressView billingAddressView;
    private android.widget.TextView cardErrors;
    private android.widget.TextView billingErrors;
    private android.widget.CheckBox saveCardCheckbox;
    private android.widget.Space bottomSpace;
    private final kotlin.Lazy addCardViewModel$delegate = null;
    
    public CardDataCollectionFragment(@org.jetbrains.annotations.NotNull()
    java.lang.Class<ViewModelType> viewModelClass, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory viewModelFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ViewModelType getSheetViewModel() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodParams() {
        return null;
    }
    
    private final com.stripe.android.paymentsheet.paymentdatacollection.CardDataCollectionFragment.AddCardViewModel getAddCardViewModel() {
        return null;
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
    
    private final void updateSelection() {
    }
    
    private final void setupCardWidget() {
    }
    
    private final void populateFieldsFromNewCard() {
    }
    
    private final void populateFieldsFromArguments() {
    }
    
    private final void onCardError(com.stripe.android.paymentsheet.paymentdatacollection.CardDataCollectionFragment.AddCardViewModel.Field field, java.lang.String errorMessage) {
    }
    
    private final void setupSaveCardCheckbox() {
    }
    
    private final void onSaveCardCheckboxChanged() {
    }
    
    private final com.stripe.android.paymentsheet.model.PaymentSelection.CustomerRequestedSave shouldSaveCard() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment$AddCardViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cardErrors", "", "Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment$AddCardViewModel$Field;", "", "getCardErrors", "()Ljava/util/Map;", "isCardValid", "", "()Z", "setCardValid", "(Z)V", "Field", "paymentsheet_debug"})
    public static final class AddCardViewModel extends androidx.lifecycle.ViewModel {
        private boolean isCardValid = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<com.stripe.android.paymentsheet.paymentdatacollection.CardDataCollectionFragment.AddCardViewModel.Field, java.lang.String> cardErrors = null;
        
        public AddCardViewModel() {
            super();
        }
        
        public final boolean isCardValid() {
            return false;
        }
        
        public final void setCardValid(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<com.stripe.android.paymentsheet.paymentdatacollection.CardDataCollectionFragment.AddCardViewModel.Field, java.lang.String> getCardErrors() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/CardDataCollectionFragment$AddCardViewModel$Field;", "", "(Ljava/lang/String;I)V", "Number", "Date", "Cvc", "paymentsheet_debug"})
        public static enum Field {
            /*public static final*/ Number /* = new Number() */,
            /*public static final*/ Date /* = new Date() */,
            /*public static final*/ Cvc /* = new Cvc() */;
            
            Field() {
            }
        }
    }
}
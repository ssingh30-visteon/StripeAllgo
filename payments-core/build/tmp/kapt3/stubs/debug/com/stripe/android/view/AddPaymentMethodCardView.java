package com.stripe.android.view;

import java.lang.System;

/**
 * View for adding a payment method of type [PaymentMethod.Type.Card].
 *
 * See [AddPaymentMethodActivity] for usage.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodCardView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/stripe/android/view/BillingAddressFields;)V", "billingAddressWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "billingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "initEnterListeners", "", "activity", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "setCommunicatingProgress", "communicating", "", "OnEditorActionListenerImpl", "payments-core_debug"})
public final class AddPaymentMethodCardView extends com.stripe.android.view.AddPaymentMethodView {
    private final com.stripe.android.view.BillingAddressFields billingAddressFields = null;
    private final com.stripe.android.view.CardMultilineWidget cardMultilineWidget = null;
    private final com.stripe.android.view.ShippingInfoWidget billingAddressWidget = null;
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public AddPaymentMethodCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull()
    com.stripe.android.view.BillingAddressFields billingAddressFields) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.model.PaymentMethodCreateParams getCreateParams() {
        return null;
    }
    
    private final com.stripe.android.model.PaymentMethod.BillingDetails getBillingDetails() {
        return null;
    }
    
    private final void initEnterListeners(com.stripe.android.view.AddPaymentMethodActivity activity) {
    }
    
    @java.lang.Override()
    public void setCommunicatingProgress(boolean communicating) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodCardView$OnEditorActionListenerImpl;", "Landroid/widget/TextView$OnEditorActionListener;", "activity", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "addPaymentMethodCardView", "Lcom/stripe/android/view/AddPaymentMethodCardView;", "keyboardController", "Lcom/stripe/android/view/KeyboardController;", "(Lcom/stripe/android/view/AddPaymentMethodActivity;Lcom/stripe/android/view/AddPaymentMethodCardView;Lcom/stripe/android/view/KeyboardController;)V", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "payments-core_debug"})
    public static final class OnEditorActionListenerImpl implements android.widget.TextView.OnEditorActionListener {
        private final com.stripe.android.view.AddPaymentMethodActivity activity = null;
        private final com.stripe.android.view.AddPaymentMethodCardView addPaymentMethodCardView = null;
        private final com.stripe.android.view.KeyboardController keyboardController = null;
        
        public OnEditorActionListenerImpl(@org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AddPaymentMethodActivity activity, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.AddPaymentMethodCardView addPaymentMethodCardView, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.KeyboardController keyboardController) {
            super();
        }
        
        @java.lang.Override()
        public boolean onEditorAction(@org.jetbrains.annotations.Nullable()
        android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable()
        android.view.KeyEvent event) {
            return false;
        }
    }
}
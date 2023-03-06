package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/SwipeToDeleteCallbackListener;", "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "deletePaymentMethodDialogFactory", "Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;)V", "onSwiped", "", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "payments-core_debug"})
public final class SwipeToDeleteCallbackListener implements com.stripe.android.view.PaymentMethodSwipeCallback.Listener {
    private final com.stripe.android.view.DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory = null;
    
    public SwipeToDeleteCallbackListener(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory) {
        super();
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.PaymentMethod paymentMethod) {
    }
}
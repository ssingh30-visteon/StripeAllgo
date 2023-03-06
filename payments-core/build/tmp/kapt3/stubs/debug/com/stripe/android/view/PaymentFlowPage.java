package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPage;", "", "titleResId", "", "(Ljava/lang/String;II)V", "getTitleResId", "()I", "ShippingInfo", "ShippingMethod", "payments-core_debug"})
public enum PaymentFlowPage {
    /*public static final*/ ShippingInfo /* = new ShippingInfo(0) */,
    /*public static final*/ ShippingMethod /* = new ShippingMethod(0) */;
    @androidx.annotation.StringRes()
    private final int titleResId = 0;
    
    PaymentFlowPage(@androidx.annotation.StringRes()
    int titleResId) {
    }
    
    @androidx.annotation.StringRes()
    public final int getTitleResId() {
        return 0;
    }
}
package com.stripe.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\n"}, d2 = {"REFRESHABLE_PAYMENT_METHODS", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "getREFRESHABLE_PAYMENT_METHODS", "()Ljava/util/Set;", "getRequestCode", "", "Lcom/stripe/android/model/StripeIntent;", "shouldRefresh", "", "payments-core_debug"})
public final class StripeIntentKtxKt {
    
    /**
     * A set of PMs that don't transfer the PI status immediately after confirmation, needs to poll
     * the refresh endpoint until the PI status transfers out of "requires_action".
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<com.stripe.android.model.PaymentMethod.Type> REFRESHABLE_PAYMENT_METHODS = null;
    
    public static final int getRequestCode(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent $this$getRequestCode) {
        return 0;
    }
    
    /**
     * Check if this [StripeIntent] needs to be refreshed until it moves out "requires_action" state.
     */
    public static final boolean shouldRefresh(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.StripeIntent $this$shouldRefresh) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.Set<com.stripe.android.model.PaymentMethod.Type> getREFRESHABLE_PAYMENT_METHODS() {
        return null;
    }
}
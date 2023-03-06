package com.stripe.android.model;

import java.lang.System;

/**
 * Model for a Stripe API object creation parameters
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "toParamMap", "", "", "", "payments-core_debug"})
public abstract interface StripeParamsModel extends android.os.Parcelable {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.Object> toParamMap();
}
package com.stripe.android;

import java.lang.System;

/**
 * Represents a listener for Ephemeral Key Update events.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/EphemeralKeyUpdateListener;", "", "onKeyUpdate", "", "stripeResponseJson", "", "onKeyUpdateFailure", "responseCode", "", "message", "payments-core_debug"})
public abstract interface EphemeralKeyUpdateListener {
    
    /**
     * Called when a key update request from your server comes back successfully.
     *
     * @param stripeResponseJson the raw JSON String returned from Stripe's servers
     */
    public abstract void onKeyUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String stripeResponseJson);
    
    /**
     * Called when a key update request from your server comes back with an error.
     *
     * @param responseCode the error code returned from Stripe's servers
     * @param message the error message returned from Stripe's servers
     */
    public abstract void onKeyUpdateFailure(int responseCode, @org.jetbrains.annotations.NotNull()
    java.lang.String message);
}
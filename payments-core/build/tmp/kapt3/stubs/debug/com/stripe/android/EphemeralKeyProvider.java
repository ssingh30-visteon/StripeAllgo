package com.stripe.android;

import java.lang.System;

/**
 * Represents an object that can call to a server and create
 * [EphemeralKeys][EphemeralKey].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/EphemeralKeyProvider;", "", "createEphemeralKey", "", "apiVersion", "", "keyUpdateListener", "Lcom/stripe/android/EphemeralKeyUpdateListener;", "payments-core_debug"})
public abstract interface EphemeralKeyProvider {
    
    /**
     * When called, talks to a client server that then communicates with Stripe's servers to
     * create an [EphemeralKey].
     *
     * @param apiVersion the Stripe API Version being used
     * @param keyUpdateListener a callback object to notify about results
     */
    public abstract void createEphemeralKey(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.Size(min = 4L)
    java.lang.String apiVersion, @org.jetbrains.annotations.NotNull()
    com.stripe.android.EphemeralKeyUpdateListener keyUpdateListener);
}
package com.stripe.android.core.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"HTTP_TOO_MANY_REQUESTS", "", "payments-core_debug"})
public final class NetworkConstantsKt {
    
    /**
     * If the SDK receives a "Too Many Requests" (429) status code from Stripe,
     * it will automatically retry the request using exponential backoff.
     *
     * See https://stripe.com/docs/rate-limits for more information.
     */
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
}
package com.stripe.android;

import java.lang.System;

/**
 * Interface for handling [PaymentIntent] authentication with the Alipay SDK
 * @see <a href="https://intl.alipay.com/docs/ac/app/sdk_integration">Alipay Documentation</a>
 *
 * To authenticate using the Alipay SDK, pass the data String to PayTask#payV2
 * <pre>
 * new AlipayAuthenticator() {
 * @NotNull
 * @Override
 * Map<String, String> onAuthenticationRequest(@NotNull String data) {
 *     return new PayTask(this).payV2(data, true)
 * }
 * }
 * </pre>
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/AlipayAuthenticator;", "", "onAuthenticationRequest", "", "", "data", "payments-core_debug"})
public abstract interface AlipayAuthenticator {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    public abstract java.util.Map<java.lang.String, java.lang.String> onAuthenticationRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String data);
}
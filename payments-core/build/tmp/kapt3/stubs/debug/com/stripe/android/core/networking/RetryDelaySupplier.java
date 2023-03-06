package com.stripe.android.core.networking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0017\u00a2\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/core/networking/RetryDelaySupplier;", "", "()V", "incrementSeconds", "", "(J)V", "getDelayMillis", "maxRetries", "", "remainingRetries", "Companion", "payments-core_debug"})
@javax.inject.Singleton()
public final class RetryDelaySupplier {
    private final long incrementSeconds = 0L;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.core.networking.RetryDelaySupplier.Companion Companion = null;
    @java.lang.Deprecated()
    private static final long DEFAULT_INCREMENT_SECONDS = 2L;
    
    public RetryDelaySupplier(long incrementSeconds) {
        super();
    }
    
    @javax.inject.Inject()
    public RetryDelaySupplier() {
        super();
    }
    
    /**
     * Calculate an exponential backoff delay before retrying the next completion request
     * using the equation:
     * ```
     * incrementSeconds ^ ((maxRetries - remainingRetries) + 1)
     * ```
     *
     * For example, if [maxRetries] is 3:
     * - Delay 2 seconds before the first retry
     * - Delay 4 seconds before the second retry
     * - Delay 8 seconds before the third retry
     */
    public final long getDelayMillis(int maxRetries, int remainingRetries) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/core/networking/RetryDelaySupplier$Companion;", "", "()V", "DEFAULT_INCREMENT_SECONDS", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
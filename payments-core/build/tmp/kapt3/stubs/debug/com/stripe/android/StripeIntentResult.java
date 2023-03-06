package com.stripe.android;

import java.lang.System;

/**
 * A model representing the result of a [StripeIntent] confirmation or authentication attempt
 * via [Stripe.confirmPayment] or [Stripe.handleNextActionForPayment]
 *
 * [intent] is a [StripeIntent] retrieved after confirmation/authentication succeeded or failed.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003:\u0001\u0016B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00058F\u00a2\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/StripeIntentResult;", "T", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/model/StripeModel;", "outcomeFromFlow", "", "(I)V", "failureMessage", "", "getFailureMessage", "()Ljava/lang/String;", "intent", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "outcome", "getOutcome$annotations", "()V", "getOutcome", "()I", "determineOutcome", "stripeIntentStatus", "Lcom/stripe/android/model/StripeIntent$Status;", "Outcome", "payments-core_debug"})
public abstract class StripeIntentResult<T extends com.stripe.android.model.StripeIntent> implements com.stripe.android.model.StripeModel {
    private final int outcomeFromFlow = 0;
    
    public StripeIntentResult(@com.stripe.android.StripeIntentResult.Outcome()
    int outcomeFromFlow) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract T getIntent();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getFailureMessage();
    
    @com.stripe.android.StripeIntentResult.Outcome()
    @java.lang.Deprecated()
    public static void getOutcome$annotations() {
    }
    
    @com.stripe.android.StripeIntentResult.Outcome()
    public final int getOutcome() {
        return 0;
    }
    
    @com.stripe.android.StripeIntentResult.Outcome()
    private final int determineOutcome(com.stripe.android.model.StripeIntent.Status stripeIntentStatus, @com.stripe.android.StripeIntentResult.Outcome()
    int outcome) {
        return 0;
    }
    
    /**
     * Values that indicate the outcome of confirmation and payment authentication.
     */
    @androidx.annotation.IntDef(value = {0, 1, 2, 3, 4})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/StripeIntentResult$Outcome;", "", "Companion", "payments-core_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface Outcome {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.StripeIntentResult.Outcome.Companion Companion = null;
        public static final int UNKNOWN = 0;
        
        /**
         * Confirmation or payment authentication succeeded
         */
        public static final int SUCCEEDED = 1;
        
        /**
         * Confirm or payment authentication failed
         */
        public static final int FAILED = 2;
        
        /**
         * Payment authentication was canceled by the user
         */
        public static final int CANCELED = 3;
        
        /**
         * Payment authentication timed-out
         */
        public static final int TIMEDOUT = 4;
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/StripeIntentResult$Outcome$Companion;", "", "()V", "CANCELED", "", "FAILED", "SUCCEEDED", "TIMEDOUT", "UNKNOWN", "payments-core_debug"})
        public static final class Companion {
            public static final int UNKNOWN = 0;
            
            /**
             * Confirmation or payment authentication succeeded
             */
            public static final int SUCCEEDED = 1;
            
            /**
             * Confirm or payment authentication failed
             */
            public static final int FAILED = 2;
            
            /**
             * Payment authentication was canceled by the user
             */
            public static final int CANCELED = 3;
            
            /**
             * Payment authentication timed-out
             */
            public static final int TIMEDOUT = 4;
            
            private Companion() {
                super();
            }
        }
    }
}
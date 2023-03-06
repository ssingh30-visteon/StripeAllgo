package com.stripe.android.payments.core.authentication.threeds2;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "", "()V", "Complete", "StartChallenge", "StartFallback", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "payments-core_debug"})
public abstract class NextStep {
    
    private NextStep() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartChallenge;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "args", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;)V", "getArgs", "()Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_debug"})
    public static final class StartChallenge extends com.stripe.android.payments.core.authentication.threeds2.NextStep {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.stripe3ds2.transaction.InitChallengeArgs args = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.core.authentication.threeds2.NextStep.StartChallenge copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.transaction.InitChallengeArgs args) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StartChallenge(@org.jetbrains.annotations.NotNull()
        com.stripe.android.stripe3ds2.transaction.InitChallengeArgs args) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.transaction.InitChallengeArgs component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.stripe3ds2.transaction.InitChallengeArgs getArgs() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$StartFallback;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "getArgs", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_debug"})
    public static final class StartFallback extends com.stripe.android.payments.core.authentication.threeds2.NextStep {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.auth.PaymentBrowserAuthContract.Args args = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.core.authentication.threeds2.NextStep.StartFallback copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.auth.PaymentBrowserAuthContract.Args args) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StartFallback(@org.jetbrains.annotations.NotNull()
        com.stripe.android.auth.PaymentBrowserAuthContract.Args args) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.auth.PaymentBrowserAuthContract.Args component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.auth.PaymentBrowserAuthContract.Args getArgs() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/NextStep$Complete;", "Lcom/stripe/android/payments/core/authentication/threeds2/NextStep;", "result", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "getResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "payments-core_debug"})
    public static final class Complete extends com.stripe.android.payments.core.authentication.threeds2.NextStep {
        @org.jetbrains.annotations.NotNull()
        private final com.stripe.android.payments.PaymentFlowResult.Unvalidated result = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.core.authentication.threeds2.NextStep.Complete copy(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.PaymentFlowResult.Unvalidated result) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Complete(@org.jetbrains.annotations.NotNull()
        com.stripe.android.payments.PaymentFlowResult.Unvalidated result) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.PaymentFlowResult.Unvalidated component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.payments.PaymentFlowResult.Unvalidated getResult() {
            return null;
        }
    }
}
package com.stripe.android.paymentsheet.flowcontroller;

import java.lang.System;

/**
 * An interface for a class that can initialize a [PaymentSheet.FlowController].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "", "init", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "clientSecret", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "paymentSheetConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InitResult", "paymentsheet_debug"})
public abstract interface FlowControllerInitializer {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object init(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.ClientSecret clientSecret, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.PaymentSheet.Configuration paymentSheetConfiguration, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "", "()V", "Failure", "Success", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Success;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Failure;", "paymentsheet_debug"})
    public static abstract class InitResult {
        
        private InitResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Success;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "initData", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "(Lcom/stripe/android/paymentsheet/flowcontroller/InitData;)V", "getInitData", "()Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
        public static final class Success extends com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult {
            @org.jetbrains.annotations.NotNull()
            private final com.stripe.android.paymentsheet.flowcontroller.InitData initData = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult.Success copy(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.flowcontroller.InitData initData) {
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
            
            public Success(@org.jetbrains.annotations.NotNull()
            com.stripe.android.paymentsheet.flowcontroller.InitData initData) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.flowcontroller.InitData component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.paymentsheet.flowcontroller.InitData getInitData() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Failure;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "paymentsheet_debug"})
        public static final class Failure extends com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            public Failure(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
    }
    
    /**
     * An interface for a class that can initialize a [PaymentSheet.FlowController].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}
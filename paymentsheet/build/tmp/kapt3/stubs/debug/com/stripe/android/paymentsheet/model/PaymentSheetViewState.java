package com.stripe.android.paymentsheet.model;

import java.lang.System;

/**
 * This will show the state of the [PaymentSheetActivity] as it does work.  The states always
 * progress as follows: Ready -> StartProcessing -> FinishProcessing -> ProcessResult
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "", "errorMessage", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "getErrorMessage", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "FinishProcessing", "Reset", "StartProcessing", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "paymentsheet_debug"})
public abstract class PaymentSheetViewState {
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage errorMessage = null;
    
    private PaymentSheetViewState(com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage errorMessage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage getErrorMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c2\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "message", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
    public static final class Reset extends com.stripe.android.paymentsheet.model.PaymentSheetViewState {
        private final com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.model.PaymentSheetViewState.Reset copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage message) {
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
        
        public Reset() {
            super(null);
        }
        
        public Reset(@org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage message) {
            super(null);
        }
        
        private final com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel.UserErrorMessage component1() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "()V", "paymentsheet_debug"})
    public static final class StartProcessing extends com.stripe.android.paymentsheet.model.PaymentSheetViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.model.PaymentSheetViewState.StartProcessing INSTANCE = null;
        
        private StartProcessing() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "onComplete", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "paymentsheet_debug"})
    public static final class FinishProcessing extends com.stripe.android.paymentsheet.model.PaymentSheetViewState {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onComplete = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.model.PaymentSheetViewState.FinishProcessing copy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
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
        
        public FinishProcessing(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnComplete() {
            return null;
        }
    }
}
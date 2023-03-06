package com.stripe.android.paymentsheet.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \n2\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "event", "", "getEvent", "()Ljava/lang/String;", "toString", "Companion", "Dismiss", "Init", "Payment", "SelectPaymentOption", "ShowExistingPaymentOptions", "ShowNewPaymentOptionForm", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "paymentsheet_debug"})
public abstract class PaymentSheetEvent {
    private final com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Companion Companion = null;
    
    private PaymentSheetEvent(com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEvent();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "event", "", "getEvent", "()Ljava/lang/String;", "paymentsheet_debug"})
    public static final class Init extends com.stripe.android.paymentsheet.analytics.PaymentSheetEvent {
        private final com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration = null;
        
        public Init(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.PaymentSheet.Configuration configuration) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getEvent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "event", "", "getEvent", "()Ljava/lang/String;", "paymentsheet_debug"})
    public static final class Dismiss extends com.stripe.android.paymentsheet.analytics.PaymentSheetEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String event = "dismiss";
        
        public Dismiss(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getEvent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "event", "", "getEvent", "()Ljava/lang/String;", "paymentsheet_debug"})
    public static final class ShowNewPaymentOptionForm extends com.stripe.android.paymentsheet.analytics.PaymentSheetEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String event = "sheet_newpm_show";
        
        public ShowNewPaymentOptionForm(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getEvent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "event", "", "getEvent", "()Ljava/lang/String;", "paymentsheet_debug"})
    public static final class ShowExistingPaymentOptions extends com.stripe.android.paymentsheet.analytics.PaymentSheetEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String event = "sheet_savedpm_show";
        
        public ShowExistingPaymentOptions(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getEvent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "event", "", "getEvent", "()Ljava/lang/String;", "paymentsheet_debug"})
    public static final class SelectPaymentOption extends com.stripe.android.paymentsheet.analytics.PaymentSheetEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String event = null;
        
        public SelectPaymentOption(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getEvent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "result", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "event", "", "getEvent", "()Ljava/lang/String;", "Result", "paymentsheet_debug"})
    public static final class Payment extends com.stripe.android.paymentsheet.analytics.PaymentSheetEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String event = null;
        
        public Payment(@org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.EventReporter.Mode mode, @org.jetbrains.annotations.NotNull()
        com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Payment.Result result, @org.jetbrains.annotations.Nullable()
        com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getEvent() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "Success", "Failure", "paymentsheet_debug"})
        public static enum Result {
            /*public static final*/ Success /* = new Success(null) */,
            /*public static final*/ Failure /* = new Failure(null) */;
            private final java.lang.String code = null;
            
            Result(java.lang.String code) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;", "", "()V", "analyticsValue", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.lang.String analyticsValue(com.stripe.android.paymentsheet.model.PaymentSelection paymentSelection) {
            return null;
        }
    }
}
package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/AlertDisplayer;", "", "show", "", "message", "", "DefaultAlertDisplayer", "payments-core_debug"})
public abstract interface AlertDisplayer {
    
    public abstract void show(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/view/AlertDisplayer$DefaultAlertDisplayer;", "Lcom/stripe/android/view/AlertDisplayer;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "show", "", "message", "", "payments-core_debug"})
    public static final class DefaultAlertDisplayer implements com.stripe.android.view.AlertDisplayer {
        private final android.app.Activity activity = null;
        
        public DefaultAlertDisplayer(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
        
        @java.lang.Override()
        public void show(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
}
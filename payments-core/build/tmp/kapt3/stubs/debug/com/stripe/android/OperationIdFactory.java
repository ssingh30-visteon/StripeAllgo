package com.stripe.android;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00e0\u0080\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/OperationIdFactory;", "", "create", "", "Companion", "payments-core_debug"})
public abstract interface OperationIdFactory {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.OperationIdFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String create();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/OperationIdFactory$Companion;", "", "()V", "get", "Lcom/stripe/android/OperationIdFactory;", "get$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
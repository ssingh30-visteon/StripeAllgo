package com.stripe.android.googlepaylauncher;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "", "value", "", "(Ljava/lang/String;II)V", "getValue$payments_core_debug", "()I", "Production", "Test", "payments-core_debug"})
public enum GooglePayEnvironment {
    /*public static final*/ Production /* = new Production(0) */,
    /*public static final*/ Test /* = new Test(0) */;
    private final int value = 0;
    
    GooglePayEnvironment(int value) {
    }
    
    public final int getValue$payments_core_debug() {
        return 0;
    }
}
package com.stripe.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2 = {"Lcom/stripe/android/model/CardFunding;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "Credit", "Debit", "Prepaid", "Unknown", "Companion", "payments-core_debug"})
public enum CardFunding {
    /*public static final*/ Credit /* = new Credit(null) */,
    /*public static final*/ Debit /* = new Debit(null) */,
    /*public static final*/ Prepaid /* = new Prepaid(null) */,
    /*public static final*/ Unknown /* = new Unknown(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.model.CardFunding.Companion Companion = null;
    
    CardFunding(java.lang.String code) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCode$payments_core_debug() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/model/CardFunding$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/CardFunding;", "code", "", "fromCode$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.CardFunding fromCode$payments_core_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String code) {
            return null;
        }
    }
}
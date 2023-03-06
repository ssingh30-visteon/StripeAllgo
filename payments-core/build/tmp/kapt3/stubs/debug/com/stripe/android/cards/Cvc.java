package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/cards/Cvc;", "", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc$Validated;", "payments-core_debug"})
public abstract class Cvc {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.cards.Cvc.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int COMMON_LENGTH = 3;
    
    private Cvc() {
        super();
    }
    
    /**
     * A representation of a partial or full CVC that hasn't been validated.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fJ\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc;", "denormalized", "", "(Ljava/lang/String;)V", "normalized", "getNormalized$payments_core_debug", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "isComplete", "maxLength", "isPartialEntry", "toString", "validate", "Lcom/stripe/android/cards/Cvc$Validated;", "payments-core_debug"})
    public static final class Unvalidated extends com.stripe.android.cards.Cvc {
        private final java.lang.String denormalized = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String normalized = null;
        
        /**
         * A representation of a partial or full CVC that hasn't been validated.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.cards.Cvc.Unvalidated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String denormalized) {
            return null;
        }
        
        /**
         * A representation of a partial or full CVC that hasn't been validated.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A representation of a partial or full CVC that hasn't been validated.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A representation of a partial or full CVC that hasn't been validated.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Unvalidated(@org.jetbrains.annotations.NotNull()
        java.lang.String denormalized) {
            super();
        }
        
        private final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getNormalized$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.cards.Cvc.Validated validate(int maxLength) {
            return null;
        }
        
        private final boolean isComplete(int maxLength) {
            return false;
        }
        
        public final boolean isPartialEntry(int maxLength) {
            return false;
        }
    }
    
    /**
     * A representation of a client-side validated CVC.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/cards/Cvc$Validated;", "Lcom/stripe/android/cards/Cvc;", "value", "", "(Ljava/lang/String;)V", "getValue$payments_core_debug", "()Ljava/lang/String;", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_debug"})
    public static final class Validated extends com.stripe.android.cards.Cvc {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        /**
         * A representation of a client-side validated CVC.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.cards.Cvc.Validated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        /**
         * A representation of a client-side validated CVC.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A representation of a client-side validated CVC.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A representation of a client-side validated CVC.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Validated(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getValue$payments_core_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/cards/Cvc$Companion;", "", "()V", "COMMON_LENGTH", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
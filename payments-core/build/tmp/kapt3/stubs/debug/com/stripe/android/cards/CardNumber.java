package com.stripe.android.cards;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/cards/CardNumber;", "", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber$Validated;", "payments-core_debug"})
public abstract class CardNumber {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.cards.CardNumber.Companion Companion = null;
    public static final int MIN_PAN_LENGTH = 14;
    public static final int MAX_PAN_LENGTH = 19;
    public static final int DEFAULT_PAN_LENGTH = 16;
    private static final java.util.Set<java.lang.Integer> DEFAULT_SPACE_POSITIONS = null;
    private static final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> SPACE_POSITIONS = null;
    
    private CardNumber() {
        super();
    }
    
    /**
     * A representation of a partial or full card number that hasn't been validated.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0014\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000eJ\t\u0010\u001c\u001a\u00020\u000eH\u00d6\u0001J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000eH\u0000\u00a2\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\nH\u0000\u00a2\u0006\u0002\b J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001a\u001a\u00020\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber;", "denormalized", "", "(Ljava/lang/String;)V", "bin", "Lcom/stripe/android/cards/Bin;", "getBin", "()Lcom/stripe/android/cards/Bin;", "isMaxLength", "", "()Z", "isValidLuhn", "length", "", "getLength", "()I", "normalized", "getNormalized", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "formatNumber", "panLength", "getFormatted", "hashCode", "isPartialEntry", "isPartialEntry$payments_core_debug", "isPossibleCardBrand", "isPossibleCardBrand$payments_core_debug", "toString", "validate", "Lcom/stripe/android/cards/CardNumber$Validated;", "Companion", "payments-core_debug"})
    public static final class Unvalidated extends com.stripe.android.cards.CardNumber {
        private final java.lang.String denormalized = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String normalized = null;
        private final int length = 0;
        private final boolean isMaxLength = false;
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.cards.Bin bin = null;
        private final boolean isValidLuhn = false;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.cards.CardNumber.Unvalidated.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.util.Set<java.lang.Character> REJECT_CHARS = null;
        
        /**
         * A representation of a partial or full card number that hasn't been validated.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.cards.CardNumber.Unvalidated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String denormalized) {
            return null;
        }
        
        /**
         * A representation of a partial or full card number that hasn't been validated.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A representation of a partial or full card number that hasn't been validated.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A representation of a partial or full card number that hasn't been validated.
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
        public final java.lang.String getNormalized() {
            return null;
        }
        
        public final int getLength() {
            return 0;
        }
        
        public final boolean isMaxLength() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.cards.Bin getBin() {
            return null;
        }
        
        public final boolean isValidLuhn() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.cards.CardNumber.Validated validate(int panLength) {
            return null;
        }
        
        /**
         * Format a number based on its expected length
         *
         * e.g. `"4242424242424242"` with pan length `16` will return `"4242 4242 4242 4242"`;
         * `"424242"` with pan length `16` will return `"4242 42"`;
         * `"4242424242424242"` with pan length `14` will return `"4242 424242 4242"`
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormatted(int panLength) {
            return null;
        }
        
        private final java.lang.String formatNumber(int panLength) {
            return null;
        }
        
        public final boolean isPartialEntry$payments_core_debug(int panLength) {
            return false;
        }
        
        public final boolean isPossibleCardBrand$payments_core_debug() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated$Companion;", "", "()V", "REJECT_CHARS", "", "", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * A representation of a client-side validated card number.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Validated;", "Lcom/stripe/android/cards/CardNumber;", "value", "", "(Ljava/lang/String;)V", "getValue$payments_core_debug", "()Ljava/lang/String;", "component1", "component1$payments_core_debug", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_debug"})
    public static final class Validated extends com.stripe.android.cards.CardNumber {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        
        /**
         * A representation of a client-side validated card number.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.cards.CardNumber.Validated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return null;
        }
        
        /**
         * A representation of a client-side validated card number.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * A representation of a client-side validated card number.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * A representation of a client-side validated card number.
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/cards/CardNumber$Companion;", "", "()V", "DEFAULT_PAN_LENGTH", "", "DEFAULT_SPACE_POSITIONS", "", "MAX_PAN_LENGTH", "MIN_PAN_LENGTH", "SPACE_POSITIONS", "", "getSpacePositions", "panLength", "getSpacePositions$payments_core_debug", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.Integer> getSpacePositions$payments_core_debug(int panLength) {
            return null;
        }
    }
}
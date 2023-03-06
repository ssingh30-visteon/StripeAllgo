package com.stripe.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/ExpirationDate;", "", "()V", "Unvalidated", "Validated", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "payments-core_debug"})
public abstract class ExpirationDate {
    
    private ExpirationDate() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\u0006\u0010\u0018\u001a\u00020\u0006J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate;", "month", "", "year", "(II)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "isComplete", "", "isComplete$payments_core_debug", "()Z", "isMonthValid", "isPartialEntry", "isPartialEntry$payments_core_debug", "getMonth", "()Ljava/lang/String;", "getYear", "component1", "component2", "copy", "equals", "other", "", "getDisplayString", "hashCode", "toString", "validate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "Companion", "payments-core_debug"})
    public static final class Unvalidated extends com.stripe.android.model.ExpirationDate {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String month = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String year = null;
        private final boolean isMonthValid = false;
        private final boolean isComplete = false;
        private final boolean isPartialEntry = false;
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.model.ExpirationDate.Unvalidated.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.ExpirationDate.Unvalidated EMPTY = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.ExpirationDate.Unvalidated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String month, @org.jetbrains.annotations.NotNull()
        java.lang.String year) {
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
        
        public Unvalidated(@org.jetbrains.annotations.NotNull()
        java.lang.String month, @org.jetbrains.annotations.NotNull()
        java.lang.String year) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMonth() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getYear() {
            return null;
        }
        
        public final boolean isMonthValid() {
            return false;
        }
        
        public Unvalidated(int month, int year) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.ExpirationDate.Validated validate() {
            return null;
        }
        
        /**
         * Creates a string value to be entered into an expiration date text field
         * without a divider. For instance, (1, 2020) => "0120". It doesn't matter if
         * the year is two-digit or four. (1, 20) => "0120".
         *
         * Note: A four-digit year will be truncated, so (1, 2720) => "0120". If the year
         * date is 3 digits, the data will be considered invalid and the empty string will be returned.
         * A one-digit date is valid (represents 2001, for instance).
         *
         * @return a length-four string representing the date, or an empty string if input is invalid
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayString() {
            return null;
        }
        
        public final boolean isComplete$payments_core_debug() {
            return false;
        }
        
        public final boolean isPartialEntry$payments_core_debug() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "getEMPTY", "()Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "create", "input", "", "payments-core_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Converts raw string input of the format MMYY into a [ExpirationDate.Unvalidated].
             * The month and year fields may be incomplete. This method requires the input string
             * to have allowed characters, but does not validate the value of the string.
             *
             * "123" would result in ExpirationDate.Unvalidated(month = "12", year = "3")
             * "1" would result in ExpirationDate.Unvalidated(month = "1", year = "")
             *
             * @param input up to four characters of user input
             * @return a [ExpirationDate.Unvalidated] with the first two characters as the month and
             * the last two characters as the year.
             */
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.ExpirationDate.Unvalidated create(@org.jetbrains.annotations.NotNull()
            java.lang.String input) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.ExpirationDate.Unvalidated getEMPTY() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/ExpirationDate$Validated;", "Lcom/stripe/android/model/ExpirationDate;", "month", "", "year", "(II)V", "getMonth", "()I", "getYear", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "payments-core_debug"})
    public static final class Validated extends com.stripe.android.model.ExpirationDate {
        private final int month = 0;
        private final int year = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.ExpirationDate.Validated copy(int month, int year) {
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
        
        public Validated(int month, int year) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getMonth() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getYear() {
            return 0;
        }
    }
}
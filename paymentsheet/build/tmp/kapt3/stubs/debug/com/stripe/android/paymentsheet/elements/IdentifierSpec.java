package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This uniquely identifies a element in the form.  The objects here are for identifier
 * specs that need to be found when pre-populating fields, or when extracting data.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u000b\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "City", "Country", "Email", "Generic", "Line1", "Line2", "Name", "Phone", "PostalCode", "SaveForFutureUse", "State", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Generic;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Name;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Email;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Phone;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Line1;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Line2;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$City;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$PostalCode;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$State;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Country;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$SaveForFutureUse;", "paymentsheet_debug"})
public abstract class IdentifierSpec {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    
    private IdentifierSpec(java.lang.String value) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Generic;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "_value", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "paymentsheet_debug"})
    public static final class Generic extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        private final java.lang.String _value = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.paymentsheet.elements.IdentifierSpec.Generic copy(@org.jetbrains.annotations.NotNull()
        java.lang.String _value) {
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
        
        public Generic(@org.jetbrains.annotations.NotNull()
        java.lang.String _value) {
            super(null);
        }
        
        private final java.lang.String component1() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Name;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class Name extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.Name INSTANCE = null;
        
        private Name() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Email;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class Email extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.Email INSTANCE = null;
        
        private Email() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Phone;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class Phone extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.Phone INSTANCE = null;
        
        private Phone() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Line1;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class Line1 extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.Line1 INSTANCE = null;
        
        private Line1() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Line2;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class Line2 extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.Line2 INSTANCE = null;
        
        private Line2() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$City;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class City extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.City INSTANCE = null;
        
        private City() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$PostalCode;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class PostalCode extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.PostalCode INSTANCE = null;
        
        private PostalCode() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$State;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class State extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.State INSTANCE = null;
        
        private State() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$Country;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class Country extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.Country INSTANCE = null;
        
        private Country() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/IdentifierSpec$SaveForFutureUse;", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "()V", "paymentsheet_debug"})
    public static final class SaveForFutureUse extends com.stripe.android.paymentsheet.elements.IdentifierSpec {
        @org.jetbrains.annotations.NotNull()
        public static final com.stripe.android.paymentsheet.elements.IdentifierSpec.SaveForFutureUse INSTANCE = null;
        
        private SaveForFutureUse() {
            super(null);
        }
    }
}
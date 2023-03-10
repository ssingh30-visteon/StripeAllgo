package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/BankDropdownSpec;", "Lcom/stripe/android/paymentsheet/elements/SectionFieldSpec;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "label", "", "bankType", "Lcom/stripe/android/paymentsheet/elements/SupportedBankType;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;ILcom/stripe/android/paymentsheet/elements/SupportedBankType;)V", "getBankType", "()Lcom/stripe/android/paymentsheet/elements/SupportedBankType;", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "getLabel", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "paymentsheet_debug"})
public final class BankDropdownSpec extends com.stripe.android.paymentsheet.elements.SectionFieldSpec {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    private final int label = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.SupportedBankType bankType = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.BankDropdownSpec copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @androidx.annotation.StringRes()
    int label, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SupportedBankType bankType) {
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
    
    public BankDropdownSpec(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @androidx.annotation.StringRes()
    int label, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SupportedBankType bankType) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.IdentifierSpec component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.IdentifierSpec getIdentifier() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getLabel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.SupportedBankType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.SupportedBankType getBankType() {
        return null;
    }
}
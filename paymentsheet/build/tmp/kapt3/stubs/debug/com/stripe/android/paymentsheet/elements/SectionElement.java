package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J \u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c0\n0\u001bH\u0016J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SectionElement;", "Lcom/stripe/android/paymentsheet/elements/FormElement;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "field", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "controller", "Lcom/stripe/android/paymentsheet/elements/SectionController;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;Lcom/stripe/android/paymentsheet/elements/SectionController;)V", "fields", "", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/paymentsheet/elements/SectionController;)V", "getController", "()Lcom/stripe/android/paymentsheet/elements/SectionController;", "getFields", "()Ljava/util/List;", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "hashCode", "", "toString", "", "paymentsheet_debug"})
public final class SectionElement extends com.stripe.android.paymentsheet.elements.FormElement {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> fields = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.SectionController controller = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.SectionElement copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionFieldElement> fields, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SectionController controller) {
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
    
    public SectionElement(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionFieldElement> fields, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SectionController controller) {
        super();
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> getFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.SectionController component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.SectionController getController() {
        return null;
    }
    
    public SectionElement(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SectionFieldElement field, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SectionController controller) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow() {
        return null;
    }
}
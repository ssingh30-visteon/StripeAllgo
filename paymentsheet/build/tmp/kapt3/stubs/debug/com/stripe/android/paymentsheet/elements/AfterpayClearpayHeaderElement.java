package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c2\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J \u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b0\u001aH\u0016J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u000eH\u00d6\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/AfterpayClearpayHeaderElement;", "Lcom/stripe/android/paymentsheet/elements/FormElement;", "identifier", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "amount", "Lcom/stripe/android/paymentsheet/model/Amount;", "controller", "Lcom/stripe/android/paymentsheet/elements/Controller;", "(Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;Lcom/stripe/android/paymentsheet/model/Amount;Lcom/stripe/android/paymentsheet/elements/Controller;)V", "getController", "()Lcom/stripe/android/paymentsheet/elements/Controller;", "getIdentifier", "()Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "infoUrl", "", "getInfoUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/paymentsheet/forms/FormFieldEntry;", "getLabel", "resources", "Landroid/content/res/Resources;", "hashCode", "", "toString", "Companion", "paymentsheet_debug"})
public final class AfterpayClearpayHeaderElement extends com.stripe.android.paymentsheet.elements.FormElement {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.IdentifierSpec identifier = null;
    private final com.stripe.android.paymentsheet.model.Amount amount = null;
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.paymentsheet.elements.Controller controller = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String infoUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.elements.AfterpayClearpayHeaderElement.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String url = "https://static-us.afterpay.com/javascript/modal/%s_rebrand_modal.html";
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.AfterpayClearpayHeaderElement copy(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.Amount amount, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.elements.Controller controller) {
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
    
    public AfterpayClearpayHeaderElement(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.IdentifierSpec identifier, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.model.Amount amount, @org.jetbrains.annotations.Nullable()
    com.stripe.android.paymentsheet.elements.Controller controller) {
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
    
    private final com.stripe.android.paymentsheet.model.Amount component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.paymentsheet.elements.Controller component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.stripe.android.paymentsheet.elements.Controller getController() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<kotlin.Pair<com.stripe.android.paymentsheet.elements.IdentifierSpec, com.stripe.android.paymentsheet.forms.FormFieldEntry>>> getFormFieldValueFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInfoUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/AfterpayClearpayHeaderElement$Companion;", "", "()V", "url", "", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
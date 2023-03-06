package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/SimpleDropdownConfig;", "Lcom/stripe/android/paymentsheet/elements/DropdownConfig;", "label", "", "items", "", "Lcom/stripe/android/paymentsheet/elements/DropdownItemSpec;", "(ILjava/util/List;)V", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "getLabel", "()I", "convertFromRaw", "rawValue", "convertToRaw", "displayName", "getDisplayItems", "paymentsheet_debug"})
public final class SimpleDropdownConfig implements com.stripe.android.paymentsheet.elements.DropdownConfig {
    private final int label = 0;
    private final java.util.List<com.stripe.android.paymentsheet.elements.DropdownItemSpec> items = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugLabel = "simple_dropdown";
    
    public SimpleDropdownConfig(@androidx.annotation.StringRes()
    int label, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.paymentsheet.elements.DropdownItemSpec> items) {
        super();
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getDisplayItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String convertFromRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String convertToRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String displayName) {
        return null;
    }
}
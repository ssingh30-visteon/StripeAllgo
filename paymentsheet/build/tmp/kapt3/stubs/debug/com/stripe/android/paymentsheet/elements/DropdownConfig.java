package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0003H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/DropdownConfig;", "", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "label", "", "getLabel", "()I", "convertFromRaw", "rawValue", "convertToRaw", "displayName", "getDisplayItems", "", "Lcom/stripe/android/paymentsheet/elements/CountryConfig;", "Lcom/stripe/android/paymentsheet/elements/SimpleDropdownConfig;", "paymentsheet_debug"})
public abstract interface DropdownConfig {
    
    /**
     * This is a label for debug logs
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getDebugLabel();
    
    /**
     * This is the label to describe the field
     */
    public abstract int getLabel();
    
    /**
     * This is the list of displayable items to show in the drop down
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getDisplayItems();
    
    /**
     * This will convert the field to a raw value to use in the parameter map
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String convertFromRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String rawValue);
    
    /**
     * This will convert from a raw value used in the parameter map to a disiplayValue
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String convertToRaw(@org.jetbrains.annotations.NotNull()
    java.lang.String displayName);
}
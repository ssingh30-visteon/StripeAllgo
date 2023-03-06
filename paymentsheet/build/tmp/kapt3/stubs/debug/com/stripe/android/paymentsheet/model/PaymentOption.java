package com.stripe.android.paymentsheet.model;

import java.lang.System;

/**
 * The customer's selected payment option.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOption;", "", "drawableResourceId", "", "label", "", "(ILjava/lang/String;)V", "getDrawableResourceId", "()I", "getLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "paymentsheet_debug"})
public final class PaymentOption {
    
    /**
     * The drawable resource id of the icon that represents the payment option.
     */
    private final int drawableResourceId = 0;
    
    /**
     * A label that describes the payment option.
     *
     * For example, "····4242" for a Visa ending in 4242.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String label = null;
    
    /**
     * The customer's selected payment option.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.model.PaymentOption copy(@androidx.annotation.DrawableRes()
    int drawableResourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
        return null;
    }
    
    /**
     * The customer's selected payment option.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * The customer's selected payment option.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * The customer's selected payment option.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PaymentOption(@androidx.annotation.DrawableRes()
    int drawableResourceId, @org.jetbrains.annotations.NotNull()
    java.lang.String label) {
        super();
    }
    
    /**
     * The drawable resource id of the icon that represents the payment option.
     */
    public final int component1() {
        return 0;
    }
    
    /**
     * The drawable resource id of the icon that represents the payment option.
     */
    public final int getDrawableResourceId() {
        return 0;
    }
    
    /**
     * A label that describes the payment option.
     *
     * For example, "····4242" for a Visa ending in 4242.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * A label that describes the payment option.
     *
     * For example, "····4242" for a Visa ending in 4242.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
}
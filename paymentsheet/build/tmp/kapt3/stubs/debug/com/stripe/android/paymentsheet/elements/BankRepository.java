package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0007\b\u0010\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J#\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u001a0 H\u0001\u00a2\u0006\u0002\b!J\u001a\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\t\u0010#\u001a\u00020\u0018H\u00d6\u0001R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/BankRepository;", "", "()V", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "bankItemMap", "", "Lcom/stripe/android/paymentsheet/elements/SupportedBankType;", "", "Lcom/stripe/android/paymentsheet/elements/DropdownItemSpec;", "format", "Lkotlinx/serialization/json/Json;", "getResources", "()Landroid/content/res/Resources;", "component1", "copy", "equals", "", "other", "get", "bankType", "get$paymentsheet_debug", "getJsonStringFromInputStream", "", "inputStream", "Ljava/io/InputStream;", "hashCode", "", "initialize", "", "supportedBankTypeInputStreamMap", "", "initialize$paymentsheet_debug", "parseBank", "toString", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class BankRepository {
    @org.jetbrains.annotations.Nullable()
    private final android.content.res.Resources resources = null;
    private final java.util.Map<com.stripe.android.paymentsheet.elements.SupportedBankType, java.util.List<com.stripe.android.paymentsheet.elements.DropdownItemSpec>> bankItemMap = null;
    private final kotlinx.serialization.json.Json format = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.BankRepository copy(@org.jetbrains.annotations.Nullable()
    android.content.res.Resources resources) {
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
    
    @javax.inject.Inject()
    public BankRepository(@org.jetbrains.annotations.Nullable()
    android.content.res.Resources resources) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.res.Resources component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.res.Resources getResources() {
        return null;
    }
    
    public BankRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.paymentsheet.elements.DropdownItemSpec> get$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.SupportedBankType bankType) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void initialize$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.util.Map<com.stripe.android.paymentsheet.elements.SupportedBankType, ? extends java.io.InputStream> supportedBankTypeInputStreamMap) {
    }
    
    private final java.util.List<com.stripe.android.paymentsheet.elements.DropdownItemSpec> parseBank(java.io.InputStream inputStream) {
        return null;
    }
    
    private final java.lang.String getJsonStringFromInputStream(java.io.InputStream inputStream) {
        return null;
    }
}
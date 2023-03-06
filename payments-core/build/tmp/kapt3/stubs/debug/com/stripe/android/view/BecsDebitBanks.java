package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks;", "", "context", "Landroid/content/Context;", "shouldIncludeTestBank", "", "(Landroid/content/Context;Z)V", "banks", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "(Ljava/util/List;Z)V", "getBanks$payments_core_debug", "()Ljava/util/List;", "byPrefix", "bsb", "", "Bank", "Companion", "payments-core_debug"})
public final class BecsDebitBanks {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.stripe.android.view.BecsDebitBanks.Bank> banks = null;
    private final boolean shouldIncludeTestBank = false;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.BecsDebitBanks.Companion Companion = null;
    @java.lang.Deprecated()
    private static final com.stripe.android.view.BecsDebitBanks.Bank STRIPE_TEST_BANK = null;
    
    public BecsDebitBanks(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.view.BecsDebitBanks.Bank> banks, boolean shouldIncludeTestBank) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.BecsDebitBanks.Bank> getBanks$payments_core_debug() {
        return null;
    }
    
    public BecsDebitBanks(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean shouldIncludeTestBank) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.BecsDebitBanks.Bank byPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String bsb) {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b\u0010J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Bank;", "Landroid/os/Parcelable;", "prefix", "", "code", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode$payments_core_debug", "()Ljava/lang/String;", "getName$payments_core_debug", "getPrefix$payments_core_debug", "component1", "component1$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class Bank implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String prefix = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String code = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.BecsDebitBanks.Bank> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.BecsDebitBanks.Bank copy(@org.jetbrains.annotations.NotNull()
        java.lang.String prefix, @org.jetbrains.annotations.NotNull()
        java.lang.String code, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
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
        
        public Bank(@org.jetbrains.annotations.NotNull()
        java.lang.String prefix, @org.jetbrains.annotations.NotNull()
        java.lang.String code, @org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrefix$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCode$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3$payments_core_debug() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName$payments_core_debug() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.BecsDebitBanks.Bank> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.BecsDebitBanks.Bank createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.BecsDebitBanks.Bank[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/BecsDebitBanks$Companion;", "", "()V", "STRIPE_TEST_BANK", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "createBanksData", "", "context", "Landroid/content/Context;", "readFile", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final java.util.List<com.stripe.android.view.BecsDebitBanks.Bank> createBanksData(android.content.Context context) {
            return null;
        }
        
        private final java.lang.String readFile(android.content.Context context) {
            return null;
        }
    }
}
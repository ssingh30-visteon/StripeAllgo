package com.stripe.android.paymentsheet.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0010\u00a2\u0006\u0002\u0010\u0002B\u0011\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001\u00a2\u0006\u0002\b\u0011J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000\u00a2\u0006\u0002\b\u0013J\'\u0010\u0014\u001a\u00020\u000e2\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\t0\u0016H\u0001\u00a2\u0006\u0002\b\u0018R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository;", "", "()V", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "countryFieldMap", "", "", "", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "getResources", "()Landroid/content/res/Resources;", "add", "", "countryCode", "listElements", "add$paymentsheet_debug", "get", "get$paymentsheet_debug", "initialize", "countryAddressSchemaPair", "", "Lcom/stripe/android/paymentsheet/address/CountryAddressSchema;", "initialize$paymentsheet_debug", "Companion", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class AddressFieldElementRepository {
    @org.jetbrains.annotations.Nullable()
    private final android.content.res.Resources resources = null;
    private final java.util.Map<java.lang.String, java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement>> countryFieldMap = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.address.AddressFieldElementRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_COUNTRY_CODE = "ZZ";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> supportedCountries = null;
    
    @javax.inject.Inject()
    public AddressFieldElementRepository(@org.jetbrains.annotations.Nullable()
    android.content.res.Resources resources) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.res.Resources getResources() {
        return null;
    }
    
    public AddressFieldElementRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> get$paymentsheet_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String countryCode) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void initialize$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<com.stripe.android.paymentsheet.address.CountryAddressSchema>> countryAddressSchemaPair) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void add$paymentsheet_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionFieldElement> listElements) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository$Companion;", "", "()V", "DEFAULT_COUNTRY_CODE", "", "getDEFAULT_COUNTRY_CODE$paymentsheet_debug$annotations", "supportedCountries", "", "getSupportedCountries$paymentsheet_debug$annotations", "getSupportedCountries$paymentsheet_debug", "()Ljava/util/Set;", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getDEFAULT_COUNTRY_CODE$paymentsheet_debug$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<java.lang.String> getSupportedCountries$paymentsheet_debug() {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getSupportedCountries$paymentsheet_debug$annotations() {
        }
    }
}
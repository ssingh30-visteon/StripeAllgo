package com.stripe.android.view;

import java.lang.System;

@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\b\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\tJ\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0007J\u0016\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tJ\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\tH\u0007J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\tH\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/CountryUtils;", "", "()V", "CARD_POSTAL_CODE_COUNTRIES", "", "", "getCARD_POSTAL_CODE_COUNTRIES$payments_core_debug", "()Ljava/util/Set;", "cachedCountriesLocale", "Ljava/util/Locale;", "cachedOrderedLocalizedCountries", "", "Lcom/stripe/android/view/Country;", "doesCountryUsePostalCode", "", "countryCode", "Lcom/stripe/android/model/CountryCode;", "doesCountryUsePostalCode$payments_core_debug", "formatNameForSorting", "name", "formatNameForSorting$payments_core_debug", "getCountryByCode", "currentLocale", "getCountryCodeByName", "countryName", "getDisplayCountry", "getOrderedCountries", "getSortedLocalizedCountries", "localizedCountries", "payments-core_debug"})
public final class CountryUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.CountryUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Set<java.lang.String> CARD_POSTAL_CODE_COUNTRIES = null;
    private static java.util.Locale cachedCountriesLocale;
    private static java.util.List<com.stripe.android.view.Country> cachedOrderedLocalizedCountries;
    
    private CountryUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getCARD_POSTAL_CODE_COUNTRIES$payments_core_debug() {
        return null;
    }
    
    private final java.util.List<com.stripe.android.view.Country> localizedCountries(java.util.Locale currentLocale) {
        return null;
    }
    
    private final java.util.List<com.stripe.android.view.Country> getSortedLocalizedCountries(java.util.Locale currentLocale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.String formatNameForSorting$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
}
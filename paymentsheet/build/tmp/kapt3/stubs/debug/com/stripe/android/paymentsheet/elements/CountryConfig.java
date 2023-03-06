package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This is the configuration for a country dropdown.
 *
 * @property onlyShowCountryCodes: a list of country code that should be shown.  If empty all
 * countries will be shown.
 * @property locale: this is the locale used to display the country names.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H\u0016R\u0014\u0010\b\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/CountryConfig;", "Lcom/stripe/android/paymentsheet/elements/DropdownConfig;", "onlyShowCountryCodes", "", "", "locale", "Ljava/util/Locale;", "(Ljava/util/Set;Ljava/util/Locale;)V", "debugLabel", "getDebugLabel", "()Ljava/lang/String;", "label", "", "getLabel", "()I", "getLocale", "()Ljava/util/Locale;", "getOnlyShowCountryCodes", "()Ljava/util/Set;", "convertFromRaw", "rawValue", "convertToRaw", "displayName", "getDisplayItems", "", "paymentsheet_debug"})
public final class CountryConfig implements com.stripe.android.paymentsheet.elements.DropdownConfig {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> onlyShowCountryCodes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Locale locale = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String debugLabel = "country";
    @androidx.annotation.StringRes()
    private final int label = 0;
    
    public CountryConfig() {
        super();
    }
    
    public CountryConfig(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> onlyShowCountryCodes, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getOnlyShowCountryCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale getLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getDebugLabel() {
        return null;
    }
    
    @java.lang.Override()
    public int getLabel() {
        return 0;
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
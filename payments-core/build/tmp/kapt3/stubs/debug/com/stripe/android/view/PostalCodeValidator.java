package com.stripe.android.view;

import java.lang.System;

/**
 * Validation rules for postal codes
 */
@androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J;\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\u00a2\u0006\u0002\b\f\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/PostalCodeValidator;", "", "()V", "isValid", "", "postalCode", "", "countryCode", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "isValid$payments_core_debug", "Companion", "payments-core_debug"})
public final class PostalCodeValidator {
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.PostalCodeValidator.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.util.Map<java.lang.String, java.util.regex.Pattern> POSTAL_CODE_PATTERNS = null;
    
    public PostalCodeValidator() {
        super();
    }
    
    /**
     * 1. if there is a regex for the country code, validate the postal code against it
     * 2. if the country does not use a postal code, treat postal code as valid
     * 3. otherwise, postal code must be not-blank
     */
    public final boolean isValid(@org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
        return false;
    }
    
    public final boolean isValid$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String postalCode, @org.jetbrains.annotations.Nullable()
    java.lang.String countryCode, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R*\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/PostalCodeValidator$Companion;", "", "()V", "POSTAL_CODE_PATTERNS", "", "", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "isPostalCodeNotRequired", "", "optionalShippingInfoFields", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final boolean isPostalCodeNotRequired(java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields, java.util.List<? extends com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields) {
            return false;
        }
    }
}
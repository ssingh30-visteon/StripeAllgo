package com.stripe.android.paymentsheet.address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0002\u001a\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u001a\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00180\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"format", "Lkotlinx/serialization/json/Json;", "combineCityAndPostal", "", "Lcom/stripe/android/paymentsheet/elements/SectionFieldElement;", "countryAddressElements", "Lcom/stripe/android/paymentsheet/elements/SectionSingleFieldElement;", "getJsonStringFromInputStream", "", "inputStream", "Ljava/io/InputStream;", "getKeyboard", "Landroidx/compose/ui/text/input/KeyboardType;", "fieldSchema", "Lcom/stripe/android/paymentsheet/address/FieldSchema;", "(Lcom/stripe/android/paymentsheet/address/FieldSchema;)I", "isCityOrPostal", "", "identifierSpec", "Lcom/stripe/android/paymentsheet/elements/IdentifierSpec;", "isPostalNextToCity", "element1", "element2", "parseAddressesSchema", "Lcom/stripe/android/paymentsheet/address/CountryAddressSchema;", "transformToElementList", "paymentsheet_debug"})
public final class TransformAddressToElementKt {
    private static final kotlinx.serialization.json.Json format = null;
    
    @org.jetbrains.annotations.Nullable()
    public static final java.util.List<com.stripe.android.paymentsheet.address.CountryAddressSchema> parseAddressesSchema(@org.jetbrains.annotations.Nullable()
    java.io.InputStream inputStream) {
        return null;
    }
    
    private static final java.lang.String getJsonStringFromInputStream(java.io.InputStream inputStream) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> transformToElementList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.paymentsheet.address.CountryAddressSchema> $this$transformToElementList) {
        return null;
    }
    
    private static final java.util.List<com.stripe.android.paymentsheet.elements.SectionFieldElement> combineCityAndPostal(java.util.List<? extends com.stripe.android.paymentsheet.elements.SectionSingleFieldElement> countryAddressElements) {
        return null;
    }
    
    private static final boolean isPostalNextToCity(com.stripe.android.paymentsheet.elements.SectionSingleFieldElement element1, com.stripe.android.paymentsheet.elements.SectionSingleFieldElement element2) {
        return false;
    }
    
    private static final boolean isCityOrPostal(com.stripe.android.paymentsheet.elements.IdentifierSpec identifierSpec) {
        return false;
    }
    
    private static final int getKeyboard(com.stripe.android.paymentsheet.address.FieldSchema fieldSchema) {
        return 0;
    }
}
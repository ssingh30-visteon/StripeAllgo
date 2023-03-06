package com.stripe.android.paymentsheet.paymentdatacollection;

import java.lang.System;

/**
 * This class will transform the fields in a form into a structure as defined by a map.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bJ4\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/TransformToPaymentMethodCreateParams;", "", "()V", "transform", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "formFieldValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "paramKey", "", "", "transformToPaymentMethodCreateParamsMap", "", "mapStructure", "Companion", "paymentsheet_debug"})
public final class TransformToPaymentMethodCreateParams {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.paymentsheet.paymentdatacollection.TransformToPaymentMethodCreateParams.Companion Companion = null;
    
    public TransformToPaymentMethodCreateParams() {
        super();
    }
    
    /**
     * This function will convert formFieldValue to PaymentMethodCreateParams.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams transform(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.forms.FormFieldValues formFieldValues, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> paramKey) {
        return null;
    }
    
    /**
     * This function will put the field values as defined in the formFieldValues into a map
     * according to the mapLayout structure.
     *
     * @param: mapLayout: This is a map of keys (strings) and their values (String or another map).  This defines
     * how the resulting map should look with no values in it.
     * @param: formFieldValues: These are the fields and their values and based on the algorithm of this function
     * will be put into a map according to the mapStructure
     */
    private final java.util.Map<java.lang.String, java.lang.Object> transformToPaymentMethodCreateParamsMap(com.stripe.android.paymentsheet.forms.FormFieldValues formFieldValues, java.util.Map<java.lang.String, ? extends java.lang.Object> mapStructure) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/TransformToPaymentMethodCreateParams$Companion;", "", "()V", "createMap", "", "mapStructure", "", "", "dest", "", "formFieldKeyValues", "paymentsheet_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * This function will look for each of the keys in the mapStructure and
         * if the formField contains a key that matches it will populate the value.
         *
         * For example:
         * mapStructure = {
         *  "name": null
         *  billing = {
         *     address = {
         *        "name": null
         *     }
         *  }
         * }
         * formFieldValues = {
         *  "name": "John Smith"
         * }
         *
         * will return a map of:
         * dest = {
         *  "name": "John Smith"
         *  billing = {
         *     address = {
         *        "name": "John Smith"
         *     }
         *  }
         * }
         */
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        private final void createMap(java.util.Map<java.lang.String, ? extends java.lang.Object> mapStructure, java.util.Map<java.lang.String, java.lang.Object> dest, java.util.Map<java.lang.String, java.lang.String> formFieldKeyValues) {
        }
    }
}
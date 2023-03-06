package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/CountryAutoCompleteTextViewValidator;", "Landroid/widget/AutoCompleteTextView$Validator;", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "onCountrySelected", "Lkotlin/Function1;", "Lcom/stripe/android/view/Country;", "", "(Lcom/stripe/android/view/CountryAdapter;Lkotlin/jvm/functions/Function1;)V", "fixText", "", "invalidText", "isValid", "", "text", "payments-core_debug"})
public final class CountryAutoCompleteTextViewValidator implements android.widget.AutoCompleteTextView.Validator {
    private final com.stripe.android.view.CountryAdapter countryAdapter = null;
    private final kotlin.jvm.functions.Function1<com.stripe.android.view.Country, kotlin.Unit> onCountrySelected = null;
    
    public CountryAutoCompleteTextViewValidator(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.CountryAdapter countryAdapter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.view.Country, kotlin.Unit> onCountrySelected) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence fixText(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence invalidText) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
        return false;
    }
}
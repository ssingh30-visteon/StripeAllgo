package com.stripe.android.view;

import java.lang.System;

/**
 * Adapter that populates a list of countries for a spinner.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0012\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010!\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u000bH\u0016J\u001b\u0010%\u001a\u00020&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0000\u00a2\u0006\u0002\b*R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/stripe/android/view/CountryAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/view/Country;", "context", "Landroid/content/Context;", "unfilteredCountries", "", "itemLayoutId", "", "textViewFactory", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "(Landroid/content/Context;Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "countryFilter", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "firstItem", "getFirstItem$payments_core_debug", "()Lcom/stripe/android/view/Country;", "suggestions", "getUnfilteredCountries$payments_core_debug", "()Ljava/util/List;", "setUnfilteredCountries$payments_core_debug", "(Ljava/util/List;)V", "getCount", "getFilter", "Landroid/widget/Filter;", "getItem", "i", "getItemId", "", "getPosition", "item", "getView", "Landroid/view/View;", "view", "viewGroup", "updateUnfilteredCountries", "", "allowedCountryCodes", "", "", "updateUnfilteredCountries$payments_core_debug", "CountryFilter", "payments-core_debug"})
public final class CountryAdapter extends android.widget.ArrayAdapter<com.stripe.android.view.Country> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.stripe.android.view.Country> unfilteredCountries;
    private final kotlin.jvm.functions.Function1<android.view.ViewGroup, android.widget.TextView> textViewFactory = null;
    private final com.stripe.android.view.CountryAdapter.CountryFilter countryFilter = null;
    private java.util.List<com.stripe.android.view.Country> suggestions;
    
    public CountryAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.view.Country> unfilteredCountries, int itemLayoutId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.ViewGroup, ? extends android.widget.TextView> textViewFactory) {
        super(null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.stripe.android.view.Country> getUnfilteredCountries$payments_core_debug() {
        return null;
    }
    
    public final void setUnfilteredCountries$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.stripe.android.view.Country> p0) {
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.stripe.android.view.Country getItem(int i) {
        return null;
    }
    
    @java.lang.Override()
    public int getPosition(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.Country item) {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int i) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int i, @org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    /**
     * @param allowedCountryCodes A set of allowed country codes. Will be ignored if empty.
     *
     * @return `true` if [unfilteredCountries] was updated, `false` otherwise
     */
    public final boolean updateUnfilteredCountries$payments_core_debug(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedCountryCodes) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u001c\u0010\u001b\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0014R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "Landroid/widget/Filter;", "unfilteredCountries", "", "Lcom/stripe/android/view/Country;", "adapter", "Lcom/stripe/android/view/CountryAdapter;", "activity", "Landroid/app/Activity;", "(Ljava/util/List;Lcom/stripe/android/view/CountryAdapter;Landroid/app/Activity;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "getUnfilteredCountries", "()Ljava/util/List;", "setUnfilteredCountries", "(Ljava/util/List;)V", "filteredSuggestedCountries", "constraint", "", "getSuggestedCountries", "hideKeyboard", "", "isMatch", "", "countries", "performFiltering", "Landroid/widget/Filter$FilterResults;", "publishResults", "filterResults", "payments-core_debug"})
    static final class CountryFilter extends android.widget.Filter {
        @org.jetbrains.annotations.NotNull()
        private java.util.List<com.stripe.android.view.Country> unfilteredCountries;
        private final com.stripe.android.view.CountryAdapter adapter = null;
        private final java.lang.ref.WeakReference<android.app.Activity> activityRef = null;
        
        public CountryFilter(@org.jetbrains.annotations.NotNull()
        java.util.List<com.stripe.android.view.Country> unfilteredCountries, @org.jetbrains.annotations.NotNull()
        com.stripe.android.view.CountryAdapter adapter, @org.jetbrains.annotations.Nullable()
        android.app.Activity activity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.stripe.android.view.Country> getUnfilteredCountries() {
            return null;
        }
        
        public final void setUnfilteredCountries(@org.jetbrains.annotations.NotNull()
        java.util.List<com.stripe.android.view.Country> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.widget.Filter.FilterResults performFiltering(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence constraint) {
            return null;
        }
        
        @java.lang.Override()
        protected void publishResults(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence constraint, @org.jetbrains.annotations.Nullable()
        android.widget.Filter.FilterResults filterResults) {
        }
        
        private final java.util.List<com.stripe.android.view.Country> filteredSuggestedCountries(java.lang.CharSequence constraint) {
            return null;
        }
        
        private final java.util.List<com.stripe.android.view.Country> getSuggestedCountries(java.lang.CharSequence constraint) {
            return null;
        }
        
        private final boolean isMatch(java.util.List<com.stripe.android.view.Country> countries, java.lang.CharSequence constraint) {
            return false;
        }
        
        private final void hideKeyboard(android.app.Activity activity) {
        }
    }
}
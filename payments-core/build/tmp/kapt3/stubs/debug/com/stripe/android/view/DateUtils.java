package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0007J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/view/DateUtils;", "", "()V", "MAX_VALID_YEAR", "", "convertTwoDigitYearToFour", "inputYear", "calendar", "Ljava/util/Calendar;", "isExpiryDataValid", "", "expiryMonth", "expiryYear", "payments-core_debug"})
public final class DateUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.DateUtils INSTANCE = null;
    private static final int MAX_VALID_YEAR = 9980;
    
    private DateUtils() {
        super();
    }
    
    /**
     * Checks whether or not the input month and year has yet expired.
     *
     * @param expiryMonth An integer representing a month. Only values 1-12 are valid,
     * but this is called by user input, so we have to check outside that range.
     * @param expiryYear An integer representing the full year (2017, not 17). Only positive values
     * are valid, but this is called by user input, so we have to check outside
     * for otherwise nonsensical dates. This code cannot validate years greater
     * than [9980][MAX_VALID_YEAR] because of how we parse years in [convertTwoDigitYearToFour].
     * @return `true` if the current month and year is the same as or later than the input
     * month and year, `false` otherwise. Note that some cards expire on the first of the
     * month, but we don't validate that here.
     */
    @kotlin.jvm.JvmStatic()
    public static final boolean isExpiryDataValid(int expiryMonth, int expiryYear) {
        return false;
    }
    
    @androidx.annotation.VisibleForTesting()
    @kotlin.jvm.JvmStatic()
    public static final boolean isExpiryDataValid(int expiryMonth, int expiryYear, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return false;
    }
    
    /**
     * Converts a two-digit input year to a four-digit year. As the current calendar year
     * approaches a century, we assume small values to mean the next century. For instance, if
     * the current year is 2090, and the input value is "18", the user probably means 2118,
     * not 2018. However, in 2017, the input "18" probably means 2018. This code should be
     * updated before the year 9981.
     *
     * @param inputYear a two-digit integer, between 0 and 99, inclusive
     * @return a four-digit year
     */
    @androidx.annotation.IntRange(from = 1000L, to = 9999L)
    public final int convertTwoDigitYearToFour(@androidx.annotation.IntRange(from = 0L, to = 99L)
    int inputYear) {
        return 0;
    }
    
    @androidx.annotation.IntRange(from = 1000L, to = 9999L)
    @androidx.annotation.VisibleForTesting()
    public final int convertTwoDigitYearToFour(@androidx.annotation.IntRange(from = 0L, to = 99L)
    int inputYear, @org.jetbrains.annotations.NotNull()
    java.util.Calendar calendar) {
        return 0;
    }
}
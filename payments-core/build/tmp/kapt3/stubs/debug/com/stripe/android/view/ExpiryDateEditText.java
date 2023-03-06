package com.stripe.android.view;

import java.lang.System;

/**
 * An [EditText] that handles putting numbers around a central divider character.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 52\u00020\u0001:\u00015B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u001e\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\u000fH\u0002J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0016H\u0007J#\u0010)\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\b,\u0010-J-\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H\u0001\u00a2\u0006\u0002\b3J\u0012\u00104\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010 \u001a\u0004\u0018\u00010!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u00066"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "completionCallback", "Lkotlin/Function0;", "", "getCompletionCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function0;)V", "dateDigitsLength", "<set-?>", "", "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_debug", "()Z", "setIncludeSeparatorGaps$payments_core_debug", "(Z)V", "includeSeparatorGaps$delegate", "Lkotlin/properties/ReadWriteProperty;", "isDateValid", "separator", "validatedDate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getValidatedDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "month", "year", "listenForTextChanges", "setIncludeSeparatorGaps", "include", "setText", "expiryMonth", "expiryYear", "setText$payments_core_debug", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateSelectionIndex", "newLength", "editActionStart", "editActionAddition", "maxInputLength", "updateSelectionIndex$payments_core_debug", "updateSeparatorUi", "Companion", "payments-core_debug"})
public final class ExpiryDateEditText extends com.stripe.android.view.StripeEditText {
    
    /**
     * Is `true` if the text entered represents a valid expiry date that has not
     * yet passed, and `false` if not.
     */
    private boolean isDateValid = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty includeSeparatorGaps$delegate = null;
    private final int dateDigitsLength = 0;
    private java.lang.String separator;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.ExpiryDateEditText.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int INVALID_INPUT = -1;
    @java.lang.Deprecated()
    private static final java.lang.String SEPARATOR_WITHOUT_GAPS = "/";
    @java.lang.Deprecated()
    private static final java.lang.String SEPARATOR_WITH_GAPS = " / ";
    @java.lang.Deprecated()
    private static final boolean INCLUDE_SEPARATOR_GAPS_DEFAULT = false;
    
    @kotlin.jvm.JvmOverloads()
    public ExpiryDateEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ExpiryDateEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ExpiryDateEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCompletionCallback$payments_core_debug() {
        return null;
    }
    
    public final void setCompletionCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final boolean isDateValid() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.ExpirationDate.Validated getValidatedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getAccessibilityText() {
        return null;
    }
    
    public final boolean getIncludeSeparatorGaps$payments_core_debug() {
        return false;
    }
    
    public final void setIncludeSeparatorGaps$payments_core_debug(boolean p0) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setIncludeSeparatorGaps(boolean include) {
    }
    
    public final void setText$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.Integer expiryMonth, @org.jetbrains.annotations.Nullable()
    java.lang.Integer expiryYear) {
    }
    
    private final void updateSeparatorUi(boolean includeSeparatorGaps) {
    }
    
    private final void listenForTextChanges() {
    }
    
    /**
     * Updates the selection index based on the current (pre-edit) index, and
     * the size change of the number being input.
     *
     * @param newLength the post-edit length of the string
     * @param editActionStart the position in the string at which the edit action starts
     * @param editActionAddition the number of new characters going into the string (zero for
     * delete)
     *
     * @return an index within the string at which to put the cursor
     */
    @androidx.annotation.VisibleForTesting()
    public final int updateSelectionIndex$payments_core_debug(int newLength, int editActionStart, int editActionAddition, int maxInputLength) {
        return 0;
    }
    
    private final boolean isDateValid(java.lang.String month, java.lang.String year) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText$Companion;", "", "()V", "INCLUDE_SEPARATOR_GAPS_DEFAULT", "", "INVALID_INPUT", "", "SEPARATOR_WITHOUT_GAPS", "", "SEPARATOR_WITH_GAPS", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
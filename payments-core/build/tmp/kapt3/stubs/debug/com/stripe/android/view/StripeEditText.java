package com.stripe.android.view;

import java.lang.System;

/**
 * Extension of [TextInputEditText] that listens for users pressing the delete key when
 * there is no text present. Google has actually made this
 * [somewhat difficult](https://code.google.com/p/android/issues/detail?id=42904),
 * but we listen here for hardware key presses, older Android soft keyboard delete presses,
 * and modern Google Keyboard delete key presses.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0005`abcdB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u000106H\u0016J\b\u0010:\u001a\u000208H\u0002J\n\u0010;\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010<\u001a\n =*\u0004\u0018\u00010&0&H\u0007J\u0018\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u000208H\u0002J\b\u0010C\u001a\u000208H\u0002J\u0012\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u0002082\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010K\u001a\u0002082\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u00020MH\u0016J\u0012\u0010O\u001a\u0002082\b\u00109\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010P\u001a\u0002082\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010Q\u001a\u0002082\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010R\u001a\u0002082\b\b\u0001\u0010S\u001a\u00020\u0007J\u0010\u0010T\u001a\u0002082\b\u0010\u001c\u001a\u0004\u0018\u00010\nJ\u0010\u0010U\u001a\u0002082\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010V\u001a\u000208H\u0007J\u0010\u0010W\u001a\u0002082\b\u0010X\u001a\u0004\u0018\u00010&J\u0012\u0010Y\u001a\u0002082\b\u0010Z\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010Y\u001a\u0002082\u0006\u0010[\u001a\u00020\u0007H\u0016J\u0017\u0010\\\u001a\u0002082\b\u0010]\u001a\u0004\u0018\u00010^H\u0000\u00a2\u0006\u0002\b_R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@AX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00078G\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0004\n\u0002\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u00020\n8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\fR\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020&0*8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u00020.2\u0006\u00102\u001a\u00020.@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u0016\u00105\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006e"}, d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "afterTextChangedListener", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "<set-?>", "Landroid/content/res/ColorStateList;", "defaultColorStateList", "getDefaultColorStateList$payments_core_debug", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_debug", "(Landroid/content/res/ColorStateList;)V", "defaultErrorColor", "defaultErrorColorInt", "getDefaultErrorColorInt", "()I", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "errorMessage", "getErrorMessage$payments_core_debug", "setErrorMessage$payments_core_debug", "(Ljava/lang/String;)V", "errorMessageListener", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "externalColorStateList", "externalErrorColor", "Ljava/lang/Integer;", "externalFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "fieldText", "getFieldText$payments_core_debug", "internalFocusChangeListeners", "", "getInternalFocusChangeListeners", "()Ljava/util/List;", "isLastKeyDelete", "", "()Z", "setLastKeyDelete", "(Z)V", "shouldShowError", "getShouldShowError", "setShouldShowError", "textWatchers", "Landroid/text/TextWatcher;", "addTextChangedListener", "", "watcher", "determineDefaultErrorColor", "getOnFocusChangeListener", "getParentOnFocusChangeListener", "kotlin.jvm.PlatformType", "isDeleteKey", "keyCode", "event", "Landroid/view/KeyEvent;", "listenForDeleteEmpty", "listenForTextChanges", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "onRestoreInstanceState", "state", "Landroid/os/Parcelable;", "onSaveInstanceState", "removeTextChangedListener", "setAfterTextChangedListener", "setDeleteEmptyListener", "setErrorColor", "errorColor", "setErrorMessage", "setErrorMessageListener", "setNumberOnlyInputType", "setOnFocusChangeListener", "listener", "setTextColor", "colors", "color", "setTextSilent", "text", "", "setTextSilent$payments_core_debug", "AfterTextChangedListener", "DeleteEmptyListener", "ErrorMessageListener", "SoftDeleteInputConnection", "StripeEditTextState", "payments-core_debug"})
public class StripeEditText extends com.google.android.material.textfield.TextInputEditText {
    private boolean isLastKeyDelete = false;
    private com.stripe.android.view.StripeEditText.AfterTextChangedListener afterTextChangedListener;
    private com.stripe.android.view.StripeEditText.DeleteEmptyListener deleteEmptyListener;
    @org.jetbrains.annotations.NotNull()
    private android.content.res.ColorStateList defaultColorStateList;
    private android.content.res.ColorStateList externalColorStateList;
    @androidx.annotation.ColorInt()
    private int defaultErrorColor = 0;
    @androidx.annotation.ColorInt()
    private java.lang.Integer externalErrorColor;
    private java.util.List<android.text.TextWatcher> textWatchers;
    
    /**
     * Gets whether or not the text should be displayed in error mode.
     *
     * Sets whether or not the text should be put into "error mode," which displays
     * the text in an error color determined by the original text color.
     */
    private boolean shouldShowError = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errorMessage;
    private com.stripe.android.view.StripeEditText.ErrorMessageListener errorMessageListener;
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    private final java.util.List<android.view.View.OnFocusChangeListener> internalFocusChangeListeners = null;
    private android.view.View.OnFocusChangeListener externalFocusChangeListener;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String accessibilityText = null;
    
    @kotlin.jvm.JvmOverloads()
    public StripeEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public StripeEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    protected final boolean isLastKeyDelete() {
        return false;
    }
    
    protected final void setLastKeyDelete(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.ColorStateList getDefaultColorStateList$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setDefaultColorStateList$payments_core_debug(@org.jetbrains.annotations.NotNull()
    android.content.res.ColorStateList p0) {
    }
    
    public final boolean getShouldShowError() {
        return false;
    }
    
    public final void setShouldShowError(boolean shouldShowError) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage$payments_core_debug() {
        return null;
    }
    
    public final void setErrorMessage$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFieldText$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.ColorInt()
    public final int getDefaultErrorColorInt() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<android.view.View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected java.lang.String getAccessibilityText() {
        return null;
    }
    
    @java.lang.Override()
    public void setTextColor(@org.jetbrains.annotations.Nullable()
    android.content.res.ColorStateList colors) {
    }
    
    @java.lang.Override()
    public void setTextColor(int color) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.inputmethod.InputConnection onCreateInputConnection(@org.jetbrains.annotations.NotNull()
    android.view.inputmethod.EditorInfo outAttrs) {
        return null;
    }
    
    /**
     * Sets a listener that can react to changes in text, but only by reflecting the new
     * text in the field.
     *
     * @param afterTextChangedListener the [AfterTextChangedListener] to attach to this view
     */
    public final void setAfterTextChangedListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.StripeEditText.AfterTextChangedListener afterTextChangedListener) {
    }
    
    /**
     * Sets a listener that can react to the user attempting to delete the empty string.
     *
     * @param deleteEmptyListener the [DeleteEmptyListener] to attach to this view
     */
    public final void setDeleteEmptyListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.StripeEditText.DeleteEmptyListener deleteEmptyListener) {
    }
    
    public final void setErrorMessageListener(@org.jetbrains.annotations.Nullable()
    com.stripe.android.view.StripeEditText.ErrorMessageListener errorMessageListener) {
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    /**
     * Sets the error text color on this [StripeEditText].
     *
     * @param errorColor a [ColorInt]
     */
    public final void setErrorColor(@androidx.annotation.ColorInt()
    int errorColor) {
    }
    
    @java.lang.Override()
    public void onInitializeAccessibilityNodeInfo(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityNodeInfo info) {
    }
    
    private final void determineDefaultErrorColor() {
    }
    
    private final void listenForTextChanges() {
    }
    
    private final void listenForDeleteEmpty() {
    }
    
    private final boolean isDeleteKey(int keyCode, android.view.KeyEvent event) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable state) {
    }
    
    @java.lang.Override()
    public final void setOnFocusChangeListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnFocusChangeListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final android.view.View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return null;
    }
    
    /**
     * Note: [addTextChangedListener] will potentially be called by a superclass constructor
     */
    @java.lang.Override()
    public void addTextChangedListener(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher watcher) {
    }
    
    @java.lang.Override()
    public void removeTextChangedListener(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher watcher) {
    }
    
    /**
     * Set text without notifying its corresponding text watchers.
     */
    public final void setTextSilent$payments_core_debug(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void setNumberOnlyInputType() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "", "onDeleteEmpty", "", "payments-core_debug"})
    public static abstract interface DeleteEmptyListener {
        
        public abstract void onDeleteEmpty();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "", "onTextChanged", "", "text", "", "payments-core_debug"})
    public static abstract interface AfterTextChangedListener {
        
        public abstract void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String text);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "", "displayErrorMessage", "", "message", "", "payments-core_debug"})
    public static abstract interface ErrorMessageListener {
        
        public abstract void displayErrorMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String message);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;", "Landroid/view/inputmethod/InputConnectionWrapper;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "payments-core_debug"})
    static final class SoftDeleteInputConnection extends android.view.inputmethod.InputConnectionWrapper {
        private final com.stripe.android.view.StripeEditText.DeleteEmptyListener deleteEmptyListener = null;
        
        public SoftDeleteInputConnection(@org.jetbrains.annotations.NotNull()
        android.view.inputmethod.InputConnection target, boolean mutable, @org.jetbrains.annotations.Nullable()
        com.stripe.android.view.StripeEditText.DeleteEmptyListener deleteEmptyListener) {
            super(null, false);
        }
        
        @java.lang.Override()
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            return false;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/StripeEditText$StripeEditTextState;", "Landroid/os/Parcelable;", "superState", "errorMessage", "", "shouldShowError", "", "(Landroid/os/Parcelable;Ljava/lang/String;Z)V", "getErrorMessage", "()Ljava/lang/String;", "getShouldShowError", "()Z", "getSuperState", "()Landroid/os/Parcelable;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_debug"})
    public static final class StripeEditTextState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final android.os.Parcelable superState = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMessage = null;
        private final boolean shouldShowError = false;
        public static final android.os.Parcelable.Creator<com.stripe.android.view.StripeEditText.StripeEditTextState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.view.StripeEditText.StripeEditTextState copy(@org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage, boolean shouldShowError) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public StripeEditTextState(@org.jetbrains.annotations.Nullable()
        android.os.Parcelable superState, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage, boolean shouldShowError) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Parcelable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.os.Parcelable getSuperState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getShouldShowError() {
            return false;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.view.StripeEditText.StripeEditTextState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.StripeEditText.StripeEditTextState createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.view.StripeEditText.StripeEditTextState[] newArray(int size) {
                return null;
            }
        }
    }
}
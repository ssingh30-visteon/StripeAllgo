package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\u0012\u0010\u001c\u001a\u00020\u00172\b\b\u0001\u0010\u001d\u001a\u00020\u0007H\u0002R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/stripe/android/view/PostalCodeEditText$Config;", "config", "getConfig$payments_core_debug", "()Lcom/stripe/android/view/PostalCodeEditText$Config;", "setConfig$payments_core_debug", "(Lcom/stripe/android/view/PostalCodeEditText$Config;)V", "config$delegate", "Lkotlin/properties/ReadWriteProperty;", "postalCode", "", "getPostalCode$payments_core_debug", "()Ljava/lang/String;", "configureForGlobal", "", "configureForUs", "getTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "onFinishInflate", "updateHint", "hintRes", "Companion", "Config", "payments-core_debug"})
public final class PostalCodeEditText extends com.stripe.android.view.StripeEditText {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty config$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.PostalCodeEditText.Companion Companion = null;
    @java.lang.Deprecated()
    private static final int MAX_LENGTH_US = 5;
    @java.lang.Deprecated()
    private static final java.util.regex.Pattern ZIP_CODE_PATTERN = null;
    
    @kotlin.jvm.JvmOverloads()
    public PostalCodeEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PostalCodeEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public PostalCodeEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.PostalCodeEditText.Config getConfig$payments_core_debug() {
        return null;
    }
    
    public final void setConfig$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.PostalCodeEditText.Config p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostalCode$payments_core_debug() {
        return null;
    }
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    /**
     * Configure the field for United States users
     */
    private final void configureForUs() {
    }
    
    /**
     * Configure the field for global users
     */
    private final void configureForGlobal() {
    }
    
    /**
     * If a `TextInputLayout` is an ancestor of this view, set the hint on it. Otherwise, set
     * the hint on this view.
     */
    private final void updateHint(@androidx.annotation.StringRes()
    int hintRes) {
    }
    
    /**
     * Copied from `TextInputEditText`
     */
    private final com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Config;", "", "(Ljava/lang/String;I)V", "Global", "US", "payments-core_debug"})
    public static enum Config {
        /*public static final*/ Global /* = new Global() */,
        /*public static final*/ US /* = new US() */;
        
        Config() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Companion;", "", "()V", "MAX_LENGTH_US", "", "ZIP_CODE_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
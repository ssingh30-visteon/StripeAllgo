package com.stripe.android.view;

import java.lang.System;

/**
 * A form for accepting a customer's BECS account information.
 *
 * A company name is required to render this widget. A company name can either be specified by
 * passing it to the [BecsDebitWidget] constructor, or via XML:
 *
 * ```
 * <com.stripe.android.view.BecsDebitWidget
 *  android:id="@+id/element"
 *  android:layout_width="match_parent"
 *  android:layout_height="wrap_content"
 *  app:companyName="@string/becs_company_name" />
 * ```
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010 \u001a\u00020\u001fH\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198@X\u0080\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\""}, d2 = {"Lcom/stripe/android/view/BecsDebitWidget;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "companyName", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V", "isInputValid", "", "()Z", "params", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "validParamsCallback", "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "getValidParamsCallback", "()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "setValidParamsCallback", "(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V", "viewBinding", "Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "getViewBinding$payments_core_debug", "()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "applyAttributes", "", "verifyCompanyName", "ValidParamsCallback", "payments-core_debug"})
public final class BecsDebitWidget extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewBinding$delegate = null;
    
    /**
     * See [ValidParamsCallback].
     */
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.view.BecsDebitWidget.ValidParamsCallback validParamsCallback;
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.databinding.BecsDebitWidgetBinding getViewBinding$payments_core_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.BecsDebitWidget.ValidParamsCallback getValidParamsCallback() {
        return null;
    }
    
    public final void setValidParamsCallback(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.BecsDebitWidget.ValidParamsCallback p0) {
    }
    
    private final boolean isInputValid() {
        return false;
    }
    
    private final void verifyCompanyName() {
    }
    
    private final void applyAttributes(android.util.AttributeSet attrs) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PaymentMethodCreateParams getParams() {
        return null;
    }
    
    /**
     * An interface for a callback object that will be called when the user's input changes.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "", "onInputChanged", "", "isValid", "", "payments-core_debug"})
    public static abstract interface ValidParamsCallback {
        
        /**
         * @param isValid if the current input is valid
         */
        public abstract void onInputChanged(boolean isValid);
    }
}
package com.stripe.android.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/BecsDebitAccountNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "minLength", "getMinLength", "()I", "setMinLength", "(I)V", "Companion", "payments-core_debug"})
public final class BecsDebitAccountNumberEditText extends com.stripe.android.view.StripeEditText {
    private int minLength = 5;
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.view.BecsDebitAccountNumberEditText.Companion Companion = null;
    public static final int DEFAULT_MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 9;
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitAccountNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitAccountNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public BecsDebitAccountNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountNumber() {
        return null;
    }
    
    public final int getMinLength() {
        return 0;
    }
    
    public final void setMinLength(int p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;", "", "()V", "DEFAULT_MIN_LENGTH", "", "MAX_LENGTH", "payments-core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
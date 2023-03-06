package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants;", "", "()V", "Error", "Valid", "paymentsheet_debug"})
public final class TextFieldStateConstants {
    
    public TextFieldStateConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016\u0082\u0001\u0002\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid;", "Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "()V", "getError", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "isBlank", "", "isValid", "shouldShowError", "hasFocus", "Full", "Limitless", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid$Full;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid$Limitless;", "paymentsheet_debug"})
    public static abstract class Valid implements com.stripe.android.paymentsheet.elements.TextFieldState {
        
        private Valid() {
            super();
        }
        
        @java.lang.Override()
        public boolean shouldShowError(boolean hasFocus) {
            return false;
        }
        
        @java.lang.Override()
        public boolean isValid() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.stripe.android.paymentsheet.elements.FieldError getError() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isBlank() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid$Full;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid;", "()V", "isFull", "", "paymentsheet_debug"})
        public static final class Full extends com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Valid {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Valid.Full INSTANCE = null;
            
            private Full() {
                super();
            }
            
            @java.lang.Override()
            public boolean isFull() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid$Limitless;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Valid;", "()V", "isFull", "", "paymentsheet_debug"})
        public static final class Limitless extends com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Valid {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Valid.Limitless INSTANCE = null;
            
            private Limitless() {
                super();
            }
            
            @java.lang.Override()
            public boolean isFull() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B%\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0015\u0016\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error;", "Lcom/stripe/android/paymentsheet/elements/TextFieldState;", "errorMessageResId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)V", "getErrorMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getError", "Lcom/stripe/android/paymentsheet/elements/FieldError;", "isFull", "", "isValid", "Blank", "Incomplete", "Invalid", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error$Incomplete;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error$Invalid;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error$Blank;", "paymentsheet_debug"})
    public static abstract class Error implements com.stripe.android.paymentsheet.elements.TextFieldState {
        private final int errorMessageResId = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Object[] formatArgs = null;
        
        private Error(@androidx.annotation.StringRes()
        int errorMessageResId, java.lang.Object[] formatArgs) {
            super();
        }
        
        protected int getErrorMessageResId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        protected java.lang.Object[] getFormatArgs() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isValid() {
            return false;
        }
        
        @java.lang.Override()
        public boolean isFull() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.paymentsheet.elements.FieldError getError() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error$Incomplete;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error;", "errorMessageResId", "", "(I)V", "getErrorMessageResId", "()I", "isBlank", "", "shouldShowError", "hasFocus", "paymentsheet_debug"})
        public static final class Incomplete extends com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Error {
            private final int errorMessageResId = 0;
            
            public Incomplete(@androidx.annotation.StringRes()
            int errorMessageResId) {
                super(0, null);
            }
            
            @java.lang.Override()
            protected int getErrorMessageResId() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean shouldShowError(boolean hasFocus) {
                return false;
            }
            
            @java.lang.Override()
            public boolean isBlank() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error$Invalid;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error;", "errorMessageResId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)V", "getErrorMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "isBlank", "", "shouldShowError", "hasFocus", "paymentsheet_debug"})
        public static final class Invalid extends com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Error {
            private final int errorMessageResId = 0;
            @org.jetbrains.annotations.Nullable()
            private final java.lang.Object[] formatArgs = null;
            
            public Invalid(@androidx.annotation.StringRes()
            int errorMessageResId, @org.jetbrains.annotations.Nullable()
            java.lang.Object[] formatArgs) {
                super(0, null);
            }
            
            @java.lang.Override()
            protected int getErrorMessageResId() {
                return 0;
            }
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            protected java.lang.Object[] getFormatArgs() {
                return null;
            }
            
            @java.lang.Override()
            public boolean shouldShowError(boolean hasFocus) {
                return false;
            }
            
            @java.lang.Override()
            public boolean isBlank() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error$Blank;", "Lcom/stripe/android/paymentsheet/elements/TextFieldStateConstants$Error;", "()V", "isBlank", "", "shouldShowError", "hasFocus", "paymentsheet_debug"})
        public static final class Blank extends com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Error {
            @org.jetbrains.annotations.NotNull()
            public static final com.stripe.android.paymentsheet.elements.TextFieldStateConstants.Error.Blank INSTANCE = null;
            
            private Blank() {
                super(0, null);
            }
            
            @java.lang.Override()
            public boolean shouldShowError(boolean hasFocus) {
                return false;
            }
            
            @java.lang.Override()
            public boolean isBlank() {
                return false;
            }
        }
    }
}
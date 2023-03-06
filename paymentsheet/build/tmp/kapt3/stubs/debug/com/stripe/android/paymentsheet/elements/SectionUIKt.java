package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a6\u0010\u0000\u001a\u00020\u00012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\bH\u0001\u00a2\u0006\u0002\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\bH\u0001\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0019\u0010\f\u001a\u00020\u00012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0001\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Section", "", "title", "", "error", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "SectionCard", "SectionError", "SectionTitle", "titleText", "(Ljava/lang/Integer;)V", "paymentsheet_debug"})
public final class SectionUIKt {
    
    /**
     * This is a simple section that holds content in a card view.  It has a label, content specified
     * by the caller, and an error string.
     */
    @androidx.compose.runtime.Composable()
    public static final void Section(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer title, @org.jetbrains.annotations.Nullable()
    java.lang.String error, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    /**
     * This is the layout for the section title
     */
    @androidx.compose.runtime.Composable()
    public static final void SectionTitle(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.StringRes()
    java.lang.Integer titleText) {
    }
    
    /**
     * This is the layout for the section card.
     */
    @androidx.compose.runtime.Composable()
    public static final void SectionCard(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    /**
     * This is how error string for the section are displayed.
     */
    @androidx.compose.runtime.Composable()
    public static final void SectionError(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
}
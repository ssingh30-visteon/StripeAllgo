package com.stripe.android.paymentsheet.elements;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"TextField", "", "textFieldController", "Lcom/stripe/android/paymentsheet/elements/TextFieldController;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "nextFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/focus/FocusRequester;)I", "paymentsheet_debug"})
public final class TextFieldUIKt {
    
    /**
     * This is a helpful method for setting the next action based on the nextFocus Requester
     */
    public static final int imeAction(@org.jetbrains.annotations.Nullable()
    androidx.compose.ui.focus.FocusRequester nextFocusRequester) {
        return 0;
    }
    
    /**
     * This is focused on converting an `Element` into what is displayed in a textField.
     * - some focus logic
     * - observes values that impact how things show on the screen
     * - calls through to the Elements worker functions for focus change and value change events
     */
    @androidx.compose.runtime.Composable()
    public static final void TextField(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.TextFieldController textFieldController, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, boolean enabled) {
    }
}
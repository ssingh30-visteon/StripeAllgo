package com.stripe.android.view;

import java.lang.System;

/**
 * Class used to encapsulate the functionality of "backing up" via the delete/backspace key
 * from one text field to the previous. We use this to simulate multiple fields being all part
 * of the same EditText, so a delete key entry from field N+1 deletes the last character in
 * field N. Each BackUpFieldDeleteListener is attached to the N+1 field, from which it gets
 * its [onDeleteEmpty] call, and given a reference to the N field, upon which
 * it will be acting.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/BackUpFieldDeleteListener;", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "backUpTarget", "Lcom/stripe/android/view/StripeEditText;", "(Lcom/stripe/android/view/StripeEditText;)V", "onDeleteEmpty", "", "payments-core_debug"})
public final class BackUpFieldDeleteListener implements com.stripe.android.view.StripeEditText.DeleteEmptyListener {
    private final com.stripe.android.view.StripeEditText backUpTarget = null;
    
    public BackUpFieldDeleteListener(@org.jetbrains.annotations.NotNull()
    com.stripe.android.view.StripeEditText backUpTarget) {
        super();
    }
    
    @java.lang.Override()
    public void onDeleteEmpty() {
    }
}
package com.stripe.android.view;

import java.lang.System;

/**
 * A class for tracking the placement and layout of fields in [CardInputWidget].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bZ\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 w2\u00020\u0001:\u0001wB\u00a5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010<\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b?J\u000e\u0010@\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bAJ\u000e\u0010B\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bCJ\u000e\u0010D\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bGJ\u000e\u0010H\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bIJ\u000e\u0010J\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bKJ\u000e\u0010L\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bMJ\u000e\u0010N\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bOJ\u000e\u0010P\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bQJ\u000e\u0010R\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bSJ\u000e\u0010T\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bUJ\u000e\u0010V\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bWJ\u000e\u0010X\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\bYJ\u000e\u0010Z\u001a\u00020\u0003H\u00c0\u0003\u00a2\u0006\u0002\b[J\u00a9\u0001\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0015\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020^H\u0000\u00a2\u0006\u0002\bbJ\u0015\u0010c\u001a\u00020\u00032\u0006\u0010a\u001a\u00020^H\u0000\u00a2\u0006\u0002\bdJ/\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020^2\u0006\u0010j\u001a\u00020^H\u0000\u00a2\u0006\u0002\bkJ\u0015\u0010l\u001a\u00020\u00032\u0006\u0010a\u001a\u00020^H\u0000\u00a2\u0006\u0002\bmJ\t\u0010n\u001a\u00020\u0003H\u00d6\u0001J\u0010\u0010o\u001a\u00020\u00032\u0006\u0010p\u001a\u00020\u0003H\u0002J\b\u0010q\u001a\u00020rH\u0016J-\u0010s\u001a\u00020t2\u0006\u0010i\u001a\u00020^2\u0006\u0010j\u001a\u00020^2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\bvR\u001a\u0010\u0007\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b\'\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u0010\u0017R\u001a\u0010\f\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017\u00a8\u0006x"}, d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement;", "", "totalLengthInPixels", "", "cardWidth", "hiddenCardWidth", "peekCardWidth", "cardDateSeparation", "dateWidth", "dateCvcSeparation", "cvcWidth", "cvcPostalCodeSeparation", "postalCodeWidth", "cardTouchBufferLimit", "dateStartPosition", "dateEndTouchBufferLimit", "cvcStartPosition", "cvcEndTouchBufferLimit", "postalCodeStartPosition", "(IIIIIIIIIIIIIIII)V", "getCardDateSeparation$payments_core_debug", "()I", "setCardDateSeparation$payments_core_debug", "(I)V", "cardPeekCvcStartMargin", "getCardPeekCvcStartMargin", "cardPeekDateStartMargin", "getCardPeekDateStartMargin", "cardPeekPostalCodeStartMargin", "getCardPeekPostalCodeStartMargin", "getCardTouchBufferLimit$payments_core_debug", "setCardTouchBufferLimit$payments_core_debug", "getCardWidth$payments_core_debug", "setCardWidth$payments_core_debug", "getCvcEndTouchBufferLimit$payments_core_debug", "setCvcEndTouchBufferLimit$payments_core_debug", "getCvcPostalCodeSeparation$payments_core_debug", "setCvcPostalCodeSeparation$payments_core_debug", "getCvcStartPosition$payments_core_debug", "setCvcStartPosition$payments_core_debug", "getCvcWidth$payments_core_debug", "setCvcWidth$payments_core_debug", "getDateCvcSeparation$payments_core_debug", "setDateCvcSeparation$payments_core_debug", "getDateEndTouchBufferLimit$payments_core_debug", "setDateEndTouchBufferLimit$payments_core_debug", "getDateStartPosition$payments_core_debug", "setDateStartPosition$payments_core_debug", "getDateWidth$payments_core_debug", "setDateWidth$payments_core_debug", "getHiddenCardWidth$payments_core_debug", "setHiddenCardWidth$payments_core_debug", "getPeekCardWidth$payments_core_debug", "setPeekCardWidth$payments_core_debug", "getPostalCodeStartPosition$payments_core_debug", "setPostalCodeStartPosition$payments_core_debug", "getPostalCodeWidth$payments_core_debug", "setPostalCodeWidth$payments_core_debug", "getTotalLengthInPixels$payments_core_debug", "setTotalLengthInPixels$payments_core_debug", "component1", "component1$payments_core_debug", "component10", "component10$payments_core_debug", "component11", "component11$payments_core_debug", "component12", "component12$payments_core_debug", "component13", "component13$payments_core_debug", "component14", "component14$payments_core_debug", "component15", "component15$payments_core_debug", "component16", "component16$payments_core_debug", "component2", "component2$payments_core_debug", "component3", "component3$payments_core_debug", "component4", "component4$payments_core_debug", "component5", "component5$payments_core_debug", "component6", "component6$payments_core_debug", "component7", "component7$payments_core_debug", "component8", "component8$payments_core_debug", "component9", "component9$payments_core_debug", "copy", "equals", "", "other", "getCvcStartMargin", "isFullCard", "getCvcStartMargin$payments_core_debug", "getDateStartMargin", "getDateStartMargin$payments_core_debug", "getFocusField", "Lcom/stripe/android/view/CardInputWidget$Field;", "touchX", "frameStart", "isShowingFullCard", "postalCodeEnabled", "getFocusField$payments_core_debug", "getPostalCodeStartMargin", "getPostalCodeStartMargin$payments_core_debug", "hashCode", "toMinimalValueIfNegative", "value", "toString", "", "updateSpacing", "", "frameWidth", "updateSpacing$payments_core_debug", "Companion", "payments-core_debug"})
public final class CardInputWidgetPlacement {
    private int totalLengthInPixels;
    private int cardWidth;
    private int hiddenCardWidth;
    private int peekCardWidth;
    private int cardDateSeparation;
    private int dateWidth;
    private int dateCvcSeparation;
    private int cvcWidth;
    private int cvcPostalCodeSeparation;
    private int postalCodeWidth;
    private int cardTouchBufferLimit;
    private int dateStartPosition;
    private int dateEndTouchBufferLimit;
    private int cvcStartPosition;
    private int cvcEndTouchBufferLimit;
    private int postalCodeStartPosition;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.view.CardInputWidgetPlacement.Companion Companion = null;
    @java.lang.Deprecated()
    public static final int MIN_SEPARATION_IN_PX = 10;
    
    /**
     * A class for tracking the placement and layout of fields in [CardInputWidget].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.view.CardInputWidgetPlacement copy(int totalLengthInPixels, int cardWidth, int hiddenCardWidth, int peekCardWidth, int cardDateSeparation, int dateWidth, int dateCvcSeparation, int cvcWidth, int cvcPostalCodeSeparation, int postalCodeWidth, int cardTouchBufferLimit, int dateStartPosition, int dateEndTouchBufferLimit, int cvcStartPosition, int cvcEndTouchBufferLimit, int postalCodeStartPosition) {
        return null;
    }
    
    /**
     * A class for tracking the placement and layout of fields in [CardInputWidget].
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * A class for tracking the placement and layout of fields in [CardInputWidget].
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public CardInputWidgetPlacement() {
        super();
    }
    
    public CardInputWidgetPlacement(int totalLengthInPixels, int cardWidth, int hiddenCardWidth, int peekCardWidth, int cardDateSeparation, int dateWidth, int dateCvcSeparation, int cvcWidth, int cvcPostalCodeSeparation, int postalCodeWidth, int cardTouchBufferLimit, int dateStartPosition, int dateEndTouchBufferLimit, int cvcStartPosition, int cvcEndTouchBufferLimit, int postalCodeStartPosition) {
        super();
    }
    
    public final int component1$payments_core_debug() {
        return 0;
    }
    
    public final int getTotalLengthInPixels$payments_core_debug() {
        return 0;
    }
    
    public final void setTotalLengthInPixels$payments_core_debug(int p0) {
    }
    
    public final int component2$payments_core_debug() {
        return 0;
    }
    
    public final int getCardWidth$payments_core_debug() {
        return 0;
    }
    
    public final void setCardWidth$payments_core_debug(int p0) {
    }
    
    public final int component3$payments_core_debug() {
        return 0;
    }
    
    public final int getHiddenCardWidth$payments_core_debug() {
        return 0;
    }
    
    public final void setHiddenCardWidth$payments_core_debug(int p0) {
    }
    
    public final int component4$payments_core_debug() {
        return 0;
    }
    
    public final int getPeekCardWidth$payments_core_debug() {
        return 0;
    }
    
    public final void setPeekCardWidth$payments_core_debug(int p0) {
    }
    
    public final int component5$payments_core_debug() {
        return 0;
    }
    
    public final int getCardDateSeparation$payments_core_debug() {
        return 0;
    }
    
    public final void setCardDateSeparation$payments_core_debug(int p0) {
    }
    
    public final int component6$payments_core_debug() {
        return 0;
    }
    
    public final int getDateWidth$payments_core_debug() {
        return 0;
    }
    
    public final void setDateWidth$payments_core_debug(int p0) {
    }
    
    public final int component7$payments_core_debug() {
        return 0;
    }
    
    public final int getDateCvcSeparation$payments_core_debug() {
        return 0;
    }
    
    public final void setDateCvcSeparation$payments_core_debug(int p0) {
    }
    
    public final int component8$payments_core_debug() {
        return 0;
    }
    
    public final int getCvcWidth$payments_core_debug() {
        return 0;
    }
    
    public final void setCvcWidth$payments_core_debug(int p0) {
    }
    
    public final int component9$payments_core_debug() {
        return 0;
    }
    
    public final int getCvcPostalCodeSeparation$payments_core_debug() {
        return 0;
    }
    
    public final void setCvcPostalCodeSeparation$payments_core_debug(int p0) {
    }
    
    public final int component10$payments_core_debug() {
        return 0;
    }
    
    public final int getPostalCodeWidth$payments_core_debug() {
        return 0;
    }
    
    public final void setPostalCodeWidth$payments_core_debug(int p0) {
    }
    
    public final int component11$payments_core_debug() {
        return 0;
    }
    
    public final int getCardTouchBufferLimit$payments_core_debug() {
        return 0;
    }
    
    public final void setCardTouchBufferLimit$payments_core_debug(int p0) {
    }
    
    public final int component12$payments_core_debug() {
        return 0;
    }
    
    public final int getDateStartPosition$payments_core_debug() {
        return 0;
    }
    
    public final void setDateStartPosition$payments_core_debug(int p0) {
    }
    
    public final int component13$payments_core_debug() {
        return 0;
    }
    
    public final int getDateEndTouchBufferLimit$payments_core_debug() {
        return 0;
    }
    
    public final void setDateEndTouchBufferLimit$payments_core_debug(int p0) {
    }
    
    public final int component14$payments_core_debug() {
        return 0;
    }
    
    public final int getCvcStartPosition$payments_core_debug() {
        return 0;
    }
    
    public final void setCvcStartPosition$payments_core_debug(int p0) {
    }
    
    public final int component15$payments_core_debug() {
        return 0;
    }
    
    public final int getCvcEndTouchBufferLimit$payments_core_debug() {
        return 0;
    }
    
    public final void setCvcEndTouchBufferLimit$payments_core_debug(int p0) {
    }
    
    public final int component16$payments_core_debug() {
        return 0;
    }
    
    public final int getPostalCodeStartPosition$payments_core_debug() {
        return 0;
    }
    
    public final void setPostalCodeStartPosition$payments_core_debug(int p0) {
    }
    
    private final int toMinimalValueIfNegative(int value) {
        return 0;
    }
    
    /**
     * Checks on the horizontal position of a touch event to see if
     * that event needs to be associated with one of the controls even
     * without having actually touched it. This essentially gives a larger
     * touch surface to the controls. We return `null` if the user touches
     * actually inside the widget because no interception is necessary - the touch will
     * naturally give focus to that control, and we don't want to interfere with what
     * Android will naturally do in response to that touch.
     *
     * @param touchX distance in pixels from the start of this control
     * @return a [Field] that represents the [View] to request focus, or `null`
     * if no such request is necessary.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.view.CardInputWidget.Field getFocusField$payments_core_debug(int touchX, int frameStart, boolean isShowingFullCard, boolean postalCodeEnabled) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/CardInputWidgetPlacement$Companion;", "", "()V", "MIN_SEPARATION_IN_PX", "", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
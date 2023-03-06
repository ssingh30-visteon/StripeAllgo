package com.stripe.android.view;

import java.lang.System;

/**
 * A [StripeEditText] that handles spacing out the digits of a credit card.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001:\u0001jB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bB7\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\u0010\u000eBO\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J/\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\bZJ\b\u0010[\u001a\u00020+H\u0002J\u0017\u0010\\\u001a\u00020+2\b\u0010]\u001a\u0004\u0018\u00010\u001cH\u0000\u00a2\u0006\u0002\b^J\b\u0010_\u001a\u00020+H\u0014J\r\u0010`\u001a\u00020+H\u0000\u00a2\u0006\u0002\baJ\b\u0010b\u001a\u00020+H\u0014J\u0015\u0010c\u001a\u00020+2\u0006\u0010d\u001a\u00020KH\u0000\u00a2\u0006\u0002\beJ\u0010\u0010f\u001a\u00020@2\u0006\u0010d\u001a\u00020KH\u0002J\u0017\u0010g\u001a\u00020+2\b\b\u0002\u0010h\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\biR\u0014\u0010\u0018\u001a\u00020\r8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u00101\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020*8\u0006@@X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b2\u0010#\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u00107\u001a\b\u0012\u0004\u0012\u00020+0\fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010>R\u001e\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020@@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020+0)X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R\u0014\u0010F\u001a\u00020@8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bF\u0010BR\u0010\u0010G\u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u00020\u00078@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\bI\u0010>R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010J\u001a\u00020K8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010O8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010\t\u001a\u00020\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010U\u00a8\u0006k"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "workContext", "Lkotlin/coroutines/CoroutineContext;", "publishableKeySupplier", "Lkotlin/Function0;", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)V", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "accessibilityText", "getAccessibilityText", "()Ljava/lang/String;", "value", "Lcom/stripe/android/model/AccountRange;", "accountRange", "setAccountRange", "(Lcom/stripe/android/model/AccountRange;)V", "accountRangeRepositoryJob", "Lkotlinx/coroutines/Job;", "getAccountRangeRepositoryJob$payments_core_debug$annotations", "()V", "getAccountRangeRepositoryJob$payments_core_debug", "()Lkotlinx/coroutines/Job;", "setAccountRangeRepositoryJob$payments_core_debug", "(Lkotlinx/coroutines/Job;)V", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/model/CardBrand;", "", "brandChangeCallback", "getBrandChangeCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function1;", "setBrandChangeCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function1;)V", "cardBrand", "getCardBrand$annotations", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "setCardBrand$payments_core_debug", "(Lcom/stripe/android/model/CardBrand;)V", "completionCallback", "getCompletionCallback$payments_core_debug", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_debug", "(Lkotlin/jvm/functions/Function0;)V", "formattedPanLength", "getFormattedPanLength", "()I", "<set-?>", "", "isCardNumberValid", "()Z", "isLoadingCallback", "isLoadingCallback$payments_core_debug", "setLoadingCallback$payments_core_debug", "isValid", "loadingJob", "panLength", "getPanLength$payments_core_debug", "unvalidatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "getUnvalidatedCardNumber", "()Lcom/stripe/android/cards/CardNumber$Unvalidated;", "validatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_debug", "()Lcom/stripe/android/cards/CardNumber$Validated;", "getWorkContext$payments_core_debug", "()Lkotlin/coroutines/CoroutineContext;", "setWorkContext$payments_core_debug", "(Lkotlin/coroutines/CoroutineContext;)V", "calculateCursorPosition", "newFormattedLength", "start", "addedDigits", "calculateCursorPosition$payments_core_debug", "cancelAccountRangeRepositoryJob", "onAccountRangeResult", "newAccountRange", "onAccountRangeResult$payments_core_debug", "onAttachedToWindow", "onCardMetadataLoadedTooSlow", "onCardMetadataLoadedTooSlow$payments_core_debug", "onDetachedFromWindow", "queryAccountRangeRepository", "cardNumber", "queryAccountRangeRepository$payments_core_debug", "shouldQueryAccountRange", "updateLengthFilter", "maxLength", "updateLengthFilter$payments_core_debug", "CardNumberTextWatcher", "payments-core_debug"})
public final class CardNumberEditText extends com.stripe.android.view.StripeEditText {
    @org.jetbrains.annotations.NotNull()
    private kotlin.coroutines.CoroutineContext workContext;
    private final com.stripe.android.cards.CardAccountRangeRepository cardAccountRangeRepository = null;
    private final com.stripe.android.cards.StaticCardAccountRanges staticCardAccountRanges = null;
    private final com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor = null;
    private final com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = null;
    @org.jetbrains.annotations.NotNull()
    private com.stripe.android.model.CardBrand cardBrand = com.stripe.android.model.CardBrand.Unknown;
    private com.stripe.android.model.AccountRange accountRange;
    
    /**
     * Check whether or not the card number is valid
     */
    private boolean isCardNumberValid = false;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job accountRangeRepositoryJob;
    private kotlinx.coroutines.Job loadingJob;
    
    public CardNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext workContext, @org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.CardAccountRangeRepository cardAccountRangeRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.cards.StaticCardAccountRanges staticCardAccountRanges, @org.jetbrains.annotations.NotNull()
    com.stripe.android.core.networking.AnalyticsRequestExecutor analyticsRequestExecutor, @org.jetbrains.annotations.NotNull()
    com.stripe.android.networking.PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext getWorkContext$payments_core_debug() {
        return null;
    }
    
    public final void setWorkContext$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext p0) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads()
    public CardNumberEditText(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private CardNumberEditText(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, kotlin.coroutines.CoroutineContext workContext, kotlin.jvm.functions.Function0<java.lang.String> publishableKeySupplier) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.CardBrand getCardBrand() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getCardBrand$annotations() {
    }
    
    public final void setCardBrand$payments_core_debug(@org.jetbrains.annotations.NotNull()
    com.stripe.android.model.CardBrand value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.stripe.android.model.CardBrand, kotlin.Unit> getBrandChangeCallback$payments_core_debug() {
        return null;
    }
    
    public final void setBrandChangeCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.stripe.android.model.CardBrand, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCompletionCallback$payments_core_debug() {
        return null;
    }
    
    public final void setCompletionCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    private final void setAccountRange(com.stripe.android.model.AccountRange value) {
    }
    
    public final int getPanLength$payments_core_debug() {
        return 0;
    }
    
    private final int getFormattedPanLength() {
        return 0;
    }
    
    public final boolean isCardNumberValid() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.cards.CardNumber.Validated getValidatedCardNumber$payments_core_debug() {
        return null;
    }
    
    private final com.stripe.android.cards.CardNumber.Unvalidated getUnvalidatedCardNumber() {
        return null;
    }
    
    private final boolean isValid() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getAccountRangeRepositoryJob$payments_core_debug() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    @java.lang.Deprecated()
    public static void getAccountRangeRepositoryJob$payments_core_debug$annotations() {
    }
    
    public final void setAccountRangeRepositoryJob$payments_core_debug(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> isLoadingCallback$payments_core_debug() {
        return null;
    }
    
    public final void setLoadingCallback$payments_core_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getAccessibilityText() {
        return null;
    }
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    private final void cancelAccountRangeRepositoryJob() {
    }
    
    private final boolean shouldQueryAccountRange(com.stripe.android.cards.CardNumber.Unvalidated cardNumber) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J*\u0010\u0017\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0002J(\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0004H\u0002J*\u0010\"\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\b\u00a8\u0006\'"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;", "Lcom/stripe/android/view/StripeTextWatcher;", "(Lcom/stripe/android/view/CardNumberEditText;)V", "beforeCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "digitsAdded", "", "getDigitsAdded", "()Z", "formattedNumber", "", "isPastedPan", "latestChangeStart", "", "latestInsertionSize", "newCursorPosition", "Ljava/lang/Integer;", "shouldUpdateAfterChange", "getShouldUpdateAfterChange", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "isComplete", "wasCardNumberValid", "startPosition", "previousCount", "currentCount", "cardNumber", "onTextChanged", "before", "shouldQueryRepository", "accountRange", "Lcom/stripe/android/model/AccountRange;", "payments-core_debug"})
    final class CardNumberTextWatcher extends com.stripe.android.view.StripeTextWatcher {
        private int latestChangeStart = 0;
        private int latestInsertionSize = 0;
        private java.lang.Integer newCursorPosition;
        private java.lang.String formattedNumber;
        private com.stripe.android.cards.CardNumber.Unvalidated beforeCardNumber;
        private boolean isPastedPan = false;
        
        public CardNumberTextWatcher() {
            super();
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence s, int start, int count, int after) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.Nullable()
        java.lang.CharSequence s, int start, int before, int count) {
        }
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.Nullable()
        android.text.Editable s) {
        }
        
        private final boolean getShouldUpdateAfterChange() {
            return false;
        }
        
        private final boolean getDigitsAdded() {
            return false;
        }
        
        /**
         * If `true`, [completionCallback] will be invoked.
         */
        private final boolean isComplete(boolean wasCardNumberValid) {
            return false;
        }
        
        /**
         * The [currentCount] characters beginning at [startPosition] have just replaced old text
         * that had length [previousCount]. If [currentCount] < [previousCount], digits were
         * deleted.
         */
        private final boolean isPastedPan(int startPosition, int previousCount, int currentCount, com.stripe.android.cards.CardNumber.Unvalidated cardNumber) {
            return false;
        }
        
        private final boolean shouldQueryRepository(com.stripe.android.model.AccountRange accountRange) {
            return false;
        }
    }
}
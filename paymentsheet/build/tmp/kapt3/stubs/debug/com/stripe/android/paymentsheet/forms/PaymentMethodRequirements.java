package com.stripe.android.paymentsheet.forms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ>\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "", "piRequirements", "", "Lcom/stripe/android/paymentsheet/forms/PIRequirement;", "siRequirements", "Lcom/stripe/android/paymentsheet/forms/SIRequirement;", "confirmPMFromCustomer", "", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V", "getConfirmPMFromCustomer", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPiRequirements", "()Ljava/util/Set;", "getSiRequirements", "component1", "component2", "component3", "copy", "(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "equals", "other", "hashCode", "", "toString", "", "paymentsheet_debug"})
public final class PaymentMethodRequirements {
    
    /**
     * These are the requirements for using a PaymentIntent.
     * - Only [PIRequirement]s are allowed in this set.
     * - If this is null, PaymentIntents (even if SFU is set) are not supported by this LPM.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Set<com.stripe.android.paymentsheet.forms.PIRequirement> piRequirements = null;
    
    /**
     * These are the requirements for using a SetupIntent.
     *  - Only [SIRequirement]s are allowed in this set.
     *  - If this is null SetupIntents and PaymentIntents with SFU set are not
     *  supported by this LPM. If SetupIntents are supported, but there are
     *  no additional requirements this must be an emptySet.
     *  - In order to make sure the PM can be used when attached to a customer it
     *  must include the requirements of the saved payment method.  For instance,
     *  Bancontact is not delayed, but when saved it is represented as a SEPA paymnent
     *  method which is delayed.  So there must be Delay support in order to meet
     *  the requiremetns of this PM.  (There was a consideration of adding a SaveType
     *  that in cases where SI or PIw/SFU it would also check the requirements of
     *  the SaveType - not sure if the SaveType pi and/or si requirements should be checked).
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Set<com.stripe.android.paymentsheet.forms.SIRequirement> siRequirements = null;
    
    /**
     * This indicates if the payment method can be confirmed when attached to a customer
     * and only the Payment Method id is available.
     * - Null means that it is not supported, or that it is attached as a different type
     * - false means that it is supported by the payment method, but not currently enabled
     * (likely because of a lack of mandate support)
     * - true means that a PM of this type attached to a customer can be confirmed
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean confirmPMFromCustomer = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.forms.PaymentMethodRequirements copy(@org.jetbrains.annotations.Nullable()
    java.util.Set<? extends com.stripe.android.paymentsheet.forms.PIRequirement> piRequirements, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends com.stripe.android.paymentsheet.forms.SIRequirement> siRequirements, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean confirmPMFromCustomer) {
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
    
    public PaymentMethodRequirements(@org.jetbrains.annotations.Nullable()
    java.util.Set<? extends com.stripe.android.paymentsheet.forms.PIRequirement> piRequirements, @org.jetbrains.annotations.Nullable()
    java.util.Set<? extends com.stripe.android.paymentsheet.forms.SIRequirement> siRequirements, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean confirmPMFromCustomer) {
        super();
    }
    
    /**
     * These are the requirements for using a PaymentIntent.
     * - Only [PIRequirement]s are allowed in this set.
     * - If this is null, PaymentIntents (even if SFU is set) are not supported by this LPM.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<com.stripe.android.paymentsheet.forms.PIRequirement> component1() {
        return null;
    }
    
    /**
     * These are the requirements for using a PaymentIntent.
     * - Only [PIRequirement]s are allowed in this set.
     * - If this is null, PaymentIntents (even if SFU is set) are not supported by this LPM.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<com.stripe.android.paymentsheet.forms.PIRequirement> getPiRequirements() {
        return null;
    }
    
    /**
     * These are the requirements for using a SetupIntent.
     *  - Only [SIRequirement]s are allowed in this set.
     *  - If this is null SetupIntents and PaymentIntents with SFU set are not
     *  supported by this LPM. If SetupIntents are supported, but there are
     *  no additional requirements this must be an emptySet.
     *  - In order to make sure the PM can be used when attached to a customer it
     *  must include the requirements of the saved payment method.  For instance,
     *  Bancontact is not delayed, but when saved it is represented as a SEPA paymnent
     *  method which is delayed.  So there must be Delay support in order to meet
     *  the requiremetns of this PM.  (There was a consideration of adding a SaveType
     *  that in cases where SI or PIw/SFU it would also check the requirements of
     *  the SaveType - not sure if the SaveType pi and/or si requirements should be checked).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<com.stripe.android.paymentsheet.forms.SIRequirement> component2() {
        return null;
    }
    
    /**
     * These are the requirements for using a SetupIntent.
     *  - Only [SIRequirement]s are allowed in this set.
     *  - If this is null SetupIntents and PaymentIntents with SFU set are not
     *  supported by this LPM. If SetupIntents are supported, but there are
     *  no additional requirements this must be an emptySet.
     *  - In order to make sure the PM can be used when attached to a customer it
     *  must include the requirements of the saved payment method.  For instance,
     *  Bancontact is not delayed, but when saved it is represented as a SEPA paymnent
     *  method which is delayed.  So there must be Delay support in order to meet
     *  the requiremetns of this PM.  (There was a consideration of adding a SaveType
     *  that in cases where SI or PIw/SFU it would also check the requirements of
     *  the SaveType - not sure if the SaveType pi and/or si requirements should be checked).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<com.stripe.android.paymentsheet.forms.SIRequirement> getSiRequirements() {
        return null;
    }
    
    /**
     * This indicates if the payment method can be confirmed when attached to a customer
     * and only the Payment Method id is available.
     * - Null means that it is not supported, or that it is attached as a different type
     * - false means that it is supported by the payment method, but not currently enabled
     * (likely because of a lack of mandate support)
     * - true means that a PM of this type attached to a customer can be confirmed
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    /**
     * This indicates if the payment method can be confirmed when attached to a customer
     * and only the Payment Method id is available.
     * - Null means that it is not supported, or that it is attached as a different type
     * - false means that it is supported by the payment method, but not currently enabled
     * (likely because of a lack of mandate support)
     * - true means that a PM of this type attached to a customer can be confirmed
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getConfirmPMFromCustomer() {
        return null;
    }
}
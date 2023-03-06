package com.stripe.android.paymentsheet.elements;

import java.lang.System;

/**
 * This holds all the resources read in from JSON.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/elements/ResourceRepository;", "", "bankRepository", "Lcom/stripe/android/paymentsheet/elements/BankRepository;", "addressRepository", "Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository;", "(Lcom/stripe/android/paymentsheet/elements/BankRepository;Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository;)V", "getAddressRepository$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/address/AddressFieldElementRepository;", "getBankRepository$paymentsheet_debug", "()Lcom/stripe/android/paymentsheet/elements/BankRepository;", "paymentsheet_debug"})
@javax.inject.Singleton()
public final class ResourceRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.elements.BankRepository bankRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.stripe.android.paymentsheet.address.AddressFieldElementRepository addressRepository = null;
    
    @javax.inject.Inject()
    public ResourceRepository(@org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.elements.BankRepository bankRepository, @org.jetbrains.annotations.NotNull()
    com.stripe.android.paymentsheet.address.AddressFieldElementRepository addressRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.elements.BankRepository getBankRepository$paymentsheet_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.paymentsheet.address.AddressFieldElementRepository getAddressRepository$paymentsheet_debug() {
        return null;
    }
}
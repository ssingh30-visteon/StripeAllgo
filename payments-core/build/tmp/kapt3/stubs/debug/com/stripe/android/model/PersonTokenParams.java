package com.stripe.android.model;

import java.lang.System;

/**
 * Creates a single-use token that represents the details for a person. Use this when creating or
 * updating persons associated with a Connect account.
 * See [the documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
 *
 * See [Create a person token](https://stripe.com/docs/api/tokens/create_person)
 */
@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0005Z[\\]^B\u00f5\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u00f9\u0001\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00c6\u0001J\t\u0010N\u001a\u00020OH\u00d6\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u000106H\u00d6\u0003J\t\u0010S\u001a\u00020OH\u00d6\u0001J\t\u0010T\u001a\u00020\nH\u00d6\u0001J\u0019\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020OH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010%R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002060\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00100R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109\u00a8\u0006_"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams;", "Lcom/stripe/android/model/TokenParams;", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", "metadata", "", "phone", "relationship", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "ssnLast4", "verification", "Lcom/stripe/android/model/PersonTokenParams$Verification;", "(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Relationship;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Verification;)V", "getAddress", "()Lcom/stripe/android/model/Address;", "getAddressKana", "()Lcom/stripe/android/model/AddressJapanParams;", "getAddressKanji", "getDateOfBirth", "()Lcom/stripe/android/model/DateOfBirth;", "getEmail", "()Ljava/lang/String;", "getFirstName", "getFirstNameKana", "getFirstNameKanji", "getGender", "getIdNumber", "getLastName", "getLastNameKana", "getLastNameKanji", "getMaidenName", "getMetadata", "()Ljava/util/Map;", "getPhone", "getRelationship", "()Lcom/stripe/android/model/PersonTokenParams$Relationship;", "getSsnLast4", "typeDataParams", "", "getTypeDataParams", "getVerification", "()Lcom/stripe/android/model/PersonTokenParams$Verification;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "Document", "Relationship", "Verification", "payments-core_debug"})
public final class PersonTokenParams extends com.stripe.android.model.TokenParams {
    
    /**
     * The person’s address.
     *
     * [person.address](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.Address address = null;
    
    /**
     * The Kana variation of the person’s address (Japan only).
     *
     * [person.address_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address_kana)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.AddressJapanParams addressKana = null;
    
    /**
     * The Kanji variation of the person’s address (Japan only).
     *
     * [person.address_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.AddressJapanParams addressKanji = null;
    
    /**
     * The person’s date of birth.
     *
     * [person.dob](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-dob)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.DateOfBirth dateOfBirth = null;
    
    /**
     * The person’s email address.
     *
     * [person.email](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-email)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    
    /**
     * The person’s first name.
     *
     * [person.first_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String firstName = null;
    
    /**
     * The Kana variation of the person’s first name (Japan only).
     *
     * [person.first_name_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name_kana)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String firstNameKana = null;
    
    /**
     * The Kanji variation of the person’s first name (Japan only).
     *
     * [person.first_name_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String firstNameKanji = null;
    
    /**
     * The person’s gender (International regulations require either “male” or “female”).
     *
     * [person.gender](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-gender)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String gender = null;
    
    /**
     * The person’s ID number, as appropriate for their country. For example, a social security
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself,
     * you can also provide a PII token.
     *
     * [person.id_number](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-id_number)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String idNumber = null;
    
    /**
     * The person’s last name.
     *
     * [person.last_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastName = null;
    
    /**
     * The Kana variation of the person’s last name (Japan only).
     *
     * [person.last_name_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name_kana)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastNameKana = null;
    
    /**
     * The Kanji variation of the person’s last name (Japan only).
     *
     * [person.last_name_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastNameKanji = null;
    
    /**
     * The person’s maiden name.
     *
     * [person.maiden_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-maiden_name)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String maidenName = null;
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value
     * to `metadata`.
     *
     * [person.metadata](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-metadata)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.Map<java.lang.String, java.lang.String> metadata = null;
    
    /**
     * The person’s phone number.
     *
     * [person.phone](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-phone)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String phone = null;
    
    /**
     * The relationship that this person has with the account’s legal entity.
     *
     * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PersonTokenParams.Relationship relationship = null;
    
    /**
     * The last 4 digits of the person’s social security number.
     *
     * [person.ssn_last_4](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-ssn_last_4)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String ssnLast4 = null;
    
    /**
     * The person’s verification status.
     *
     * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
     */
    @org.jetbrains.annotations.Nullable()
    private final com.stripe.android.model.PersonTokenParams.Verification verification = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.stripe.android.model.PersonTokenParams.Companion Companion = null;
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_PERSON = "person";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS = "address";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_KANA = "address_kana";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ADDRESS_KANJI = "address_kanji";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_DOB = "dob";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_EMAIL = "email";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_FIRST_NAME = "first_name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_FIRST_NAME_KANA = "first_name_kana";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_GENDER = "gender";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_ID_NUMBER = "id_number";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LAST_NAME = "last_name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LAST_NAME_KANA = "last_name_kana";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_LAST_NAME_KANJI = "last_name_kanji";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_MAIDEN_NAME = "maiden_name";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_METADATA = "metadata";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_PHONE = "phone";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_RELATIONSHIP = "relationship";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_SSN_LAST_4 = "ssn_last_4";
    @java.lang.Deprecated()
    private static final java.lang.String PARAM_VERIFICATION = "verification";
    public static final android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams> CREATOR = null;
    
    /**
     * Creates a single-use token that represents the details for a person. Use this when creating or
     * updating persons associated with a Connect account.
     * See [the documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     *
     * See [Create a person token](https://stripe.com/docs/api/tokens/create_person)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.stripe.android.model.PersonTokenParams copy(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.AddressJapanParams addressKana, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.AddressJapanParams addressKanji, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.DateOfBirth dateOfBirth, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String firstNameKana, @org.jetbrains.annotations.Nullable()
    java.lang.String firstNameKanji, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String idNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNameKana, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNameKanji, @org.jetbrains.annotations.Nullable()
    java.lang.String maidenName, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PersonTokenParams.Relationship relationship, @org.jetbrains.annotations.Nullable()
    java.lang.String ssnLast4, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PersonTokenParams.Verification verification) {
        return null;
    }
    
    /**
     * Creates a single-use token that represents the details for a person. Use this when creating or
     * updating persons associated with a Connect account.
     * See [the documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     *
     * See [Create a person token](https://stripe.com/docs/api/tokens/create_person)
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Creates a single-use token that represents the details for a person. Use this when creating or
     * updating persons associated with a Connect account.
     * See [the documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     *
     * See [Create a person token](https://stripe.com/docs/api/tokens/create_person)
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Creates a single-use token that represents the details for a person. Use this when creating or
     * updating persons associated with a Connect account.
     * See [the documentation](https://stripe.com/docs/connect/account-tokens) to learn more.
     *
     * See [Create a person token](https://stripe.com/docs/api/tokens/create_person)
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PersonTokenParams() {
        super(null, null);
    }
    
    public PersonTokenParams(@org.jetbrains.annotations.Nullable()
    com.stripe.android.model.Address address, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.AddressJapanParams addressKana, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.AddressJapanParams addressKanji, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.DateOfBirth dateOfBirth, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String firstNameKana, @org.jetbrains.annotations.Nullable()
    java.lang.String firstNameKanji, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String idNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNameKana, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNameKanji, @org.jetbrains.annotations.Nullable()
    java.lang.String maidenName, @org.jetbrains.annotations.Nullable()
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PersonTokenParams.Relationship relationship, @org.jetbrains.annotations.Nullable()
    java.lang.String ssnLast4, @org.jetbrains.annotations.Nullable()
    com.stripe.android.model.PersonTokenParams.Verification verification) {
        super(null, null);
    }
    
    /**
     * The person’s address.
     *
     * [person.address](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address component1() {
        return null;
    }
    
    /**
     * The person’s address.
     *
     * [person.address](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.Address getAddress() {
        return null;
    }
    
    /**
     * The Kana variation of the person’s address (Japan only).
     *
     * [person.address_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address_kana)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.AddressJapanParams component2() {
        return null;
    }
    
    /**
     * The Kana variation of the person’s address (Japan only).
     *
     * [person.address_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address_kana)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.AddressJapanParams getAddressKana() {
        return null;
    }
    
    /**
     * The Kanji variation of the person’s address (Japan only).
     *
     * [person.address_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.AddressJapanParams component3() {
        return null;
    }
    
    /**
     * The Kanji variation of the person’s address (Japan only).
     *
     * [person.address_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-address_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.AddressJapanParams getAddressKanji() {
        return null;
    }
    
    /**
     * The person’s date of birth.
     *
     * [person.dob](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-dob)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.DateOfBirth component4() {
        return null;
    }
    
    /**
     * The person’s date of birth.
     *
     * [person.dob](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-dob)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.DateOfBirth getDateOfBirth() {
        return null;
    }
    
    /**
     * The person’s email address.
     *
     * [person.email](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-email)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * The person’s email address.
     *
     * [person.email](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-email)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    /**
     * The person’s first name.
     *
     * [person.first_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * The person’s first name.
     *
     * [person.first_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    /**
     * The Kana variation of the person’s first name (Japan only).
     *
     * [person.first_name_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name_kana)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * The Kana variation of the person’s first name (Japan only).
     *
     * [person.first_name_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name_kana)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstNameKana() {
        return null;
    }
    
    /**
     * The Kanji variation of the person’s first name (Japan only).
     *
     * [person.first_name_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    /**
     * The Kanji variation of the person’s first name (Japan only).
     *
     * [person.first_name_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-first_name_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstNameKanji() {
        return null;
    }
    
    /**
     * The person’s gender (International regulations require either “male” or “female”).
     *
     * [person.gender](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-gender)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * The person’s gender (International regulations require either “male” or “female”).
     *
     * [person.gender](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-gender)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    /**
     * The person’s ID number, as appropriate for their country. For example, a social security
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself,
     * you can also provide a PII token.
     *
     * [person.id_number](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-id_number)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * The person’s ID number, as appropriate for their country. For example, a social security
     * number in the U.S., social insurance number in Canada, etc. Instead of the number itself,
     * you can also provide a PII token.
     *
     * [person.id_number](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-id_number)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdNumber() {
        return null;
    }
    
    /**
     * The person’s last name.
     *
     * [person.last_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * The person’s last name.
     *
     * [person.last_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    /**
     * The Kana variation of the person’s last name (Japan only).
     *
     * [person.last_name_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name_kana)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    /**
     * The Kana variation of the person’s last name (Japan only).
     *
     * [person.last_name_kana](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name_kana)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastNameKana() {
        return null;
    }
    
    /**
     * The Kanji variation of the person’s last name (Japan only).
     *
     * [person.last_name_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    /**
     * The Kanji variation of the person’s last name (Japan only).
     *
     * [person.last_name_kanji](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-last_name_kanji)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastNameKanji() {
        return null;
    }
    
    /**
     * The person’s maiden name.
     *
     * [person.maiden_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-maiden_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    /**
     * The person’s maiden name.
     *
     * [person.maiden_name](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-maiden_name)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMaidenName() {
        return null;
    }
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value
     * to `metadata`.
     *
     * [person.metadata](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-metadata)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> component15() {
        return null;
    }
    
    /**
     * Set of key-value pairs that you can attach to an object. This can be useful for storing
     * additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value
     * to `metadata`.
     *
     * [person.metadata](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-metadata)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
        return null;
    }
    
    /**
     * The person’s phone number.
     *
     * [person.phone](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-phone)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    /**
     * The person’s phone number.
     *
     * [person.phone](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-phone)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    /**
     * The relationship that this person has with the account’s legal entity.
     *
     * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PersonTokenParams.Relationship component17() {
        return null;
    }
    
    /**
     * The relationship that this person has with the account’s legal entity.
     *
     * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PersonTokenParams.Relationship getRelationship() {
        return null;
    }
    
    /**
     * The last 4 digits of the person’s social security number.
     *
     * [person.ssn_last_4](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-ssn_last_4)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    /**
     * The last 4 digits of the person’s social security number.
     *
     * [person.ssn_last_4](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-ssn_last_4)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSsnLast4() {
        return null;
    }
    
    /**
     * The person’s verification status.
     *
     * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PersonTokenParams.Verification component19() {
        return null;
    }
    
    /**
     * The person’s verification status.
     *
     * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
     */
    @org.jetbrains.annotations.Nullable()
    public final com.stripe.android.model.PersonTokenParams.Verification getVerification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, java.lang.Object> getTypeDataParams() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PersonTokenParams createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.stripe.android.model.PersonTokenParams[] newArray(int size) {
            return null;
        }
    }
    
    /**
     * The relationship that this person has with the account’s legal entity.
     *
     * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002-.BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020\bH\u00d6\u0001J\u0013\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\bH\u00d6\u0001J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020#0&H\u0016J\t\u0010\'\u001a\u00020\u000bH\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bH\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006/"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "director", "", "executive", "owner", "percentOwnership", "", "representative", "title", "", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getDirector", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExecutive", "getOwner", "getPercentOwnership", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRepresentative", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Relationship;", "describeContents", "equals", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_debug"})
    public static final class Relationship implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * Whether the person is a director of the account’s legal entity. Currently only required
         * for accounts in the EU. Directors are typically members of the governing board of the
         * company, or responsible for ensuring the company meets its regulatory obligations.
         *
         * [person.relationship.directory](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-directory)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean director = null;
        
        /**
         * Whether the person has significant responsibility to control, manage, or direct the
         * organization.
         *
         * [person.relationship.executive](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-executive)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean executive = null;
        
        /**
         * Whether the person is an owner of the account’s legal entity.
         *
         * [person.relationship.owner](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-owner)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean owner = null;
        
        /**
         * The percent owned by the person of the account’s legal entity.
         *
         * [person.relationship.representative](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-representative)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer percentOwnership = null;
        
        /**
         * Whether the person is authorized as the primary representative of the account. This is
         * the person nominated by the business to provide information about themselves, and general
         * information about the account. There can only be one representative at any given time.
         * At the time the account is created, this person should be set to the person responsible
         * for opening the account.
         *
         * [person.relationship.percent_ownership](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-percent_ownership)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean representative = null;
        
        /**
         * The person’s title (e.g., CEO, Support Engineer).
         *
         * [person.relationship.title](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-title)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PersonTokenParams.Relationship.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_DIRECTOR = "director";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_EXECUTIVE = "executive";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_OWNER = "owner";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_PERCENT_OWNERSHIP = "percent_ownership";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_REPRESENTATIVE = "representative";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_TITLE = "title";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams.Relationship> CREATOR = null;
        
        /**
         * The relationship that this person has with the account’s legal entity.
         *
         * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Relationship copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean director, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean executive, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean owner, @org.jetbrains.annotations.Nullable()
        java.lang.Integer percentOwnership, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean representative, @org.jetbrains.annotations.Nullable()
        java.lang.String title) {
            return null;
        }
        
        /**
         * The relationship that this person has with the account’s legal entity.
         *
         * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The relationship that this person has with the account’s legal entity.
         *
         * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The relationship that this person has with the account’s legal entity.
         *
         * [person.relationship](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Relationship() {
            super();
        }
        
        public Relationship(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean director, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean executive, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean owner, @org.jetbrains.annotations.Nullable()
        java.lang.Integer percentOwnership, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean representative, @org.jetbrains.annotations.Nullable()
        java.lang.String title) {
            super();
        }
        
        /**
         * Whether the person is a director of the account’s legal entity. Currently only required
         * for accounts in the EU. Directors are typically members of the governing board of the
         * company, or responsible for ensuring the company meets its regulatory obligations.
         *
         * [person.relationship.directory](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-directory)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        /**
         * Whether the person is a director of the account’s legal entity. Currently only required
         * for accounts in the EU. Directors are typically members of the governing board of the
         * company, or responsible for ensuring the company meets its regulatory obligations.
         *
         * [person.relationship.directory](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-directory)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getDirector() {
            return null;
        }
        
        /**
         * Whether the person has significant responsibility to control, manage, or direct the
         * organization.
         *
         * [person.relationship.executive](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-executive)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component2() {
            return null;
        }
        
        /**
         * Whether the person has significant responsibility to control, manage, or direct the
         * organization.
         *
         * [person.relationship.executive](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-executive)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getExecutive() {
            return null;
        }
        
        /**
         * Whether the person is an owner of the account’s legal entity.
         *
         * [person.relationship.owner](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-owner)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        /**
         * Whether the person is an owner of the account’s legal entity.
         *
         * [person.relationship.owner](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-owner)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getOwner() {
            return null;
        }
        
        /**
         * The percent owned by the person of the account’s legal entity.
         *
         * [person.relationship.representative](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-representative)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        /**
         * The percent owned by the person of the account’s legal entity.
         *
         * [person.relationship.representative](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-representative)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getPercentOwnership() {
            return null;
        }
        
        /**
         * Whether the person is authorized as the primary representative of the account. This is
         * the person nominated by the business to provide information about themselves, and general
         * information about the account. There can only be one representative at any given time.
         * At the time the account is created, this person should be set to the person responsible
         * for opening the account.
         *
         * [person.relationship.percent_ownership](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-percent_ownership)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        /**
         * Whether the person is authorized as the primary representative of the account. This is
         * the person nominated by the business to provide information about themselves, and general
         * information about the account. There can only be one representative at any given time.
         * At the time the account is created, this person should be set to the person responsible
         * for opening the account.
         *
         * [person.relationship.percent_ownership](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-percent_ownership)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getRepresentative() {
            return null;
        }
        
        /**
         * The person’s title (e.g., CEO, Support Engineer).
         *
         * [person.relationship.title](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-title)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        /**
         * The person’s title (e.g., CEO, Support Engineer).
         *
         * [person.relationship.title](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-relationship-title)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams.Relationship> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PersonTokenParams.Relationship createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PersonTokenParams.Relationship[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "()V", "director", "", "Ljava/lang/Boolean;", "executive", "owner", "percentOwnership", "", "Ljava/lang/Integer;", "representative", "title", "", "build", "setDirector", "(Ljava/lang/Boolean;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "setExecutive", "setOwner", "setPercentOwnership", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PersonTokenParams$Relationship$Builder;", "setRepresentative", "setTitle", "payments-core_debug"})
        public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.PersonTokenParams.Relationship> {
            private java.lang.Boolean director;
            private java.lang.Boolean executive;
            private java.lang.Boolean owner;
            private java.lang.Integer percentOwnership;
            private java.lang.Boolean representative;
            private java.lang.String title;
            
            public Builder() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PersonTokenParams.Relationship.Builder setDirector(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean director) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PersonTokenParams.Relationship.Builder setExecutive(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean executive) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PersonTokenParams.Relationship.Builder setOwner(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean owner) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PersonTokenParams.Relationship.Builder setPercentOwnership(@org.jetbrains.annotations.Nullable()
            java.lang.Integer percentOwnership) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PersonTokenParams.Relationship.Builder setRepresentative(@org.jetbrains.annotations.Nullable()
            java.lang.Boolean representative) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.stripe.android.model.PersonTokenParams.Relationship.Builder setTitle(@org.jetbrains.annotations.Nullable()
            java.lang.String title) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public com.stripe.android.model.PersonTokenParams.Relationship build() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Relationship$Companion;", "", "()V", "PARAM_DIRECTOR", "", "PARAM_EXECUTIVE", "PARAM_OWNER", "PARAM_PERCENT_OWNERSHIP", "PARAM_REPRESENTATIVE", "PARAM_TITLE", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * The person’s verification status.
     *
     * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\t\u0010\u0017\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "document", "Lcom/stripe/android/model/PersonTokenParams$Document;", "additionalDocument", "(Lcom/stripe/android/model/PersonTokenParams$Document;Lcom/stripe/android/model/PersonTokenParams$Document;)V", "getAdditionalDocument", "()Lcom/stripe/android/model/PersonTokenParams$Document;", "getDocument", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Verification implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * An identifying document, either a passport or local ID card.
         *
         * [person.verification.document](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document)
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.PersonTokenParams.Document document = null;
        
        /**
         * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
         *
         * [person.verification.additional_document](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-additional_document)
         */
        @org.jetbrains.annotations.Nullable()
        private final com.stripe.android.model.PersonTokenParams.Document additionalDocument = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PersonTokenParams.Verification.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_DOCUMENT = "document";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams.Verification> CREATOR = null;
        
        /**
         * The person’s verification status.
         *
         * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
         */
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Verification copy(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Document document, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Document additionalDocument) {
            return null;
        }
        
        /**
         * The person’s verification status.
         *
         * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * The person’s verification status.
         *
         * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * The person’s verification status.
         *
         * [person.verification](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification)
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmOverloads()
        public Verification() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Verification(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Document document) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Verification(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Document document, @org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Document additionalDocument) {
            super();
        }
        
        /**
         * An identifying document, either a passport or local ID card.
         *
         * [person.verification.document](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PersonTokenParams.Document component1() {
            return null;
        }
        
        /**
         * An identifying document, either a passport or local ID card.
         *
         * [person.verification.document](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PersonTokenParams.Document getDocument() {
            return null;
        }
        
        /**
         * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
         *
         * [person.verification.additional_document](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-additional_document)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PersonTokenParams.Document component2() {
            return null;
        }
        
        /**
         * A document showing address, either a passport, local ID card, or utility bill from a well-known utility company.
         *
         * [person.verification.additional_document](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-additional_document)
         */
        @org.jetbrains.annotations.Nullable()
        public final com.stripe.android.model.PersonTokenParams.Document getAdditionalDocument() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams.Verification> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PersonTokenParams.Verification createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PersonTokenParams.Verification[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Verification$Companion;", "", "()V", "PARAM_ADDITIONAL_DOCUMENT", "", "PARAM_DOCUMENT", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u001f\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u000eH\u00d6\u0001J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "front", "", "back", "(Ljava/lang/String;Ljava/lang/String;)V", "getBack", "()Ljava/lang/String;", "getFront", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_debug"})
    public static final class Document implements com.stripe.android.model.StripeParamsModel, android.os.Parcelable {
        
        /**
         * The front of an ID returned by a
         * [file upload](https://stripe.com/docs/api/tokens/create_person#create_file) with a
         * `purpose` value of `identity_document`. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
         *
         * [person.verification.document.front](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document-front)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String front = null;
        
        /**
         * The back of an ID returned by a
         * [file upload](https://stripe.com/docs/api/tokens/create_person#create_file) with a
         * `purpose` value of `identity_document`. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
         *
         * [person.verification.document.back](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document-back)
         */
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String back = null;
        @org.jetbrains.annotations.NotNull()
        private static final com.stripe.android.model.PersonTokenParams.Document.Companion Companion = null;
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_BACK = "back";
        @java.lang.Deprecated()
        private static final java.lang.String PARAM_FRONT = "front";
        public static final android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams.Document> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Document copy(@org.jetbrains.annotations.Nullable()
        java.lang.String front, @org.jetbrains.annotations.Nullable()
        java.lang.String back) {
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
        
        @kotlin.jvm.JvmOverloads()
        public Document() {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Document(@org.jetbrains.annotations.Nullable()
        java.lang.String front) {
            super();
        }
        
        @kotlin.jvm.JvmOverloads()
        public Document(@org.jetbrains.annotations.Nullable()
        java.lang.String front, @org.jetbrains.annotations.Nullable()
        java.lang.String back) {
            super();
        }
        
        /**
         * The front of an ID returned by a
         * [file upload](https://stripe.com/docs/api/tokens/create_person#create_file) with a
         * `purpose` value of `identity_document`. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
         *
         * [person.verification.document.front](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document-front)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        /**
         * The front of an ID returned by a
         * [file upload](https://stripe.com/docs/api/tokens/create_person#create_file) with a
         * `purpose` value of `identity_document`. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
         *
         * [person.verification.document.front](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document-front)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFront() {
            return null;
        }
        
        /**
         * The back of an ID returned by a
         * [file upload](https://stripe.com/docs/api/tokens/create_person#create_file) with a
         * `purpose` value of `identity_document`. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
         *
         * [person.verification.document.back](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document-back)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        /**
         * The back of an ID returned by a
         * [file upload](https://stripe.com/docs/api/tokens/create_person#create_file) with a
         * `purpose` value of `identity_document`. The uploaded file needs to be a color image
         * (smaller than 8,000px by 8,000px), in JPG or PNG format, and less than 10 MB in size.
         *
         * [person.verification.document.back](https://stripe.com/docs/api/tokens/create_person#create_person_token-person-verification-document-back)
         */
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getBack() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Map<java.lang.String, java.lang.Object> toParamMap() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.stripe.android.model.PersonTokenParams.Document> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PersonTokenParams.Document createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.stripe.android.model.PersonTokenParams.Document[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Document$Companion;", "", "()V", "PARAM_BACK", "", "PARAM_FRONT", "payments-core_debug"})
        static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010!\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010\'\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\fJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\fJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001c\u0010-\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017J\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\fJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u00100\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\fJ\u0010\u00101\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PersonTokenParams;", "()V", "address", "Lcom/stripe/android/model/Address;", "addressKana", "Lcom/stripe/android/model/AddressJapanParams;", "addressKanji", "dateOfBirth", "Lcom/stripe/android/model/DateOfBirth;", "email", "", "firstName", "firstNameKana", "firstNameKanji", "gender", "idNumber", "lastName", "lastNameKana", "lastNameKanji", "maidenName", "metadata", "", "phone", "relationship", "Lcom/stripe/android/model/PersonTokenParams$Relationship;", "ssnLast4", "verification", "Lcom/stripe/android/model/PersonTokenParams$Verification;", "build", "setAddress", "setAddressKana", "setAddressKanji", "setDateOfBirth", "setEmail", "setFirstName", "setFirstNameKana", "setFirstNameKanji", "setGender", "setIdNumber", "setLastName", "setLastNameKana", "setLastNameKanji", "setMaidenName", "setMetadata", "setPhone", "setRelationship", "setSsnLast4", "setVerification", "payments-core_debug"})
    public static final class Builder implements com.stripe.android.ObjectBuilder<com.stripe.android.model.PersonTokenParams> {
        private com.stripe.android.model.Address address;
        private com.stripe.android.model.AddressJapanParams addressKana;
        private com.stripe.android.model.AddressJapanParams addressKanji;
        private com.stripe.android.model.DateOfBirth dateOfBirth;
        private java.lang.String email;
        private java.lang.String firstName;
        private java.lang.String firstNameKana;
        private java.lang.String firstNameKanji;
        private java.lang.String gender;
        private java.lang.String idNumber;
        private java.lang.String lastName;
        private java.lang.String lastNameKana;
        private java.lang.String lastNameKanji;
        private java.lang.String maidenName;
        private java.util.Map<java.lang.String, java.lang.String> metadata;
        private java.lang.String phone;
        private com.stripe.android.model.PersonTokenParams.Relationship relationship;
        private java.lang.String ssnLast4;
        private com.stripe.android.model.PersonTokenParams.Verification verification;
        
        public Builder() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setAddress(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.Address address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setAddressKana(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.AddressJapanParams addressKana) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setAddressKanji(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.AddressJapanParams addressKanji) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setDateOfBirth(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.DateOfBirth dateOfBirth) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setEmail(@org.jetbrains.annotations.Nullable()
        java.lang.String email) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setFirstName(@org.jetbrains.annotations.Nullable()
        java.lang.String firstName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setFirstNameKana(@org.jetbrains.annotations.Nullable()
        java.lang.String firstNameKana) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setFirstNameKanji(@org.jetbrains.annotations.Nullable()
        java.lang.String firstNameKanji) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setGender(@org.jetbrains.annotations.Nullable()
        java.lang.String gender) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setIdNumber(@org.jetbrains.annotations.Nullable()
        java.lang.String idNumber) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setLastName(@org.jetbrains.annotations.Nullable()
        java.lang.String lastName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setLastNameKana(@org.jetbrains.annotations.Nullable()
        java.lang.String lastNameKana) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setLastNameKanji(@org.jetbrains.annotations.Nullable()
        java.lang.String lastNameKanji) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setMaidenName(@org.jetbrains.annotations.Nullable()
        java.lang.String maidenName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setMetadata(@org.jetbrains.annotations.Nullable()
        java.util.Map<java.lang.String, java.lang.String> metadata) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setPhone(@org.jetbrains.annotations.Nullable()
        java.lang.String phone) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setRelationship(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Relationship relationship) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setSsnLast4(@org.jetbrains.annotations.Nullable()
        java.lang.String ssnLast4) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.stripe.android.model.PersonTokenParams.Builder setVerification(@org.jetbrains.annotations.Nullable()
        com.stripe.android.model.PersonTokenParams.Verification verification) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.stripe.android.model.PersonTokenParams build() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PersonTokenParams$Companion;", "", "()V", "PARAM_ADDRESS", "", "PARAM_ADDRESS_KANA", "PARAM_ADDRESS_KANJI", "PARAM_DOB", "PARAM_EMAIL", "PARAM_FIRST_NAME", "PARAM_FIRST_NAME_KANA", "PARAM_FIRST_NAME_KANJI", "PARAM_GENDER", "PARAM_ID_NUMBER", "PARAM_LAST_NAME", "PARAM_LAST_NAME_KANA", "PARAM_LAST_NAME_KANJI", "PARAM_MAIDEN_NAME", "PARAM_METADATA", "PARAM_PERSON", "PARAM_PHONE", "PARAM_RELATIONSHIP", "PARAM_SSN_LAST_4", "PARAM_VERIFICATION", "payments-core_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
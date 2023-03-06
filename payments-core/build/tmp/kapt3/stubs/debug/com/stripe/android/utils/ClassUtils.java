package com.stripe.android.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J$\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J,\u0010\r\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/stripe/android/utils/ClassUtils;", "", "()V", "findField", "Ljava/lang/reflect/Field;", "clazz", "Ljava/lang/Class;", "allowedFields", "", "", "findMethod", "Ljava/lang/reflect/Method;", "allowedMethods", "getInternalObject", "", "obj", "payments-core_debug"})
public final class ClassUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.stripe.android.utils.ClassUtils INSTANCE = null;
    
    private ClassUtils() {
        super();
    }
    
    /**
     * @param clazz the class to search in
     * @param allowedFields allowed field names
     * @param obj the target object whose field we are accessing
     * @return the value of the found field, if exists, on the target object, or null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.Object getInternalObject(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> allowedFields, @org.jetbrains.annotations.NotNull()
    java.lang.Object obj) {
        return null;
    }
    
    /**
     * @param clazz the class to search in
     * @param allowedFields allowed field names
     * @return the [Field], made accessible, if one is found, otherwise null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.reflect.Field findField(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> allowedFields) {
        return null;
    }
    
    /**
     * @param clazz the class to search in
     * @param allowedMethods allowed method names
     * @return the [Method] if one is found, otherwise null
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.reflect.Method findMethod(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.String> allowedMethods) {
        return null;
    }
}
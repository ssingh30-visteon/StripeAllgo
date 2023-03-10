package com.stripe.android.cardverificationsheet.framework.api

import java.io.UnsupportedEncodingException
import java.net.URLEncoder

/**
 * Copied from payments-core temporarily
 */
internal class QueryStringFactory {

    /**
     * Create a query string from a [Map]
     */
    fun create(params: Map<String, *>?): String {
        return flattenParams(params).joinToString("&") {
            it.toString()
        }
    }

    private fun flattenParams(params: Map<String, *>?): List<Parameter> {
        return flattenParamsMap(params)
    }

    private fun flattenParamsList(
        params: List<*>,
        keyPrefix: String
    ): List<Parameter> {
        // Because application/x-www-form-urlencoded cannot represent an empty
        // list, convention is to take the list parameter and just set it to an
        // empty string. (e.g. A regular list might look like `a[]=1&b[]=2`.
        // Emptying it would look like `a=`.)
        return if (params.isEmpty()) {
            listOf(Parameter(keyPrefix, ""))
        } else {
            val newPrefix = "$keyPrefix[]"
            params.flatMap {
                flattenParamsValue(it, newPrefix)
            }
        }
    }

    private fun flattenParamsMap(
        params: Map<String, *>?,
        keyPrefix: String? = null
    ): List<Parameter> {
        return params?.flatMap { (key, value) ->
            val newPrefix = keyPrefix?.let { "$it[$key]" } ?: key
            flattenParamsValue(value, newPrefix)
        }
            ?: emptyList()
    }

    @Suppress("UNCHECKED_CAST")
    private fun flattenParamsValue(
        value: Any?,
        keyPrefix: String
    ): List<Parameter> {
        return when (value) {
            is Map<*, *> -> flattenParamsMap(value as Map<String, Any>?, keyPrefix)
            is List<*> -> flattenParamsList(value, keyPrefix)
            null -> {
                listOf(Parameter(keyPrefix, ""))
            }
            else -> {
                listOf(Parameter(keyPrefix, value.toString()))
            }
        }
    }

    private data class Parameter internal constructor(
        private val key: String,
        private val value: String
    ) {
        override fun toString(): String {
            val encodedKey = urlEncode(key)
            val encodedValue = urlEncode(value)
            return "$encodedKey=$encodedValue"
        }

        @Throws(UnsupportedEncodingException::class)
        private fun urlEncode(str: String): String {
            // Preserve original behavior that passing null for an object id will lead
            // to us actually making a request to /v1/foo/null
            return URLEncoder.encode(str, Charsets.UTF_8.name())
        }
    }
}

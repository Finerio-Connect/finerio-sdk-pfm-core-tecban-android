package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCUpdateFinancialEntityRequest.kt
 *
 * @param name The name of the financial entity.
 * @param code The code of the financial entity.
 *
 */
@JsonClass(generateAdapter = true)
data class OBUpdateFinancialEntityRequest(
    @Json(name = "name") val name: String,
    @Json(name = "code") val code: String
)
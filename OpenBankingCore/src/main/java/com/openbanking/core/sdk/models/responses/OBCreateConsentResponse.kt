package com.openbanking.core.sdk.models.responses

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCreateConsentResponse.kt
 *
 * @param bankId The ID of bank.
 * @param userId The ID of user.
 * @param url The URL to consume consent.
 */
@JsonClass(generateAdapter = true)
data class OBCreateConsentResponse(
    @Json(name = "bankId") val bankId: String,
    @Json(name = "userId") val userId: Int,
    @Json(name = "url") val url: String
)
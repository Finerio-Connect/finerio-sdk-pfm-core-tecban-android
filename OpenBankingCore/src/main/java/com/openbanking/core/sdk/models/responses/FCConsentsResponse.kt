package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.FCConsent
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCConsentsResponse.kt
 *
 * @param consents Array of objects (FCConsent).
 */
@JsonClass(generateAdapter = true)
data class FCConsentsResponse(
    @Json(name = "consents") var consents: List<FCConsent>
)

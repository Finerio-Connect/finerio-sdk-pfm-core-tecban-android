package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBConsent
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCConsentsResponse.kt
 *
 * @param consents Array of objects (FCConsent).
 */
@JsonClass(generateAdapter = true)
data class OBConsentsResponse(
    @Json(name = "consents") var consents: List<OBConsent>
)

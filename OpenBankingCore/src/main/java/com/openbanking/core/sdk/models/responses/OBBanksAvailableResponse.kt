package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBBank
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCBanksAvailableResponse.kt
 *
 * @param banks The list of FCBank.
 */
@JsonClass(generateAdapter = true)
data class OBBanksAvailableResponse(
    @Json(name = "banks" ) val banks : List<OBBank>
)

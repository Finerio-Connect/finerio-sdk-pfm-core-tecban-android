package com.finerioconnect.core.sdk.models.responses

import com.finerioconnect.core.sdk.models.FCBank
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCBanksAvailableResponse.kt
 *
 * @param banks The list of FCBank.
 */
@JsonClass(generateAdapter = true)
data class FCBanksAvailableResponse(
    @Json(name = "banks" ) val banks : List<FCBank>
)

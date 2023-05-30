package com.finerioconnect.core.sdk.models.responses

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCAggregationStatusResponse.kt
 *
 * @param bankId The ID of bank.
 * @param userId The ID of user.
 * @param status The current status of aggregation process.
 */
@JsonClass(generateAdapter = true)
data class FCAggregationStatusResponse(
    @Json(name = "bankId") val bankId: String,
    @Json(name = "userId") val userId: Int,
    @Json(name = "status") val status: String
)
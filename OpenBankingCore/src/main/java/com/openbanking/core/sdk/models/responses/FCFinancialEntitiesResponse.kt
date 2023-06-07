package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.FCFinancialEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCFinancialEntitiesResponse.kt
 *
 * @param data Array of objects (Financial Entities).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class FCFinancialEntitiesResponse(
    @Json(name = "data") val data : List<FCFinancialEntity>,
    @Json(name = "nextCursor") val nextCursor : Int?
)

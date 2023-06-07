package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBBudget
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCBudgetsResponse.kt
 *
 * @param data Array of objects (Budgets).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class OBBudgetsResponse(
    @Json(name = "data") val budgets : List<OBBudget>,
    @Json(name = "nextCursor") val nextCursor : Int?
)

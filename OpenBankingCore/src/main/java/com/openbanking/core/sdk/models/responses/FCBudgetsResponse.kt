package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.FCBudget
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCBudgetsResponse.kt
 *
 * @param data Array of objects (Budgets).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class FCBudgetsResponse(
    @Json(name = "data") val budgets : List<FCBudget>,
    @Json(name = "nextCursor") val nextCursor : Int?
)

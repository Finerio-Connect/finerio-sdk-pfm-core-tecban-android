package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCFinancialEntity.kt
 *
 * @param date Transaction date.
 * @param transactions List of transactions.
 *
 */
@JsonClass(generateAdapter = true)
data class FCMovementsByDate(
    @Json(name = "date") val date : Long,
    @Json(name = "transactions") val transactions : List<FCTransaction>
)

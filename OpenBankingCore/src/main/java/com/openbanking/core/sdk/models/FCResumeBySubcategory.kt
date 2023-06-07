package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCResumeBySubcategory.kt
 *
 * @param categoryId The system ID of the category.
 * @param amount The amount of the category.
 * @param transactionsByDate The financial information grouped by date
 *
 */
@JsonClass(generateAdapter = true)
data class FCResumeBySubcategory(
    @Json(name = "categoryId") val categoryId : Int,
    @Json(name = "amount") val amount : Double,
    @Json(name = "transactionsByDate") val transactionsByDate : List<FCMovementsByDate>
)

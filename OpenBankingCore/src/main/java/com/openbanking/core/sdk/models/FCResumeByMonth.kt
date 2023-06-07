package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCResumeByMonth.kt
 *
 * @param date The year and month of the information.
 * @param amount The amount of the category.
 * @param categories The financial information grouped by categories
 *
 */
@JsonClass(generateAdapter = true)
data class FCResumeByMonth(
    @Json(name = "date") val date : Long,
    @Json(name = "amount") val amount : Double,
    @Json(name = "categories") val categories : List<FCResumeByCategory>
)

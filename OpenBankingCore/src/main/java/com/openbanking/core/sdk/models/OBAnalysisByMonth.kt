package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCAnalysisByMonth
 *
 * @param date The year and month of the information.
 * @param categories The financial information grouped by categories
 */
@JsonClass(generateAdapter = true)
data class OBAnalysisByMonth(
    @Json(name = "date") var date: Long,
    @Json(name = "categories") var categories: List<OBAnalysisByCategory>
)

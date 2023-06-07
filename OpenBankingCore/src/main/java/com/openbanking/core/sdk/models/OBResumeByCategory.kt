package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCResumeByCategory.kt
 *
 * @param categoryId The system ID of the category.
 * @param amount The amount of the category.
 * @param subcategories The financial information grouped by subcategories
 *
 */
@JsonClass(generateAdapter = true)
data class OBResumeByCategory(
    @Json(name = "categoryId") val categoryId : Int,
    @Json(name = "amount") val amount : Double,
    @Json(name = "subcategories") val subcategories : List<OBResumeBySubcategory>
)
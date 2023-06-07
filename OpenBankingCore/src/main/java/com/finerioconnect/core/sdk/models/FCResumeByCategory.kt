package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCResumeByCategory.kt
 *
 * @param categoryId The system ID of the category.
 * @param amount The amount of the category.
 * @param subcategories The financial information grouped by subcategories
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCResumeByCategory(
    @Json(name = "categoryId") val categoryId : Int,
    @Json(name = "amount") val amount : Double,
    @Json(name = "subcategories") val subcategories : List<FCResumeBySubcategory>
)
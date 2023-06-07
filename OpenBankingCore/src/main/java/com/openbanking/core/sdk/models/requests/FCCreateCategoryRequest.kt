package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCreateCategoryRequest.kt
 *
 * @param userId The ID of the user that owns the category.
 * @param name The name of the category.
 * @param color The color of the category.
 * @param parentCategoryId The ID of the parent category that owns this subcategory.
 *
 */
@JsonClass(generateAdapter = true)
data class FCCreateCategoryRequest(
    @Json(name = "userId") val userId : Int?,
    @Json(name = "name") val name : String,
    @Json(name = "color") val color : String?,
    @Json(name = "parentCategoryId") val parentCategoryId : Long?
)
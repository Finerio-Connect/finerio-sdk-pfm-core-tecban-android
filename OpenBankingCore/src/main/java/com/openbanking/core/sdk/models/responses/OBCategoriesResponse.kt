package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBCategory
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCategoriesResponse
 *
 * @param data Array of objects (Category).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class OBCategoriesResponse(
    @Json(name = "data") var data: List<OBCategory>?,
    @Json(name = "nextCursor") var nextCursor: Int?
)

package com.openbanking.core.sdk.models.responses

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OBResourcesResponse(
    @Json(name = "bankId") val bankId: String,
    @Json(name = "userId") val userId: Int,
    @Json(name = "resources") val resources: List<String>
)

package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OBApiKeyRequest(
    @Json(name = "X-api-key")
    val apiKey: String
)

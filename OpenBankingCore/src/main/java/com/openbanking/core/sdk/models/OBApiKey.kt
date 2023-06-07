package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OBApiKey(
    @Json(name = "apiKey")
    val apiKey: String
)

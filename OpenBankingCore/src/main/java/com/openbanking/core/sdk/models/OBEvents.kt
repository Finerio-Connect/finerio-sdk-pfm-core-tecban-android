package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OBEvents(
    @Json(name = "deviceId")
    val deviceId: String,
    @Json(name = "event")
    val event: String
)
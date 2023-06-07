package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCEventsRequest.kt
 *
 * @param deviceId The ID of the current device.
 * @param name The name of the event.
 *
 */
@JsonClass(generateAdapter = true)
data class OBEventsRequest(
    @Json(name = "deviceId")
    val deviceId: String,
    @Json(name = "event")
    val event: String
)
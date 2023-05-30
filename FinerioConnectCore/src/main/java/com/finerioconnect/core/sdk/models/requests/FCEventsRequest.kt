package com.finerioconnect.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCEventsRequest.kt
 *
 * @param deviceId The ID of the current device.
 * @param name The name of the event.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCEventsRequest(
    @Json(name = "deviceId")
    val deviceId: String,
    @Json(name = "event")
    val event: String
)
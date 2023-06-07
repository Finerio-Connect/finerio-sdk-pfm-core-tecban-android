package com.finerioconnect.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCreateUserRequest.kt
 *
 * @param name The name of the user.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCCreateUserRequest(
    @Json(name = "name") val name : String
)

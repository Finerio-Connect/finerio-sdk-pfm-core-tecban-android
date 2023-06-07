package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCUpdateUserRequest.kt
 *
 * @param name The name of the user.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCUpdateUserRequest(
    @Json(name = "name") val name : String
)

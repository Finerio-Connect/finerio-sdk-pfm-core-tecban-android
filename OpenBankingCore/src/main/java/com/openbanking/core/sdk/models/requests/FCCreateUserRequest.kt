package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCreateUserRequest.kt
 *
 * @param name The name of the user.
 *
 */
@JsonClass(generateAdapter = true)
data class FCCreateUserRequest(
    @Json(name = "name") val name : String
)

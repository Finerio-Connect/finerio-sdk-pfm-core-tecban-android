package com.finerioconnect.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCreateFinancialEntityRequest.kt
 *
 * @param name The name of the financial entity.
 * @param code The code of the financial entity.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCCreateFinancialEntityRequest(
    @Json(name = "name") val name: String,
    @Json(name = "code") val code: String
)
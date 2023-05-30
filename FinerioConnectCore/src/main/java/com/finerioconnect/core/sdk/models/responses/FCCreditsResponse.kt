package com.finerioconnect.core.sdk.models.responses

import com.finerioconnect.core.sdk.models.FCCredit
import com.finerioconnect.core.sdk.models.FCTotalBalance
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FCCreditsResponse(
    @Json(name = "data") val credits: List<FCCredit>,
    @Json(name = "nextCursor") val nextCursor: Int?,
    @Json(name = "totalBalance") val totalBalance: FCTotalBalance?
)

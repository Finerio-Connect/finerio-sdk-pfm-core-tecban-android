package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBCredit
import com.openbanking.core.sdk.models.OBTotalBalance
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OBCreditsResponse(
    @Json(name = "data") val credits: List<OBCredit>,
    @Json(name = "nextCursor") val nextCursor: Int?,
    @Json(name = "totalBalance") val totalBalance: OBTotalBalance?
)

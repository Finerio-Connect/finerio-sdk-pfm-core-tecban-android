package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OBTotalBalance(
    @Json(name = "availableAmount") val availableAmount: Double?,
    @Json(name = "limitAmount") val limitAmount: Double?,
    @Json(name = "usedAmount") val usedAmount: Double?
)

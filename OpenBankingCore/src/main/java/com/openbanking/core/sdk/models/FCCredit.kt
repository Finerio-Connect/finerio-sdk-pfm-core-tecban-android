package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FCCredit(
    @Json(name = "id") val id: Int,
    @Json(name = "providerId") val providerId: String,
    @Json(name = "financialEntityId") val financialEntityId: Int,
    @Json(name = "nature") val nature: String,
    @Json(name = "name") val name: String,
    @Json(name = "number") val number: String,
    @Json(name = "chargeable") val chargeable: Boolean,
    @Json(name = "dateCreated") val dateCreated: String,
    @Json(name = "lastUpdated") val lastUpdated: String,
    @Json(name = "lineName") val lineName: String,
    @Json(name = "availableAmount") val availableAmount: Double,
    @Json(name = "limitAmount") val limitAmount: Double,
    @Json(name = "usedAmount") val usedAmount: Double,
    @Json(name = "isBankAggregation") val isBankAggregation: Boolean
)


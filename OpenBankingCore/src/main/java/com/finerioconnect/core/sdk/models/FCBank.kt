package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCBank.kt
 *
 * @param bankId The ID of bank.
 * @param financialEntityId The ID of financial entity.
 * @param name The bank name.
 * @param imagePath The path to show image bank.
 * @param isBankAggregation Is bank aggregation flag.
 */
@JsonClass(generateAdapter = true)
data class FCBank(
    @Json(name = "bankId") val bankId: String,
    @Json(name = "financialEntityId") val financialEntityId: Int?,
    @Json(name = "name") val name: String?,
    @Json(name = "imagePath") val imagePath: String?,
    @Json(name = "isBankAggregation") val isBankAggregation: Boolean?
)

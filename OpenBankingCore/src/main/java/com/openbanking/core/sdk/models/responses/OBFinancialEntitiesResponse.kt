package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBFinancialEntity
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCFinancialEntitiesResponse.kt
 *
 * @param financialEntities Array of objects (Financial Entities).
 */
@JsonClass(generateAdapter = true)
data class OBFinancialEntitiesResponse(
    @Json(name = "financialEntities") val financialEntities : List<OBFinancialEntity>,
)

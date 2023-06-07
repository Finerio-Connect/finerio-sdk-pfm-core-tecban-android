package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCFinancialEntity.kt
 *
 * @param id The ID of the financial entity.
 * @param name The name of the financial entity.
 * @param code The code of the financial entity.
 * @param imagePath The image of the financial entity.
 * @param isBankAggregation The flag to identify if its provided by bank or manual account.
 * @param dateCreated The date when the financial entity was created.
 * @param lastUpdated The date when the financial entity was updated.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCFinancialEntity(
    @Json(name = "id") val id : Int,
    @Json(name = "name") val name : String,
    @Json(name = "code") val code : String,
    @Json(name = "imagePath") val imagePath : String?,
    @Json(name = "isBankAggregation") val isBankAggregation : Boolean?,
    @Json(name = "dateCreated") val dateCreated : Long,
    @Json(name = "lastUpdated") val lastUpdated : Long
)

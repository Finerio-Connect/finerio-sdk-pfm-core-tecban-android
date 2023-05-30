package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCFinancialEntity.kt
 *
 * @param date Transaction date.
 * @param transactions List of transactions.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCMovementsByDate(
    @Json(name = "date") val date : Long,
    @Json(name = "transactions") val transactions : List<FCTransaction>
)

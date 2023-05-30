package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCResumeBalance.kt
 *
 * @param date The year and month of the information
 * @param incomes The incomes of a user, grouped by month by default.
 * @param expenses The expenses of a user, grouped by month by default
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCResumeBalance(
    @Json(name = "date") val date : Long,
    @Json(name = "incomes") val incomes : Double,
    @Json(name = "expenses") val expenses : Double
)

package com.finerioconnect.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCUpdateBudgetRequest.kt
 *
 * @param name The name of the budget.
 * @param amount The amount of the budget.
 * @param warningPercentage The percentage where the budget status changes from stable to warning.
 * @param categoryId The category ID of the budget.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCUpdateBudgetRequest(
    @Json(name = "name") val name : String,
    @Json(name = "amount") val amount : Double,
    @Json(name = "warningPercentage") val warningPercentage : Double,
    @Json(name = "categoryId") val categoryId : Long?
)

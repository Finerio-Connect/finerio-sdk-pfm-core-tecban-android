package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCCreateBudgetRequest.kt
 *
 * @param userId The ID of the user
 * @param categoryId The category ID of the budget.
 * @param name The name of the budget.
 * @param amount The amount of the budget.
 * @param warningPercentage The percentage where the budget status changes from stable to warning.
 *
 */
@JsonClass(generateAdapter = true)
data class OBCreateBudgetRequest(
    @Json(name = "userId") val userId : Int,
    @Json(name = "categoryId") val categoryId : Int,
    @Json(name = "name") val name : String,
    @Json(name = "amount") val amount : Double,
    @Json(name = "warningPercentage") val warningPercentage : Double
)

package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCBudget.kt
 *
 * @param id The ID of the budget
 * @param categoryId The category ID of the budget.
 * @param name The name of the budget.
 * @param amount The amount of the budget.
 * @param warningPercentage The percentage where the budget status changes from stable to warning. By default is 0.7.
 * @param spent The amount of money spent for the category.
 * @param leftToSpend The amount of money remaining for the budget.
 * @param status Enum: "ok" "warning" "danger" The status of the budget.
 * @param dateCreated The date when the budget was created.
 * @param lastUpdated The date when the budget was updated.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCBudget(
    @Json(name = "id") val id : Int,
    @Json(name = "categoryId") val categoryId : Int,
    @Json(name = "name") val name : String,
    @Json(name = "amount") val amount : Double,
    @Json(name = "warningPercentage") val warningPercentage : Double,
    @Json(name = "spent") val spent : Double,
    @Json(name = "leftToSpend") val leftToSpend : Double,
    @Json(name = "status") val status : String,
    @Json(name = "dateCreated") val dateCreated : Long,
    @Json(name = "lastUpdated") val lastUpdated : Long
)

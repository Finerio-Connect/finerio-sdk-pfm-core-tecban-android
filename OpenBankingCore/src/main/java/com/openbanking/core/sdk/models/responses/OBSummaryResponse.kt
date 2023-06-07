package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBResumeBalance
import com.openbanking.core.sdk.models.OBResumeByMonth
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * SummaryResponse
 *
 * @param incomes List of objects (IncomesModel).
 * @param expenses List of objects (ExpensesModel).
 * @param balances List of objects (BalancesModel).
 */
@JsonClass(generateAdapter = true)
data class OBSummaryResponse(
    @Json(name = "incomes") val incomes : List<OBResumeByMonth>,
    @Json(name = "expenses") val expenses : List<OBResumeByMonth>,
    @Json(name = "balances") val balances : List<OBResumeBalance>
)

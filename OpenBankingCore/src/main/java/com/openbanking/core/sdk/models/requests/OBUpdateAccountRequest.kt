package com.openbanking.core.sdk.models.requests

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * CreateAccountRequest
 *
 * @param nature Enum: "Debit" "Credit card" "Credit" "Investment" "Mortgage" The nature of the account.
 * @param name The name of the account.
 * @param number The name of the account.
 * @param balance The name of the account.
 * @param chargeable A flag that indicates if the balance of an account will change with transactions changes. False by default.
 */
@JsonClass(generateAdapter = true)
data class OBUpdateAccountRequest(
    @Json(name = "nature") var nature: String?,
    @Json(name = "name") var name: String?,
    @Json(name = "number") var number: String?,
    @Json(name = "balance") var balance: Double?,
    @Json(name = "chargeable") var chargeable: Boolean?,
    @Json(name = "extra_data") var extraData: String?
)
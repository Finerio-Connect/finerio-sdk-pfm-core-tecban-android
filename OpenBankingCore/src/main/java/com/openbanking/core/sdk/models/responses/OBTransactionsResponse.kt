package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBTransaction
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCTransactionsResponse
 *
 * @param data Array of objects (OBTransaction).
 * @param currentPage The curent page of Transactions list.
 * @param totalPages The total of pages to show Transactions list.
 * @param totalItems The total items of transactions.
 */
@JsonClass(generateAdapter = true)
data class OBTransactionsResponse(
    @Json(name = "data") var data: List<OBTransaction>?,
    @Json(name = "currentPage") var currentPage: Int?,
    @Json(name = "totalPages") var totalPages: Int?,
    @Json(name = "totalItems") var totalItems: Int?
)

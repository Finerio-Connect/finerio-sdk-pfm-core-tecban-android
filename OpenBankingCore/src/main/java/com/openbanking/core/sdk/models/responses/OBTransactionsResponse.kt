package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBTransaction
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCTransactionsResponse
 *
 * @param data Array of objects (Transaction).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class OBTransactionsResponse(
    @Json(name = "data") var data: List<OBTransaction>?,
    @Json(name = "nextCursor") var nextCursor: Int?
)

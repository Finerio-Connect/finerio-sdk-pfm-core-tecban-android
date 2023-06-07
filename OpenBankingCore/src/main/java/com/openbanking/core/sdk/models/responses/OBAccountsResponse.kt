package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBAccount
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCAccountsResponse
 *
 * @param data  Array of objects (Account).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class OBAccountsResponse(
    @Json(name = "data") var data: List<OBAccount>?,
    @Json(name = "nextCursor") var nextCursor: Int?
)
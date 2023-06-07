package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBUser
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCUsersResponse.kt
 *
 * @param data Array of objects (Users).
 * @param nextCursor The ID to be used in the next request in the 'cursor' query parameter.
 */
@JsonClass(generateAdapter = true)
data class OBUsersResponse(
    @Json(name = "data") val data : List<OBUser>,
    @Json(name = "nextCursor") val nextCursor : Int?
)

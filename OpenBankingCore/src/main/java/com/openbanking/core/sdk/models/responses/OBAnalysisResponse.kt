package com.openbanking.core.sdk.models.responses

import com.openbanking.core.sdk.models.OBAnalysisByMonth
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCAnalysisResponse
 *
 * @param data The analysis of a user, grouped by month by default.
 */
@JsonClass(generateAdapter = true)
data class OBAnalysisResponse(
    @Json(name = "data") var data: List<OBAnalysisByMonth>
)

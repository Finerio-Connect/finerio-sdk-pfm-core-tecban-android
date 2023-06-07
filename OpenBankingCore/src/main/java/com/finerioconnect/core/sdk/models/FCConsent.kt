package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCConsent.kt
 *
 * @param consentId The ID of consent.
 * @param expirationDate The consent expiration date.
 * @param bank The bank data.
 * @param status The consent current status.
 */
@JsonClass(generateAdapter = true)
data class FCConsent(
    @Json(name = "consentId") var consentId: String,
    @Json(name = "expirationDate") var expirationDate: String?,
    @Json(name = "bank") var bank: FCBank,
    @Json(name = "status") var status: String,
    @Json(name = "originBankName") val originBankName: String?,
    @Json(name = "customerIdentification") val customerIdentification: String?,
    @Json(name = "cpf") val cpf: String?,
    @Json(name = "purpose") val purpose: String?,
    @Json(name = "deadline") val deadline: Int?,
    @Json(name = "expirationDay") val expirationDay: String?,
    @Json(name = "isSynchronized") val isSynchronized: Boolean?
)

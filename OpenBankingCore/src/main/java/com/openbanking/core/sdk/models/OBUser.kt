package com.openbanking.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCUser.kt
 *
 * @param id The ID of the user.
 * @param cpf The CPF of the user.
 * @param dateCreated The date when the user was created.
 *
 */
@JsonClass(generateAdapter = true)
data class OBUser(
    @Json(name = "id") val id : Int,
    @Json(name = "cpf") val cpf : String,
    @Json(name = "dateCreated") val dateCreated : Long,
)

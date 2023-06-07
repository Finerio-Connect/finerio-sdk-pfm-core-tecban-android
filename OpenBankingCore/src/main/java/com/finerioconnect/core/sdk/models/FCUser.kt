package com.finerioconnect.core.sdk.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * FCUser.kt
 *
 * @param id The ID of the user.
 * @param cpf The CPF of the user.
 * @param dateCreated The date when the user was created.
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
@JsonClass(generateAdapter = true)
data class FCUser(
    @Json(name = "id") val id : Int,
    @Json(name = "cpf") val cpf : String,
    @Json(name = "dateCreated") val dateCreated : Long,
)

package com.openbanking.core.sdk.modelsui

import com.openbanking.core.sdk.shared.enums.FCFieldType

data class FCBankField(
    val name: String,
    val friendlyName: String,
    val position: Int,
    val type: FCFieldType,
    val required: Boolean?,
    val bankId: String,
    var value: String?
)

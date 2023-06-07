package com.openbanking.core.sdk.modelsui

data class FCAccountDetail(
    val userLabel: String,
    val user: String,
    val credential: FCCredential,
    val bankFields: List<FCBankField>
)
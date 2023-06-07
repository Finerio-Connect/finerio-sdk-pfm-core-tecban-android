package com.finerioconnect.core.sdk.modelsui

data class FCCredentialModel(
    var name: String = "",
    var image: FCImage? = null,
    var accounts: List<FCAccount>? = null,
    var collapsed: Boolean
)

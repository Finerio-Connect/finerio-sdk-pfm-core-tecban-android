package com.finerioconnect.core.sdk.modelsui

data class FCTransactionModel(
    var date: String = "",
    var total: Double = 0.0,
    var transactions: List<FCTransaction> = arrayListOf()
)

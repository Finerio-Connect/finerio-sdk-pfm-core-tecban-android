package com.finerioconnect.core.sdk.modelsui

import java.util.*

data class FCBalance(
    var month: Int,
    var date: Date,
    var totalIncomes: Double,
    var totalExpenses: Double
)
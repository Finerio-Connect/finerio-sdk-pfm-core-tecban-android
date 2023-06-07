package com.openbanking.core.sdk.ui.adapters.transactions.models

import com.openbanking.core.sdk.modelsui.FCImage

data class FCTransactionCategory(
    val name: String = "",
    val image: FCImage? = null,
    val backgroundColor: String? = null,
    val textColor: String? = null,
)

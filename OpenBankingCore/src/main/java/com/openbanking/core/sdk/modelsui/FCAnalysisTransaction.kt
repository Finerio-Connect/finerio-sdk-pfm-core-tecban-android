package com.openbanking.core.sdk.modelsui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.math.BigDecimal

@Parcelize
data class FCAnalysisTransaction(
    val description: String,
    val average: BigDecimal,
    val quantity: Int,
    val amount: BigDecimal
) : Parcelable

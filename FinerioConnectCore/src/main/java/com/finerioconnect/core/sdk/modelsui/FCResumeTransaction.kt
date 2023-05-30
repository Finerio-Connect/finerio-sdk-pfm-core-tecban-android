package com.finerioconnect.core.sdk.modelsui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FCResumeTransaction(
    val id: String,
    val date: String,
    val description: String,
    val amount: Double,
    val category: FCCategory
) : Parcelable
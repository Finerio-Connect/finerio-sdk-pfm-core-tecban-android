package com.openbanking.core.sdk.modelsui

import android.os.Parcelable
import com.openbanking.core.sdk.shared.enums.FCBankStatus
import kotlinx.parcelize.Parcelize

@Parcelize
data class FCBank(
    val id: String,
    val code: String,
    val name: String,
    val image: FCImage? = null,
    val status: FCBankStatus
) : Parcelable

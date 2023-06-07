package com.finerioconnect.core.sdk.modelsui

import android.os.Parcelable
import com.finerioconnect.core.sdk.modelsui.FCBank
import kotlinx.parcelize.Parcelize

@Parcelize
data class FCAccount(
    var id: String?,
    var name: String?,
    var type: String?,
    var balance: Double? = null,
    var bank: FCBank? = null
) : Parcelable
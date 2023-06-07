package com.finerioconnect.core.sdk.modelsui

import android.os.Parcelable
import com.finerioconnect.core.sdk.shared.enums.FCCredentialStatus
import kotlinx.parcelize.Parcelize

@Parcelize
data class FCCredential(
    var id: String? = null,
    var name: String? = null,
    var balance: Double? = 0.0,
    var user: String? = null,
    var status: FCCredentialStatus,
    var lastUpdated: String? = null,
    var institutionCode: String? = null,
    var image: FCImage? = null,
    var accounts: MutableList<FCAccount>? = null
) : Parcelable
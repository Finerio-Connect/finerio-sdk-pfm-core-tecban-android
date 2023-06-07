package com.openbanking.core.sdk.ui.base

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.LinearLayoutCompat
import com.openbanking.core.sdk.core.OpenBankingCore
import com.openbanking.core.sdk.helpers.logWarn

open class CategoryBaseView  @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayoutCompat(context, attrs) {

    init {
        orientation = VERTICAL
    }

    protected fun checkSDKCoreConfiguration() {
        if (!OpenBankingCore.shared.isReadySDK) {
            logWarn("You must configure the FineroConnectSDK to continue")
            return
        }
    }
}
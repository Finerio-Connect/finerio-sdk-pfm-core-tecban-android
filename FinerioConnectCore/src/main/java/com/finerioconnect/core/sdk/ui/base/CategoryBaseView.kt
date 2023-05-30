package com.finerioconnect.core.sdk.ui.base

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.LinearLayoutCompat
import com.finerioconnect.core.sdk.core.FinerioConnectCore
import com.finerioconnect.core.sdk.helpers.logWarn

open class CategoryBaseView  @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayoutCompat(context, attrs) {

    init {
        orientation = VERTICAL
    }

    protected fun checkSDKCoreConfiguration() {
        if (!FinerioConnectCore.shared.isReadySDK) {
            logWarn("You must configure the FineroConnectSDK to continue")
            return
        }
    }
}
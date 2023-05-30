package com.finerioconnect.core.sdk.ui.listeners

import com.finerioconnect.core.sdk.modelsui.FCCategory

interface OnFCCategoryListener {
    fun didSelectedCategory(category: FCCategory?)
}
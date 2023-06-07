package com.openbanking.core.sdk.ui.listeners

import com.openbanking.core.sdk.modelsui.FCCategory

interface OnFCCategoryListener {
    fun didSelectedCategory(category: FCCategory?)
}
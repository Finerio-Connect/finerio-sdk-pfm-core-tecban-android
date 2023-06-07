package com.openbanking.core.sdk.ui.listeners

import com.openbanking.core.sdk.modelsui.FCCategory

interface OnFCSubcategoryListener {
    fun didSelectedSubcategory(subcategory: FCCategory?)
}
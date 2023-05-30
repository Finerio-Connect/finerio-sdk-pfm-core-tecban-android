package com.finerioconnect.core.sdk.ui.listeners

import com.finerioconnect.core.sdk.modelsui.FCCategory

interface OnFCSubcategoryListener {
    fun didSelectedSubcategory(subcategory: FCCategory?)
}
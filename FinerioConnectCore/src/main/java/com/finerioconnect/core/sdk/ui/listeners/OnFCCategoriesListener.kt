package com.finerioconnect.core.sdk.ui.listeners

import com.finerioconnect.core.sdk.modelsui.FCCategory

interface OnFCCategoriesListener {
    fun didSelectedCategories(category: ArrayList<FCCategory>?)
}
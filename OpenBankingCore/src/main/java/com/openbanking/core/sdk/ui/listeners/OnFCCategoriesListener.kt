package com.openbanking.core.sdk.ui.listeners

import com.openbanking.core.sdk.modelsui.FCCategory

interface OnFCCategoriesListener {
    fun didSelectedCategories(category: ArrayList<FCCategory>?)
}
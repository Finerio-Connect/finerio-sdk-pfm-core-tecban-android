package com.openbanking.core.sdk.ui.adapters.categories.models

import android.widget.CheckBox
import com.openbanking.core.sdk.modelsui.FCImage

data class CategoryAdapterModel(
    val id: String,
    val name: String,
    val backgroundColor: String = "",
    val textColor: String = "",
    val image: FCImage?,
    val parentId: String? = null,
    var checkbox: CheckBox?,
    var isChecked: Boolean = false,
    var isDisplayedOnScreen: Boolean = false,
    var subCategories: ArrayList<CategoryAdapterModel>? = arrayListOf()
)
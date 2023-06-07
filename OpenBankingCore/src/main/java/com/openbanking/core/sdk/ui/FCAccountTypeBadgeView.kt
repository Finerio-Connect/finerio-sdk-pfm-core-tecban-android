package com.openbanking.core.sdk.ui

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.widget.ImageViewCompat
import com.bumptech.glide.Glide
import com.openbanking.core.sdk.databinding.PartialAccountTypeBadgeViewBinding
import com.openbanking.core.sdk.extensions.findImageIdentifier
import com.openbanking.core.sdk.extensions.isUrl
import com.openbanking.core.sdk.extensions.safe
import com.openbanking.core.sdk.modelsui.FCImage

class FCAccountTypeBadgeView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : LinearLayoutCompat(context, attrs) {

    private val mBinding = PartialAccountTypeBadgeViewBinding
        .inflate(LayoutInflater.from(context), this, true)

    fun setAccount(accountName: String, image: FCImage?) = with(mBinding) {
        tvAccount.text = accountName
        val imageName = image?.name.safe()
        if (imageName.isUrl()) {
            Glide.with(context).load(imageName).into(ivAccount)
        } else {
            val resourceImage = context.findImageIdentifier(imageName)
            ivAccount.setImageResource(resourceImage)
        }
        val tint = image?.tintColor
        val colorStateList = if (tint == null) null else ColorStateList.valueOf(tint)
        ImageViewCompat.setImageTintList(ivAccount, colorStateList)
    }

}
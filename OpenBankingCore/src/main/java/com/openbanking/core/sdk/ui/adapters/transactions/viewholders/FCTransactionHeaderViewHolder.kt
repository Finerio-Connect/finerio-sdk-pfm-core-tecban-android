package com.openbanking.core.sdk.ui.adapters.transactions.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.openbanking.core.sdk.core.OpenBankingCore
import com.openbanking.core.sdk.databinding.ItemHeaderDateBinding
import com.openbanking.core.sdk.extensions.formatAmount
import com.openbanking.core.sdk.extensions.safe
import com.openbanking.core.sdk.ui.adapters.transactions.models.FCTransactionHeader
import com.openbanking.core.sdk.ui.models.TransactionListPalette

class FCTransactionHeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val mBinding = ItemHeaderDateBinding.bind(itemView)

    fun bind(header: FCTransactionHeader?, transactionListPalette: TransactionListPalette? = null) = with(mBinding) {
        tvDateTitle.text = header?.dateTitle.safe()
        header?.amount?.let {
            tvAmount.text = it.formatAmount()
        }
        transactionListPalette?.headerBackground?.let {
            llHeader.setBackgroundColor(it)
        }
        transactionListPalette?.headerTextColor?.let {
            tvDateTitle.setTextColor(it)
            tvAmount.setTextColor(it)
        }
        OpenBankingCore.shared.fonts.family?.let {
            tvDateTitle.typeface = it
            tvAmount.typeface = it
        }
    }

}
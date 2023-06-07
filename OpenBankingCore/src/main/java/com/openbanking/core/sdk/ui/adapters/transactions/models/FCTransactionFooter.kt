package com.openbanking.core.sdk.ui.adapters.transactions.models

import com.openbanking.core.sdk.ui.adapters.transactions.FCTransactionAdapter

class FCTransactionFooter: FCTransactionRow() {
    override fun viewType(): Int = FCTransactionAdapter.ITEM_VIEW_TYPE_FOOTER
}
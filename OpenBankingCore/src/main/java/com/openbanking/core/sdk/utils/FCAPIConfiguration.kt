package com.openbanking.core.sdk.utils

import java.util.*

/**
 * FCAPIConfiguration.kt
 * FCAPIConfiguration main class to set API configuration
 *
 * Copyright © 2022 Finerio Connect. All rights reserved.
 */
class FCAPIConfiguration {
    companion object {
        val shared = FCAPIConfiguration()
    }

    var apiKey = ""
        private set

    var locale = ""
        private set

    // initialize configuration with apikey and locale
    fun init(apiKey: String, locale: String = Locale.getDefault().language) = apply {
        this.apiKey = apiKey
        this.locale = locale
    }
}
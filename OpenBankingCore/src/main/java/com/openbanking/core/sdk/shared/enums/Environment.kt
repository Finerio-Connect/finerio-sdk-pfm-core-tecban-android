package com.openbanking.core.sdk.shared.enums

import com.openbanking.core.sdk.utils.FCEnvironmentDetails

enum class Environment {
    SANDBOX,
    PRODUCTION,
    CUSTOM;

    companion object {
        private lateinit var environmentCustom: FCEnvironmentDetails

        @JvmStatic
        fun custom(fcEnvironmentDetails: FCEnvironmentDetails): Environment {
            environmentCustom = fcEnvironmentDetails
            return CUSTOM
        }

        fun getCustomDetails(): FCEnvironmentDetails {
            return environmentCustom
        }
    }
}
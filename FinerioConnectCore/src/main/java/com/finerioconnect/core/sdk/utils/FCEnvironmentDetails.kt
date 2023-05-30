package com.finerioconnect.core.sdk.utils

import com.finerioconnect.core.sdk.shared.enums.Environment

class FCEnvironmentDetails {
    companion object {
        val shared = FCEnvironmentDetails()
    }

    lateinit var scheme: String
    lateinit var host: String
    lateinit var version: String

    fun init(scheme: String, host: String, version: String) {
        this.scheme = scheme
        this.host = host
        this.version = version
    }

    fun getDetails(environment: Environment) : FCEnvironmentDetails {
        when(environment) {
            Environment.SANDBOX -> {
                scheme = "https://"
                host = "api-pfm-openbanking-v1.finerioconnect.com/"
                version = ""
            }
            Environment.PRODUCTION -> {
                scheme = ""
                host = ""
                version = ""
            }
            Environment.CUSTOM -> {
                scheme = Environment.getCustomDetails().scheme
                host = Environment.getCustomDetails().host
                version = Environment.getCustomDetails().version
            }
        }

        return this
    }
}
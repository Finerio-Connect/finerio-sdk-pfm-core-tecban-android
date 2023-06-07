package com.openbanking.core.sdk.utils

import com.openbanking.core.sdk.shared.enums.Environment

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
                scheme = "http://"
                host = "ec2-3-21-18-54.us-east-2.compute.amazonaws.com:8081/"
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
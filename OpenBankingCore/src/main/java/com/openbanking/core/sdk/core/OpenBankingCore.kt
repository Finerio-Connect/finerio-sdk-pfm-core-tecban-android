package com.openbanking.core.sdk.core

import com.openbanking.core.sdk.helpers.logInfo
import com.openbanking.core.sdk.modelsui.Fonts
import com.openbanking.core.sdk.shared.enums.Environment
import com.openbanking.core.sdk.shared.enums.LogLevel

class OpenBankingCore private constructor() {

    companion object {
        val shared = OpenBankingCore()
    }

    private var configuration: Configuration = Configuration()

    fun init(configuration: Configuration) = apply {
        this.configuration = configuration
    }

    var logLevel: LogLevel
        get() = configuration.logLevel
        set(value) {
            configuration.setLogLevel(value)
        }

    var environment: Environment
        get() = configuration.environment
        set(value) {
            configuration.setEnvironment(value)
        }

    var fonts: Fonts
        get() = configuration.fonts
        set(value) {
            configuration.setFonts(value)
        }

    var isReadySDK: Boolean
        get() = configuration.isReadySDK
        set(value) {
            configuration.setIsReadySDK(value)
        }

    var apiKey: String
        get() = configuration.apiKey
        set(value) {
            configuration.setUserToken(value)
        }

    fun configure() {
        logInfo("FinerioConnectCore configured...")

        configuration.setIsReadySDK(true)
    }
}
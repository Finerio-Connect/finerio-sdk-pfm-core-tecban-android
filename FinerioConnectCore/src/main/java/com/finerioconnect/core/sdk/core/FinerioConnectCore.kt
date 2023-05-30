package com.finerioconnect.core.sdk.core

import com.finerioconnect.core.sdk.helpers.logInfo
import com.finerioconnect.core.sdk.modelsui.Fonts
import com.finerioconnect.core.sdk.shared.enums.Environment
import com.finerioconnect.core.sdk.shared.enums.LogLevel

class FinerioConnectCore private constructor() {

    companion object {
        val shared = FinerioConnectCore()
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
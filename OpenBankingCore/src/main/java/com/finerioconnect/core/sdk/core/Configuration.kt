package com.finerioconnect.core.sdk.core

import com.finerioconnect.core.sdk.modelsui.Fonts
import com.finerioconnect.core.sdk.shared.enums.Environment
import com.finerioconnect.core.sdk.shared.enums.LogLevel

class Configuration {

    // MARK: Global Variables

    var logLevel: LogLevel = LogLevel.INFO
        private set
    var environment: Environment = Environment.SANDBOX
        private set
    var fonts = Fonts()
        private set
    var isReadySDK = false
        private set
    var apiKey = ""
        private set

    fun setLogLevel(logLevel: LogLevel) = apply {
        this.logLevel = logLevel
    }

    fun setEnvironment(environment: Environment) = apply {
        this.environment = environment
    }

    fun setFonts(fonts: Fonts) = apply {
        this.fonts = fonts
    }

    fun setIsReadySDK(isReadySDK: Boolean) = apply {
        this.isReadySDK = isReadySDK
    }

    fun setUserToken(userToken: String) = apply {
        this.apiKey = userToken
    }
}
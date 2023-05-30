package com.finerioconnect.pfm.sdk.tecban.sdkcore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finerioconnect.core.sdk.core.FinerioConnectCore.Companion.shared
import com.finerioconnect.core.sdk.shared.enums.Environment
import com.finerioconnect.core.sdk.shared.enums.LogLevel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configSDK()
    }

    private fun configSDK() {
        val finerioConnectCore = shared
        finerioConnectCore.apiKey = "your_api_key"
        finerioConnectCore.environment = Environment.SANDBOX
        finerioConnectCore.logLevel = LogLevel.DEBUG
        finerioConnectCore.configure()
    }
}
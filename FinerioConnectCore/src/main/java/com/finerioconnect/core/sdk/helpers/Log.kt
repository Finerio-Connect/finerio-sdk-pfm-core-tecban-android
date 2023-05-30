package com.finerioconnect.core.sdk.helpers

import android.util.Log
import com.finerioconnect.core.sdk.core.FinerioConnectCore
import com.finerioconnect.core.sdk.shared.enums.LogLevel

private const val TAG = "Finero Connect"

fun logInfo(message: String){
    if(FinerioConnectCore.shared.logLevel.ordinal < LogLevel.INFO.ordinal){
        return
    }
    Log.i(TAG, message)
}

fun logWarn(message: String, filename: String = "", line: Int = -1, funcName: String = ""){
    if(FinerioConnectCore.shared.logLevel.ordinal < LogLevel.ERROR.ordinal){
        return
    }
    val caller = "$filename - #$line - $funcName"
    Log.w(TAG, "⚠️⚠️⚠️ WARNING: $message")
    Log.w(TAG, "⚠️⚠️⚠️ FROM CALLER: $caller")
}


fun logError(error: Exception, filename: String = "", line: Int = -1, funcName: String = ""){
    if(FinerioConnectCore.shared.logLevel.ordinal < LogLevel.ERROR.ordinal){
        return
    }
    val errorMessage = error.message?:""
    if(errorMessage.contains("401") || errorMessage.contains("402")){
        Log.e(TAG, "Invalid credentials!!")
        return
    }

    val caller = "$filename - #$line - $funcName"
    Log.e(TAG, "‼️‼️‼️ ERROR: $errorMessage")
    Log.e(TAG, "‼️‼️‼️ FROM CALLER: $caller")
}
package com.finerioconnect.core.sdk.server

interface Server {

    fun<T: PfmSdkApi> api(apiClient: Class<T>): T

}
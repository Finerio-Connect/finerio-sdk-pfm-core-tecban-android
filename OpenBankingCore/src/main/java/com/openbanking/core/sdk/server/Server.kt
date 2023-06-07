package com.openbanking.core.sdk.server

interface Server {

    fun<T: PfmSdkApi> api(apiClient: Class<T>): T

}
package com.example.postapp.model.api

import okhttp3.OkHttpClient

object ApiClient {
    var client= OkHttpClient.Builder().build()

}
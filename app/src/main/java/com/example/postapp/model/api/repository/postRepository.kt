package com.example.postapp.model.api.repository

import com.example.postapp.model.api.ApiClient
import com.example.postapp.model.api.ApiInterface
import com.example.postapp.model.post

import ke.co.postapp .api.ApiClient
import ke.co.postapp.api.ApiInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class postRepository {
    suspend fun getPost(): Response<list<post>> =withContxet(Dispatchers.10){this:CoroutineScope
        val apiInterface:ApiInterface=ApiClient.buidlService(ApiInterface::class.java)
        val response = apiInterface.getPost()
        return@withContxet response
    }

}
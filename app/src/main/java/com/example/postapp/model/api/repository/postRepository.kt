package com.example.postapp.model.api.repository

import com.example.postapp.model.post

import ke.co.postapp .api.ApiClient
import ke.co.postapp.api.ApiInterface
import kotlinx.Coroutines.Dispatchers
import kotlinx.Coroutines.withContext
import retrofit2.Response

class postRepository {
    suspend fun getPost(): Response<list<post>>? {
        val Dispatchers = null
        return Dispatchers?.let {
            withContext()
        }
    }

    private fun withContext() {

    }

}


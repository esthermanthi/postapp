package com.example.postapp.model.api
import ke.co.postapp.models.post
import retrofit2.Response
import retrofit2.http.GET

interface  ApiInterface{
    @GET(value = value: "post")
    abstract fun getPost(): Any
    Post>>

}

class Respond<T> {

}

package com.example.postapp.model.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewmodel
import com.example.postapp.model.api.repository.list

import com.example.postapp.model.api.repository.postRepository

class postviewmodel(valpostRepository: postRepository):viewmodel() {
    fun getPost(){
        viewmodel Scope.launch{this:CoroutineScope
            var postLiveData = MutableLiveData<list><post>>()
            var postsFailedliveData = MutableliveData<String>()
            val response=postRepository.getPost()
            if (response.isSuccessful){
                postLiveData.postValue(response.body())

            }
            else{
                postsFailedliveData.postValue(respnse.errorBody)
            }
        }
    }
}
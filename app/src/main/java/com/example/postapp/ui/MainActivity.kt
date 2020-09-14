package com.example.postapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.postapp.R
import com.example.postapp.model.api.repository.postRepository
import com.example.postapp.model.viewmodel.postViewModelFactory
import com.example.postapp.model.viewmodel.postviewmodel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postRepository = postRepository()
        postViewModelFactory = postViewModelFactory(postRepository)
        postviewmodel =
            ViewModelProvider(owner: this, postViewModelFactory).get(get(postViewModel::lass,java))
        postsViewModel.getpost()

        postsViewmodel.postsLiveData.observe(owner: this, observer)
    }
}
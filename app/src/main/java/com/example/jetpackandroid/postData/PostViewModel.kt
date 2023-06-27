package com.example.jetpackandroid.postData

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PostViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<Post>>
    private val repository: PostRepository

    init {
        val userDao = PostDatabase.getDatabase(application).postDao()
        repository = PostRepository(userDao)
        readAllData = repository.readAllData
    }

    fun addUser(user: Post){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addPost(user)
        }
    }
}
package com.example.jetpackandroid.postData

import androidx.lifecycle.LiveData

class PostRepository(private val postDao: PostDao) {
    val readAllData: LiveData<List<Post>> = postDao.readAllData()

    suspend fun addPost(post: Post){
        postDao.addPost(post)
    }
}
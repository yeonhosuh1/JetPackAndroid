package com.example.jetpackandroid.postData

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "post_table")
data class Post (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val Name: String,
    val timestamp: LocalDateTime,
    val content: Int,
)
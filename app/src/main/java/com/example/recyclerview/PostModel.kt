package com.example.recyclerview

data class PostModel(
    val image: String,
    val description: String,
    val like: Int,
    val dislike: Int,
    val type: Int
) : BaseModel(type)

package com.example.recyclerview

data class AdModel(
    val url: String,
    val image: String,
    val type: Int
) : BaseModel(type)

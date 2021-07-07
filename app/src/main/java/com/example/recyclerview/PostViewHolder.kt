package com.example.recyclerview

import android.view.View
import kotlinx.android.synthetic.main.item_post.view.*

class PostViewHolder(itemView: View, type: Int) : BaseViewHolder(itemView, type) {
    fun populateModel(post: PostModel, onPostItemClicked: () -> Unit) {
        itemView.tvDescription.text = post.description
        itemView.tvLike.text = post.like.toString()
        itemView.tvDislike.text = post.dislike.toString()
        itemView.setOnClickListener {
            onPostItemClicked.invoke()
        }
    }
}
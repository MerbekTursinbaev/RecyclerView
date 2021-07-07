package com.example.recyclerview

import android.view.View

class AdViewHolder(itemView: View, type: Int) : BaseViewHolder(itemView,type){
    fun populateModel(ad: AdModel, onAdItemClicked: () -> Unit) {
        itemView.setOnClickListener {
            onAdItemClicked.invoke()
        }
    }
}
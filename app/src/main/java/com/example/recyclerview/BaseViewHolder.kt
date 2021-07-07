package com.example.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder(itemView: View, val type: Int ) : RecyclerView.ViewHolder(itemView) {
    companion object {
        const val TYPE_AD = 2
        const val TYPE_POST = 1
    }
}
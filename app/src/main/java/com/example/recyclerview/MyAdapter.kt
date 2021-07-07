package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter: RecyclerView.Adapter<BaseViewHolder>() {
    var models: List<BaseModel> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].viewtype

    }

    var onPostItemClicked: () -> Unit = {}
    var onAdItemClicked: () -> Unit = {}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        var view: View
        if (viewType == BaseViewHolder.TYPE_POST) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
            return PostViewHolder(view,viewType)
        } else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_ad,parent,false)
            return AdViewHolder(view,viewType)
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
       if (holder.type == BaseViewHolder.TYPE_POST) {
           (holder as PostViewHolder).populateModel(models[position] as PostModel, onPostItemClicked)
       } else {
           (holder as AdViewHolder).populateModel(models[position] as AdModel, onAdItemClicked)
       }
    }

    override fun getItemCount() = models.size
}
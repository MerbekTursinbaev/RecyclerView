package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val myAdapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setData()
        myAdapter.onPostItemClicked = {
            val intent = Intent(this,Post::class.java)
            startActivity(intent)
        }
        myAdapter.onAdItemClicked = {
            val intent = Intent(this,Ad::class.java)
            startActivity(intent)
        }
    }

    private fun setData() {
        val list: MutableList<BaseModel> = mutableListOf()
        for (i in 1..100) {
            if (i%5==0) {
                list.add(AdModel("","",BaseViewHolder.TYPE_AD))
            } else {
                list.add(PostModel("","asdsadasdasd",789,123,BaseViewHolder.TYPE_POST))
            }
        }
        myAdapter.models = list
    }
}
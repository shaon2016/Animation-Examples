package com.lastblade.animationpractice

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class ExplodeTransitionAdapter(val context: Context, val items: ArrayList<Int>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return MyViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.rv_explode_transition, p0, false))
    }

    override fun getItemCount() = items.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, pos: Int) {
        val h = holder as MyViewHolder
        val curPos = h.adapterPosition
        h.bind(items[curPos])

        h.itemView.setOnClickListener {
            val intent = Intent(context, ExplodeTransitionItemDetails::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val bundle = ActivityOptions.makeSceneTransitionAnimation(context as Activity).toBundle()
                context.startActivity(intent, bundle)
            } else {
                context.startActivity(intent)
            }
        }
    }


    private inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private val imageView = v.findViewById<ImageView>(R.id.imageView)

        fun bind(ivResource: Int) {
            imageView.setImageResource(ivResource)
        }
    }
}
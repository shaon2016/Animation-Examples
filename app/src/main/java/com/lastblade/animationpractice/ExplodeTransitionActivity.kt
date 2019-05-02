package com.lastblade.animationpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_explode_transition.*

class ExplodeTransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explode_transition)

        val items = arrayListOf<Int>(R.drawable.one,R.drawable.two, R.drawable.three, R.drawable.four)
        val explodeTransitionAdapter = ExplodeTransitionAdapter(this, items)
        rvExplode.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        rvExplode.adapter = explodeTransitionAdapter
    }
}

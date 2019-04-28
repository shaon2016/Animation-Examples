package com.lastblade.animationpractice

import android.os.Bundle
import android.support.animation.DynamicAnimation
import android.support.animation.FlingAnimation
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fling_animation.*

class FlingAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fling_animation)

        btnFling.setOnClickListener {
            val fling = FlingAnimation(ivFling, DynamicAnimation.X)
            fling.setStartVelocity(200f)
            fling.start()
        }
    }
}

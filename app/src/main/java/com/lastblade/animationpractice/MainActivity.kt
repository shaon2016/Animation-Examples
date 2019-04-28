package com.lastblade.animationpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Mother link of the animation
 * https://developer.android.com/training/animation/overview.html
 *
 * */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFlingAnimationPage.setOnClickListener {
            startActivity(Intent(this, FlingAnimation::class.java))
        }
    }
}

package com.lastblade.animationpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_window_transition.*

class ActivityWindowTransition : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window_transition)

        btnSharedTransition.setOnClickListener {
            startActivity(Intent(this, ActivityWindowTransitionOne::class.java))
        }

        btnExplode.setOnClickListener {
            startActivity(Intent(this, ExplodeTransitionActivity::class.java))
        }
    }
}

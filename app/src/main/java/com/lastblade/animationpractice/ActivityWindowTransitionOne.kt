package com.lastblade.animationpractice

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_window_transition_one.*

/*
* Link
* https://guides.codepath.com/android/Shared-Element-Activity-Transition
* */

class ActivityWindowTransitionOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window_transition_one)


        ivWindowTransitionOne.setOnClickListener {
            val intent = Intent(this, ActivityWindowTransitionTwo::class.java)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                startActivity(
                    intent,
                    ActivityOptions.makeSceneTransitionAnimation(
                        this, ivWindowTransitionOne,
                        "pic"
                    ).toBundle()
                )
            } else startActivity(intent)
        }
    }
}

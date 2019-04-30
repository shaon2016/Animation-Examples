package com.lastblade.animationpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_auto_layout_animation.*

class AutoLayoutAnimationActivity : AppCompatActivity() {
    var v: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_layout_animation)


        btnAdd.setOnClickListener {
            v = View.inflate(this, R.layout.auto_layout_flexbox_portion, null)

            flAuto.addView(v)
        }

        btnRemove.setOnClickListener {
            if (v != null)
                flAuto.removeView(v)
        }
    }
}

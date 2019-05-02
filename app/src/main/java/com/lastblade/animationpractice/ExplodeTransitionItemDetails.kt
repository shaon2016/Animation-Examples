package com.lastblade.animationpractice

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Slide
import android.view.Gravity
import android.view.Window
import android.view.animation.AnimationUtils

class ExplodeTransitionItemDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(window) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)

                val slide = Slide(Gravity.BOTTOM)

                slide.addTarget(R.id.tvMainContent)

                val slideInterpolator = AnimationUtils.loadInterpolator(
                    this@ExplodeTransitionItemDetails, android.R.interpolator.linear_out_slow_in
                )
                slide.interpolator = slideInterpolator

                enterTransition = slide
            }
        }

        setContentView(R.layout.activity_explode_transition_item_details)
    }
}

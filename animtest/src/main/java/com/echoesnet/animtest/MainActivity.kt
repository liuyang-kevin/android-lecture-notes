package com.echoesnet.animtest

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivListAnim = findViewById<ImageView>(R.id.ivListAnim)
        ivListAnim.setImageResource(R.drawable.play_heart)
        val anim = ivListAnim.drawable as AnimationDrawable
        anim.start()

//        val animation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha)
//        ivListAnim.startAnimation(animation)
//
//        animation.setAnimationListener(object : Animation.AnimationListener {
//            override fun onAnimationStart(animation: Animation) {
//
//            }
//
//            override fun onAnimationEnd(animation: Animation) {
////                this@MainActivity.runOnUiThread { ivListAnim.startAnimation(animation) }
//                ivListAnim.startAnimation(animation)
//            }
//
//            override fun onAnimationRepeat(animation: Animation) {
//
//            }
//        })



        val alphaAnim = ObjectAnimator.ofFloat(ivListAnim, "alpha", 1.0f, 0.5f, 0.8f, 1.0f)
        val scaleXAnim = ObjectAnimator.ofFloat(ivListAnim, "scaleX", 0.0f, 1.0f)
        val scaleYAnim = ObjectAnimator.ofFloat(ivListAnim, "scaleY", 0.0f, 2.0f)
        val rotateAnim = ObjectAnimator.ofFloat(ivListAnim, "rotation", 0.0f, 360.0f)
        val transXAnim = ObjectAnimator.ofFloat(ivListAnim, "translationX", 100.0f, 400.0f)
        val transYAnim = ObjectAnimator.ofFloat(ivListAnim, "translationY", 100.0f, 750.0f)
        val set = AnimatorSet()
//        set.playTogether(alphaAnim, scaleXAnim, scaleYAnim)
        set.playSequentially(alphaAnim, scaleXAnim, scaleYAnim, rotateAnim, transXAnim, transYAnim)
        set.duration = 3000
        set.start()


    }
}

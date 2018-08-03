package com.echoesnet.animtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class GiftDemoActivity : AppCompatActivity() {
    //Anim
    private val TIME_PARENT_TRANSLATION = 250

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


//    private val mHandler = object : Handler() {
//        override fun handleMessage(msg: android.os.Message) {
//            when (msg.what) {
//                1 -> {
//                    (msg.obj as View).visibility = View.VISIBLE
//                    var appearAnim: Animator? = (msg.obj as View).getTag(R.id.viewTagSecond) as Animator
//                    if (appearAnim == null) {
//                        appearAnim = start(msg.obj as View)
//                        (msg.obj as View).setTag(R.id.viewTagSecond, appearAnim)
//                    }
//                    appearAnim!!.start()
//                }
//                2 -> {
//                    val mGiftNumber = (msg.obj as View).findViewById(R.id.giftNum) as TextView
//                    var scaleAnim: Animator? = mGiftNumber.tag as Animator
//                    if (scaleAnim == null) {
//                        scaleAnim = scaleText(msg.obj as View)
//                        mGiftNumber.tag = scaleAnim
//                    }
//
//                    val disappearAnim = (msg.obj as View).getTag(R.id.viewTagThird) as Animator
//                    if (disappearAnim != null && disappearAnim.isRunning) {
//                        return
//                    }
//                    if (disappearAnim != null && disappearAnim.isStarted) {
//                        disappearAnim.cancel()
//                    }
//                    if (scaleAnim!!.isRunning) {
//                        scaleAnim.cancel()
//                    }
//                    scaleAnim.start()
//                }
//                3 -> {
//                    var disappearAnim1: Animator? = (msg.obj as View).getTag(R.id.viewTagThird) as Animator
//
//                    if (disappearAnim1 == null) {
//                        disappearAnim1 = disappear(msg.obj as View)
//                        (msg.obj as View).setTag(R.id.viewTagThird, disappearAnim1)
//                    }
//                    disappearAnim1!!.startDelay = (TIME_PARENT_TRANSLATION * 4).toLong()
//                    disappearAnim1.start()
//                }
//                -1 ->
//                    //                    disappearAnim = null;
//                    //                    appearAnim = null;
//                    //                    scalAnim = null;
//                    (msg.obj as View).setTag(R.id.viewTagFirst, "")
//                else -> {
//                }
//            }//                    ((View)msg.obj).setVisibility(View.INVISIBLE);
//        }
//    }
//
//
//    private fun start(v: View): Animator {
//        val mGiftImg = v.findViewById(R.id.ivgift) as ImageView
//        val mGiftNumber = v.findViewById(R.id.giftNum) as TextView
//
//        val distance = -v.paddingLeft - v.measuredWidth
//        val anim0 = ofAnimators(v, "translationX", *floatArrayOf(distance.toFloat(), 0f))
//        val anima = ofAnimators(v, "alpha", *floatArrayOf(0.8f, 1.0f))
//        val animy = ofAnimators(v, "translationY", *floatArrayOf(0.0f, 0.0f))
//        anim0.duration = TIME_PARENT_TRANSLATION.toLong()
//
//        val anim1 = ofAnimators(mGiftImg, "translationX", *floatArrayOf(distance.toFloat(), 0f))
//        anim1.duration = (TIME_PARENT_TRANSLATION * 2.5).toInt().toLong()
//
//        val anim2 = ofAnimators(mGiftNumber, "translationX", *floatArrayOf(distance.toFloat(), 0f))
//        anim2.duration = (TIME_PARENT_TRANSLATION * 2.5).toInt().toLong()
//
//        val set = AnimatorSet()
//        set.addListener(generateAnimListener(v, 1))
//        set.playTogether(*arrayOf(anim0, anima, animy, anim1, anim2))
//        return set
//    }
//
//    private fun scaleText(v: View): Animator {
//        val mGiftNumber = v.findViewById(R.id.giftNum) as TextView
//
//        val set = AnimatorSet()
//        set.playTogether(*arrayOf(ofAnimators(mGiftNumber, "scaleX", *floatArrayOf(1.0f, 2.0f, 1.0f, 1.3f, 1.0f)), ofAnimators(mGiftNumber, "scaleY", *floatArrayOf(1.0f, 2.0f, 1.0f, 1.3f, 1.0f))))
//        set.duration = (TIME_PARENT_TRANSLATION * 3.5).toInt().toLong()
//        set.addListener(generateAnimListener(v, 2))
//        return set
//    }
//
//    private fun disappear(v: View): Animator {
//        val set = AnimatorSet()
//        set.playTogether(*arrayOf(ofAnimators(v, "translationY", *floatArrayOf(0.0f, -176f)), ofAnimators(v, "alpha", *floatArrayOf(1.0f, 0.0f))))
//        set.duration = (TIME_PARENT_TRANSLATION * 4).toLong()
//        set.addListener(generateAnimListener(v, 3))
//        return set
//    }
//
//
//    private fun ofAnimators(target: View, name: String, vararg values: Float): Animator {
//        return ObjectAnimator.ofFloat(target, name, *values)
//    }
//
//    private fun generateAnimListener(v: View, tag: Int): Animator.AnimatorListener {
//        return object : Animator.AnimatorListener {
//
//            override fun onAnimationStart(animation: Animator) {}
//
//            override fun onAnimationEnd(animation: Animator) {
//                if (!animation.isRunning) {
//                    return
//                }
//                val msg = Message()
//
//                when (tag) {
//                    1 -> msg.what = 2
//                    2 -> msg.what = 3
//                    3 -> {
//                        msg.what = -1
//                        doNext()
//                    }
//                    else -> {
//                    }
//                }
//
//                msg.obj = v
//                mHandler.sendMessage(msg)
//            }
//
//            override fun onAnimationRepeat(animation: Animator) {}
//
//            override fun onAnimationCancel(animation: Animator) {}
//        }
//    }
}

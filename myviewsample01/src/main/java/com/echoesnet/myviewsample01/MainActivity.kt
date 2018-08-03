package com.echoesnet.myviewsample01

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.echoesnet.demoviewslibrary.HeartLikeSurfaceView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val m = MyView(this)
//        setContentView(m)
        setContentView(R.layout.activity_main)
        val hlsTest = findViewById<HeartLikeSurfaceView>(R.id.hlsTest)

        hlsTest.setOnClickListener({ v -> hlsTest.put() })
    }
}

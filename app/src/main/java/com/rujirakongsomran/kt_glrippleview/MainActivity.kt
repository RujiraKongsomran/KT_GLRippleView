package com.rujirakongsomran.kt_glrippleview

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        glView.run {
            addBackgroundImages(listOf(
                BitmapFactory.decodeResource(resources, R.drawable.chocolate_cake),
                BitmapFactory.decodeResource(resources, R.drawable.donut)
            ))
            setRippleOffset(0.01f)
            setFadeInterval(2000)
            startCrossFadeAnimation()
        }

    }
}
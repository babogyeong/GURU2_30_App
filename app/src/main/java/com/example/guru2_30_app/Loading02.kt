package com.example.guru2_30_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Loading02 : AppCompatActivity() {

    private val delayMillis: Long = 3000 //3초

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading02)

        //3초 후에 자동으로 Splash01로 전환
        Handler().postDelayed({
            val intent = Intent(this@Loading02, Splash01::class.java)
            startActivity(intent)
            finish()
        }, delayMillis)
    }
}
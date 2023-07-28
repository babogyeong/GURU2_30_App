package com.example.guru2_30_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LoadOff : AppCompatActivity() {

    private val delayMillis: Long = 2000 // 2초
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_off)

        //2초 후에 자동으로 LoadOn으로 전환
        Handler().postDelayed({
            val intent = Intent(this@LoadOff, LoadOn::class.java)
            startActivity(intent)
            finish()
        }, delayMillis)
    }
}
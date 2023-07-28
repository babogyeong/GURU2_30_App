package com.example.guru2_30_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash03)

        findViewById<View>(R.id.btn03).setOnClickListener {
            // 다른 화면으로 전환하기 위한 Intent 생성
            val intent = Intent(this@Splash03, Splash04::class.java)
            startActivity(intent)
        }
    }
}
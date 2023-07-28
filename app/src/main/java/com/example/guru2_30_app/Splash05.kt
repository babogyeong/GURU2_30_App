package com.example.guru2_30_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash05)

        findViewById<View>(R.id.StartButton).setOnClickListener {
            // 다른 화면으로 전환하기 위한 Intent 생성
            val intent = Intent(this@Splash05, main::class.java)
            startActivity(intent)
        }
    }
}
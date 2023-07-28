package com.example.guru2_30_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.view.View;


class Splash02 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash02)

        findViewById<View>(R.id.btn02).setOnClickListener {
            // 다른 화면으로 전환하기 위한 Intent 생성
            val intent = Intent(this@Splash02, Splash03::class.java)
            startActivity(intent)
        }
    }
}
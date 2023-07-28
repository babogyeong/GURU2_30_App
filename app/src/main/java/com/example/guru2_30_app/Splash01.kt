package com.example.guru2_30_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.view.View;


class Splash01 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash01)

        findViewById<View>(R.id.btn01).setOnClickListener {
            // 다른 화면으로 전환하기 위한 Intent 생성
            val intent = Intent(this@Splash01, Splash02::class.java)
            startActivity(intent)
        }
    }
}
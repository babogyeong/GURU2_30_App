package com.example.guru2_30_app

import android.annotation.SuppressLint

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.view.View;


class Splash04 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash04)

        findViewById<View>(R.id.btn04).setOnClickListener {
            // 다른 화면으로 전환하기 위한 Intent 생성
            val intent = Intent(this@Splash04, Splash05::class.java)
            startActivity(intent)
        }
    }
}
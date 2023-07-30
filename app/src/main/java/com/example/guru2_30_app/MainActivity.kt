package com.example.guru2_30_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var sidebarLayout: LinearLayout
    private lateinit var btnSidebar: ImageButton
    private lateinit var languageButton: ImageButton
    private lateinit var englishButton: ImageButton
    private lateinit var koreanButton: ImageButton
    private var isLanguageVisible = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sidebarLayout = findViewById(R.id.sidebarLayout)
        btnSidebar = findViewById(R.id.btn_sidebar)
        languageButton = findViewById(R.id.languageButton)
        englishButton = findViewById(R.id.englishButton)
        koreanButton = findViewById(R.id.koreanButton)

        btnSidebar.setOnClickListener {
            if (sidebarLayout.visibility == View.VISIBLE) {
                sidebarLayout.visibility = View.GONE
            } else {
                sidebarLayout.visibility = View.VISIBLE
            }
        }

        findViewById<View>(R.id.mainBtn).setOnClickListener{
            val intent = Intent(this@MainActivity, NoteActivity::class.java)
            startActivity(intent)
        }
        fun onLanguageButtonClick(view: View) {
            if (isLanguageVisible) {
                englishButton.visibility = View.GONE
                koreanButton.visibility = View.GONE
            } else {
                englishButton.visibility = View.VISIBLE
                koreanButton.visibility = View.VISIBLE
            }
            isLanguageVisible = !isLanguageVisible
        }
        fun onEnglishButtonClick(view: View) {
            // 영어 버튼을 눌렀을 때 동작하는 로직
            isKoreanSelected = false
            // TODO: 영어로 설정하는 로직 추가
        }

        fun onKoreanButtonClick(view: View) {
            // 한국어 버튼을 눌렀을 때 동작하는 로직
            isKoreanSelected = true

            // TODO: 한국어로 설정하는 로직 추가
        }

    }
}
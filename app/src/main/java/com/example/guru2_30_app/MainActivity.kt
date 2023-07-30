package com.example.guru2_30_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private lateinit var sidebarLayout: LinearLayout
    private lateinit var btnSidebar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sidebarLayout = findViewById(R.id.sidebarLayout)
        btnSidebar = findViewById(R.id.btn_sidebar)

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
    }
}
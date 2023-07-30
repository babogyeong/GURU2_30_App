package com.example.guru2_30_app

import android.annotation.SuppressLint
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText

class NoteActivity : AppCompatActivity() {

    lateinit var dbManager: DBManager
    lateinit var sqlitedb: SQLiteDatabase

    lateinit var saveBtn: Button
    lateinit var edtDate: EditText
    lateinit var edtTitle: EditText
    lateinit var edtPerson: EditText
    lateinit var edtPlace: EditText
    lateinit var edtIssue: EditText
    lateinit var edtFeel: EditText
    lateinit var edtTome: EditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        saveBtn = findViewById(R.id.saveBtn)
        edtDate = findViewById(R.id.date)
        edtTitle = findViewById(R.id.title)
        edtPerson = findViewById(R.id.person)
        edtPlace = findViewById(R.id.place)
        edtIssue = findViewById(R.id.issue)
        edtFeel = findViewById(R.id.feel)
        edtTome = findViewById(R.id.tome)

        dbManager = DBManager(this, "noteDB", null, 1)

        saveBtn.setOnClickListener{
            var str_title: String = edtTitle.text.toString()
            var str_date: String = edtDate.text.toString()
            var str_person: String = edtPerson.text.toString()
            var str_place: String = edtPlace.text.toString()
            var str_issue: String = edtIssue.text.toString()
            var str_feel: String = edtFeel.text.toString()
            var str_tome: String = edtTome.text.toString()

            sqlitedb = dbManager.writableDatabase
            sqlitedb.execSQL("INSERT INTO personnel VALUES ( '"+str_date+"', '"+str_title+"', '"+str_person+"', '"+str_place+"', '"+str_issue+"', '"+str_feel+"', '"+str_tome+"')")
            sqlitedb.close()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("intent_date", str_date)
            startActivity(intent)
        }
    }

}
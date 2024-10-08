package com.example.quizzapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        var btn_start = findViewById<Button>(R.id.btn_start)
        var et_name = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.et_name)

        btn_start.setOnClickListener {
            if (et_name.text.toString().isEmpty()){
               Toast.makeText(this,
                   "Please enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionActivity::class.java)
               intent.putExtra(Constants.USER_NAME, et_name.text.toString())
               
                startActivity(intent)
                finish()
            }
        }

    }
}
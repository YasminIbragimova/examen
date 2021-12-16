package com.example.examenyasmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.MainPage)
        val textView = findViewById<Button>(R.id.button)

        textView.setOnClickListener{
            startActivity(Intent(this,secondpage::class.java))
        }
    }
}
package com.example.examenyasmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondpage)
        val textView = findViewById<Button>(R.id.button2)

        textView.setOnClickListener{
            startActivity(Intent(this,MainPage::class.java))
        }
    }
}
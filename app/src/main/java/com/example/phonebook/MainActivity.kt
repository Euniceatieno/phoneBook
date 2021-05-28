package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNext=findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent2=Intent(baseContext,monalisa::class.java)
          startActivity(intent2)
        }
    }
    
}
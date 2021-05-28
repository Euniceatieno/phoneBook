package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class lovelace : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lovelace)
        var btnlace=findViewById<Button>(R.id.btnlace)
        btnlace.setOnClickListener {
            var intent9= Intent(baseContext,chinawall::class.java)
            startActivity(intent9)
        }
    }
}
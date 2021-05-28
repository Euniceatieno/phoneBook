package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class chinawall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chinawall)
        var btnCnext=findViewById<Button>(R.id.btnCnext)
        var btnCprevious=findViewById<Button>(R.id.btnCprevious)
        btnCnext.setOnClickListener {
            var intent7= Intent(baseContext,lovelace::class.java)
            startActivity(intent7)
        }
        btnCprevious.setOnClickListener {
            var intent8= Intent(baseContext,bobmarley::class.java)
            startActivity(intent8)

        }
    }
}
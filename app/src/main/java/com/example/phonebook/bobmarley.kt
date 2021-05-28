package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class bobmarley : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bobmarley)
        var btnmona=findViewById<Button>(R.id.btnmona)
        var btnPmona=findViewById<Button>(R.id.btnPmona)
        btnmona.setOnClickListener {
            var intent5= Intent(baseContext,chinawall::class.java)
            startActivity(intent5)
        }
        btnPmona.setOnClickListener {
            var intent6= Intent(baseContext,monalisa::class.java)
            startActivity(intent6)

        }
}
}
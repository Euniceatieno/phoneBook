package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class monalisa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monalisa)
        var btnNextchina=findViewById<Button>(R.id.btnNextchina)
        var btnPreviousblack=findViewById<Button>(R.id.btnPreviousblack)
        btnNextchina.setOnClickListener {
            var intent3= Intent(baseContext,bobmarley::class.java)
            startActivity(intent3)
        }
        btnPreviousblack.setOnClickListener {
            var intent4= Intent(baseContext,MainActivity::class.java)
            startActivity(intent4)

    }
    }
}

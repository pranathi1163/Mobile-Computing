package com.example.q12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button1)
        btn.setOnClickListener()
        {
            val i = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(i);
        }
    }
}
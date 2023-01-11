package com.example.q6

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var bundle :Bundle ?=intent.extras
        val tv = findViewById<TextView>(R.id.textView)
        var name = bundle?.get("key").toString()
        tv.text = "Hi $name"
    }
}
package com.example.q5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle :Bundle ?=intent.extras
        val tv = findViewById<TextView>(R.id.tv5)
        var message = bundle?.get("msg").toString()
        tv.setText(message)
    }
}
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.q5.MainActivity2
import java.util.*

class MainActivity : AppCompatActivity() {
    private fun getRandomString() : String {
        val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..6)
            .map { charset.random() }
            .joinToString("")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rand: String = getRandomString()
        val cap = findViewById<TextView>(R.id.textView3)
        cap.text = rand
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val ip1 : String = findViewById<EditText?>(R.id.ip1).text.toString()
            val ip2 : String = findViewById<EditText?>(R.id.ip2).text.toString()
            if(ip2 == rand && ip1.length>0 && ip1.length<=10)
            {
                intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("msg","$ip1")
                startActivity(intent)
            }
            else
            {
                intent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
package com.example.myapplication

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var bundle :Bundle ?=intent.extras
        val tv = findViewById<TextView>(R.id.tv5)
        var message = bundle?.get("msg").toString()
        tv.setText(message)
    }

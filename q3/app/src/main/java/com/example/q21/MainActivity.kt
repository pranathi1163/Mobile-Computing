package com.example.q21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt1=findViewById<Button>(R.id.button)
        val ratings=findViewById<RatingBar>(R.id.ratingBar)
        val txt=findViewById<TextView>(R.id.rating)
        ratings.setOnRatingBarChangeListener(
            RatingBar.OnRatingBarChangeListener{ratings,rating,fromUser ->
                val value=ratings.getRating() as Float
                if(value>=4)
                    txt.setText("awesome")
                else if(value>=3)
                    txt.setText("best")
                else if(value>=2)
                    txt.setText("bad")
                else if(value>=1)
                    txt.setText("worst")
                else
                    txt.setText("awful")

            })
        bt1.setOnClickListener()
        {
            Toast.makeText(applicationContext,"Submitted",Toast.LENGTH_LONG).show()
        }

    }
}
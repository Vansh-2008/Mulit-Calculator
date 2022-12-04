package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import kotlin.math.sqrt

class SaCone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sa_cone)

        val lengthEditText = findViewById<EditText>(R.id.sa_cone_radius)
        val heightEditText = findViewById<EditText>(R.id.sa_cone_height)
        val calculateBtn = findViewById<Button>(R.id.sa_cone_calc)
        val resultText = findViewById<TextView>(R.id.sa_cone_result)
        val clearBtn = findViewById<Button>(R.id.sa_cone_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@SaCone, SurfaceAreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val r = lengthEditText.text.toString().toFloat()
            val h = lengthEditText.text.toString().toFloat()
            val rhSQ = (r*r) + (h*h)
            val rhSQRT = sqrt(rhSQ)
            val sa = 3.14 * r * (r + rhSQRT)

            resultText.text = sa.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            lengthEditText.text.clear()
            heightEditText.text.clear()
        }

    }
}
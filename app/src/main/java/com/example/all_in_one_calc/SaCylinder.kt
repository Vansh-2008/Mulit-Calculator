package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import kotlin.math.sqrt

class SaCylinder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sa_cylinder)

        val lengthEditText = findViewById<EditText>(R.id.sa_cylinder_radius)
        val heightEditText = findViewById<EditText>(R.id.sa_cylinder_height)
        val calculateBtn = findViewById<Button>(R.id.sa_cylinder_calc)
        val resultText = findViewById<TextView>(R.id.sa_cylinder_result)
        val clearBtn = findViewById<Button>(R.id.sa_cylinder_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@SaCylinder, SurfaceAreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val r = lengthEditText.text.toString().toFloat()
            val h = lengthEditText.text.toString().toFloat()
            val sa = (2 * 3.14 * r * h) + (2 * 3.14 * r * r)

            resultText.text = sa.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            lengthEditText.text.clear()
            heightEditText.text.clear()
        }

    }
}
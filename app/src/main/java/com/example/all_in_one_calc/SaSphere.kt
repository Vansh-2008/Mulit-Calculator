package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class SaSphere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sa_sphere)

        val lengthEditText = findViewById<EditText>(R.id.sa_sphere_a)
        val calculateBtn = findViewById<Button>(R.id.sa_sphere_calc)
        val resultText = findViewById<TextView>(R.id.sa_sphere_result)
        val clearBtn = findViewById<Button>(R.id.sa_sphere_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@SaSphere, SurfaceAreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val r = lengthEditText.text.toString().toFloat()
            val rectArea = 4 * 3.14 * (r * r)

            resultText.text = rectArea.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            lengthEditText.text.clear()
        }
    }
}
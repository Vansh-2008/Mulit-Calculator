package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class AreaSquare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_square)

        val lengthEditText = findViewById<EditText>(R.id.area_square_side)
        val calculateBtn = findViewById<Button>(R.id.area_square_calc)
        val resultText = findViewById<TextView>(R.id.area_square_result)
        val clearBtn = findViewById<Button>(R.id.area_square_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaSquare, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val length = lengthEditText.text.toString().toFloat()
            val rectArea = length * length

            resultText.text = rectArea.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            lengthEditText.text.clear()
        }

    }
}
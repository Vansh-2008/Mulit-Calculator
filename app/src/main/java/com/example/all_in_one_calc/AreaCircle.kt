package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class AreaCircle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_circle)

        val radiusEditText = findViewById<EditText>(R.id.area_circle_side)
        val calculateBtn = findViewById<Button>(R.id.area_circle_calc)
        val resultText = findViewById<TextView>(R.id.area_circle_result)
        val clearBtn = findViewById<Button>(R.id.area_circle_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaCircle, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val radius = radiusEditText.text.toString().toFloat()
            val rectArea = radius * radius

            resultText.text = rectArea.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            radiusEditText.text.clear()
        }

    }
}
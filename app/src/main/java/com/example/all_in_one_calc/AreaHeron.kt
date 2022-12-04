package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.sqrt

class AreaHeron : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_heron)

        val clearBtn = findViewById<Button>(R.id.area_triangle_clear_button)
        val sideA = findViewById<EditText>(R.id.area_triangle_side_a)
        val sideB = findViewById<EditText>(R.id.area_triangle_side_b)
        val sideC = findViewById<EditText>(R.id.area_triangle_side_c)
        val calculateButton = findViewById<Button>(R.id.area_triangle_calculate_button)
        val resultText = findViewById<TextView>(R.id.result_text)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaHeron, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateButton.setOnClickListener{

            val a = sideA.text.toString().toFloat()
            val b = sideB.text.toString().toFloat()
            val c = sideC.text.toString().toFloat()

            val s = (a + b + c)/2
            val rtIT = (s*(s-a)*(s-b)*(s-c))
            val result = sqrt(rtIT)
            resultText.text = result.toString()
            Toast.makeText(applicationContext,"The area of triangle is: $result unit square", Toast.LENGTH_SHORT).show()

        }
        clearBtn.setOnClickListener{
            resultText.text = ""
            sideA.text.clear()
            sideB.text.clear()
            sideC.text.clear()
        }


    }
}
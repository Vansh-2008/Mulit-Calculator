package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.math.sqrt

class AreaTriSimp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_tri_simp)

        val clearBtn = findViewById<Button>(R.id.area_triangle_clear_button)
        val height = findViewById<EditText>(R.id.area_triangle_height)
        val base = findViewById<EditText>(R.id.area_triangle_base)
        val calculateButton = findViewById<Button>(R.id.area_triangle_calculate_button)
        val resultText = findViewById<TextView>(R.id.result_text)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaTriSimp, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateButton.setOnClickListener{

            val b = height.text.toString().toFloat()
            val a = base.text.toString().toFloat()
            val result = 1/2 * (a * b)
            resultText.text = result.toString()
            Toast.makeText(applicationContext,"The area of triangle is: $result unit square", Toast.LENGTH_SHORT).show()

        }
        clearBtn.setOnClickListener{
            resultText.text = ""
            base.text.clear()
            height.text.clear()
        }

    }
}
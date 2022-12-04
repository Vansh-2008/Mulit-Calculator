package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class AreaTrapezium : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_trapezium)

        val sideAEditText = findViewById<EditText>(R.id.area_trap_side_a)
        val sideBEditText = findViewById<EditText>(R.id.area_trap_side_b)
        val heightEditText = findViewById<EditText>(R.id.area_trap_height)
        val resultText = findViewById<TextView>(R.id.result_text)
        val calculateBtn = findViewById<Button>(R.id.area_trap_calculate_button)
        val clearBtn = findViewById<Button>(R.id.area_trap_clear_button)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaTrapezium, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val a = sideAEditText.text.toString().toFloat()
            val b = sideBEditText.text.toString().toFloat()
            val h = heightEditText.text.toString().toFloat()
            val result = ((a+b) / 2) * h

            resultText.text = result.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            sideAEditText.text.clear()
            sideBEditText.text.clear()
            heightEditText.text.clear()
        }
    }
}
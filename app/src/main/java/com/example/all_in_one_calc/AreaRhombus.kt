package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class AreaRhombus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_rhombus)

        val dia1EditText = findViewById<EditText>(R.id.area_rhom_d1)
        val dia2EditText = findViewById<EditText>(R.id.area_rhom_d2)
        val calculateBtn = findViewById<Button>(R.id.area_rhom_calc)
        val resultText = findViewById<TextView>(R.id.area_rhom_result)
        val clearBtn = findViewById<Button>(R.id.area_rhom_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaRhombus, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val p = dia1EditText.text.toString().toFloat()
            val q = dia2EditText.text.toString().toFloat()
            val rectArea = (p * q) / 2

            resultText.text = rectArea.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            dia1EditText.text.clear()
            dia2EditText.text.clear()
        }

    }
}
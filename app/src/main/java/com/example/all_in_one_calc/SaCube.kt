package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class SaCube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sa_cube)

        val lengthEditText = findViewById<EditText>(R.id.sa_cube_a)
        val calculateBtn = findViewById<Button>(R.id.sa_cube_calc)
        val resultText = findViewById<TextView>(R.id.sa_cube_result)
        val clearBtn = findViewById<Button>(R.id.sa_cube_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@SaCube, SurfaceAreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val a = lengthEditText.text.toString().toFloat()
            val rectArea = (a*a) * 6

            resultText.text = rectArea.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            lengthEditText.text.clear()
        }
    }
}
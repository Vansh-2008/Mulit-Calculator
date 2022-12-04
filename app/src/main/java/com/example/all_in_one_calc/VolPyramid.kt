package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class VolPyramid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vol_pyramid)

        val lengthEditText = findViewById<EditText>(R.id.vol_pyramid_length)
        val widthEditText = findViewById<EditText>(R.id.vol_pyramid_width)
        val heightEditText = findViewById<EditText>(R.id.vol_pyramid_height)
        val resultText = findViewById<TextView>(R.id.vol_pyramid_result)
        val calculateBtn = findViewById<Button>(R.id.vol_pyramid_calc)
        val clearBtn = findViewById<Button>(R.id.vol_pyramid_clr)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@VolPyramid, VolumeActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val length = lengthEditText.text.toString().toFloat()
            val width = widthEditText.text.toString().toFloat()
            val height = heightEditText.text.toString().toFloat()
            val cuboidVol = (length * width * height) / 3

            resultText.text = cuboidVol.toString()
        }
        clearBtn.setOnClickListener(){
            resultText.text = ""
            lengthEditText.text.clear()
            widthEditText.text.clear()
            heightEditText.text.clear()
        }

    }
}
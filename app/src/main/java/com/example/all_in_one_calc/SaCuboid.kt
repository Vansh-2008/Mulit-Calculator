package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class SaCuboid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sa_cuboid)

        val lengthEditText = findViewById<EditText>(R.id.sa_cuboid_length)
        val widthEditText = findViewById<EditText>(R.id.sa_cuboid_width)
        val heightEditText = findViewById<EditText>(R.id.sa_cuboid_height)
        val resultText = findViewById<TextView>(R.id.sa_cuboid_result)
        val calculateBtn = findViewById<Button>(R.id.sa_cuboid_calc)
        val clearBtn = findViewById<Button>(R.id.sa_cuboid_clear)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@SaCuboid, SurfaceAreaActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val l = lengthEditText.text.toString().toFloat()
            val w = widthEditText.text.toString().toFloat()
            val h = heightEditText.text.toString().toFloat()
            val cuboidVol = 2 * ((l*w) + (w*h) + (h*l))
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
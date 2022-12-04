package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class VolCone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vol_cone)


        val radiusEditText = findViewById<EditText>(R.id.vol_cone_radius)
        val heightEditText = findViewById<EditText>(R.id.vol_cone_height)
        val resultText = findViewById<TextView>(R.id.vol_cone_result)
        val calculateBtn = findViewById<Button>(R.id.vol_cone_calc)
        val clearBtn = findViewById<Button>(R.id.vol_cone_clr)


        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@VolCone, VolumeActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val radius = radiusEditText.text.toString().toFloat()
            val height = heightEditText.text.toString().toFloat()
            val cuboidVol = (3.14 * radius * 2 * height) / 3

            resultText.text = cuboidVol.toString()
        }

        clearBtn.setOnClickListener(){
            resultText.text = ""
            radiusEditText.text.clear()
            heightEditText.text.clear()
        }

    }
}

// πr2h
//3
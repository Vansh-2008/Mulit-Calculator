package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class VolCylinder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vol_cylinder)

        val radiusEditText = findViewById<EditText>(R.id.vol_cylinder_radius)
        val heightEditText = findViewById<EditText>(R.id.vol_cylinder_height)
        val resultText = findViewById<TextView>(R.id.vol_cylinder_result)
        val calculateBtn = findViewById<Button>(R.id.vol_cylinder_calc)
        val clearBtn = findViewById<Button>(R.id.vol_cylinder_clr)


        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@VolCylinder, VolumeActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateBtn.setOnClickListener(){
            val radius = radiusEditText.text.toString().toFloat()
            val height = heightEditText.text.toString().toFloat()
            val cuboidVol = (3.14 * radius * radius * height)

            resultText.text = cuboidVol.toString()
        }

        clearBtn.setOnClickListener(){
            resultText.text = ""
            radiusEditText.text.clear()
            heightEditText.text.clear()
        }


    }
}
package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class VolSphere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vol_sphere)

        val volCubeResultTxt = findViewById<TextView>(R.id.sphere_vol_result)
        val calcBtn = findViewById<Button>(R.id.vol_sphere_calc_btn)
        val volSphereInput = findViewById<EditText>(R.id.vol_sphere_input)
        val clearBtn = findViewById<Button>(R.id.vol_sphere_clr_btn)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@VolSphere, VolumeActivity::class.java)
            startActivity(intent)
            finish()
        }

        calcBtn.setOnClickListener(){
            val radius = volSphereInput.text.toString().toFloat()
            val cubeVol = (4 * 3.14 * radius*radius*radius) / 3
            volCubeResultTxt.text = cubeVol.toString()
        }
        clearBtn.setOnClickListener(){
            volCubeResultTxt.text = ""
            volSphereInput.text.clear()
        }


    }
}
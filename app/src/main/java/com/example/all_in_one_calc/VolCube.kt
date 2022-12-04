package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class VolCube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vol_cube)

        val volCubeResultTxt = findViewById<TextView>(R.id.cube_vol_result)
        val calcBtn = findViewById<Button>(R.id.vol_cube_calc_btn)
        val volCubeInput = findViewById<EditText>(R.id.vol_cube_input)
        val clearBtn = findViewById<Button>(R.id.vol_cube_clr_btn)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@VolCube, VolumeActivity::class.java)
            startActivity(intent)
            finish()
        }

        calcBtn.setOnClickListener(){
            val side = volCubeInput.text.toString().toFloat()
            val cubeVol = side * side * side
            volCubeResultTxt.text = cubeVol.toString()
        }
        clearBtn.setOnClickListener(){
            volCubeResultTxt.text = ""
            volCubeInput.text.clear()
        }
    }
}
package com.example.all_in_one_calc

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val volBtn = findViewById<Button>(R.id.vol_btn)
        val areaBtn = findViewById<Button>(R.id.area_btn)
        val mathsBtn = findViewById<Button>(R.id.maths_btn)
        val surfaceAreaBtn = findViewById<Button>(R.id.surface_area_btn)
        val bmiBtn = findViewById<Button>(R.id.bmi_btn)
        val mediaplayer: MediaPlayer = MediaPlayer.create(this, R.raw.pop_sound)

        volBtn.setOnClickListener(){
            val intent = Intent(this@MainActivity, VolumeActivity::class.java)
            startActivity(intent)
            mediaplayer.start()
            finish()
        }

        mathsBtn.setOnClickListener(){
            val intent = Intent(this@MainActivity, MathsActivity::class.java)
            startActivity(intent)
            mediaplayer.start()
            finish()
        }

        bmiBtn.setOnClickListener(){
            val intent = Intent(this@MainActivity, BmiActivity::class.java)
            startActivity(intent)
            mediaplayer.start()
            finish()
        }

        areaBtn.setOnClickListener(){
            val intent = Intent(this@MainActivity, AreaActivity::class.java)
            startActivity(intent)
            mediaplayer.start()
            finish()
        }
        surfaceAreaBtn.setOnClickListener(){
            val intent = Intent(this@MainActivity, SurfaceAreaActivity::class.java)
            startActivity(intent)
            mediaplayer.start()
            finish()
        }
    }
}
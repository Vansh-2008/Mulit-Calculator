package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class VolumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        val cubeBtn = findViewById<Button>(R.id.vol_cube)
        val cuboidBtn = findViewById<Button>(R.id.vol_cuboid)
        val coneBtn = findViewById<Button>(R.id.vol_cone)
        val cylinderBtn = findViewById<Button>(R.id.vol_cylinder)
        val sphereBtn = findViewById<Button>(R.id.vol_sphere)
        val pyramidBtn = findViewById<Button>(R.id.vol_pyramid)
        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        cubeBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, VolCube::class.java)
            startActivity(intent)
            finish()
        }

        cuboidBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, VolCuboid::class.java)
            startActivity(intent)
            finish()
        }
        coneBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, VolCone::class.java)
            startActivity(intent)
            finish()
        }

        cylinderBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, VolCylinder::class.java)
            startActivity(intent)
            finish()
        }

        sphereBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, VolSphere::class.java)
            startActivity(intent)
            finish()
        }

        pyramidBtn.setOnClickListener(){
            val intent = Intent(this@VolumeActivity, VolPyramid::class.java)
            startActivity(intent)
            finish()
        }

    }
}
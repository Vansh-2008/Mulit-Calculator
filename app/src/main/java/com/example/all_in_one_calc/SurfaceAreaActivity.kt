package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SurfaceAreaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_surface_area)

        val cubeBtn = findViewById<Button>(R.id.sa_cube)
        val cuboidBtn = findViewById<Button>(R.id.sa_cuboid)
        val coneBtn = findViewById<Button>(R.id.sa_cone)
        val cylinderBtn = findViewById<Button>(R.id.sa_cylinder)
        val sphereBtn = findViewById<Button>(R.id.sa_sphere)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@SurfaceAreaActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        cubeBtn.setOnClickListener() {
            val intent = Intent(this@SurfaceAreaActivity, SaCube::class.java)
            startActivity(intent)
            finish()
        }
        cuboidBtn.setOnClickListener() {
            val intent = Intent(this@SurfaceAreaActivity, SaCube::class.java)
            startActivity(intent)
            finish()
        }
        coneBtn.setOnClickListener() {
            val intent = Intent(this@SurfaceAreaActivity, SaCone::class.java)
            startActivity(intent)
            finish()
        }
        cylinderBtn.setOnClickListener() {
            val intent = Intent(this@SurfaceAreaActivity, SaCylinder::class.java)
            startActivity(intent)
            finish()
        }
        sphereBtn.setOnClickListener() {
            val intent = Intent(this@SurfaceAreaActivity, SaSphere::class.java)
            startActivity(intent)
            finish()
        }

    }
}
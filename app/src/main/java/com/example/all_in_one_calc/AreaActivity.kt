package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AreaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)

        val rectBtn = findViewById<Button>(R.id.area_rec)
        val sqBtn = findViewById<Button>(R.id.area_sq)
        val triBtn = findViewById<Button>(R.id.area_triangle)
        val circleBtn = findViewById<Button>(R.id.area_circle)
        val parallBtn = findViewById<Button>(R.id.area_parallelogram)
        val trapBtn = findViewById<Button>(R.id.area_trapezium)
        val rhomBtn = findViewById<Button>(R.id.area_rhombus)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        rectBtn.setOnClickListener(){
            val intent = Intent(this@AreaActivity, AreaRectangle::class.java)
            startActivity(intent)
            finish()
        }
        sqBtn.setOnClickListener(){
            val intent = Intent(this@AreaActivity, AreaSquare::class.java)
            startActivity(intent)
            finish()
        }
        circleBtn.setOnClickListener(){
            val intent = Intent(this@AreaActivity, AreaCircle::class.java)
            startActivity(intent)
            finish()
        }
        triBtn.setOnClickListener(){
            val intent = Intent(this@AreaActivity, AreaTriangle::class.java)
            startActivity(intent)
            finish()
        }
        parallBtn.setOnClickListener() {
            val intent = Intent(this@AreaActivity, AreaParallelogram::class.java)
            startActivity(intent)
            finish()
        }
        trapBtn.setOnClickListener() {
            val intent = Intent(this@AreaActivity, AreaTrapezium::class.java)
            startActivity(intent)
            finish()
        }
       rhomBtn.setOnClickListener() {
            val intent = Intent(this@AreaActivity, AreaRhombus::class.java)
            startActivity(intent)
            finish()
        }
    }
}
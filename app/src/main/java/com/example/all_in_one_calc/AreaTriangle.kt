package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AreaTriangle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_triangle)

        val simpleBtn = findViewById<Button>(R.id.triangle_area_method_1)
        val heronBtn = findViewById<Button>(R.id.triangle_area_method_2)
        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@AreaTriangle, AreaActivity::class.java)
            startActivity(intent)
            finish()
        }
        simpleBtn.setOnClickListener(){
            val intent = Intent(this@AreaTriangle, AreaTriSimp::class.java)
            startActivity(intent)
            finish()
        }
        heronBtn.setOnClickListener(){
            val intent = Intent(this@AreaTriangle, AreaHeron::class.java)
            startActivity(intent)
            finish()
        }

    }
}
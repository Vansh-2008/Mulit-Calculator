package com.example.all_in_one_calc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class BmiActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val textCategory = findViewById<TextView>(R.id.text_category)
        val resultText = findViewById<TextView>(R.id.result_text)
        val weightText = findViewById<EditText>(R.id.weight_text_view)
        val heightText = findViewById<EditText>(R.id.height_text_view)
        val calculateButton = findViewById<Button>(R.id.calculate_button)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@BmiActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        calculateButton.setOnClickListener{

            val weight = weightText.text.toString().toFloat()
            val height = heightText.text.toString().toFloat()
            val myBMI = (weight / (height*height)) * 10000

            resultText.text = myBMI.toString()

            if (myBMI < 18.5){
                textCategory.text = "You are - Underweight"
            }
            else if (myBMI in 18.50..25.00){
                textCategory.text = "You are - Normal"
            }
            else if (myBMI in 25.00..31.00){
                textCategory.text = "You are - Overweight"
            }
            else if (myBMI in 31.00..65.00){
                textCategory.text = "You are - Super Overweight"
            } else{
                textCategory.text = "Error code 'BMI-0--0'"
                Toast.makeText(this, "Please enter the valid needed field", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
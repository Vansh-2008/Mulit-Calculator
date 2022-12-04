package com.example.all_in_one_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class MathsActivity : AppCompatActivity() {

    lateinit var editText : EditText
    var number1 : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean = false
    var isDiv : Boolean = false
    var isMulti : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maths)
        editText = findViewById(R.id.number_edit_text)

        val backBtn = findViewById<ImageButton>(R.id.back_btn)

        backBtn.setOnClickListener(){
            val intent = Intent(this@MathsActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun operationFunction(view: View){
        when(view.id){

            R.id.btn_1 -> {
                val number = editText.text.toString() + "1"
                editText.setText(number)
            }
            R.id.btn_2 -> {
                val number = editText.text.toString() + "2"
                editText.setText(number)
            }
            R.id.btn_3 -> {
                val number = editText.text.toString() + "3"
                editText.setText(number)
            }
            R.id.btn_4 -> {
                val number = editText.text.toString() + "4"
                editText.setText(number)
            }
            R.id.btn_5 -> {
                val number = editText.text.toString() + "5"
                editText.setText(number)
            }
            R.id.btn_6 -> {
                val number = editText.text.toString() + "6"
                editText.setText(number)
            }
            R.id.btn_7 -> {
                val number = editText.text.toString() + "7"
                editText.setText(number)
            }
            R.id.btn_8 -> {
                val number = editText.text.toString() + "8"
                editText.setText(number)
            }
            R.id.btn_9 -> {
                val number = editText.text.toString() + "9"
                editText.setText(number)
            }
            R.id.btn_0 -> {
                val number = editText.text.toString() + "0"
                editText.setText(number)
            }
            R.id.btn_dot -> {
                val number = editText.text.toString() + "."
                editText.setText(number)
            }
            R.id.btn_clr -> {
                editText.setText("")
            }
            R.id.btn_add -> {
                number1 = editText.text.toString().toFloat()
                isPlus = true
            }
            R.id.btn_Minus -> {
                number1 = editText.text.toString().toFloat()
                isMinus = true
            }
            R.id.btn_div -> {
                number1 = editText.text.toString().toFloat()
                isDiv = true
            }
            R.id.btn_multi -> {
                number1 = editText.text.toString().toFloat()
                isMulti = true
            }
            R.id.btn_equal -> {

                if (isPlus) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 + number2
                    editText.setText(result.toString())
                    isPlus = false
                }else if (isMinus) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 - number2
                    editText.setText(result.toString())
                    isMinus = false
                }else if (isDiv) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 / number2
                    editText.setText(result.toString())
                    isDiv = false
                }else if (isMulti) {
                    val number2 = editText.text.toString().toFloat()
                    val result = number1 * number2
                    editText.setText(result.toString())
                    isDiv = false
                }
            }
        }
    }

}
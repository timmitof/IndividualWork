package com.timmitof.individualwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)


        button.setOnClickListener {
            val numberEditText = editText.text
            if(numberEditText.isNullOrEmpty()){
                Toast.makeText(this, "Неверный формат", Toast.LENGTH_SHORT).show()
            } else {
                val number = editText.text.toString().toInt()
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("NUMBER", number)
                startActivity(intent)
            }
        }
    }
}
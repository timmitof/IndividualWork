package com.timmitof.individualwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        imageView = findViewById(R.id.imageView)

        val number = intent.getIntExtra("NUMBER", 0)

        when (number) {
            1 -> imageView.setImageResource(R.drawable.images1)
            2 -> imageView.setImageResource(R.drawable.images2)
            3 -> imageView.setImageResource(R.drawable.images3)
        }
    }
}
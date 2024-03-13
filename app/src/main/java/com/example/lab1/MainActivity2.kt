package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.textView2).apply { text = name }

        val button2Click = findViewById<Button>(R.id.button2)

        button2Click.setOnClickListener {
            finish()
        }
    }

}
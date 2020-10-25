package com.example.latihanmodul4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val imageButton = findViewById<ImageButton>(R.id.imageButton2)
            imageButton.setOnClickListener {
                Toast.makeText(this@MainActivity, "Data Berhasil Masuk", Toast.LENGTH_LONG).show()
            }
        }
    }

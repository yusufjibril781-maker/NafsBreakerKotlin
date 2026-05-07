package com.nafsbreaker

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startBtn = findViewById<Button>(R.id.startBtn)
        startBtn.setOnClickListener {
            Toast.makeText(this, "Missions coming soon, my love 😘", Toast.LENGTH_SHORT).show()
        }
    }
}

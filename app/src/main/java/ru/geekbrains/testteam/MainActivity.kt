package ru.geekbrains.testteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /////////Создать спринт 1

        var btn = findViewById<Button>(R.id.button);
        btn.setOnClickListener {
            Toast.makeText(this, "Button", Toast.LENGTH_LONG).show()
        }
            ///fdq
    }
}
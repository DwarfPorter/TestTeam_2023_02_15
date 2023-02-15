package ru.geekbrains.testteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = 4
        Toast.makeText(this, "aaa" + a.toString(), Toast.LENGTH_SHORT).show()

    }
}
package com.example.androidmoreonuis_11420047

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        //1. menghubungkan ke view layout
        var button_confirm: Button = findViewById(R.id.button_confirm)
        var button_cancel: Button = findViewById(R.id.button_cancel)

        //2. set action listener
        button_confirm.setOnClickListener {
            Toast.makeText(this, "Thank you for your confirmation", Toast.LENGTH_SHORT).show()
        }
        button_cancel.setOnClickListener {
            Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
        }
    }
}
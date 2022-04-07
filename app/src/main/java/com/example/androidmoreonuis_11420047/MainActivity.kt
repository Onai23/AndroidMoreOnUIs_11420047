package com.example.androidmoreonuis_11420047

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. menghubungkan layout view
        var button_toast: Button = findViewById(R.id.btn_toast)
        var button_dialog: Button = findViewById(R.id.btn_dialog)

        //2. set action listener
        button_toast.setOnClickListener {
            var intent = Intent(this, ToastActivity::class.java)
            startActivity(intent)
        }
        button_dialog.setOnClickListener {
            var intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
    }
}
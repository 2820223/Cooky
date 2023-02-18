package com.example.cooky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ChooseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_layout)

        var parol = intent.getStringExtra("parol")
        var login = intent.getStringExtra("login")
        Log.d("parol",parol.toString())
        Log.d("login",login.toString())




    }
}
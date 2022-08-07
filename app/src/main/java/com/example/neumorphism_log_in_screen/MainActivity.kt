package com.example.neumorphism_log_in_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.concurrent.Delayed

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.signup_btn).setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))

        }

    }


}


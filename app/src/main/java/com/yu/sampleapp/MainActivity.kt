package com.yu.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import android.content.Intent

class MainActivity : AppCompatActivity() {
    //showing of the main page
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerNowTextView : TextView = findViewById(R.id.register_now_textview)
        val buttonLogin : AppCompatButton = findViewById(R.id.login_button)

        buttonLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        registerNowTextView.setOnClickListener {
            val intent  = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
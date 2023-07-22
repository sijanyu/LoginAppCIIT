package com.yu.sampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import org.w3c.dom.Text

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val usernameTextView : TextView = findViewById(R.id.edit_username_textview)
        val passwordTextView : TextView = findViewById(R.id.edit_password_textview)

        val registerButton : AppCompatButton = findViewById(R.id.register_button)
        val goToLogin : TextView = findViewById(R.id.back_to_login)

        registerButton.setOnClickListener {
            usernameTextView.text = ""
            passwordTextView.text = ""
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        goToLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
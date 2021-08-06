package com.example.webuy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_log_in.*


class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
//OnClick for going to register screen
        signup_link.setOnClickListener{
            val intent= Intent(this, RegistrationActivity:: class.java)
            startActivity(intent)
        }
//OnClick for going to Reset Password screen
        forgotPassword.setOnClickListener{
            val intent= Intent(this,ForgotPassword::class.java)
            startActivity(intent)
        }

    }
}
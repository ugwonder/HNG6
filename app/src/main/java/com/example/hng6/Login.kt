package com.example.hng6

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstancesState: Bundle?) {
        super.onCreate(savedInstancesState)
        setContentView(R.layout.activity_login)

        val login_email = findViewById<View>(R.id.login_email) as EditText
        val login_password = findViewById<View>(R.id.login_password) as EditText
        val btnlogin = findViewById<View>(R.id.Login) as Button

        btnlogin.setOnClickListener {
            val email = login_email.text.toString()
            val password = login_password.text.toString()

            val preferences = getSharedPreferences("MYPREPS", Context.MODE_PRIVATE)

            val userDetails = preferences.getString(
                email + password + "data",
                "username or password is incorrect."
            )
            val editor = preferences.edit()
            editor.putString("display", userDetails)
            editor.commit()

            val displayscreen = Intent(this@Login, DisplayScreen::class.java)
        }


    }
}

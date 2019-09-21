package com.example.hng6

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    internal constructor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val email = findViewById<View>(R.id.register_email) as EditText
        val password = findViewById<View>(R.id.register_password) as EditText
        val full_name = findViewById<View>(R.id.register_full_name) as EditText
        val track = findViewById<View>(R.id.register_track) as EditText
        val stage = findViewById<View>(R.id.register_stage) as EditText
        val btnregister = findViewById<View>(R.id.btnregister) as Button

        btnregister.setOnClickListener {
            val preferences = getSharedPreferences("MYPREPS", Context.MODE_PRIVATE)
            val newemail = email.text.toString()
            val newpassword = password.text.toString()
            val new_full_name = full_name.text.toString()
            val newtrack = track.text.toString()
            val newstage = stage.text.toString()

            val editor = preferences.edit()

            editor.putString(
                newemail + newpassword + "data",
                "$new_full_name/n$newtrack/n$newstage"
            )
            editor.commit()

            val activity_login = Intent(this@Register, MainActivity::class.java)
            startActivity(activity_login)
        }


    }
}

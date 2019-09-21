package com.example.hng6

import android.content.Intent
import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity

class welcome_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openRegister(view: View) {
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    fun openLogin(view: View) {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }


}

package com.example.likit.lynx

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun forgotOnClick(view: View) {

        val forgotIntent= Intent(this,ForgotActivity::class.java)
        startActivity(forgotIntent)

    }
    fun registerNewOnClick(view: View) {

        val registernewIntent = Intent(this, RegisterActivity::class.java)
        startActivity(registernewIntent)
    }
}

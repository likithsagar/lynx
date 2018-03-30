package com.example.likit.lynx

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)
    }

    fun register1OnClick(view: View) {

        val register1Intent= Intent(this,RegisterActivity2::class.java)
        startActivity(register1Intent)

    }
}

package com.example.likit.lynx

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setSpinner()
    }
    private fun setSpinner() {
        val mySpinner: Spinner =findViewById(R.id.mySpinner)
        val myStrings = arrayOf("Race/Ethnicity","One", "Two" , "Three", "Four")
        var adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, myStrings)
        mySpinner.adapter= adapter as SpinnerAdapter?
        mySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                val selectedText = parent?.getChildAt(0) as TextView
                selectedText?.setTextColor(0x66FFFFFF)

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //(parent?.getChildAt(0) as TextView).setTextColor(Color.LTGRAY)
                val selectedText = parent?.getChildAt(0) as TextView
                if(position==0)
                    selectedText?.setTextColor(0x66FFFFFF)
            }
        }

    }

    fun registerOnClick(view: View) {

        val registerIntent= Intent(this,RegisterActivity1::class.java)
        startActivity(registerIntent)

    }
}

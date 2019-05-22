package com.example.iteradmin.intent_prog01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1=findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent=Intent(applicationContext,Main2Activity::class.java)
            startActivity(intent)
        }
    }
}

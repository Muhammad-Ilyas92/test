package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun send(v: View)
    {
        val msg:String = name.text.toString()
        val intent = Intent (this,ThirdActivity::class.java)
        intent.putExtra("key",msg)
        startActivity(intent)
    }

}
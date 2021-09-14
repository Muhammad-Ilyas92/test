package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.third_activity.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        val bundle:Bundle?=intent.extras
        val nam:Any?  = bundle?.get("key")
        result.text = nam.toString()
    }

    fun back(v:View)
    {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}
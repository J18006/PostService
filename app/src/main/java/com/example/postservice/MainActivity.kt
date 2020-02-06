package com.example.postservice

import android.support.v7.app.AppCompatActivity
//import androidx.appcompat.app.AppCompatActivity
import android.os.AsyncTask.execute
//import android.R
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    var button: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button1) as Button
        button!!.setOnClickListener {
            val post = AsyncHttp("Android", 10.11)
            post.execute()
        }

    }
}

















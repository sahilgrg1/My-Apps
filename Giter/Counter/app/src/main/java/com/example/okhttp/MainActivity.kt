package com.example.okhttp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reset.setOnClickListener {
            count = 0
            tv.setText(""+count)
        }
        incre.setOnClickListener {
            count++
            tv.setText(""+count)
        }
        decre.setOnClickListener {
            if(count == 0)
            {
                return@setOnClickListener
            }
            count--
            tv.setText(""+count)

        }

    }
}

package com.example.helloworld_kt

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : ComponentActivity() {
    var tvCount:TextView? = null
    var btnAdd:FloatingActionButton? = null
    var btnSubtract:FloatingActionButton?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        tvCount = findViewById<TextView>(R.id.tv_count)
        btnAdd = findViewById<FloatingActionButton>(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)

        btnAdd?.setOnClickListener(View.OnClickListener {
            var count = tvCount?.getText().toString().toInt()
            count++
            tvCount?.setText(count.toString())
        })

        btnSubtract?.setOnClickListener(View.OnClickListener {
            var count = tvCount?.getText().toString().toInt()
            count--
            tvCount?.setText(count.toString())
        })
    }
}


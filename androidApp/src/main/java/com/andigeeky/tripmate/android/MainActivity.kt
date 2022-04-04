package com.andigeeky.tripmate.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andigeeky.tripmate.Greeting
import android.widget.TextView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

suspend fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainScope().launch {
            val tv: TextView = findViewById(R.id.text_view)
            tv.text = greet()
        }
    }
}

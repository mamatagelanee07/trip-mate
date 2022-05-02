package com.andigeeky.tripmate.android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.andigeeky.tripmate.trips.model.Trip
import com.andigeeky.tripmate.trips.usecases.GetTrips
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

suspend fun list(): List<Trip> {
    return GetTrips().invoke()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainScope().launch {
            val tv: TextView = findViewById(R.id.text_view)
            tv.text = list().toString()
        }
    }
}

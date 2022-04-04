package com.andigeeky.tripmate

import com.andigeeky.tripmate.trips.usecases.GetTrips

class Greeting {
    suspend fun greeting(): String {
        return "Hello, ${GetTrips(httpClient())()}!"
    }
}
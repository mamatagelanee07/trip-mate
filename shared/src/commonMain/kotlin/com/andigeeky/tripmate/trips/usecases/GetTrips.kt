package com.andigeeky.tripmate.trips.usecases

import com.andigeeky.tripmate.trips.model.Trip
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

class GetTrips(private val client: HttpClient) {
    suspend operator fun invoke(): List<Trip> {
        return client.get("http://0.0.0.0:8080/trip") {
            method = HttpMethod.Get
            contentType(ContentType.Application.Json)
        }.body()
    }
}
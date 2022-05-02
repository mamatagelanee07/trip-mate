package com.andigeeky.tripmate.trips.usecases

import com.andigeeky.tripmate.apolloClient
import com.andigeeky.tripmate.graphql.GetAllTripsQuery
import com.andigeeky.tripmate.trips.model.Trip
import com.apollographql.apollo3.ApolloClient

class GetTrips {
    suspend fun getTrips(): List<Trip> {
        val client: ApolloClient = apolloClient()
        return client.query(GetAllTripsQuery()).execute().data?.trips?.map {
            Trip(
                id = it?.id!!,
                name = it.name,
                startDate = it.startDate,
                endDate = it.endDate
            )
        }.orEmpty()
    }
}
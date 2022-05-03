package com.andigeeky.tripmate.trips.usecases

import com.andigeeky.tripmate.graphql.GetAllTripsQuery
import com.andigeeky.tripmate.trips.model.Trip
import com.apollographql.apollo3.ApolloClient
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetTrips : KoinComponent{
    private val client: ApolloClient by inject()
    suspend operator fun invoke(): List<Trip> {
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
package com.andigeeky.tripmate.di

import com.andigeeky.tripmate.trips.usecases.GetTrips
import com.apollographql.apollo3.ApolloClient
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
    appDeclaration()
    modules(common_modules)
}

val apolloModule = module {
    single { ApolloClient.Builder().serverUrl("https://trip-mate-graphql-server.herokuapp.com/").build()}
}
val useCaseModule = module {
    factory { GetTrips() }
}

val common_modules = apolloModule + useCaseModule
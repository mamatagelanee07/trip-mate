package com.andigeeky.tripmate

import com.apollographql.apollo3.ApolloClient

fun apolloClient() = ApolloClient.Builder()
    .serverUrl("https://trip-mate-graphql-server.herokuapp.com/")
    .build()
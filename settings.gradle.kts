pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "TripMate"
include(":androidApp")
include(":shared")
include(":graphql-client")

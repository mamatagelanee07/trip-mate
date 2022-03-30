package com.andigeeky.tripmate

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
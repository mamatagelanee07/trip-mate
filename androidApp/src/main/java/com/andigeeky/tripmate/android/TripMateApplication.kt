package com.andigeeky.tripmate.android

import android.app.Application
import com.andigeeky.tripmate.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class TripMateApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE) // Remove this when the koin upgrade to 3.2
            androidContext(this@TripMateApplication)
        }
    }
}
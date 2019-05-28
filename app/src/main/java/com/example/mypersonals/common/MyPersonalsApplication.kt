package com.example.mypersonals.common

import android.app.Application

class MyPersonalsApplication : Application() {
    lateinit var presenterFactory: PresenterFactory

    override fun onCreate() {
        super.onCreate()
        instance = this
        presenterFactory = PresenterFactory()
    }

    companion object {
        /**
         * instance of application
         */
        lateinit var instance: MyPersonalsApplication
    }
}
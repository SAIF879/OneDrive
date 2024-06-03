package com.example.onedrive

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class OneDriveApplication : Application(){

    companion object{
        @JvmStatic
        var instance :OneDriveApplication?= null
        @JvmStatic
        fun getContext(): Context? {
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}
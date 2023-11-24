package com.abdl.mybookshelfapp

import android.app.Application
import com.abdl.mybookshelfapp.data.AppContainer
import com.abdl.mybookshelfapp.data.DefaultAppContainer

class BookshelfApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
package com.softniels.exampleapplication

import android.app.Application
import com.softniels.exampleapplication.database.database
import com.softniels.exampleapplication.product.product
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ExampleApplication)
            modules(
                database,
                product
            )
        }
    }

}
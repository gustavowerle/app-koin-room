package com.exampleapplication

import android.app.Application
import com.exampleapplication.database.database
import com.exampleapplication.product.product
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
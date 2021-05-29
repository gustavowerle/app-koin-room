package com.exampleapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.exampleapplication.database.product.ProductDAO
import com.exampleapplication.database.product.ProductEntity

@Database(
    entities = [
        ProductEntity::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDAO

}
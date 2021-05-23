package com.softniels.exampleapplication.database.product

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class ProductEntity(
    @PrimaryKey
    var id: Int,
    var name: String,
    var value: Float
)
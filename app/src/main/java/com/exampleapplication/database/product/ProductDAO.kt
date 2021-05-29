package com.exampleapplication.database.product

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ProductDAO {

    @Query("SELECT * FROM product")
    fun getAllProducts(): List<ProductEntity>

    @Insert
    fun createProduct(product: ProductEntity)

    @Update
    fun updateProduct(product: ProductEntity)

}
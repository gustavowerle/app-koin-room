package com.softniels.exampleapplication.product

import com.softniels.exampleapplication.database.product.ProductDAO
import com.softniels.exampleapplication.database.product.ProductEntity

class ProductRepository(private val productDAO: ProductDAO) {

    fun getAllProducts(): List<ProductEntity> {
        return productDAO.getAllProducts()
    }

    fun createProduct(product: ProductEntity) {
        productDAO.createProduct(product)
    }

    fun updateProduct(product: ProductEntity) {
        productDAO.updateProduct(product)
    }

}
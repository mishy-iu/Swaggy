package com.mitchelle.swaggy.repository

import android.content.Context
import com.mitchelle.swaggy.data.ProductDatabase
import com.mitchelle.swaggy.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}
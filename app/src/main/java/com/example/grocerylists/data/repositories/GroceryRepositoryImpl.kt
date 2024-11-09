package com.example.grocerylists.data.repositories

import com.example.grocerylists.domain.entities.GroceryList
import com.example.grocerylists.domain.repositories.IGroceryRepository

class GroceryRepository: IGroceryRepository {
    override fun create(list: GroceryList) {
        TODO("Not yet implemented")
    }

    override fun delete(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(): List<GroceryList> {
        TODO("Not yet implemented")
    }

    override fun getById(id: String): GroceryList? {
        TODO("Not yet implemented")
    }
}
package com.example.grocerylists.domain.repositories

import com.example.grocerylists.domain.entities.GroceryList

interface IGroceryRepository {
    fun create(list: GroceryList)
    fun delete(id: String): Boolean
    fun get():List<GroceryList>
    fun getById(id:String):GroceryList?
}